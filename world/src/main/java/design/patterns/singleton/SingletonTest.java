package design.patterns.singleton;

import static com.util.Print.println;

/**
 * -单例对象 占用资源少，不需要延时加载，枚举 好于 饿汉 
 * -单例对象 占用资源多，需要延时加载，静态内部类 好于 懒汉式
 * 
 * @author Administrator
 *
 */
public class SingletonTest {

	public static void main(String[] args) {
		int num = 1000000;
		timeOne(num);
		timeTwo(num);
		timeThree(num);
		timeFour(num);
		timeFive(num);
	}

	private static void timeOne(int num) {
		Long time = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			SingletonDemoOne.getInstance();
		}
		println("number of times :" + num + " time:"
				+ (System.currentTimeMillis() - time));
	}

	private static void timeTwo(int num) {
		Long time = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			SingleDemoTwo.getInstance();
		}
		println("number of times :" + num + " time:"
				+ (System.currentTimeMillis() - time));
	}

	private static void timeThree(int num) {
		Long time = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			SingleDemoThree.getInstance();
		}
		println("number of times :" + num + " time:"
				+ (System.currentTimeMillis() - time));
	}

	private static void timeFour(int num) {
		Long time = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			SingleDemoFour.getInstance();
		}
		println("number of times :" + num + " time:"
				+ (System.currentTimeMillis() - time));
	}

	private static void timeFive(int num) {
		Long time = System.currentTimeMillis();
		for (int i = 0; i < num; i++) {
			SingleDemoFive.INSTANCE.singletonOperation();
		}
		println("number of times :" + num + " time:"
				+ (System.currentTimeMillis() - time));
	}
}
