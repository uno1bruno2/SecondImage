package com.qa.Camel;

import javax.jms.ConnectionFactory;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.Expression;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jms.JmsComponent;
import org.apache.camel.component.properties.PropertiesComponent;
import org.apache.camel.impl.DefaultCamelContext;

public class FtpToJMSExampleWithPropertiesFile {
	
	 public static void main(String args[]) throws Exception {
	        CamelContext context = new DefaultCamelContext();
	        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost");
	 
	        PropertiesComponent prop = context.getComponent("properties", PropertiesComponent.class);
	        prop.setLocation("classpath:system-properties.properties");
	        
	        context.addComponent("jms", JmsComponent.jmsComponentAutoAcknowledge(connectionFactory));
	        context.addRoutes(new RouteBuilder() {
	            @Override
	            public void configure() {
//	                from("ftp://test.rebex.net?username=demo&password=password").to("activemq:queue:{{myDest}}");
	            	
//	            	from("ftp://test.rebex.net?username=demo&password=password")
//	            		.choice()
//                			.when(header("CamelFileName").endsWith(".xml"))
//                				.to("activemq:xmlOrders")
//                			.when(header("CamelFileName").regex("^.*(csv|csl)$"))
//                				.to("activemq:csvOrders")
//                			.otherwise()
//                				.to("activemq:otherOrders")
//                			.end()
//        				.to("activemq:continuedProcessing");
	            	
//	            	from("ftp://test.rebex.net?username=demo&password=password")
//	            		.filter(header("CamelFileName").endsWith(".txt"))
//	            			.to("activemq:queue:txtOrders");
	            	
//	            	from("activemq:xmlOrders").multicast().parallelProcessing()
//	            		.to("activemq:accounting","activemq:production");
	            	
//	            	from("activemq:xmlOrders").multicast().parallelProcessing().stopOnException()
//	            		.to("activemq:accounting").to("activemq:orders");
//	            	from("activemq:accounting").throwException(Exception.class,"I failed").log("Accounting recieved order:${header:CamelFileName}")
//	            		.to("activemq:orders");
	            	
	            	from("file:inbox").transform(body().regexReplaceAll("", "<br/>")).to("file:outbox");
	            	
	            	from("file:inbox?noop=true").transform(new Expression() {
	            		public <T> T evaluate(Exchange exchange, Class<T> type) {
	            			String body = exchange.getIn().getBody(String.class);
	            			body = body.replaceAll("","<br/>");
	            			body = "<body>" + body + "</body>";
	            			return (T) body;
	            		}
	            	}).to("file:outbox");
	            }
	        });
	        context.start();
	        Thread.sleep(10000);
	        context.stop();
	    }

}
