package estudosCucumber;

import org.junit.runner.RunWith;
import cucumber.api.junit.*;
import io.cucumber.junit.CucumberOptions;

@SuppressWarnings("deprecation")
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test")
public class Runner {

}
