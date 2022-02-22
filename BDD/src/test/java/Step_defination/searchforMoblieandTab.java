package Step_defination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class searchforMoblieandTab 
{
	//WebDriver driver;

	@Given("launch browser")
	public void launch_browser() {
		//WebDriverManager.chromedriver().setup();
		//  driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Given: launching the browser");	
	}

	@When("enter url")
	public void enter_url() {
		//driver.manage().window().maximize();
		//driver.get("http://www.flipcart.com");
		System.out.println("When: entered the url");
	}

	@Then("search for samsung mobile")
	public void search_for_samsung_mobile() {
		System.out.println("Then:searching for samsung mobiles");

	}

	@Then("search for samsung tab")
	public void search_for_samsung_tab() {
		System.out.println("Then: searching for samsung tab");
	}
}
