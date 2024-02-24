package com.java.springframework.di.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.java.springframework.di.service.MessageService;

@Component
public class FieldBasedInjection {
	
	    @Autowired
	    @Qualifier("TwitterService")
		private MessageService messageService;

		public void processMsg(String message) {
			messageService.sendMsg(message);
		}
}
