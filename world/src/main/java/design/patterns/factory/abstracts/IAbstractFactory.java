package design.patterns.factory.abstracts;

import design.patterns.factory.methods.IMyMessage;
import design.patterns.factory.simple.INoodles;

public interface IAbstractFactory {

	public INoodles createNoodles(int type);

	public IMyMessage createMyMessage(String type);

}
