package com.distribution.dubbo.provider;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.alibaba.dubbo.rpc.RpcContext;
import com.distribution.dubbo.api.FirstService;

public class FirstServiceImpl implements FirstService{

	public String echo(String text) {
		System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + text + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + text + ", response form provider: " + RpcContext.getContext().getLocalAddress();
	}

	

}
