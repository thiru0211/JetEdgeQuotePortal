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

public class JE_QP_6_QuoteReports {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("To Check Quote Reports User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Quote Reports User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check Quote Reports")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");

	}

	@And("close the Quote Reports Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Click the By User in Quote Reports")
	public void Click_the_price_rules_button_in_quote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liQuoteReports\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liQuoteReports\"]/a/span[2]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"liByUser\"]/a/span"));
		ele1.click();
	}

	@And("Select valid from date in by user")
	public void select_valid_from_date_in_by_user(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFromDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFromDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_title")));
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_title"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_month_0_0")));
		ele2 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_month_0_0"));
		ele2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_day_0_0")));
		ele3 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_0_0"));
		ele3.click();
		
	}
	@Then("Select valid sales rep in by user")
	public void select_valid_sales_rep_in_by_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlSalesRep")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlSalesRep"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@And("Select valid sort by in by user")
	public void select_valid_sort_by_in_by_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlSalesRep")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlSalesRep"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@Then("Click search button in by user")
	public void click_search_button_in_by_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	@And("Click export button in by user")
	public void click_export_button_in_by_user() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnExport")));
		ele = driver.findElement(By.id("cpWheelsUp_btnExport"));
		ele.click();
	}
	
	@Then("Click the By Day in Quote Reports")
	public void click_the_by_day_in_quote_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liQuoteReports\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liQuoteReports\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liByDate\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"liByDate\"]/a/span"));
		ele1.click();
	}
	@And("Select valid from date in By Day")
	public void select_valid_from_date_in_by_day() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFromDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFromDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_title")));
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_title"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_month_0_0")));
		ele2 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_month_0_0"));
		ele2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_day_0_0")));
		ele3 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_0_0"));
		ele3.click();
	}
	@And("Select valid sort by in By Day")
	public void select_valid_sort_by_in_by_day() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlSortBy")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@Then("Click search button in By Day")
	public void click_search_button_in_by_day() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	@And("Click export button in By Day")
	public void click_export_button_in_by_day() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnExport")));
		ele = driver.findElement(By.id("cpWheelsUp_btnExport"));
		ele.click();
	}
	
	@Then("Click the By Trip Type in Quote Reports")
	public void click_the_by_trip_type_in_quote_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liQuoteReports\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liQuoteReports\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liByTrip\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"liByTrip\"]/a/span"));
		ele1.click();
	}
	@And("Select valid from date in By Trip Type")
	public void select_valid_from_date_in_by_trip_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFromDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFromDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_title")));
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_title"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_month_0_0")));
		ele2 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_month_0_0"));
		ele2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_day_0_0")));
		ele3 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_0_0"));
		ele3.click();
	}
	@Then("Select valid Quoted For in By Trip Type")
	public void select_valid_quoted_for_in_by_trip_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlquotefor")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlquotefor"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@And("Select valid sort by in By Trip Type")
	public void select_valid_sort_by_in_by_trip_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlSortBy")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlSortBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@Then("Click search button in By Trip Type")
	public void click_search_button_in_by_trip_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	@And("Click export button in By Trip Type")
	public void click_export_button_in_by_trip_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnExport")));
		ele = driver.findElement(By.id("cpWheelsUp_btnExport"));
		ele.click();
	}
	
	@Then("Click the By Route in Quote Reports")
	public void click_the_by_route_in_quote_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liQuoteReports\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liQuoteReports\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liByRoute\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"liByRoute\"]/a/span"));
		ele1.click();
	}
	@And("Select valid Report Type in By Route")
	public void select_valid_report_type_in_by_route() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlTripType")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlTripType"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@Then("Select valid from date in By Route")
	public void select_valid_from_date_in_by_route() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFromDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFromDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_title")));
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_title"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_month_0_0")));
		ele2 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_month_0_0"));
		ele2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_day_0_0")));
		ele3 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_0_0"));
		ele3.click();
	}
	@And("Enter valid number in top box in By Route")
	public void enter_valid_number_in_top_box_in_by_route() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNum")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNum"));
		ele.clear();
		ele.sendKeys("20");
	}
	@Then("Click search button in By Route")
	public void click_search_button_in_by_route() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	@And("Click export button in By Route")
	public void click_export_button_in_by_route() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnExcel")));
		ele = driver.findElement(By.id("cpWheelsUp_btnExcel"));
		ele.click();
	}
	
	@Then("Click the Calendar View in Quote Reports")
	public void click_the_calendar_view_in_quote_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liQuoteReports\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liQuoteReports\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"li3\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"li3\"]/a/span"));
		ele1.click();
	}
	@And("Select valid Project Start in Calendar View")
	public void select_valid_project_start_in_calendar_view() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtProjStart")));
		ele = driver.findElement(By.id("cpWheelsUp_txtProjStart"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_title")));
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_title"));
		ele1.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_month_0_0")));
		ele2 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_month_0_0"));
		ele2.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_day_0_0")));
		ele3 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_0_0"));
		ele3.click();
	}
	@Then("Enter valid number in Display Week in Calendar View")
	public void enter_valid_number_in_display_week_in_calendar_view() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDisWeek")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDisWeek"));
		ele.clear();
		ele.sendKeys("20");
	}
	@Then("Click search button in Calendar View")
	public void click_search_button_in_calendar_view() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	@And("Click export button in Calendar View")
	public void click_export_button_in_calendar_view() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnExport")));
		ele = driver.findElement(By.id("cpWheelsUp_btnExport"));
		ele.click();
	}
}
