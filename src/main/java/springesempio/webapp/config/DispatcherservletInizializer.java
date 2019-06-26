package springesempio.webapp.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherservletInizializer extends  AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 return new Class[]
	    {
			 WebApplicationContextConfig.class
		 };
	}

	@Override
	protected String[] getServletMappings() {
	  // qualsiasi chiamata eseguita al webserver verrà gestita dal dispatcherservlet

		return new String[]{ "/" };
	}

}
