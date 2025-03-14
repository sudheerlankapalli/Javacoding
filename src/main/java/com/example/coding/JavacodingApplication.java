package com.example.coding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.*;

@SpringBootApplication
public class JavacodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavacodingApplication.class, args);
		int a=12;
		String name="KRISHNA";
		StringBuilder sb =new StringBuilder(name);
		System.out.println(sb.length());
	System.out.println("Name is " +name);
	 
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Enter the first number");
	 int number1=sc.nextInt();
	 
	 System.out.println("Enter the second number");
	 int number2=sc.nextInt();
	 
	 System.out.println("Addition " +(number1+number2));
	 System.out.println("Subtraction "+(number1-number2));
	 System.out.println("Multiplication"+(number1*number2));
	 System.out.println("Division"+(number1/number2));
	 System.out.println("Reminder"+(number1%number2));
	 System.out.print("Simple text to check the git ");

	 System.out.print("Enter the name to print");
	 Scanner txt=new Scanner(System.in);
	 String str=txt.nextLine();
	 for (int i=0;i<=5;i++){
		 System.out.println(str);
	 }
    System.out.print("Simple text to check the git ");
	 System.out.println("Code form the master");
	}

}
