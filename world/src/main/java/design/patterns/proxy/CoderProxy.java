package design.patterns.proxy;

import static com.util.Print.*;

/**
 * 代理
 * 
 * @author Administrator
 *
 */
public class CoderProxy implements ICoder {

	private ICoder coder;

	public CoderProxy(ICoder coder) {
		this.coder = coder;
	}

	@Override
	public void implDemands(String demandName) {
		if (demandName.startsWith("Add")) {
			println("No longer receive 'Add' demand");
			return;
		}
		coder.implDemands(demandName);
	}

}
