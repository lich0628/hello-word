package design.patterns.stage;

public class Transmogrify {

	public static void main(String[] args) {
		Stage s = new Stage();
		s.performPlay();
		s.change();
		s.performPlay();
	}

}
