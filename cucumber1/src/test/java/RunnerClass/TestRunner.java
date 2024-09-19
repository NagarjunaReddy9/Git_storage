package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\nm22220\\eclipse-workspace\\nag\\cucumber1\\src\\test\\java\\features\\Test.feature", 
    glue ="Methods",
    tags= "@smokeTest"
   )
    


public class TestRunner {
    // Test runner code
}




  


