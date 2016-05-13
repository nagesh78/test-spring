package org.nagesh.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by naveena_nagesh on 5/12/2016.
 */

public class Context {

    private static final Context instance = new Context();

    private static  ApplicationContext context;

    private Context() {
        init();
    }

    private void init() {
        context = new ClassPathXmlApplicationContext("spring-core.xml");

    }


    public static ApplicationContext getApplicationInstance() {
        return context;
    }
}
