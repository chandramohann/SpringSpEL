package springspelexample;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


	public static void main(String[] args) {
			
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Employee employee = (Employee) context.getBean("employeeBean");
			Company company = (Company) context.getBean("companyBean");
			System.out.println(employee.toString());
			context.close();
	}
	
}
