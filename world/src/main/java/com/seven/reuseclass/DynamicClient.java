package com.seven.reuseclass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicClient {

	public static void main(String[] args) {
		ICoder coder = new JavaCoder("Zhang");

		InvocationHandler handler = new CoderDynamicProxy(coder);

		ClassLoader cl = coder.getClass().getClassLoader();

		ICoder proxy = (ICoder) Proxy.newProxyInstance(cl, coder.getClass()
				.getInterfaces(), handler);

		proxy.implDemands("Modify user management");
	}

}
