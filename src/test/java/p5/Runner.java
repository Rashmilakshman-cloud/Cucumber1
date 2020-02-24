package p5;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//@CucumberOptions(tags= {"@Login"})
@CucumberOptions(monochrome=true,plugin= {"pretty","json:cucumber-reports.json"})
//@CucumberOptions(monochrome=true,plugin= {"pretty","html:cucumberreport.html"})
//CucumberOptions(monochrome=true,plugin= {"pretty","junit:cucumberunit.xml"})
@RunWith(Cucumber.class)
public class Runner {

}
