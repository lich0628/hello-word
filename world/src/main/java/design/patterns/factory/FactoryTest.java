package design.patterns.factory;

import design.patterns.factory.abstracts.AbstractFactory;
import design.patterns.factory.abstracts.IAbstractFactory;
import design.patterns.factory.methods.IMyMessage;
import design.patterns.factory.methods.IMyMessageFacoty;
import design.patterns.factory.methods.MyMessageFactory;
import design.patterns.factory.simple.INoodles;
import design.patterns.factory.simple.SimpleFactory;

public class FactoryTest {

	public static void main(String[] args) {
		simple();
		methods();
		abstracts();
	}

	// 简单工厂模式
	private static void simple() {
		INoodles i = SimpleFactory.createNoodles(SimpleFactory.TYPE_GK);
		i.desc();
	}

	// 工厂方法模式
	private static void methods() {
		IMyMessageFacoty factory = new MyMessageFactory();
		IMyMessage myMessage = factory.createMyMessage("SMS");
		try {
			myMessage.sendMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 抽象工厂模式 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。

	private static void abstracts() {
		IAbstractFactory factory = new AbstractFactory();

		INoodles i = factory.createNoodles(SimpleFactory.TYPE_PAO);
		i.desc();

		IMyMessage myMessage = factory.createMyMessage("OA");
		try {
			myMessage.sendMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
