package design.patterns.singleton;

/**
 * 懒汉式(线程安全，调用效率不高，但是能延时加载)
 * 
 * @author Administrator
 *
 */
public class SingleDemoTwo {

	private static SingleDemoTwo instance;

	private SingleDemoTwo() {
	}

	public static synchronized SingleDemoTwo getInstance() {
		if (instance == null) {
			instance = new SingleDemoTwo();
		}
		return instance;
	}

}
