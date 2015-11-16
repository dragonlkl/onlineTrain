package com.aleadin.train.startup;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan(basePackages = "com.aleadin.train")
@EnableAutoConfiguration
public class Application  extends WebMvcConfigurerAdapter implements ApplicationContextAware{
	public static ApplicationContext context;
	
    public static void main(String[] args) {
        SpringApplication.run(new Object[] {Application.class,DBConfig.class}, args);
    }

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;
		
	}
}
