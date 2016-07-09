package sj.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sj.model.Customer;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ApplicationContext ctx=new ClassPathXmlApplicationContext("Mybeans.xml");
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("ByName.xml");
	//	ApplicationContext ctx=new ClassPathXmlApplicationContext("ByType.xml");
	//	ApplicationContext ctx=new ClassPathXmlApplicationContext("ByConstructor.xml");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("AutoDetect.xml");
		
		Customer cs=(Customer)ctx.getBean("CustomerBean");
		
		
		System.out.println(cs);
		
		
		
	}

}
