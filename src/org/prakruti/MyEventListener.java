package org.prakruti;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationEvent;

@Component
public class MyEventListener implements ApplicationListener{

	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
//		System.out.println(event.toString());
		
	}
	
}
