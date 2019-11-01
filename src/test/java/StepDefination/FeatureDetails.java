package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FeatureDetails {
	WebDriver driver;
	@Given(":User_should_be_in_home_page")
	public void User_should_be_in_home_page(){
		
	}
	@When(":Run the applicaton using browser")
	public void run_the_applicaton_using_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browsers Jars\\Chrome\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().window().maximize();
	}

	@Then(":Enter \"([^\"]*)\" and \"([^\"]*)\" in EditBox")
	public void enter_and_in_EditBox(String Username, String Password) {
		driver.findElement(By.id("username")).sendKeys(Username);
		driver.findElement(By.id("password")).sendKeys(Password);
	}

	@Then(":sign in the the application")
	public void sign_in_the_the_application() {
		driver.findElement(By.xpath("//button[@class='btn btn-primary sbutton']")).click();
	}

	@Then(":Home page should display")
	public void home_page_should_display() {
		System.out.println("Browser of the Title" + driver.getTitle());
	}

	@Then(":Close the Browser")
	public void close_the_Browser() {
		driver.quit();
	}


}
