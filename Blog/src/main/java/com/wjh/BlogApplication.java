package com.wjh;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableTransactionManagement//添加对应的事务处理
@MapperScan("com.wjh.dao")
public class BlogApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	
	//用于配置tomcat识别JavaConfig配置
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(BlogApplication.class);
	}
	
	//用于配置上下文参数
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter("appName", "博客管理系统");
	}
	
	
	
}
