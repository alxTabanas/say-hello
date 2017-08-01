package com.alxtabanas;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(ignoreResourceNotFound=true,value="classpath:application.properties")
public class ConfigBean {
	
	@Value("${restapi.url}")
    private String restAPIUrl;
	
	@Value("${hello.msg}")
	private String hello;

    public String hello() {
        return hello;
    }

	public String getRestAPIUrl() {
		return restAPIUrl;
	}
    
    
}
