package springspelexample;


import org.springframework.stereotype.Component;

@Component("employeeBean")
public class Employee {
	
	private String name;
	
	private Company company;
	
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
