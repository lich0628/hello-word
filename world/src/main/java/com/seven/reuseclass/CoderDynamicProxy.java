package com.seven.reuseclass;

import static com.util.Print.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CoderDynamicProxy implements InvocationHandler {

	private ICoder coder;

	public CoderDynamicProxy(ICoder _coder) {
		this.coder = _coder;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		println(System.currentTimeMillis());
		Object result = method.invoke(coder, args);
		println(System.currentTimeMillis());
		return result;
	}

}
