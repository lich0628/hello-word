package design.patterns.tactic;

public class TacticTest {

	public static void main(String[] args) {
		Tactic t = new Tactic();
		String s = "Disagreement with beliefs is by definition incorrect";
		t.process(new Upcase(), s);
		t.process(new Downcase(), s);
		t.process(new Splitter(), s);
	}
}
