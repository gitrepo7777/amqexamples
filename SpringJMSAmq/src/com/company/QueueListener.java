package com.company;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

@Component
public class QueueListener implements MessageListener {
	public void onMessage(final Message message) {
		if (message instanceof TextMessage) {
			final TextMessage textMessage = (TextMessage) message;
			try {
				System.out.println("Hi I received the message : " + textMessage.getText());
			} catch (final JMSException e) {
				e.printStackTrace();
			}
		}
	}
}
