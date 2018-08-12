package com.mp.common;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MedplusDispatcherInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
		System.out.println("starting........");
		XmlWebApplicationContext ctx = null;
		DispatcherServlet dispatcher = null;
		ctx = new XmlWebApplicationContext();
		ctx.setConfigLocation("/WEB-INF/dispatcher-servlet.xml");
		dispatcher=new DispatcherServlet(ctx);
		ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher", dispatcher);
		dynamic.setLoadOnStartup(1);
		dynamic.addMapping("*.htm");

		System.out.println("done............");
	}
}
