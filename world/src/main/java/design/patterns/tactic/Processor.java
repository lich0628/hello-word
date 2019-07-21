package design.patterns.tactic;

public interface Processor {

	public String name();

	Object process(Object input);

}
