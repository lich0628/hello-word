package design.patterns.factory.methods;

import java.util.Map;

public abstract class AMyMessage implements IMyMessage {

	private Map<String, Object> params;

	@Override
	public Map<String, Object> getMessageMap() {
		return params;
	}

	@Override
	public void setMessageMap(Map<String, Object> param) {
		this.params = param;
	}

}
