package design.patterns.proxy.dynamic;

import static com.util.Print.*;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import design.patterns.proxy.ICoder;

/**
 * 动态代理
 * 
 * @author Administrator
 *
 */
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
