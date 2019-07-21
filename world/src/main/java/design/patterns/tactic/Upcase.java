package design.patterns.tactic;

public class Upcase extends StringProcessor {

	public String process(Object input) {
		return ((String) input).toUpperCase();
	}

}
