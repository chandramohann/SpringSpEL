package springspelexample;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("studentBean")
public class Student {
	
	@Value("James Smith")
	private String studentName;
	
	@Value("Computer Science")
	private String major;

	private College college;
	
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString(){
		return "Student " +studentName + " from " +college.getCollgeName()   +" with a " + major  +" major";
	}
}
