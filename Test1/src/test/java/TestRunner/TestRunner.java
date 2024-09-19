package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\nm22220\\eclipse-workspace\\nag\\Test1\\src\\test\\resources\\Features\\login.feature", 
    glue ="StepDefinitions",
    tags= "@smokeTest"
   )
public class TestRunner  {
}
