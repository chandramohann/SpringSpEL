package springspelexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

// in case reading for config.properties in resources:
//@Configuration
//@PropertySource({
	//"classpath:config.properties"
//})
@Component("projectEnvBean")
public class ProjectEnvironment {

	 @Autowired
	 Environment environment;
	 
	 //post Spring 3.2 syntax
	 @Value("#{ environment['appHome'] }")
	 private String appHome;	

	public String getAppHome() {
		return appHome;
	}

	public void setAppHome(String appHome) {
		this.appHome = appHome;
	}

	 
	 @Override
	 public String toString() {		 
		 return "environment variable value appHome = " +appHome.toString();	 
	 }
	
}
