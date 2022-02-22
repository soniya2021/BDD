package Step_defination;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;

	@Given("launch the brower")
	public void launch_the_brower() {
	    
		WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("enter the url")
	public void enter_the_url() {
	   driver.get("http://localhost:8888"); 
	}

	@Then("enter the username")
	public void enter_the_username() {
	 driver.findElement(By.name("user_name")).sendKeys("admin");
	 
	}

	@Then("enter the password")
	public void enter_the_password() {
    driver.findElement(By.name("user_password" )).sendKeys("admin");

	}

	@Then("click on login_button")
	public void click_on_login_button() {
	 driver.findElement(By.id("submitButton")).click();
	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(1500);
		driver.close();
	}
	@When("enter the url {string}")
	public void enter_the_url(String URL) {
		 driver.get(URL);

	}

	@Then("enter the username {string}")
	public void enter_the_username(String UN) {
		 driver.findElement(By.name("user_name")).sendKeys(UN);

	}

	@Then("enter the password {string}")
	public void enter_the_password(String PWD) {
		 driver.findElement(By.name("user_password")).sendKeys(PWD);
	}
	@Then("click on homepage")
	public void click_on_homepage() {
		driver.findElement(By.name("home_page")).click();
	}

	@Then("click on leads")
	public void click_on_leads() {
		driver.findElement(By.name("leads")).click();

	}
}
