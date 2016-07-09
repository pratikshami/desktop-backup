package Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sj.model.Customer;


public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ApplicationContext ctx=new ClassPathXmlApplicationContext("Mybeans.xml");
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("ByName.xml");
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("ByType.xml");
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("ByConstructor.xml");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("autowire.xml");
		
		Employee e1=(Employee)ctx.getBean("emp");
		
		
		System.out.println(e1);
		
		
		
	}

}
