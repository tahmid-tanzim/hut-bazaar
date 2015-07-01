/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tanzim.javabrains;

//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.FileSystemResource;

/**
 *
 * @author tanzim
 */
public class DrawingApp {
   public static void main(String[] args) {
        System.out.print("Hello World\n");
//        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
//        Triangle t = (Triangle) factory.getBean("triangle");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle t = (Triangle) context.getBean("triangle");
        t.draw();
    }    
}
