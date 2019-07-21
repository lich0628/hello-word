package com.loader;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.Hashtable;
import java.util.Map;

public class ModuleClassLoader extends URLClassLoader {

	Map<String, Class<?>> cache = new Hashtable<String, Class<?>>();

	public ModuleClassLoader(URL[] urls) {
		super(urls);
	}

	protected Class<?> loadClass(String name, boolean resolve)
			throws ClassNotFoundException {
		if (cache.containsKey(name)) {
			return cache.get(name);
		} else {
			Class<?> classz = super.loadClass(name, resolve);
			cache.put(name, classz);
			return classz;
		}
	}

}
