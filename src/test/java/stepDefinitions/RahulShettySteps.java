package stepDefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RahulShettySteps {
	
	/*
	 * Given User is on Rahul Shetty login Page
	When User tries to update form details as below
	|Rahul Shetty|
	|rahul.shetty@gmail.com|
	|RahulShetty|
	|09-09-2000|
	Then User submits the details
	
	
	
	------------
	
	 Scenario: Updating the fields in login form
    Given User is on Rahul Shetty login Page
    When User tries to update form details as below
      | Username    | Rahul Shetty           |
      | Email       | rahul.shetty@gmail.com |
      | Password    | RahulShetty            |
      | DateOfBirth | 09-09-2000             |
    Then User submits the details
	 */
	
	WebDriver driver;
	
	@Given("User is on Rahul Shetty login Page")
	public void loginPage()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
	}
	
	@When("^User tries to update form details as below using List$")
	public void enterLoginDetailsUsingList(List<String> userData)			//since datatable is in list format..
	{
		driver.findElement(By.name("name")).sendKeys(userData.get(0));
		driver.findElement(By.name("email")).sendKeys(userData.get(1));
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(userData.get(2));
		driver.findElement(By.name("bday")).sendKeys(userData.get(3));
	}
	
	@When("^User tries to update form details as below using Maps$")
	public void enterLoginDetailsUsingMaps(Map<String,String> userData)			//since datatable is in list format..
	{
		driver.findElement(By.name("name")).sendKeys(userData.get("Username"));
		driver.findElement(By.name("email")).sendKeys(userData.get("Email"));
		driver.findElement(By.id("exampleInputPassword1")).sendKeys(userData.get("Password"));
		driver.findElement(By.name("bday")).sendKeys(userData.get("DateOfBirth"));
	}
	
	@When("^User tries to update form details as below using Maps co-pilot$")
	public void enterLoginDetailsUsingMaps(io.cucumber.datatable.DataTable dataTable) {
	    Map<String, String> userData = dataTable.asMap(String.class, String.class);

	    driver.findElement(By.name("name")).sendKeys(userData.get("Username"));
	    driver.findElement(By.name("email")).sendKeys(userData.get("Email"));
	    driver.findElement(By.id("exampleInputPassword1")).sendKeys(userData.get("Password"));
	    driver.findElement(By.name("bday")).sendKeys(userData.get("DateOfBirth"));
	}
	
	@When("^User tries to update form details as below using DataTablesMap$")
	public void enterLoginDetailsUsingDTMaps(DataTable dataTable) {
	    Map<String, String> userData = dataTable.asMap(String.class, String.class);

	    driver.findElement(By.name("name")).sendKeys(userData.get("Username"));
	    driver.findElement(By.name("email")).sendKeys(userData.get("Email"));
	    driver.findElement(By.id("exampleInputPassword1")).sendKeys(userData.get("Password"));
	    driver.findElement(By.name("bday")).sendKeys(userData.get("DateOfBirth"));
	}
	
	@When("^User tries to update form details as below using DataTablesList$")
	public void enterLoginDetailsUsingDTList(DataTable dataTable) {
	    List<String> userData = dataTable.asList(String.class);

	    driver.findElement(By.name("name")).sendKeys(userData.get(0));
	    driver.findElement(By.name("email")).sendKeys(userData.get(1));
	    driver.findElement(By.id("exampleInputPassword1")).sendKeys(userData.get(2));
	    driver.findElement(By.name("bday")).sendKeys(userData.get(3));
	}
	
	@When("^User tries to update form details as below using DataTablesListOfMap$")
	public void enterLoginDetailsUsingDTListOfMaps(DataTable dataTable) {
		List<Map<String, String>> userDatas = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> userData : userDatas)
		{
			driver.findElement(By.name("name")).sendKeys(userData.get("Username"));
			driver.findElement(By.name("email")).sendKeys(userData.get("Email"));
			driver.findElement(By.id("exampleInputPassword1")).sendKeys(userData.get("Password"));
			driver.findElement(By.name("bday")).sendKeys(userData.get("DateOfBirth"));
			
			try {
				Thread.sleep(3000);
				driver.navigate().refresh();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	@Then("User submits the details")
	public void submitDetails()
	{
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

}
