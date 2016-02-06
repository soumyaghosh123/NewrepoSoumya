package Cucucmber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class samplecode {
	
	@Given("I am a bad tester")
	
	public void xxxx(){
		System.out.println("i am the boss");
	}
	
	@When ("^I come to [a-zA-Z]{1,}$")
	public void when_data(){
		System.out.println("datas are very strange");
		System.out.println("Another value creation");
		
	}
	@Then("^I feel [a-zA-Z]{1,}$")
	public void then_data(){
		System.out.println(" I am in then statement");
	}

}
