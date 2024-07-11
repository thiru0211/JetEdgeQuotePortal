package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JE_QP_8_WindTemp {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("To Check Wind Temp User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Wind Temp User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check Wind Temp")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");

	}

	@And("close the Wind Temp Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Click season setup button in wind temp")
	public void Click_user_report_button_in_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liWindTemp\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liWindTemp\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SRD1\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"SRD1\"]/a/span"));
		ele1.click();
	}

	@And("Select valid season in any month in season setup")
	public void Select_valid_season_in_any_month_in_season_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvSeason_rblSeason_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvSeason_rblSeason_0"));
		Select sel=new Select(ele);
		sel.selectByIndex(2);
	}
	
	@Then("Click clear button in season setup")
	public void Click_clear_button_in_season_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}
	
	@Then("Click update button in season setup")
	public void Click_update_button_in_season_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
	}
	
	@And("Click close button in season setup")
	public void Click_close_button_in_season_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele = driver.findElement(By.id("btnClose"));
		ele.click();
	}
	
	@Then("Change to default value in modified month in season setup")
	public void Change_to_default_value_in_modified_month_in_season_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvSeason_rblSeason_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvSeason_rblSeason_0"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	
	@Then("Click Static Routing Data button in wind temp")
	public void Click_Static_Routing_Data_button_in_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liWindTemp\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liWindTemp\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"SRD\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"SRD\"]/a/span"));
		ele1.click();
	}
	
	@And("Select valid aircraft type in Static Routing Data")
	public void Select_valid_aircraft_type_in_Static_Routing_Data() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtTripType")));
		ele = driver.findElement(By.id("cpWheelsUp_txtTripType"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_cbTripTypeALL")));
		ele1 = driver.findElement(By.id("cpWheelsUp_cbTripTypeALL"));
		if(!ele1.isSelected()) {
			ele1.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Image1")));
		ele = driver.findElement(By.id("cpWheelsUp_Image1"));
		ele.click();
	}
	
	@Then("Enter valid start airport in Static Routing Data")
	public void Enter_valid_start_airport_in_Static_Routing_Data() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFStartAirport")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFStartAirport"));
		ele.sendKeys("KMMU");
	}
	
	@And("Enter valid end airport in Static Routing Data")
	public void Enter_valid_end_airport_in_Static_Routing_Data() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFEndAirprot")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFEndAirprot"));
		ele.sendKeys("CYXU");
	}
	
	@Then("Click search button in Static Routing Data")
	public void Click_search_button_in_Static_Routing_Data() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	
	@And("Click export button in Static Routing Data")
	public void Click_export_button_in_Static_Routing_Data() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cpWheelsUp_btnexport")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnexport")));
		ele = driver.findElement(By.id("cpWheelsUp_btnexport"));
		ele.click();
	}
	
	@Then("Click Wind Temp Dump button in wind temp")
	public void Click_Wind_Temp_Dump_button_in_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liWindTemp\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liWindTemp\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"WTD\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"WTD\"]/a/span"));
		ele1.click();
	}
	
	@Then("Enter valid start airport in Wind Temp Dump")
	public void Enter_valid_start_airport_in_Wind_Temp_Dump() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFStartAirport")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFStartAirport"));
		ele.sendKeys("KMMU");
	}
	
	@And("Enter valid end airport in Wind Temp Dump")
	public void Enter_valid_end_airport_in_Wind_Temp_Dump() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFEndAirprot")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFEndAirprot"));
		ele.sendKeys("CYXU");
	}
	
	@Then("Click search button in Wind Temp Dump")
	public void Click_search_button_in_Wind_Temp_Dump() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	
	@And("Click export button in Wind Temp Dump")
	public void Click_export_button_in_Wind_Temp_Dump() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(2));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cpWheelsUp_btnexport")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnexport")));
		ele = driver.findElement(By.id("cpWheelsUp_btnexport"));
		ele.click();
	}
}
