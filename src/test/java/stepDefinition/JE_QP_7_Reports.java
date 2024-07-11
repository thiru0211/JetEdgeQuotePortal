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

public class JE_QP_7_Reports {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("To Check Reports User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Reports User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check Reports")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");

	}

	@And("close the Reports Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Click user report button in reports")
	public void Click_user_report_button_in_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liReports\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liReports\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"UREP\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"UREP\"]/a/span"));
		ele1.click();
	}

	@Then("Select valid from date in user report")
	public void select_valid_from_date_in_user_report() {
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
	@And("Enter valid username in user report")
	public void enter_valid_username_in_user_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSearchScreen")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSearchScreen"));
		ele.sendKeys("Soundharya Support Team");
	}
	@Then("Click search button in user report")
	public void click_search_button_in_user_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	@And("Click view button in user report")
	public void click_view_button_in_user_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvLogAudit_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvLogAudit_imbView_0"));
		ele.click();
	}

	@Then("Click close button in user report")
	public void click_close_button_in_user_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("img1")));
		ele = driver.findElement(By.id("img1"));
		ele.click();
	}


	@And("Click Ratio Group button in event log report")
	public void click_ratio_group_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_4")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_4"));
		ele.click();
	}

	@Then("Click event log report button in reports")
	public void click_event_log_report_button_in_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liReports\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liReports\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ALR\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"ALR\"]/a/span"));
		ele1.click();
	}
	@And("Enter valid from date in event log report")
	public void enter_valid_from_date_in_event_log_report() {
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
	@Then("Click search button in event log report")
	public void click_search_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	@And("Click view button in event log report")
	public void click_view_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAlertLog_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAlertLog_imbView_0"));
		ele.click();
	}
	@Then("Click close button in event log report")
	public void click_close_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCloe")));
		ele = driver.findElement(By.id("btnCloe"));
		ele.click();
	}

	@Then("Modify valid details in event log report")
	public void modify_valid_details_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDepartMin")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDepartMin"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1= driver.findElement(By.id("cpWheelsUp_txtDepartMin"));
		ele1.sendKeys(text);
	}
	@And("Click update button in event log report")
	public void click_update_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
	}

	@And("Click tax setup button in event log report")
	public void click_tax_setup_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_0"));
		ele.click();
	}
	@And("Click view button in tax setup")
	public void click_view_button_in_tax_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cpWheelsUp_gvAlertLog_imbView_0")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAlertLog_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAlertLog_imbView_0"));
		ele.click();
	}
	@Then("Click close button in tax setup in event log report")
	public void click_close_button_in_tax_setup_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCloe")));
		ele = driver.findElement(By.id("btnCloe"));
		ele.click();
	}

	@And("Click Global Config button in event log report")
	public void click_global_config_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_1"));
		ele.click();
	}
	@Then("Click view button in Global Config")
	public void click_view_button_in_global_config() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAlertLog_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAlertLog_imbView_0"));
		ele.click();
	}
	@And("Click close button in Global Config")
	public void click_close_button_in_global_config() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCloe")));
		ele = driver.findElement(By.id("btnCloe"));
		ele.click();
	}

	@And("Click Account Type button in event log report")
	public void click_Account_Type_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_2"));
		ele.click();
	}

	@And("Click Flying Hour Setup button in event log report")
	public void click_flying_hour_setup_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3"));
		ele.click();
	}

	@And("Click User Setup button in event log report")
	public void click_User_setup_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3"));
		ele.click();
	}

	@And("Click Pricing Component button in event log report")
	public void click_Pricing_Component_setup_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3"));
		ele.click();
	}

	@And("Click Price Formula button in event log report")
	public void click_Price_Formula_setup_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3"));
		ele.click();
	}

	@And("Click Fleet Group button in event log report")
	public void click_Fleet_Group_setup_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3"));
		ele.click();
	}

	@And("Click Date Group button in event log report")
	public void click_date_group_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_0"));
		ele.click();
	}

	@And("Click Airport Group button in event log report")
	public void click_Airport_group_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_1"));
		ele.click();
	}

	@And("Click Tail Group button in event log report")
	public void click_Tail_group_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_2"));
		ele.click();
	}

	@And("Click Customer Group button in event log report")
	public void click_Customer_group_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_3"));
		ele.click();
	}

	@And("Click Price Rules button in event log report")
	public void click_Price_Rules_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_2_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_2_lnkScreen_0"));
		ele.click();
	}

	@And("Click Excel Upload button in event log report")
	public void click_Excel_Upload_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_2_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_2_lnkScreen_1"));
		ele.click();
	}

	@And("Click Prepare Quote button in event log report")
	public void click_Prepare_Quote_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_0"));
		ele.click();
	}

	@And("Click CT Tail Availability button in event log report")
	public void click_CT_Tail_Availability_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_1"));
		ele.click();
	}

	@And("Click Notes button in event log report")
	public void click_Notes_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_2"));
		ele.click();
	}

	@And("Click Terms and Condition button in event log report")
	public void click_Terms_and_Condition_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_3"));
		ele.click();
	}

	@And("Click User Report button in event log report")
	public void click_User_Report_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_0"));
		ele.click();
	}

	@And("Click Alert Log Report button in event log report")
	public void click_Alert_Log_Report_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_1"));
		ele.click();
	}

	@And("Click Error Log Report button in event log report")
	public void click_Error_Log_Report_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_2"));
		ele.click();
	}

	@And("Click Constant Values button in event log report")
	public void click_Constant_Values_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_0"));
		ele.click();
	}

	@And("Click Aircraft Type button in event log report")
	public void click_Aircraft_Type_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_1"));
		ele.click();
	}

	@And("Click Relocation Parameters button in event log report")
	public void click_Relocation_Parameters_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_2"));
		ele.click();
	}

	@And("Click Airport Setup button in event log report")
	public void click_Airport_Setup_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_3"));
		ele.click();
	}

	@And("Click Carriers button in event log report")
	public void click_Carriers_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_4")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_4"));
		ele.click();
	}

	@And("Click Schedule Rules button in event log report")
	public void click_Schedule_Rules_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_5")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_5"));
		ele.click();
	}

	@And("Click Commercial Flights button in event log report")
	public void click_Commercial_Flights_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_6")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_6"));
		ele.click();
	}

	@And("Click Tail Setup button in event log report")
	public void click_Tail_Setup_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_7")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_7"));
		ele.click();
	}

	@And("Click Custom Ground Rules button in event log report")
	public void click_Custom_Ground_Rules_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_8")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_8"));
		ele.click();
	}

	@And("Click Crew Setup button in event log report")
	public void click_Crew_Setup_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_9")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_9"));
		ele.click();
	}

	@And("Click Static Routing Data button in event log report")
	public void click_Static_Routing_Data_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_6_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_6_lnkScreen_0"));
		ele.click();
	}

	@And("Click Wind Temp Dump button in event log report")
	public void click_Wind_Temp_Dump_button_in_event_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_6_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_6_lnkScreen_1"));
		ele.click();
	}

	@Then("Click error log report button in reports")
	public void click_error_log_report_button_in_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liReports\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liReports\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ELR\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"ELR\"]/a/span"));
		ele1.click();
	}
	@And("Select valid from date in error log report")
	public void select_valid_from_date_in_error_log_report() {
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
	@Then("Select valid status in error log report")
	public void select_valid_status_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlFilterStatus")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFilterStatus"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@And("Click search button in error log report")
	public void click_search_button_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}

	@Then("Click edit button in error log report")
	public void click_edit_button_in_error_log_report() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvErrorLog_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvErrorLog_imbView_0"));
		ele.click();
	}

	@And("Click back button in error log report")
	public void click_back_button_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}

	@And("Modify details in error log report")
	public void modify_details_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele1.sendKeys(text);
	}
	@Then("Click update button in error log report")
	public void click_update_button_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
	}

	@Then("Click tax setup button in Masters")
	public void click_tax_setup_button_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_0"));
		ele.click();
	}
	
	@Then("Click Global Config button in Masters")
	public void click_Global_Config_button_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_1"));
		ele.click();
	}
	
	@Then("Click Account Type button in Masters")
	public void click_Account_Type_button_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_2"));
		ele.click();
	}
	
	@Then("Click Flying Hour setup button in Masters")
	public void click_Flying_Hour_setup_button_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3"));
		ele.click();
	}
	
	@Then("Click User setup button in Masters")
	public void click_User_setup_button_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_4")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_4"));
		ele.click();
	}
	
	@Then("Click Pricing Component button in Masters")
	public void click_Pricing_Component_button_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_5")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_5"));
		ele.click();
	}
	
	@Then("Click Price Formula button in Masters")
	public void click_Price_Formula_button_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_6")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_6"));
		ele.click();
	}
	
	@Then("Click Fleet Group button in error log report")
	public void click_Fleet_Group_button_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_7")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_7"));
		ele.click();
	}
	
	@Then("Click Date Group button in error log report")
	public void click_Date_Group_button_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_0"));
		ele.click();
	}
	
	@Then("Click Airport Group button in error log report")
	public void click_Airport_Group_button_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_1"));
		ele.click();
	}
	
	@Then("Click Tail Group button in error log report")
	public void click_Tail_Group_button_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_2"));
		ele.click();
	}
	
	@Then("Click Customer Group button in error log report")
	public void click_Customer_Group_button_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_3"));
		ele.click();
	}
	@Then("Click Ratio Group button in error log report")
	public void click_Ratio_Group_button_in_error_log_report() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_4")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_1_lnkScreen_4"));
		ele.click();
	}
	
	@Then("Click Price Rules button in Pricing")
	public void click_Price_Rules_button_in_Pricing() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_2_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_2_lnkScreen_0"));
		ele.click();
	}
	
	@Then("Click Excel Upload button in Pricing")
	public void click_Excel_Upload_button_in_Pricing() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_2_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_2_lnkScreen_1"));
		ele.click();
	}
	@Then("Click Prepare Quote button in Quote")
	public void click_Prepare_Quote_button_in_Quote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_0"));
		ele.click();
	}
	
	@Then("Click CT Tail Availability button in Quote")
	public void click_CT_Tail_Availability_button_in_Quote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_1"));
		ele.click();
	}
	
	@Then("Click Notes button in Quote")
	public void click_Notes_button_in_Quote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_2"));
		ele.click();
	}
	
	@Then("Click Terms and Condition button in Quote")
	public void click_Terms_and_Condition_button_in_Quote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_3_lnkScreen_3"));
		ele.click();
	}
	
	@Then("Click User Report button in reports")
	public void click_User_Report_button_in_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_0"));
		ele.click();
	}
	
	@Then("Click Alert Log Report button in reports")
	public void click_Alert_Log_Report_button_in_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_1"));
		ele.click();
	}
	
	@Then("Click Error Log Report button in reports")
	public void click_Error_Log_Report_button_in_reports() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_4_lnkScreen_2"));
		ele.click();
	}

	@Then("Click Constant Values button in Bold IQ")
	public void Click_Constant_Values_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_0"));
		ele.click();
	}
	
	@Then("Click Aircraft Type button in Bold IQ")
	public void Click_Aircraft_Type_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_1"));
		ele.click();
	}
	
	@Then("Click Relocation Parameters button in Bold IQ")
	public void Click_Relocation_Parameters_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_2"));
		ele.click();
	}
	
	@Then("Click Aircraft Setup button in Bold IQ")
	public void Click_Aircraft_Setup_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_3"));
		ele.click();
	}
	
	@Then("Click Carriers button in Bold IQ")
	public void Click_Carriers_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_4")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_4"));
		ele.click();
	}
	
	@Then("Click Schedule Rules button in Bold IQ")
	public void Click_Schedule_Rules_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_5")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_5"));
		ele.click();
	}
	
	@Then("Click Commercial Flights button in Bold IQ")
	public void Click_Commercial_Flights_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_6")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_6"));
		ele.click();
	}
	
	@Then("Click Tail Setup button in Bold IQ")
	public void Click_Tail_Setup_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_7")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_7"));
		ele.click();
	}
	
	@Then("Click Custom Ground Rules button in Bold IQ")
	public void Click_Custom_Ground_Rules_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_8")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_8"));
		ele.click();
	}
	
	@Then("Click Crew Setup button in Bold IQ")
	public void Click_Crew_Setup_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_9")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_9"));
		ele.click();
	}
	
	@Then("Click Static Routing Data button in Bold IQ")
	public void Click_Static_Routing_Data_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_6_lnkScreen_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_6_lnkScreen_0"));
		ele.click();
	}
	
	@Then("Click Wind Temp Dump button in Bold IQ")
	public void Click_Wind_Temp_Dump_button_in_Bold_IQ() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_6_lnkScreen_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_6_lnkScreen_1"));
		ele.click();
	}
	
	@Then("Click Flying Hour Setup button in Masters")
	public void click_flying_hour_setup_button_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_3"));
		ele.click();
	}
	
	@Then("Click User Setup button in Masters")
	public void click_user_setup_button_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_4")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_0_lnkScreen_4"));
		ele.click();
	}
	
	@Then("Click Airport Setup button in Bold IQ")
	public void click_airport_setup_button_in_bold_iq() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rptModule_rptScreen_5_lnkScreen_3"));
		ele.click();
	}
}
