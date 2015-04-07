package springspelexample;


//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("employeeBean")
public class Employee {
	
	//@Value("James Smith")
	private String name;
	
	//@Value("#{companyBean}")
	private Company company;
	
	//@Value("Information Technology")
	private String departmentName;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString(){
		return "Employee " +name + " in " +company   +" and department " + departmentName ;
	}
}
