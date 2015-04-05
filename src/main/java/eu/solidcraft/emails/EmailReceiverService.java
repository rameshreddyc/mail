package eu.solidcraft.emails;

import javax.mail.internet.MimeMessage;

import org.apache.log4j.Logger;

public class EmailReceiverService {
	private static Logger logger = Logger.getLogger(EmailReceiverService.class);
	public void receive(MimeMessage mimeMessage) {
		logger.debug("Message: " + mimeMessage);
	}
}
