package net.logvv.jaxws.ws;

public class SmsServceImpl implements SmsService{

	@Override
	public String printMessage(String message) {
		return "Message from "+message;
	}

}
