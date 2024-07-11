package stepDefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class JE_QP_3_Pricing {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check pricing User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check pricing User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check pricing")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");

	}

	@And("close the pricing Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Click the price rules button in quote")
	public void Click_the_price_rules_button_in_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liSpecialPricing\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liSpecialPricing\"]/a/span[2]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"OFF\"]/a/span"));
		ele1.click();
	}

	@And("Click excel upload button in price rules")
	public void Click_excel_upload_button_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnExcUpload")));
		ele = driver.findElement(By.id("cpWheelsUp_btnExcUpload"));
		ele.click();
	}

	@And("Click add new setup button in price rules")
	public void Click_add_new_setup_button_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@Then("Click save and continue button in price rules")
	public void Click_save_and_continue_button_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : "+text);
			alert.accept();
		}
		catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Select valid radio button in rule details")
	public void Select_valid_radio_button_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblItemType_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rblItemType_0"));
		ele.click();
	}

	@And("Select valid component name in rule details")
	public void Select_valid_component_name_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlLineItem")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlLineItem"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Enter valid amount in rule details")
	public void Enter_valid_amount_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtLineItemAmount")));
		ele = driver.findElement(By.id("cpWheelsUp_txtLineItemAmount"));
		ele.sendKeys("1000");
	}

	@Then("Click one way check box in rule details")
	public void Click_one_way_check_box_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_cbTripType_0")));
		ele = driver.findElement(By.id("cpWheelsUp_cbTripType_0"));
		if(!ele.isSelected()) {
			System.out.println("Checkbox is not selected");
			ele.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
	}

	@And("Select valid priority in rule details")
	public void select_valid_priority_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlPriority")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlPriority"));
		Select sel=new Select(ele);
		sel.selectByValue("10");
	}

	@Then("Enter min req seats in rule details")
	public void enter_min_req_seats_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtReqSeats")));
		ele = driver.findElement(By.id("cpWheelsUp_txtReqSeats"));
		ele.sendKeys("10");
	}

	@And("Enter min block time in rule details")
	public void enter_min_block_time_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtMinBlockTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtMinBlockTime"));
		ele.sendKeys("1");
	}

	@Then("Enter max block time in rule details")
	public void enter_max_block_time_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtMaxBlockTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtMaxBlockTime"));
		ele.sendKeys("10");
	}

	@And("Select valid leg occupancy type in rule details")
	public void select_valid_leg_occupancy_type_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlTailType")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlTailType"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Select valid expiry date in rule details")
	public void select_valid_expiry_date_in_rule_details() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtExpiryDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtExpiryDate"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender5_day_5_6"));
		ele1.click();
	}

	@And("Enter passenger count in rule details")
	public void enter_passenger_count_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtPaxCount")));
		ele = driver.findElement(By.id("cpWheelsUp_txtPaxCount"));
		ele.sendKeys("10");
	}

	@Then("Enter max trip days in rule details")
	public void enter_max_trip_days_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtMaxTripDays")));
		ele = driver.findElement(By.id("cpWheelsUp_txtMaxTripDays"));
		ele.sendKeys("10");
	}

	@And("Click no radio button in rule details")
	public void click_no_radio_button_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rbActive_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rbActive_1"));
		ele.click();
	}

	@Then("Enter valid notes in rule details")
	public void enter_valid_notes_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele.sendKeys("Test");
	}

	@Then("Enter minimum purchase days in rule details")
	public void enter_minimum_purchase_days_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDaysMin")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDaysMin"));
		ele.sendKeys("10");
	}

	@And("Enter maximum purchase days in rule details")
	public void enter_maximum_purchase_days_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDaysMax")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDaysMax"));
		ele.sendKeys("50");
	}

	@Then("Enter valid Quote Expiry in rule details")
	public void enter_valid_quote_expiry_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtQteExpiry")));
		ele = driver.findElement(By.id("cpWheelsUp_txtQteExpiry"));
		ele.sendKeys("50");
	}

	@And("Enter valid Minimum Manufacture Year in rule details")
	public void enter_valid_minimum_manufacture_year_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtManuactureYear")));
		ele = driver.findElement(By.id("cpWheelsUp_txtManuactureYear"));
		ele.sendKeys("5");
	}

	@Then("Enter valid Leg Departure Effective Time in rule details")
	public void enter_valid_Leg_Departure_Effective_Time_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtEarliestDepart")));
		ele = driver.findElement(By.id("cpWheelsUp_txtEarliestDepart"));
		ele.sendKeys("1212");
	}

	@And("Enter valid Leg Departure Discontinue Time in rule details")
	public void enter_valid_Leg_Departure_Discontinue_Time_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtLatestDepart")));
		ele = driver.findElement(By.id("cpWheelsUp_txtLatestDepart"));
		ele.sendKeys("2050");
	}

	@Then("Click valid checkbox in rule details")
	public void Click_valid_checkbox_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_cblDepartureDOW_0")));
		ele = driver.findElement(By.id("cpWheelsUp_cblDepartureDOW_0"));
		ele.click();
		ele1 = driver.findElement(By.id("cpWheelsUp_cblDepartureDOW_1"));
		ele1.click();
		ele2 = driver.findElement(By.id("cpWheelsUp_cblDepartureDOW_2"));
		ele2.click();
		ele3 = driver.findElement(By.id("cpWheelsUp_cblDepartureDOW_3"));
		ele3.click();
		ele4 = driver.findElement(By.id("cpWheelsUp_cblDepartureDOW_4"));
		ele4.click();
		ele5 = driver.findElement(By.id("cpWheelsUp_cblDepartureDOW_5"));
		ele5.click();
		ele6 = driver.findElement(By.id("cpWheelsUp_cblDepartureDOW_6"));
		ele6.click();
	}

	@Then("Enter valid Leg Arrvial Effective Time in rule details")
	public void enter_valid_Leg_Arrvial_Effective_Time_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtEarliestArrival")));
		ele = driver.findElement(By.id("cpWheelsUp_txtEarliestArrival"));
		ele.sendKeys("1212");
	}

	@And("Enter valid Leg Arrvial Discontinue Time in rule details")
	public void enter_valid_Leg_Arrvial_Discontinue_Time_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtLatestArrival")));
		ele = driver.findElement(By.id("cpWheelsUp_txtLatestArrival"));
		ele.sendKeys("2050");
	}

	@And("Click clear button in rule details")
	public void Click_clear_button_in_rule_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}

	@And("Click close button in pop up in price rules")
	public void Click_close_button_in_pop_up_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele = driver.findElement(By.id("btnClose"));
		ele.click();
	}

	@And("Click edit button in price rules")
	public void Click_edit_button_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvSpecialPrice_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvSpecialPrice_imbView_0"));
		ele.click();
	}

	@And("Select inactive status in price rules")
	public void Select_inactive_status_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlFilterActive")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFilterActive"));
		Select sel=new Select(ele);
		sel.selectByIndex(2);
	}

	@Then("Click search button in price rules")
	public void Click_search_button_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}

	@Then("Click date group tab in price rules")
	public void Click_date_group_tab_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cpWheelsUp_ancDateGroup\"]/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"cpWheelsUp_ancDateGroup\"]/div/div[1]"));
		ele.click();
	}

	@And("Click previous step in date group")
	public void Click_previous_step_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnDatePrevious")));
		ele = driver.findElement(By.id("cpWheelsUp_btnDatePrevious"));
		ele.click();
	}

	@And("Click choose group radio button in date group")
	public void Click_choose_group_radio_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblQteEff_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblQteEff_1"));
		ele.click();
	}

	@Then("Click choose date group button in date group")
	public void Click_choose_date_group_button_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnQteEff")));
		ele = driver.findElement(By.id("cpWheelsUp_btnQteEff"));
		ele.click();
	}

	@And("Click close button in date group")
	public void Click_close_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddClose")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddClose"));
		ele.click();
	}

	@And("Click checkbox button in date group")
	public void Click_checkbox_button_in_date_group() {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvDateGroup_chkChoose_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvDateGroup_chkChoose_0"));
		if(!ele.isSelected()) {
			System.out.println("Checkbox is not selected");
			ele.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Click delete button in date group")
	public void Click_delete_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvQuoteEffective_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvQuoteEffective_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@And("Click enter date radio button in date group")
	public void Click_enter_date_radio_button_in_date_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblQteEff_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rblQteEff_2"));
		ele.click();
	}

	@Then("Select valid effective date in date group")
	public void Select_valid_effective_date_in_date_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtQuotingEffective")));
		ele = driver.findElement(By.id("cpWheelsUp_txtQuotingEffective"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender2_day_0_0"));
		ele1.click();
	}

	@And("Select valid Discontinue date in date group")
	public void Select_valid_Discontinue_date_in_date_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtQuotingDiscontinue")));
		ele = driver.findElement(By.id("cpWheelsUp_txtQuotingDiscontinue"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_5_6"));
		ele1.click();
	}

	@Then("Click Add to list button in date group")
	public void Click_Add_to_list_button_in_date_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnQteEffUpdate")));
		ele = driver.findElement(By.id("cpWheelsUp_btnQteEffUpdate"));
		ele.click();
	}

	@And("click close button in date group")
	public void click_close_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele = driver.findElement(By.id("btnClose"));
		ele.click();
	}

	@And("Click choose group radio button in Leg Departure Date")
	public void Click_choose_group_radio_button_in_Leg_Departure_Date() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblFltEff_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblFltEff_1"));
		ele.click();
	}

	@Then("Click choose date group button in Leg Departure Date")
	public void Click_choose_date_group_button_in_Leg_Departure_Date() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnFltEff")));
		ele = driver.findElement(By.id("cpWheelsUp_btnFltEff"));
		ele.click();
	}

	@And("Click close button in Leg Departure Date")
	public void Click_close_button_in_Leg_Departure_Date() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddClose")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddClose"));
		ele.click();
	}

	@And("Click checkbox button in Leg Departure Date")
	public void Click_checkbox_button_in_Leg_Departure_Date() {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvDateGroup_chkChoose_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvDateGroup_chkChoose_0"));
		if(!ele.isSelected()) {
			System.out.println("Checkbox is not selected");
			ele.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Click delete button in Leg Departure Date")
	public void Click_delete_button_in_Leg_Departure_Date() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvFlightEffective_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvFlightEffective_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@And("Click enter date radio button in Leg Departure Date")
	public void Click_enter_date_radio_button_in_Leg_Departure_Date() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblFltEff_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rblFltEff_2"));
		ele.click();
	}

	@Then("Select valid effective date in Leg Departure Date")
	public void Select_valid_effective_date_in_Leg_Departure_Date() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFlightEffective")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFlightEffective"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender3_day_0_0"));
		ele1.click();
	}

	@And("Select valid Discontinue date in Leg Departure Date")
	public void Select_valid_Discontinue_date_in_Leg_Departure_Date() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFlightDiscontinue")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFlightDiscontinue"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender4_day_5_6"));
		ele1.click();
	}

	@Then("Click Add to list button in Leg Departure Date")
	public void Click_Add_to_list_button_in_Leg_Departure_Date()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnFltEffUpdate")));
		ele = driver.findElement(By.id("cpWheelsUp_btnFltEffUpdate"));
		ele.click();
	}

	@And("click close button in Leg Departure Date")
	public void click_close_button_in_Leg_Departure_Date() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele = driver.findElement(By.id("btnClose"));
		ele.click();
	}

	@Then("Click next step button in Leg Departure Date")
	public void Click_next_step_button_in_Leg_Departure_Date()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnDateNext")));
		ele = driver.findElement(By.id("cpWheelsUp_btnDateNext"));
		ele.click();
	}

	@Then("Click airport group tab in price rules")
	public void Click_airport_group_tab_in_price_rules()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cpWheelsUp_ancAirportGroup\"]/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"cpWheelsUp_ancAirportGroup\"]/div/div[1]"));
		ele.click();
	}

	@And("Click previous step button in Airport group")
	public void Click_previous_step_button_in_Airport_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button4")));
		ele = driver.findElement(By.id("cpWheelsUp_Button4"));
		ele.click();
	}

	@And("Select valid conditions in Airport group")
	public void Select_valid_conditions_in_Airport_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lbCondition")));
		ele = driver.findElement(By.id("cpWheelsUp_lbCondition"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Select valid options in Airport group")
	public void Select_valid_options_in_Airport_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lbOptions")));
		ele = driver.findElement(By.id("cpWheelsUp_lbOptions"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Select valid country in Airport group")
	public void Select_valid_country_in_Airport_group() throws InterruptedException  {
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lbCountry")));
		ele = driver.findElement(By.id("cpWheelsUp_lbCountry"));
		Select sel=new Select(ele);
		sel.selectByValue("21");
	}

	@Then("Click Add to list button in Airport group")
	public void Click_Add_to_list_button_in_Airport_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAirportAddtoList")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAirportAddtoList"));
		ele.click();
	}

	@And("Click close button in Airport group")
	public void Click_close_button_in_Airport_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele = driver.findElement(By.id("btnClose"));
		ele.click();
	}

	@Then("Click delete button in Airport group")
	public void Click_delete_button_in_Airport_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvMappedAirports_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvMappedAirports_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@Then("Click next step button in Airport group")
	public void Click_next_step_button_in_Airport_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button5")));
		ele = driver.findElement(By.id("cpWheelsUp_Button5"));
		ele.click();
	}

	@Then("Click previous step button in tail group")
	public void Click_previous_step_button_in_tail_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button6")));
		ele = driver.findElement(By.id("cpWheelsUp_Button6"));
		ele.click();
	}

	@Then("Click tail group tab in price rules")
	public void Click_tail_group_tab_in_price_rules()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cpWheelsUp_ancTailGroup\"]/div/div[1]")));
		ele = driver.findElement(By.xpath("//*[@id=\"cpWheelsUp_ancTailGroup\"]/div/div[1]"));
		ele.click();
	}

	@Then("Click choose tail button in tail group")
	public void Click_choose_tail_button_in_tail_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_LinkButton3")));
		ele = driver.findElement(By.id("cpWheelsUp_LinkButton3"));
		ele.click();
	}

	@And("Click close button in tail group")
	public void Click_close_button_in_tail_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cpWheelsUp_btnAddClose\"]/i")));
		ele = driver.findElement(By.xpath("//*[@id=\"cpWheelsUp_btnAddClose\"]/i"));
		ele.click();
	}

	@And("Click fleet radio button in tail group")
	public void Click_fleet_radio_button_in_tail_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblTailBy_0")));
		ele = driver.findElement(By.id("cpWheelsUp_RblTailBy_0"));
		ele.click();
	}

	@Then("Click select all check box in tail group")
	public void Click_select_all_check_box_in_tail_group()  {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvFleetGroup_checkAll")));
		ele = driver.findElement(By.id("cpWheelsUp_gvFleetGroup_checkAll"));
		if(!ele.isSelected()) {
			System.out.println("Checkbox is not selected");
			ele.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click Add to list button in tail group")
	public void Click_Add_to_list_button_in_tail_group()  {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnFleetgroupSaved")));
		ele = driver.findElement(By.id("cpWheelsUp_btnFleetgroupSaved"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click Aircraft Type radio button in tail group")
	public void Click_Aircraft_Type_radio_button_in_tail_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblTailBy_1")));
		ele = driver.findElement(By.id("cpWheelsUp_RblTailBy_1"));
		ele.click();
	}

	@Then("Click select all check box in Aircraft Type")
	public void Click_select_all_check_box_in_Aircraft_Type()  {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAircraftType_checkAll")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAircraftType_checkAll"));
		if(!ele.isSelected()) {
			System.out.println("Checkbox is not selected");
			ele.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click Add to list button in Aircraft Type")
	public void Click_Add_to_list_button_in_Aircraft_Type()  {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button1")));
		ele = driver.findElement(By.id("cpWheelsUp_Button1"));
		ele.click();
		driver.switchTo().defaultContent();
	}

	@And("Click Tail Group radio button in tail group")
	public void click_tail_group_radio_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblTailBy_2")));
		ele = driver.findElement(By.id("cpWheelsUp_RblTailBy_2"));
		ele.click();
	}

	@Then("select check box in Tail Group")
	public void click_select_check_box_in_tail_group() {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAirportGroup_chkChoose_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAirportGroup_chkChoose_0"));
		if(!ele.isSelected()) {
			System.out.println("Checkbox is not selected");
			ele.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click Specific Tail radio button in tail group")
	public void click_specific_tail_radio_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblTailBy_3")));
		ele = driver.findElement(By.id("cpWheelsUp_RblTailBy_3"));
		ele.click();
	}

	@Then("select check box in Specific Tail")
	public void select_check_box_in_specific_tail() {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvPopTailDetails_chkChoose_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvPopTailDetails_chkChoose_0"));
		if(!ele.isSelected()) {
			System.out.println("Checkbox is not selected");
			ele.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
		driver.switchTo().defaultContent();
	}

	@And("Click add to list button in Specific Tail")
	public void click_add_to_list_button_in_specific_tail() {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSavePopDetails")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSavePopDetails"));
		ele.click();
	}

	@And("Click delete button in tail group")
	public void click_delete_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAllowedTail_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAllowedTail_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@And("Click next step button in tail group")
	public void click_next_step_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button7")));
		ele = driver.findElement(By.id("cpWheelsUp_Button7"));
		ele.click();
	}

	@Then("Click account type group tab in price rules")
	public void Click_account_type_group_tab_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ancCustomerGroup")));
		ele = driver.findElement(By.id("cpWheelsUp_ancCustomerGroup"));
		ele.click();
	}

	@And("Click choose account type button in account type group")
	public void click_choose_account_type_button_in_account_type_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_LinkButton4")));
		ele = driver.findElement(By.id("cpWheelsUp_LinkButton4"));
		ele.click();
	}

	@Then("Click close button in account type group")
	public void click_close_button_in_account_type_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddClose")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddClose"));
		ele.click();
	}

	@Then("Click enter customer radio button in account type group")
	public void click_enter_customer_radio_button_in_account_type_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblCustomerBy_0")));
		ele = driver.findElement(By.id("cpWheelsUp_RblCustomerBy_0"));
		ele.click();
	}

	@Then("Select the check box in account type group")
	public void select_the_check_box_in_account_type_group() {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvPopCustomerDetails_chkChoose_1")));
		ele = driver.findElement(By.id("cpWheelsUp_gvPopCustomerDetails_chkChoose_1"));
		if(!ele.isSelected()) {
			System.out.println("Checkbox is not selected");
			ele.click();
		}
		else {
			System.out.println("Checkbox is already selected");
		}
		driver.switchTo().defaultContent();
	}

	@Then("Click add to list button in account type group")
	public void click_add_to_list_button_in_account_type_group() {
		ele1=driver.findElement(By.id("cpWheelsUp_ifrmAddNew"));
		driver.switchTo().frame(ele1);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button1")));
		ele = driver.findElement(By.id("cpWheelsUp_Button1"));
		ele.click();
	}

	@And("Click delete button in account type group")
	public void click_delete_button_in_account_type_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAllowedCustomer_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAllowedCustomer_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message is displayed like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@And("Click next step button in account type group")
	public void click_next_step_button_in_account_type_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button9")));
		ele = driver.findElement(By.id("cpWheelsUp_Button9"));
		ele.click();
	}

	@Then("Click ratio group tab in price rules")
	public void click_ratio_group_tab_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_anRatioRange")));
		ele = driver.findElement(By.id("cpWheelsUp_anRatioRange"));
		ele.click();
	}

	@And("Click previous step button in ratio group")
	public void click_previous_step_button_in_ratio_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button3")));
		ele = driver.findElement(By.id("cpWheelsUp_Button3"));
		ele.click();
	}

	@And("Click choose ratio range button in ratio group")
	public void click_choose_ratio_range_button_in_ratio_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnRatioRange")));
		ele = driver.findElement(By.id("cpWheelsUp_btnRatioRange"));
		ele.click();
	}

	@Then("Click close button in ratio group")
	public void Click_close_button_in_ratio_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddClose")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddClose"));
		ele.click();
	}

	@Then("Click save as new rule button in price rules")
	public void Click_save_as_new_rule_button_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSaveNeRule")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSaveNeRule"));
		ele.click();
	}

	@Then("Click Close button in price rules")
	public void Click_Close_button_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnConfirmNo")));
		ele = driver.findElement(By.id("cpWheelsUp_btnConfirmNo"));
		ele.click();
	}

	@And("Select the check box in price rules")
	public void Select_the_check_box_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_chkDateGrp")));
		ele = driver.findElement(By.id("cpWheelsUp_chkDateGrp"));
		ele.click();
	}

	@Then("Click copy button in price rules")
	public void Click_copy_button_in_price_rules() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnConfirmYes")));
		ele = driver.findElement(By.id("cpWheelsUp_btnConfirmYes"));
		ele.click();
	}

	@Then("Click the excel upload button in quote")
	public void Click_the_excel_upload_button_in_quote() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liSpecialPricing\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liSpecialPricing\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"PEU\"]/a/span"));
		ele1.click();
	}

	@And("Click Extract and preview button in excel upload")
	public void Click_Extract_and_preview_button_in_excel_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnUpload")));
		ele = driver.findElement(By.id("btnUpload"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Click view history button in excel upload")
	public void Click_view_history_button_in_excel_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnView")));
		ele = driver.findElement(By.id("cpWheelsUp_btnView"));
		ele.click();
	}

	@And("Select valid from date in calendar in excel upload")
	public void Select_valid_from_date_in_calendar_in_excel_upload() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFromDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFromDate"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_title"));
		ele1.click();
		Thread.sleep(2000);
		ele2 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_title"));
		ele2.click();
		Thread.sleep(2000);
		ele3 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_year_0_1"));
		ele3.click();
		Thread.sleep(2000);
		ele4 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_month_0_0"));
		ele4.click();
		Thread.sleep(2000);
		ele5 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_0_0"));
		ele5.click();
	}

	@Then("Click search button in view history")
	public void Click_search_button_in_view_history() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}

	@And("Click download button in view history")
	public void Click_download_button_in_view_history() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvHistory_imgDownload_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvHistory_imgDownload_0"));
		ele.click();
	}

	@And("Click go to pricing setup button in excel upload")
	public void Click_go_to_pricing_setup_button_in_excel_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnPric")));
		ele = driver.findElement(By.id("cpWheelsUp_btnPric"));
		ele.click();
	}

	@Then("Check page navigates to pricing setup page")
	public void Check_page_navigates_to_pricing_setup_page() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		if(ele.isDisplayed()) {
			System.out.println("Page naviagates to price rules");
		}
		else {
			System.out.println("Page doesnot navigates to price rules");
		}
	}

	@And("Upload valid file in excel upload")
	public void Upload_valid_file_in_excel_upload() throws InterruptedException, AWTException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lblfuFile")));
		ele = driver.findElement(By.id("cpWheelsUp_lblfuFile"));
		ele.click();
		//Upload the file
		Thread.sleep(2000);
		String FilePath="C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeQuotePortal\\Files\\Blank.xlsx";
		Robot robot = new Robot();
		StringSelection selection = new StringSelection(FilePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}
	
	@And("Click download validation button in excel upload")
	public void click_download_validation_button_in_excel_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lnkDwValRuleFile")));
		ele = driver.findElement(By.id("cpWheelsUp_lnkDwValRuleFile"));
		ele.click();
	}
	
	@And("Click download and import button in excel upload")
	public void click_download_and_import_button_in_excel_upload() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnRule")));
		ele = driver.findElement(By.id("cpWheelsUp_btnRule"));
		ele.click();
	}
}


