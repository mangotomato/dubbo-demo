package com.distribution.dubbo.consumer;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.distribution.dubbo.api.FirstService;

public class ConsumerAction {
	
	private FirstService firstService;

	public void setFirstService(FirstService firstService) {
		this.firstService = firstService;
	}
	
	public void start() throws Exception {
        for (int i = 0; i < Integer.MAX_VALUE; i ++) {
            try {
            	String hello = firstService.echo("world" + i);
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(2000);
        }
	}
	
}
