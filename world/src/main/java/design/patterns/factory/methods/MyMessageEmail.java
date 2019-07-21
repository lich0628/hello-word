package design.patterns.factory.methods;

import static com.util.Print.println;

public class MyMessageEmail extends AMyMessage {

	@Override
	public void sendMessage() throws Exception {
		if (getMessageMap() == null) {
			throw new Exception("参数错误");
		}
		println("email");
	}

}
