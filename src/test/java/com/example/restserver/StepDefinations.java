package com.example.restserver;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.DEFINED_PORT,classes = RestserverApplication.class)
public class StepDefinations {
	
	String url = null;
	double result = 0 ;
	@Given("rest api {string}")
	public void restApi(String url) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		this.url = url;
	}

	@When("I invoke api")
	public void iInvokeApi() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		RestTemplate restAPI = new RestTemplate();
		result = restAPI.getForObject(url,Double.class);
	}

	@Then("expected result {double}")
	public void expectedResult(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		assertEquals(double1,result,0.001);
	}

}
