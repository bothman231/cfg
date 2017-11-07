package com.botham.config.ConfigClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@SpringBootApplication
@RestController
public class MyController {
	
	@Value("${id:not available from repo please check}")
	String id;
	
	@RequestMapping(value="/")
	public String who() {
		return " this value is from the config file on github="+id;
	}
	
}
