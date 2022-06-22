package com.emergon.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        Class[] configClassesForAll = {};
        return configClassesForAll;
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        Class[] configClassesForThisServlet = {MyWebAppConfig.class};
        return configClassesForThisServlet;
    }

    @Override
    protected String[] getServletMappings() {
        String[] urlMapping = {"/"};
        return urlMapping;
    }

}
