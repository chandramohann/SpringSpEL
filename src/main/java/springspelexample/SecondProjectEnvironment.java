package springspelexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


@Configuration
@PropertySource({
	"classpath:config.properties"
})
@Component("secondProjectEnvBean")
public class SecondProjectEnvironment {

	 @Autowired
	 Environment environment;
	 
	 //post Spring 3.2 syntax
	 @Value("#{ environment['appHome2'] }")
	 private String appHome2;	

	public String getAppHome2() {
		return appHome2;
	}

	public void setAppHome2(String appHome2) {
		this.appHome2 = appHome2;
	}
	 
	 @Override
	 public String toString() {		 
		 return "environment variable value appHome = " +appHome2.toString();	 
	 }
	
}
