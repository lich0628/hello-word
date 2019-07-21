package design.patterns.factory.simple;

public class SimpleFactory {

	public static final int TYPE_LZ = 1;

	public static final int TYPE_PAO = 2;

	public static final int TYPE_GK = 3;

	public static INoodles createNoodles(int type) {
		switch (type) {
		case TYPE_LZ:
			return new LzNoodles();
		case TYPE_PAO:
			return new PaoNoodles();
		case TYPE_GK:
		default:
			return new GanKouNoodles();
		}
	}

}
