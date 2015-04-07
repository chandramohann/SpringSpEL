package springspelexample;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("companyBean")
public class Company {

	//@Value("12345")
	private long businessNumber;
	
	//@Value("Acme Company")
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