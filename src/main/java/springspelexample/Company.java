package springspelexample;

import org.springframework.stereotype.Component;

@Component("companyBean")
public class Company {

	private long businessNumber;
	
	private String name;

	public long getBusinessNumber() {
		return businessNumber;
	}

	public void setBusinessNumber(long businessNumber) {
		this.businessNumber = businessNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	} 

	@Override
	public String toString(){
		return name;
	}
}