package design.patterns.singleton;

/**
 * Double CheckLock实现单例：DCL也就是双重锁判断机制
 * （由于JVM底层模型原因，偶尔会出问题，不建议使用）
 * 
 * @author Administrator
 *
 */
public class SingleDemoThree {

	private static SingleDemoThree instance;

	private SingleDemoThree() {
	}

	public static SingleDemoThree getInstance() {
		if (instance == null) {
			synchronized (SingleDemoThree.class) {
				if (instance == null) {
					instance = new SingleDemoThree();
				}
			}
		}
		return instance;
	}

}
