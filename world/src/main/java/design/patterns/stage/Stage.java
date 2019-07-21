package design.patterns.stage;

/**
 * 状态
 * 
 * @author Administrator
 *
 */
public class Stage {
	private Actor actor = new HappyActor();

	public void change() {
		actor = new SadActor();
	}

	public void performPlay() {
		actor.actor();
	}
}
