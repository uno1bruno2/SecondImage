package com.qa.Camel;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class FtpToJHSExample {

//	public static void main(String[] args) throws Exception {
//		
//		CamelContext context = new DefaultCamelContext();
//		ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
//		context.addComponent("jms",JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
//		context.addRoutes(new RouteBuilder() {
//			@Override
//			public void configure() {
//				from ("ftp://test.rebex.net?username=demo&password=password").to("activemq:queue:orders");
//				from ("ftp://test.rebex.net/pub/example?username=demo&password=password").to("activemq:queue:orders");
//			}
//		});
//		context.start();
//		Thread.sleep(10000);
//		context.stop();
//		
//
//	}
	
	 public static void main(String args[]) throws Exception {
	        CamelContext context = new DefaultCamelContext();
	        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
	        context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
	        context.addRoutes(new RouteBuilder() {
	            @Override
	            public void configure() {
	                from("ftp://test.rebex.net?username=demo&password=password").process(new Processor() {
	                    public void process(Exchange exchange) throws Exception {
	                        System.out.println(
	                            "We just downloaded: " + exchange.getIn().getHeader("CamelFileName")
	                        );
	                    }
	                }).to("activemq:queue:orders"); 
	            }
	        });
	 
	        context.start();
	        Thread.sleep(10000);
	        context.stop();
	    }

}
