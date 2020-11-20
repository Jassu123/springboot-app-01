package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
private Map<String,Object> cahed=new HashMap<String,Object>();
	public static void main(String[] args) {
		
		
		SpringApplication.run(DemoApplication.class, args);
		
		System.out.println("added first statement");
		System.out.println("added first statement HIS-134");
		System.out.println("added first statement HIS-134");
	}
	
	public void doProcess(){
		//HIS-200
		
		
	}
	
	public void loadDataToCache(){
		//HIS-300
		
		
	}

}
