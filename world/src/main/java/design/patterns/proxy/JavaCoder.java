package design.patterns.proxy;

import static com.util.Print.*;

public class JavaCoder implements ICoder {

	private String name;

	public JavaCoder(String name) {
		this.name = name;
	}

	@Override
	public void implDemands(String demandName) {
		println(name + " implemented  demand: " + demandName + " in Java");

	}

}
