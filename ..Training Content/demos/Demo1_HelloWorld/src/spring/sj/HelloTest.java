/**
 * 
 */
package spring.sj;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author JOSHI
 *
 */
public class HelloTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
		"SpringHelloWorld.xml"));

    Hello myBean = (Hello) beanFactory.getBean("HelloBean");
      myBean.sayHello();
      /*Hello myBean1 = (Hello) beanFactory.getBean("HelloBean");	
      
      if(myBean==myBean1)
      System.out.println("singleton");
      
      else
    	  System.out.println("prototype");*/
	}

}
