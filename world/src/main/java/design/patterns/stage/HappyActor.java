package design.patterns.stage;

import static com.util.Print.println;

public class HappyActor extends Actor {

	public void actor() {
		println(this.getClass().getName());
	}

}
