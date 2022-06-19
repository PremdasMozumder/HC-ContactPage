import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\premd\\eclipse-workspace\\HC-ContactPage\\src\\test\\java\\features\\contact.feature",
        glue = "stepDefinitions",
        plugin = {
                "json:target/cucumber.json"
        }
)


public class Runner {

}