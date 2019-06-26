package springesempio.webapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// classe per  gestione configurazioni

//notazioni le @

@Configuration
@EnableWebMvc
@ComponentScan(basePackages ="springesempio.webapp" )//dove riceercare 
public class WebApplicationContextConfig  implements WebMvcConfigurer{

	 
	public  void configureDefaultServletHandling (DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
//		WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
	}
	
	//attivazione viewresolver
	@Bean
	public   InternalResourceViewResolver getInternalResourceVieverResolver() {
	 
			InternalResourceViewResolver resolver= new InternalResourceViewResolver();
					resolver.setViewClass(JstlView.class);
					
					resolver.setPrefix("/WEB-INF/view/");
					resolver.setSuffix(".jsp");
					
					return resolver;
	
	}

}
