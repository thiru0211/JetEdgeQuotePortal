package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JE_QP_1_SignIn {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check Signin User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Signin User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check Signin")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");
		
	}
	
	@Then("Check error message in signin page")
	public void Check_error_message_in_signin_page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("lblInvalidLogin")));
		ele=driver.findElement(By.id("lblInvalidLogin"));
		String ErrorMsg = ele.getText();
		System.out.println("Error Message Displayed Like : "+ErrorMsg);
	}
	
	@And("close the Signin Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Click the menu icon in homepage")
	public void Click_the_menu_icon_in_homepage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"kt_quick_user_toggle\"]/span/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"kt_quick_user_toggle\"]/span/span"));
		ele.click();
	}
	
	@And("Click Signout button in homepage")
	public void Click_Signout_button_in_homepage() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("A1")));
		ele = driver.findElement(By.id("A1"));
		ele.click();
	}
	
	@When("To Check Signin User Enter Invalid username and password are {string} and {string}")
	public void To_Check_Signin_User_Enter_Invalid_username_and_password_are(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
		
	}
	
	@When("To Check Signin User Enter username and invalid password are {string} and {string}")
	public void To_Check_Signin_User_Enter_username_and_Invalid_password_are(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}
	
	@When("To Check Signin User Enter invalid username and invalid password are {string} and {string}")
	public void To_Check_Signin_User_Enter_invalid_username_and_Invalid_password_are(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}
	
	@When("To Check Signin User Enter username and without password are {string} and {string}")
	public void To_Check_Signin_User_Enter_username_and_without_password_are(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}
	
	@When("To Check Signin User without username and valid password are {string} and {string}")
	public void To_Check_Signin_User_without_username_and_valid_password_are(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}
}
