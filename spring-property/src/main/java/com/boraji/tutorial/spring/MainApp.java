package com.boraji.tutorial.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author imssbora
 */
public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);


        DBConfig bean = context.getBean(DBConfig.class);
        bean.print();

//      DataSource mysql = context.getBean("mysql", DataSource.class);
//      mysql.getConnection();

//      @SuppressWarnings("unused")
//      DataSource postgresql = context.getBean("postgresql", DataSource.class);
        context.close();
    }
}
