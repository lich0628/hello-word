package design.patterns.factory.methods;

import java.util.HashMap;
import java.util.Map;

public class MyMessageFactory implements IMyMessageFacoty {

	@Override
	public IMyMessage createMyMessage(String type) {
		IMyMessage myMessage;
		Map<String, Object> params = new HashMap<String, Object>();
		if ("SMS".equals(type)) {
			myMessage = new MyMessageSMS();
			params.put("PHONENUM", "123456789");
		} else if ("OA".equals(type)) {
			myMessage = new MyMessageOA();
			params.put("OAUSERNAME", "OATEST");
		} else if ("EMAIL".equals(type)) {
			myMessage = new MyMessageEmail();
			params.put("email", "29@qq.com");
		} else {
			myMessage = new MyMessageEmail();
			params.put("email", "29@qq.com");
		}
		myMessage.setMessageMap(params);
		return myMessage;
	}

}
