
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.emp.Employee;


public class EmployeeTest
{
	public static void main(String[] args) 
	{
		try
		{
			//following line is traditional way of creating an Employee
			//Employee emp = new Employee("Amit");

			Resource resource = new FileSystemResource(".\\config\\employees.xml");
			BeanFactory factory = new XmlBeanFactory(resource);
            Employee emp1 = (Employee) factory.getBean("employee");

			Employee emp2 = (Employee) factory.getBean("employee");

			if(emp1 == emp2)
			{
				System.out.println("The 2 reference variables of type Employee are same....Singleton");
			}
			else
			{
				System.out.println("The 2 reference variables of type Employee are different.....prototype");
			}
            if(emp1.equals(emp2))
			{
				System.out.println("The 2 employees are symantically equivalent.");
			}
			else
			{
				System.out.println("The 2 employees are symantically NOT equivalent.");
			}


			Employee emp3 = (Employee) factory.getBean("otheremployee");
		

		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
}
