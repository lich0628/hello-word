package design.patterns.factory.abstracts;

import design.patterns.factory.methods.IMyMessage;
import design.patterns.factory.methods.IMyMessageFacoty;
import design.patterns.factory.methods.MyMessageFactory;
import design.patterns.factory.simple.INoodles;
import design.patterns.factory.simple.SimpleFactory;

public class AbstractFactory implements IAbstractFactory {

	@Override
	public INoodles createNoodles(int type) {
		return SimpleFactory.createNoodles(type);
	}

	@Override
	public IMyMessage createMyMessage(String type) {
		IMyMessageFacoty factory = new MyMessageFactory();
		return factory.createMyMessage(type);
	}

}
