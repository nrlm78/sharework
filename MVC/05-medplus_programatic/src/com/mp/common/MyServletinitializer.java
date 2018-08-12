package com.mp.common;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;

import com.servlet.MyServlet;

public class MyServletinitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext)  {
	
		
		System.out.println("starting........");
		/*
		  XmlWebApplicationContext ctx = null;
		DispatcherServlet dispatcher = null;
		ctx = new XmlWebApplicationContext();
		ctx.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		dispatcher=new DispatcherServlet(ctx);
		
		*/
		
		//ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher", dispatcher);
		
		ServletRegistration.Dynamic dynamic = servletContext.addServlet("myServlet", new MyServlet());
		
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("/myServlet");

		System.out.println("done............");
		
	}

}
