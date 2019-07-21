package design.patterns.tactic;

import static com.util.Print.println;

/**
 * 策略
 * 
 * @author Administrator
 *
 */
public class Tactic {

	public void process(Processor p, Object o) {
		println("Using Processor " + p.name());
		println(p.process(o));
	}
}
