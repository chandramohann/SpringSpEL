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
			
			SecondProjectEnvironment pe2 = (SecondProjectEnvironment) context.getBean("secondProjectEnvBean");
			
			System.out.println(employee.toString());
			
			System.out.println(student.toString());
			
			System.out.println(pe.toString());
			
			System.out.println(pe2.toString());
			
			context.close();
	}
	
}
