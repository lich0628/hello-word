package design.patterns.singleton;

/**
 * 饿汉式(线程安全，调用效率高，但是不能延时加载)
 * 
 * @author Administrator
 *
 */
public class SingletonDemoOne {

	private static SingletonDemoOne instance = new SingletonDemoOne();

	private SingletonDemoOne() {
	}

	public static SingletonDemoOne getInstance() {
		return instance;
	}

}
