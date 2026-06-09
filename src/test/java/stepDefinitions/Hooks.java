package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

//Hooks must always be under glue package..
//Scope of background is within a feature file..
//Scope of Hooks (Before and After Hooks) are within all the feature files in the project..

//Order of execution - Before hooks -> Background -> Scenario -> After hooks
//Hooks are used in case when scenarios have partial common code per feature file..

public class Hooks {
	
	//@Before - this will run for all the scenarios in feature file since no tags are passed...
	
	@Before("@AdminLogin")		//will run only for scenarios with @AdminLogin tags
	public void adminSetup()
	{
		System.out.println("Setting up stuffs for admin user....");
	}
	
	@Before("@CreditLogin")		//will run only for scenarios with @CreditLogin tags
	public void creditUserSetup()
	{
		System.out.println("Setting up stuffs for cards user....");
	}
	
	//@After - this will run for all the scenarios in feature file since no tags are passed...
	
	@After("@AdminLogin")		//will run only for scenarios with @AdminLogin tags
	public void adminCloseUp()
	{
		System.out.println("Closing up stuffs for admin user....");
	}
	
	@After("@CreditLogin")		//will run only for scenarios with @CreditLogin tags
	public void creditCloseUp()
	{
		System.out.println("Closing up stuffs for cards user....");
	}

}
