package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Invalidlogin {
	WebDriver driver;
	@Given("^Open chrome and$")
	public void open_chrome_and() {
		System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
	 
	}

	@When("^I enter invalid username and password$")
	public void i_enter_invalid_username_and_password() {
		driver.findElement(By.name("Email")).sendKeys("d170@yahoo.com");
		driver.findElement(By.id("Password")).sendKeys("passord");
	   
	}

	@Then("^User should not be able to login$")
	public void user_should_not_be_able_to_login(){
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

	}
}
