package org.example;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Hello world!
 *
 */
public class App extends AbstractAnnotationConfigDispatcherServletInitializer
{
    /*public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }*/

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SecurityConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
