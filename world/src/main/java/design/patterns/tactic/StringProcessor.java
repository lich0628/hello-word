package design.patterns.tactic;

public abstract class StringProcessor implements Processor {

	@Override
	public String name() {
		return getClass().getSimpleName();
	}

}
