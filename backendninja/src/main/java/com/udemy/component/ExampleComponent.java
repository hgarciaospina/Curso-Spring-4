package com.udemy.component;

import org.apache.commons.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.udemy.controller.PostController;

@SuppressWarnings("unused")
@Component("exampleComponent")
public class ExampleComponent {
	
	private static final org.apache.juli.logging.Log LOG = LogFactory.getLog(ExampleComponent.class);
	
	public void sayHello() {
		LOG.info("HELLO FROM EXAMPLECOMPONENT");
		
	}

}
