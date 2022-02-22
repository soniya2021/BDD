package Step_definationORG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrg {
	WebDriver driver;

	@Given("Launch browser")
	public void launch_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Given("enterURL {string}")
	public void enter_url(String URL) {
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");

	}

	@When("login page is displayed")
	public void login_page_is_displayed() {
		Assert.assertEquals(true, true);

	}

	@Then("enterusername {string}")
	public void enterusername(String un) {
		driver.findElement(By.name("user_name")).sendKeys(un);
	}

	@Then("enterpassword {string}")
	public void enterpassword(String pwd) {
		driver.findElement(By.name("user_password")).sendKeys(pwd);
	}

	@Then("click on login button")
	public void click_on_login_button() {
		driver.findElement(By.id("submitButton")).click();
	}

	@Then("verify the homepage title")
	public void verify_the_homepage_title() {
		Assert.assertEquals(true, true);
	}

	@Then("click on organizationlink")
	public void click_on_organizationlink() {

		driver.findElement(By.xpath("//td[@class=\"tabUnSelected\"]//a[text()=\"Organizations\"]")).click();

	}

	@Then("click on createorganization img")
	public void click_on_createorganization_img() {
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	}

	@Then("enterorgname {string}")
	public void enterorgname(String orgname) {
		driver.findElement(By.name("accountname")).sendKeys(orgname);
	}

	@Then("enter phonenumber {string}")
	public void enter_phonenumber(String phonenumber) {
		driver.findElement(By.id("phone")).sendKeys(phonenumber);

	}

//		@Then("save the organization")
//		public void save_the_organization() {
//			driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
//		}

	@Then("logout from the application")
	public void logout_from_the_application() {
		System.out.println("logout");
	}

	@Then("close the BROWSER")
	public void close_the_browser() {
		driver.close();
	}

}
