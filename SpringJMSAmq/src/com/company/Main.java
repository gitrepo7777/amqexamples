package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		QueueSender queueSender = (QueueSender)context.getBean("qSender");
		queueSender.send("FIRST MSG");
		context.stop(); //try to solve 12/11/21 19:12:54 WARN listener.DefaultMessageListenerContainer: Could not refresh JMS Connection for destination 'Queue.Name' - retrying in 5000 ms. Cause: Could not connect to broker URL: tcp://localhost:61616. Reason: java.net.ConnectException: Connection refused: connect
	}
	
}
