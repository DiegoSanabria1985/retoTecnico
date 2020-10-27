package co.com.pageTest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/academyChoquearPrueba.feture",
        tags = "@stories",
        glue = " co.com.pageTest.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}