package com.spring_project.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpring {
	public static void main(String args []) {
		var context = new AnnotationConfigApplicationContext(Spring_Configuration.class);
		var name=context.getBean("name");
		var age=context.getBean("age");
		var person=context.getBean("person");
		var person1=context.getBean("person1");
		var person2=context.getBean("person2");
		var address=context.getBean("address");
		//System.out.println(context.getBean(Person.class));
		System.out.println(name+" \n"+age+" \n"+person+" \n"+person1+" \n"+person2+" \n"+address);
	}
	
}
