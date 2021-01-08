package com.java.example.config;

import com.java.example.util.ViewNames;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


@Configuration
@ComponentScan(basePackages = "com.java.example")
public class WebConfig implements WebMvcConfigurer {
    //Constants

    public static final String RESOLVER_PREFIX ="/WEB-INF/View/";
    public static final String RESOLVER_SUFIX=".jsp";

    //Bean method for resolver
    @Bean
    public ViewResolver viewResolver(){
        UrlBasedViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix(RESOLVER_PREFIX);
        viewResolver.setSuffix(RESOLVER_SUFIX);
        return viewResolver;
    }



    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName(ViewNames.HOME);
        registry.addViewController("home").setViewName(ViewNames.HOME);
        registry.addViewController("welcome").setViewName(ViewNames.WELCOME);
    }
/*
  public void addResourceHandlers(final ResourceHandlerRegistry registry ){
        registry.addResourceHandler("/resources/***").addResourceLocations("/resources/");
    }
 */



}
