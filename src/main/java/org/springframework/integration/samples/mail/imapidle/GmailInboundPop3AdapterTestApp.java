package org.springframework.integration.samples.mail.imapidle;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessagingException;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.messaging.MessageHandler;


public class GmailInboundPop3AdapterTestApp {

	private static Logger logger = Logger.getLogger(GmailInboundPop3AdapterTestApp.class);

	public static void main (String[] args) throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		/*DirectChannel inputChannel = ac.getBean("receiveChannel", DirectChannel.class);
		inputChannel.subscribe(new MessageHandler() {
			public void handleMessage(Message<?> message) throws MessagingException {
				logger.debug("Message: " + message);
			}
		});*/
	}
}