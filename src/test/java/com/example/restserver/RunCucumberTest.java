package com.example.restserver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},features = "src/test/java/com/example/restserver",snippets = SnippetType.CAMELCASE)
public class RunCucumberTest {
	
}
