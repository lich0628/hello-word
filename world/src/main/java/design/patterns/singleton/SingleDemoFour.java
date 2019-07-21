package design.patterns.singleton;

/**
 * 静态内部类实现模式（线程安全，调用效率高，可以延时加载）
 * 
 * @author Administrator
 *
 */
public class SingleDemoFour {

	private static class SingletonClassInstance {
		private static final SingleDemoFour instance = new SingleDemoFour();
	}

	private SingleDemoFour() {
	}

	public static SingleDemoFour getInstance() {
		return SingletonClassInstance.instance;
	}

}
