
import java.io.FileInputStream;
import org.springframework.core.io.Resource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

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
            Employee emp = (Employee) factory.getBean("emloyee");

			System.out.println("employee is going to withDraw amount...");
			emp.withDrawFromAccount(100);
			System.out.println(emp.getName() + "  has withDrawn successfully...");
		}
		catch(Exception exp)
		{
			
		}
	}
}
