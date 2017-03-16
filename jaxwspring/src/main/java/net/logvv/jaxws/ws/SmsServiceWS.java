package net.logvv.jaxws.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * SEI 接口定义
 * 注解@WebService隐式定义了服务端点接口EndPoint
 * 注解@WebMethod且除了exclude元素设置为true的方法外，类中定义的所有公共方法都会映射到wsdl
 * @author wangwei
 * @date 2017年3月16日 下午5:23:58
 */
@WebService
public class SmsServiceWS {
	
	// Spring DI here
	SmsService smsService;
	
	/** 不对外显示当前方法 */
	@WebMethod(exclude = true)
	public void setSmsService(SmsService smsService){
		this.smsService = smsService;
	}
	
	@WebMethod(operationName="parseAccount")
	public String parseAccount(String message){
		return smsService.printMessage(message);
	}
	
}
