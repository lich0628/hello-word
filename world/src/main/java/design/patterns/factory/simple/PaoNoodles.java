package design.patterns.factory.simple;

import static com.util.Print.println;

public class PaoNoodles implements INoodles {

	@Override
	public void desc() {
		println("泡面");
	}

}
