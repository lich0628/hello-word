package com.loader;

import static com.util.Print.println;

import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderTest {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		// URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
		URL[] urls = ((URLClassLoader) ClassLoaderTest.class.getClassLoader())
				.getURLs();
		for (URL u : urls) {
			println(u.toExternalForm());
		}

		ClassLoader loader = new ModuleClassLoader(urls);
		try {
			Class<?> moduleA = loader
					.loadClass("com.everythingisanobject.ShowProperties");
			Method[] methods = moduleA.getMethods();
			for (Method m : methods) {
				println(m.getName());
			}
			Method test = moduleA.getMethod("test", String[].class);
			//test.invoke(moduleA.newInstance(), new String[0]);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
