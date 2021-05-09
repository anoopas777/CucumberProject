package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * Created by Karthik on 21/09/2019.
 */

@CucumberOptions(features = {"src/test/java/features"} , plugin = {"json:target/cucumber.json", "pretty","html:target/cucumber.html"},
        glue = "", monochrome=true,dryRun=false)
public class TestRunner extends AbstractTestNGCucumberTests {

//
   // @Override
   // @DataProvider
    //@DataProvider (parallel = true)
//    public Object[][] scenarios() {
//        return super.scenarios();
//    }

}
