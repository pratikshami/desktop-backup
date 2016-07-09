/**
 * 
 */
package sj;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

//import sj.Hello;

/**
 * @author JOSHI
 *
 */
public class StudentTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
		"SpringHelloWorld.xml"));

Student myBean = (Student) beanFactory.getBean("StBean");
Student myBean1 = (Student) beanFactory.getBean("StBean"); 
    
   //    System.out.println(myBean.equals(myBean1));
   //    System.out.println(myBean==myBean1);

// myBean.sayHello();
	System.out.println(myBean);	
	}

}
