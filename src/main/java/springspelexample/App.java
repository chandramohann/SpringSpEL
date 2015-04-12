package springspelexample;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


	public static void main(String[] args) {
			
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			Employee employee = (Employee) context.getBean("employeeBean");
			Company company = (Company) context.getBean("companyBean");
			
			Student student = (Student) context.getBean("studentBean");
			College college = (College) context.getBean("collegeBean");
			
			ProjectEnvironment pe = (ProjectEnvironment) context.getBean("projectEnvBean");
			
			System.out.println(employee.toString());
			
			System.out.println("\n" +student.toString());
			
			System.out.println("\n" +pe.toString());
			
			context.close();
	}
	
}
