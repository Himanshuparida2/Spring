package com.spring_project.first;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age) {}
record Address(String area,String city) {}

@Configuration
public class Spring_Configuration {
	@Bean
	public String name() {
		return "Himanshu Sekhar Parida";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	
	@Primary	
	@Bean
	public Person person() {
		return new Person("Himanshu",16);
	}
	
	@Bean
	public Person person1() {
		return new Person(name(),age());
	}
	
	@Bean
	public Person person2(String name,int age) {
		return new Person(name,age);
	}
	
	@Bean
	public Address address() {
		return new Address("Badagada","Bhubaneswar");
	}
}
