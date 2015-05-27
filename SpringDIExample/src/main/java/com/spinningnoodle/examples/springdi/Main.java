package com.spinningnoodle.examples.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by Freddy on 5/26/2015.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("META-INF/Beans.xml");
        SimpleExample simpleExample = (SimpleExample) applicationContext.getBean("simpleExample");
        simpleExample.processExample();
    }
}
