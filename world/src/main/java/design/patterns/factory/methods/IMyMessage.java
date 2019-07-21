package design.patterns.factory.methods;

import java.util.Map;

public interface IMyMessage {

	public Map<String, Object> getMessageMap();

	public void setMessageMap(Map<String, Object> param);
	
	public void sendMessage() throws Exception;
}
