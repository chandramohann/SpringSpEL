package springspelexample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("collegeBean")
public class College {


    @Value("Eastern Florida State College")
	private String collgeName;

	@Value("7547")
	private int noStudentsEnrolled;
	
	
	public int getNoStudentsEnrolled() {
		return noStudentsEnrolled;
	}

	public void setNoStudentsEnrolled(int noStudentsEnrolled) {
		this.noStudentsEnrolled = noStudentsEnrolled;
	}

	public String getCollgeName() {
		return collgeName;
	}

	public void setCollgeName(String collgeName) {
		this.collgeName = collgeName;
	} 

	@Override
	public String toString(){
		return collgeName;
	}
}
