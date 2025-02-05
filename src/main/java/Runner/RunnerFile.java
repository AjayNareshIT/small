package Runner;
import org.testng.annotations.AfterClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"Features/screenshotandreports.feature"},
                 glue =     {"Step_Definations"},
                 plugin =    { "pretty",
    		     "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = true )

public class RunnerFile extends AbstractTestNGCucumberTests{
}
