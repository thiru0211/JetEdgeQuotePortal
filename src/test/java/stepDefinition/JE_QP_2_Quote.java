package stepDefinition;

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

public class JE_QP_2_Quote {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check prepare quote User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check prepare quote User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check prepare quote")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");

	}

	@And("close the prepare quote Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Click the prepare quote button in quote")
	public void ClickThePrepareQuoteButtonInQuote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liQuote\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liQuote\"]/a/span[2]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"PQVC\"]/a/span"));
		ele1.click();
	}

	@And("Select valid quote by in prepare quote")
	public void Select_valid_quote_by_in_prepare_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlquotedby")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlquotedby"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@Then("Select valid tail in prepare quote")
	public void Select_valid_tail_in_prepare_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddltail")));
		ele = driver.findElement(By.id("cpWheelsUp_ddltail"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@And("Select valid Account Type in prepare quote")
	public void Select_valid_Account_Type_in_prepare_quote() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlCustomerP")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlCustomerP"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(2000);
	}

	@Then("Select valid Quote For in prepare quote")
	public void Select_valid_Quote_For_in_prepare_quote() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlquotefor")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlquotefor"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@And("Select valid date in calendar in prepare quote")
	public void Select_valid_date_in_calendar_in_prepare_quote() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDate"));
		ele.click();
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender3_day_5_6"));
		ele1.click();
	}

	@Then("select valid seating capacity in prepare quote")
	public void Select_valid_seating_capacity_in_prepare_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlPAX")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlPAX"));
		Select sel=new Select(ele);
		sel.selectByValue("9");
	}

	@And("select valid depature location in prepare quote")
	public void Select_valid_depature_location_in_prepare_quote() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtStartAirport")));
		ele = driver.findElement(By.id("cpWheelsUp_txtStartAirport"));
		ele.clear();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_txtStartAirport"));
		ele1.sendKeys("KRYY");
		ele2 = driver.findElement(By.id("cpWheelsUp_txtStartAirport"));
		ele2.sendKeys(Keys.ENTER);
	}

	@And("select valid destination location in prepare quote")
	public void Select_valid_destination_location_in_prepare_quote() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtEndAirport")));
		ele = driver.findElement(By.id("cpWheelsUp_txtEndAirport"));
		ele.sendKeys("AGGH");
		Thread.sleep(2000);
		ele2 = driver.findElement(By.id("cpWheelsUp_txtEndAirport"));
		ele2.sendKeys(Keys.ENTER);
	}

	@And("Check BH and FH values in prepare quote")
	public void Check_BH_and_FH_values_in_prepare_quote() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtCBH")));
		ele = driver.findElement(By.id("cpWheelsUp_txtCBH"));
		String BHValue = ele.getAttribute("value");
		System.out.println("BH Value is : "+BHValue);
		ele1 = driver.findElement(By.id("cpWheelsUp_txtCBH"));
		String FHValue = ele1.getAttribute("value");
		System.out.println("BH Value is : "+FHValue);
	}

	@And("click Add leg button in prepare quote")
	public void click_Add_leg_button_in_prepare_quote() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddToList")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddToList"));
		ele.click();
	}

	@Then("Click delete button in prepare quote")
	public void Click_delete_button_in_prepare_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvLegDetails_imbDelete_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvLegDetails_imbDelete_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@Then("Click Insert button in prepare quote")
	public void Click_Insert_button_in_prepare_quote() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddToMid")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddToMid"));
		ele.click();
	}

	@Then("Click No button in prepare quote")
	public void click_No_button_in_prepare_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button10")));
		ele = driver.findElement(By.id("cpWheelsUp_Button10"));
		ele.click();
	}

	@Then("Click Yes button in prepare quote")
	public void click_Yes_button_in_prepare_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button8")));
		ele = driver.findElement(By.id("cpWheelsUp_Button8"));
		ele.click();
	}

	@Then("Select valid seating in Add Leg")
	public void Select_valid_seating_in_Add_Leg() throws InterruptedException {
		Thread.sleep(3000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlMLegPax")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlMLegPax"));
		Select sel=new Select(ele);
		sel.selectByValue("5");
	}

	@And("Select valid date in calendar in Add Leg")
	public void Select_valid_date_in_calendar_in_Add_Leg() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtMlegDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtMlegDate"));
		ele.click();
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender2_day_5_6"));
		ele1.click();
	}

	@And("Select valid destination location in Add Leg")
	public void Select_valid_destination_location_in_Add_Leg() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtMlegEndAirpor")));
		ele = driver.findElement(By.id("cpWheelsUp_txtMlegEndAirpor"));
		ele.sendKeys("KGAB");
		ele1 = driver.findElement(By.id("cpWheelsUp_txtMlegEndAirpor"));
		ele1.sendKeys(Keys.ENTER);

	}

	@Then("Click submit button in Add Leg")
	public void Click_submit_button_in_Add_Leg() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnMidLeg")));
		ele = driver.findElement(By.id("cpWheelsUp_btnMidLeg"));
		ele.click();
	}

	@Then("click Calculate button in prepare quote")
	public void click_Calculate_button_in_prepare_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSubmitP2")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSubmitP2"));
		ele.click();
	}

	@Then("Click the quote list button in quote")
	public void click_the_quote_list_button_in_quote() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liQuote\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liQuote\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"PQV\"]/a/span"));
		ele1.click();
	}

	@And("Click create new quote button in quote list")
	public void Click_create_new_quote_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button5")));
		ele = driver.findElement(By.id("cpWheelsUp_Button5"));
		ele.click();
	}

	@Then("Check the landing page in quote list")
	public void Check_the_landing_page_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddToList")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddToList"));
		if(ele.isDisplayed()) {
			System.out.println("Page is landed to Prepare quote page");
		}
		else {
			System.out.println("Page doesnot landed to Prepare quote page");
		}
	}

	@And("Select valid quote status in quote list")
	public void select_valid_quote_status_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlSearchBy")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlSearchBy"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@Then("Select valid from date in quote list")
	public void select_valid_from_date_in_quote_list() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFromDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFromDate"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_title"));
		ele1.click();
		Thread.sleep(2000);
		ele2 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_month_0_0"));
		ele2.click();
		Thread.sleep(2000);
		ele3 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_0_0"));
		ele3.click();
		Thread.sleep(2000);

	}

	@And("Select valid tail in quote list")
	public void select_valid_tail_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddltail")));
		ele = driver.findElement(By.id("cpWheelsUp_ddltail"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@Then("Select valid customer name in quote list")
	public void select_valid_customer_name_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlRequester")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlRequester"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@And("Select valid sales name in quote list")
	public void select_valid_sales_name_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlSalesRep")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlSalesRep"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@Then("Select valid status in quote list")
	public void select_valid_status_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlStatus")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlStatus"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}

	@And("Click search button in quote list")
	public void click_search_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}

	@And("Click view button in quote list")
	public void click_view_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cpWheelsUp_gvRequestSummary_imbView_0")));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvRequestSummary_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvRequestSummary_imbView_0"));
		ele.click();
	}

	@Then("Click timer button in quote list")
	public void Click_timer_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lblProcessTime")));
		ele = driver.findElement(By.id("cpWheelsUp_lblProcessTime"));
		ele.click();
	}

	@And("Click close button in quote list")
	public void click_close_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Image16")));
		ele = driver.findElement(By.id("cpWheelsUp_Image16"));
		ele.click();
	}

	@Then("Click Action button in quote list")
	public void Click_Action_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cpWheelsUp_tblFilter1\"]/div[7]/span")));
		ele = driver.findElement(By.xpath("//*[@id=\"cpWheelsUp_tblFilter1\"]/div[7]/span"));
		ele.click();
	}

	@And("Click copy quote button in quote list")
	public void click_copy_quote_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lnkCopyQuotesave")));
		ele = driver.findElement(By.id("cpWheelsUp_lnkCopyQuotesave"));
		ele.click();
	}

	@And("Click close button in copy quote")
	public void Click_close_button_in_copy_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnConfirmNo")));
		ele = driver.findElement(By.id("cpWheelsUp_btnConfirmNo"));
		ele.click();
	}

	@And("Click create button in copy quote")
	public void Click_create_button_in_copy_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnEdCopySave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnEdCopySave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : "+text);
			alert.accept();
		}
		catch (NoAlertPresentException e) {
			System.out.println(" No Alert message is displayed ");
		}
	}

	@Then("Select valid details in copy quote")
	public void Select_valid_details_in_copy_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlCopyTail")));
		//Select valid tail
		ele = driver.findElement(By.id("cpWheelsUp_ddlCopyTail"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		//Select account type
		ele1 = driver.findElement(By.id("cpWheelsUp_ddlCopyAccnt"));
		Select sel1=new Select(ele1);
		sel1.selectByIndex(2);
	}

	@Then("Click edit button in quote list")
	public void Click_edit_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rptLegdetails_imbEdit_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rptLegdetails_imbEdit_0"));
		ele.click();
	}

	@And("Modify details in quote list")
	public void Modify_details_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlPAX")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlPAX"));
		Select sel=new Select(ele);
		sel.selectByValue("10");
	}

	@Then("Click update button in quote list")
	public void Click_update_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddToList")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddToList"));
		ele.click();
	}

	@Then("Click Add new line item button in quote list")
	public void Click_Add_new_line_item_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lnkAddLineItem")));
		ele = driver.findElement(By.id("cpWheelsUp_lnkAddLineItem"));
		ele.click();
	}

	@And("Click close button in Add new line item")
	public void Click_close_button_in_Add_new_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button6")));
		ele = driver.findElement(By.id("cpWheelsUp_Button6"));
		ele.click();
	}

	@And("Click save button in Add new line item")
	public void Click_save_button_in_Add_new_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddRevenue")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddRevenue"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : "+text);
			alert.accept();
		}
		catch (NoAlertPresentException e) {
			System.out.println(" No Alert message is displayed ");
		}
	}

	@Then("Enter valid details in Add new line item")
	public void Enter_valid_details_in_Add_new_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlLineItem")));
		//select line item
		ele = driver.findElement(By.id("cpWheelsUp_ddlLineItem"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
		//Enter rate
		ele1 = driver.findElement(By.id("cpWheelsUp_txtPRate"));
		ele1.sendKeys("100");
		//Enter Qty
		ele2 = driver.findElement(By.id("cpWheelsUp_txtPQty"));
		ele2.sendKeys("1");
		//Enter Price
		ele3 = driver.findElement(By.id("cpWheelsUp_txtPPrice"));
		ele3.sendKeys("100");
	}

	@Then("Click edit button in Add new line item")
	public void Click_edit_button_in_Add_new_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvLineRev_ImageButton4_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvLineRev_ImageButton4_0"));
		ele.click();
	}

	@And("Click close button in edit line item")
	public void Click_close_button_in_edit_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button13")));
		ele = driver.findElement(By.id("cpWheelsUp_Button13"));
		ele.click();
	}

	@Then("Modify valid details in edit line item")
	public void Modify_valid_details_in_edit_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvLineDetails_txtUnitPrice_0")));
		//Rate adj
		ele = driver.findElement(By.id("cpWheelsUp_gvLineDetails_txtUnitPrice_0"));
		ele.sendKeys("100");
	}

	@And("Click update button in edit line item")
	public void Click_update_button_in_edit_line_item() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnRvUpdte")));
		ele = driver.findElement(By.id("cpWheelsUp_btnRvUpdte"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("btnClose"));
		ele1.click();
	}

	@Then("Click delete button in edit line item")
	public void Click_delete_button_in_edit_line_item() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvLineRev_imbDelete_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvLineRev_imbDelete_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like: "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("btnClose"));
		ele1.click();
	}

	@Then("Click expand button in price list")
	public void Click_expand_button_in_price_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lnlLegReve")));
		ele = driver.findElement(By.id("cpWheelsUp_lnlLegReve"));
		ele.click();
	}

	@And("Click close button in price list")
	public void Click_close_button_in_price_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_imgClose1")));
		ele = driver.findElement(By.id("cpWheelsUp_imgClose1"));
		ele.click();
	}

	@Then("Click expand button in price formula")
	public void Click_expand_button_in_price_formula() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lnkPriceComp")));
		ele = driver.findElement(By.id("cpWheelsUp_lnkPriceComp"));
		ele.click();

		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : "+text);
			alert.accept();
		}
		catch (NoAlertPresentException e) {
			System.out.println(" No Alert message is displayed ");
		}
	}

	@And("Click close button in price formula")
	public void Click_close_button_in_price_formula() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddClose")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddClose"));
		ele.click();
	}

	@Then("Click JE Managed button in quote list")
	public void Click_JE_Managed_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvPriceComparision_llnlOfferName_1")));
		ele = driver.findElement(By.id("cpWheelsUp_gvPriceComparision_llnlOfferName_1"));
		ele.click();
	}

	@And("Click close button in JE Managed")
	public void Click_close_button_in_JE_Managed() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_imgClose1")));
		ele = driver.findElement(By.id("cpWheelsUp_imgClose1"));
		ele.click();
	}

	@Then("Click Add FET Tax button in quote list")
	public void Click_Add_FET_Tax_button_in_quote_list() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddFET")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddFET"));
		ele.click();
	}

	@And("Click close button in Add FET Tax")
	public void Click_close_button_in_Add_FET_Tax() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnFClose")));
		ele = driver.findElement(By.id("cpWheelsUp_btnFClose"));
		ele.click();
	}

	@And("Enter valid details in Add FET Tax")
	public void Enter_valid_details_in_Add_FET_Tax() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAddFET_lblQty_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAddFET_lblQty_0"));
		ele.sendKeys("1");
	}

	@And("Click Save button in Add FET Tax")
	public void Click_Save_button_in_Add_FET_Tax() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSaveFet")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSaveFet"));
		ele.click();
	}

	@Then("Click edit button in Add FET Tax")
	public void Click_edit_button_in_Add_FET_Tax() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvTaxRev_lnkTaxEdit_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvTaxRev_lnkTaxEdit_0"));
		ele.click();
	}

	@And("Click close button in edit FET Tax")
	public void Click_close_button_in_edit_FET_Tax() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button13")));
		ele = driver.findElement(By.id("cpWheelsUp_Button13"));
		ele.click();
	}

	@And("Modify details in edit FET Tax")
	public void Modify_details_in_edit_FET_Tax() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvLineDetails_txtQty_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvLineDetails_txtQty_0"));
		ele.sendKeys("14");
	}

	@And("Click save button in edit FET Tax")
	public void Click_save_button_in_edit_FET_Tax() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnRvUpdte")));
		ele = driver.findElement(By.id("cpWheelsUp_btnRvUpdte"));
		ele.click();
	}

	@Then("Click delete button in tax line item")
	public void Click_delete_button_in_tax_line_item() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvTaxRev_imbDelete_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvTaxRev_imbDelete_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@Then("Click the quote comments button in quote")
	public void Click_the_quote_comments_button_in_quote() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liQuote\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liQuote\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"NCM\"]/a/span"));
		ele1.click();
	}

	@And("Click Add new button in quote comments")
	public void Click_Add_new_button_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@Then("Click back button in quote comments")
	public void Click_back_button_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}

	@Then("Click save button in quote comments")
	public void Click_save_button_in_quote_comments() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, 0)");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : "+text);
			alert.accept();
		}
		catch (NoAlertPresentException e) {
			System.out.println(" No Alert message is displayed ");
		}
	}

	@Then("Click Add airport button in quote comments")
	public void Click_Add_airport_button_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddAirport")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddAirport"));
		ele.click();
	}

	@And("Click Add to list in add airport")
	public void Click_Add_to_list_in_add_airport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnRouteAdd")));
		ele = driver.findElement(By.id("cpWheelsUp_btnRouteAdd"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : "+text);
			alert.accept();
		}
		catch (NoAlertPresentException e) {
			System.out.println(" No Alert message is displayed ");
		}
	}

	@And("Click Enter airport radio button in add airport")
	public void Click_Enter_airport_radio_button_in_add_airport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblAirportBy_0")));
		ele = driver.findElement(By.id("cpWheelsUp_RblAirportBy_0"));
		ele.click();
	}

	@Then("Choose valid airport in add airport")
	public void Choose_valid_airport_in_add_airport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFromICAO")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFromICAO"));
		ele.sendKeys("KMMU");
	}

	@And("Click Choose group radio button in add airport")
	public void Click_Choose_group_radio_button_in_add_airport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblAirportBy_1")));
		ele = driver.findElement(By.id("cpWheelsUp_RblAirportBy_1"));
		ele.click();
	}

	@Then("Click the checkbox in add airport")
	public void Click_the_checkbox_in_add_airport() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAirportGroup_chkChoose_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAirportGroup_chkChoose_0"));
		ele.click();
		Thread.sleep(2000);
	}

	@Then("Click the close button in add airport")
	public void Click_the_close_button_in_add_airport() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cpWheelsUp_btnAddClose\"]/i")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"cpWheelsUp_btnAddClose\"]/i"));
		ele1.click();
	}

	@And("Click delete button in quote comments")
	public void Click_delete_button_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAirportMaping_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAirportMaping_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@Then("Click specific radio button in quote comments")
	public void Click_specific_radio_button_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblCustomerFlag_1")));
		ele1 = driver.findElement(By.id("cpWheelsUp_rblCustomerFlag_1"));
		ele1.click();
	}

	@And("Click Add customer button in quote comments")
	public void Click_Add_customer_button_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cpWheelsUp_btnAddCustomer")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddCustomer"));
		ele.click();
	}

	@Then("Click Close button in Customer mapping details")
	public void Click_Close_button_in_Customer_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cpWheelsUp_btnCloseGroup\"]/i")));
		ele = driver.findElement(By.xpath("//*[@id=\"cpWheelsUp_btnCloseGroup\"]/i"));
		ele.click();
	}

	@Then("Enter valid customer name in Customer mapping details")
	public void Enter_valid_customer_name_in_Customer_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtCustNameFilter")));
		ele = driver.findElement(By.id("cpWheelsUp_txtCustNameFilter"));
		ele.sendKeys("JE Managed Tail");
		ele1 = driver.findElement(By.id("cpWheelsUp_txtCustNameFilter"));
		ele1.sendKeys(Keys.ENTER);
	}

	@And("Click the checkbox in Customer mapping details")
	public void Click_the_checkbox_in_Customer_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvPopCustomerDetails_chkChoose_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvPopCustomerDetails_chkChoose_0"));
		ele.click();
	}

	@Then("Click Add to list button in Customer mapping details")
	public void Click_Add_to_list_button_in_Customer_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSavePopDetails")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSavePopDetails"));
		ele.click();
	}

	@And("Click Delete button in Customer details")
	public void Click_Delete_button_in_Customer_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvMapping_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvMapping_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@Then("Enter notes in quote comments")
	public void enter_notes_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele.sendKeys("Test");
	}

	@And("Click No radio button in quote comments")
	public void click_no_radio_button_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblActive_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblActive_1"));
		ele.click();
	}

	@And("Click clear button in quote comments")
	public void click_clear_button_in_quote_comments() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, 0)");
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}

	@And("Click Edit button in quote comments")
	public void click_Edit_button_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvNotes_imbView_1")));
		ele = driver.findElement(By.id("cpWheelsUp_gvNotes_imbView_1"));
		ele.click();
	}

	@Then("Modify the details in quote comments")
	public void Modify_the_details_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele.clear();
		ele.sendKeys("Test");
	}

	@Then("Click update button in quote comments")
	public void click_update_button_in_quote_comments() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
	}

	@Then("Click the terms and condition button in quote")
	public void Click_the_terms_and_condition_button_in_quote() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liQuote\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liQuote\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"TRM\"]/a/span"));
		ele1.click();
	}

	@And("Click add new button in terms and condition")
	public void Click_add_new_button_in_terms_and_condition() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddVers")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddVers"));
		ele.click();
	}

	@Then("Click back button in terms and condition")
	public void Click_back_button_in_terms_and_condition() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBackVer")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBackVer"));
		ele.click();
	}

	@Then("Click save button in terms and condition")
	public void Click_save_button_in_terms_and_condition() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0, 0)");
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
			System.out.println(" No Alert message is displayed ");
		}
	}

	@Then("Enter valid version in terms and condition")
	public void Enter_valid_version_in_terms_and_condition() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtVersion")));
		//Enter version value
		ele = driver.findElement(By.id("cpWheelsUp_txtVersion"));
		ele.sendKeys("20220131-1");

		//Enter notes
		ele4 = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele4.sendKeys("Test");
	}

	@And("Select valid date in calendar in terms and condition")
	public void Select_valid_date_in_calendar_in_terms_and_condition() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtEffFrom")));
		//Select valid month
		ele1 = driver.findElement(By.id("cpWheelsUp_txtEffFrom"));
		ele1.click();
		Thread.sleep(2000);
		ele2 = driver.findElement(By.id("cpWheelsUp_calendar12_day_0_0"));
		ele2.click();
	}

	@Then("Click no radio button in terms and condition")
	public void Click_no_radio_button_in_terms_and_condition() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblActive_1")));
		//Click No button
		ele3 = driver.findElement(By.id("cpWheelsUp_rblActive_1"));
		ele3.click();
	}

	@And("Enter terms and condition details in terms and condition")
	public void Enter_terms_and_condition_details_in_terms_and_condition() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_EditorMessage_ctl02_ctl00")));
		ele = driver.findElement(By.id("cpWheelsUp_EditorMessage_ctl02_ctl00"));
		driver.switchTo().frame(ele);
		Thread.sleep(2000);
		WebDriverWait wait1=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body")));
		ele1 = driver.findElement(By.xpath("/html/body"));

		ele1.sendKeys("\r\n"
				+ "ADVANCE PURCHASE:\r\n"
				+ "\r\n"
				+ "72 Hours\r\n"
				+ "CA to Hawaii Pricing = 168 Hours\r\n"
				+ "QUOTE IS SUBJECT TO REQUOTING UPON EXPIRATION OR IF SIGNED WITHIN 72 HOURS OF DEPARTURE.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "_______ CDC guidelines require all passengers to wear masks at all times on Jet Edge flights, with exception of circumstances such as eating, drinking, or taking medications, for brief periods.  Failure of passengers to comply with the CDC order may result in cancellation or suspension of the flight and/or unflown portion of the itinerary with full forfeiture of funds paid to Jet Edge, to be determined at the sole discretion of Jet Edge.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "_______ Beginning January 26, 2021, as required by the CDC, any international passengers flying to the U.S. from a foreign country will need to present proof of a negative COVID-19 viral test (NAAT or antigen) (\"Test\") taken within 3 calendar days of departure to the U.S. All passengers are required to sign an attestation form and provide proof of a negative Test or a positive test result with a doctor’s note with clearance for travel, prior to departure. Once a Test result is attained, an attestation form must be completed and returned in advance of the flight to Jet Edge.  Failure of the passengers to provide this information as directed here may result in cancellation of the flight/remaining itinerary at 100% cancellation penalty, at Jet Edge's sole discretion.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "_______ Client acknowledges Jet Edge can provide a quote for trip cancellation/interruption insurance through a partnership with Allianz Travel at an additional cost that will cover up to 100% of the Quote Amount.  Under the policy all passengers traveling on the itinerary and listed on the policy can make a claim for reimbursement if any passenger tests positive test for COVID-19.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "_______ The departure time on each leg of the itinerary listed above is considered the confirmed time within 120 hours (5 days) of the leg’s departure. Jet Edge makes no representation about the availability and/or price of any requested change by the Client within the 120 hour period.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "_______ International/Overwater Wi-Fi may be available during flight. If available and unless otherwise noted by Jet Edge in this agreement, its use by passengers will incur an additional charge, which may be substantial.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "______ This quote reflects estimated airport fees subject to update when the booking is being confirmed by Jet Edge, which occurs only upon return of the signed quote by the Client. Client has the option not to proceed with the booking if any price adjustment is sought by Jet Edge.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "_______ The itinerary may require a common passenger to fly on each flight leg.  Failure to meet this requirement may result in re-pricing of the itinerary, application of a financial penalty, or cancellation of any or all legs of the itinerary with full forfeiture of applicable funds paid by Client, to be determined at Jet Edge’s sole discretion. \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "_______ This quote may require the lead passenger to have a reservation at a Four Seasons Hawaii Collection resort with a check-in on the arrival date and check-out on the departure date, as applicable, with a continuous stay in between.  Lead passenger will provide a  reservation number to Jet Edge, and Jet Edge will confirm reservation data prior to each flight.  Failure to meet this requirement shall result in a re-price of the itinerary, a penalty, or a cancellation of a leg or the rest of the itinerary with full forfeiture of funds paid, which will be determined at Jet Edge’s sole discretion.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "______ Departures from PHNY may require a tech stop which may not be included in the quoted itinerary. If required, the tech stop will not affect trip pricing\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "______ Client has disclosed to Jet Edge whether a pet(s) will be transported on each leg of the flight.  Failure to disclose transportation of pets at the time of quoting will incur a $1k penalty in addition to the applicable pet fee(s), which must be paid by the Client regardless of whether the disclosure to Jet Edge occurred as required at the time of quoting. \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "CHARTER QUOTATION TERMS & CONDITIONS\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "CHARTER OPERATOR: Jet Edge will arrange for flights to be operated by Western Air Charter, Inc. d/b/a Jet Edge or JetSelect LLC, each of which holds an air carrier certificate under 14 CFR Part 135 issued by the FAA (Western Air Charter Air Carrier Certificate #W6JA769L and JetSelect LLC Air Carrier Certificate #U5QA550L) and is a subsidiary of JEI Holdings, LLC.  Additionally, Western Air Charter also holds a certificate of public convenience and necessity issued by DOT Order 2020-3-4 under 49 U.S.C. � 41102 to engage in interstate and foreign charter air transportation as a certificated air carrier.  Operational and other factors may require a change in the tail assignment and/or operator, even when a specific tail number and/or operator is specified in the quoted flight details (“Quote”).  Regardless, the party booking the charter (“Client”) will always be provided with a confirmation in either written or verbal form identifying the operator and tail designated to fly the quoted flights (“Itinerary”) within a reasonable time after such information becomes available and prior to initial departure and will be advised of any changes in the tail and/or operator that may occur during the Itinerary.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "AGREEMENT: By accepting this Quote, Client hereby agrees to these Charter Quotation Terms & Conditions and the Aircraft Charter Master Agreement (“Charter Master Agreement”).  The terms of the Charter Master Agreement are hereby incorporated into this Quote and made part hereof.  The Charter Master Agreement can be found at {1@Master_Agreement} or, upon request to CHARTER OPERATOR, a copy will be provided to Client.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "GENERAL: This Quote may be aircraft specific or fleet specific based on aircraft scheduling. Should the need arise to change the aircraft or Itinerary for any reason whatsoever, the Quote may change. In the event of a modification to the Itinerary or type of aircraft, for any reason whatsoever, or request and/or addition of other goods, services or both not referenced in the Quote (e.g., ground transportation or catering), the Client shall be solely responsible for the associated increase in the Quote. Client's use of an alternative aircraft, modified Itinerary, or additional goods, services, or both not reflected in the original Quote, shall be deemed acceptance of and agreement for such modifications and increased costs and Additional Expenses associated therewith. Client modifications to the Quote are not accepted by the Charter Operator unless Charter Operator provides express written confirmation to the Client of acceptance of the change.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "CONDUCT: Client agrees to act in a safe, respectful, legal, and professional manner at all times while traveling as set forth in this Quote. Client shall comply with all requirements and instructions of the flight crew. Furthermore, Client shall not cause any damage to the aircraft. If damage occurs, Client is solely responsible for damage to the aircraft, including but not limited to, cleaning or repair of damaged or soiled aircraft surfaces, components, appliances or accessories, as a result of Client’s actions and the actions of any individual(s) accompanying or otherwise traveling with the Client. In the event that Client or those traveling with Client during the trip cause any damage to the aircraft, or act in a manner the flight crew,  CHARTER OPERATOR, or Third Party Operator, as applicable, deems in its sole discretion to be unsafe, dangerous, illegal, or inappropriate, the CHARTER OPERATOR may cancel this Agreement, including termination of the remaining legs of the trip. In the event of a cancellation of this Agreement for the reasons set forth herein, Client shall remain responsible for the Payment of this Quote and any consequential damages determined by the CHARTER OPERATOR or Affiliates.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "QUOTE AND ADDITIONAL EXPENSES: The Quote is valid for twenty-four (24) hours from the date and time the Quote is provided to Client and may be revised or amended by a subsequent quote at CHARTER OPERATOR’s sole discretion. Issuance of a Quote does not guarantee aircraft availability.  This Quote does not include the full amount for Additional Expenses. Client shall be solely responsible for Payment of Additional Expenses. Additional fees may apply if Client requests CHARTER OPERATOR/Third Party Operator to use an FBO other than a CHARTER OPERATOR, Affiliate, or contracted aircraft preferred FBO; requires a Cabin Attendant not employed full-time by CHARTER OPERATOR; or makes special requests that require additional services. Additional Auxiliary Power Unit (“APU\") charge of $150 per hour will be applied, if Client causes the departure to be delayed by an hour or more.  If a flight does not reach its destination due to Force Majeure, Client agrees to pay all charges for the completed portion of the Itinerary. If there is a stopover exceeding 12 hours in duration or with a change of passengers on the domestic portion of an international itinerary, the Client will be responsible additional FET and applicable taxes to be charged no later than the time of final invoicing.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "ITINERARY CHANGE AND TRANSMITTAL OF CHANGES: Itinerary changes are permitted, but subject to aircraft and flight crew availability and Quote modification.  Notification of changes and/or cancellations must be made directly to CHARTER OPERATOR's dispatch (not to crew members) by telephone at 818-442-0096, or by email at charter@flyjetedge.com.  In the event of a change to the Itinerary, this Quote shall no longer be applicable and a new Quote, if practicable, will be required to be signed by Client prior to departure or, in the CHARTER OPERATOR's sole discretion, anytime thereafter. Notwithstanding the foregoing, the Client agrees and acknowledges that proceeding with any flight, even those with different aircraft or modified Itineraries, or making payment shall be deemed acceptance of the Quote, regardless of whether the Quote is executed, and Client shall be responsible for the full Payment.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "PAYMENT TERMS: Payment for a U.S. domestic charter is due in full no later than three (3) business days prior to the scheduled departure date of the initial leg of the itinerary. Payment for International charters is due no later than five (5) business days prior to the scheduled departure date of the initial leg of the itinerary.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "CHARTER OPERATOR will accept such pre-payments via ACH (U.S. bank account required), wire transfer, credit card, or check. Quoted price reflects a 4.3% cash discount. If a credit card is used for payment, the 4.3% cash discount will be forfeited. Additionally, CHARTER OPERATOR may also authorize Client’s credit card for 5% of the quoted amount of each trip to secure payment for possible Additional Expenses as defined herein.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Please note ACH transfers may take up to 7 business days to be received successfully. Regardless of the form of payment selected by Client, all required funds must be received in accordance with the Payment Terms. In the event all required funds are not successfully received, CHARTER OPERATOR will capture authorized funds from the credit card provided, to include a 4.3% service charge, or at its sole discretion may elect to cancel the itinerary. In the event of any overpayment please contact billings@flyjetedge.com referencing the Quote Number to arrange a refund.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "If a subsequent quote is presented to the Client, which revises or amends this Quote, then the subsequent quote’s terms and conditions prevail. The subsequent quote may continue with the same Quote Number, but with revised dates and terms and conditions.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "CHARTER OPERATOR shall not be responsible for any damages, losses, or costs to Client, incidental, consequential or otherwise, in the event the referenced aircraft becomes unavailable after confirmation. In the event CHARTER OPERATOR cancels the charter, the cancellation fee will not be charged to Client.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "If a third-party broker is purchasing the charter trip on behalf of its Client, then the broker and not the CHARTER OPERATOR will be responsible for collecting and remitting all applicable taxes.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "ITINERARY CONFIRMATION:  An Itinerary is not confirmed until the CHARTER OPERATOR provides written confirmation to the Client of the confirmation, which can be withheld at CHARTER OPERATOR’s sole discretion and for any reason.  Return to the CHARTER OPERATOR of an executed Agreement and full compliance with PAYMENT TERMS are not sufficient for establishing confirmation of an Itinerary nor obligating the CHARTER OPERATOR to provide any flight services to the Client.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "PEAK DAY: Peak Day flight departure time requests may be honored by the CHARTER OPERATOR within three (3) hours before or after the Client’s requested time. \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "CANCELLATION PENALTIES:  An Itinerary will not be considered cancelled until the time of receipt of written notice by the Client or other party authorized in writing beforehand by the Client. In the event an Itinerary or portion of an Itinerary is cancelled due to governmental declaration of a public health crisis that prohibits Client-requested flying, flights will be cancelled at no penalty with 100% return of funds to Client for the prorated value of the unflown portion of the Itinerary. Itineraries with any legs flying to, from, or between airports outside of the continental United States, Canada, and/or Mexico are considered International Itineraries.  \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Client is not eligible for a waiver of applicable cancellation penalties in the event Operator’s flight for any leg in the itinerary for whatever reason is re-scheduled at Operator’s sole discretion to depart later than the scheduled time and/or depart from and/or land at an airport(s) other than airports indicated in the itinerary.  However, Operator at its sole discretion may reduce the Quote Amount in an amount equal to or less than the [ number of hours of departure delay [ total driving distance in statute miles between alternate airport(s) and requested airport(s) ] / 50 ] x $2500.00. Also, please note that more stringent cancellation fees may apply to trips booked with a Third Party Operator, and any such fees will be communicated to Client.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "RETAIL\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Standard Days\r\n"
				+ "\r\n"
				+ "Within 7 day:         10%\r\n"
				+ "\r\n"
				+ "Within 6 day:         25%\r\n"
				+ "\r\n"
				+ "Within 5 day:         40%\r\n"
				+ "\r\n"
				+ "Within 4 day:         55%\r\n"
				+ "\r\n"
				+ "Within 3 day:         70%\r\n"
				+ "\r\n"
				+ "Within 2 day:         85%\r\n"
				+ "\r\n"
				+ "Within 1 day:         100%\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Peak and High Demand Days\r\n"
				+ "\r\n"
				+ "Upon Booking:      10%\r\n"
				+ "\r\n"
				+ "Within 14 day:        25%\r\n"
				+ "\r\n"
				+ "Within 10 day:        50%\r\n"
				+ "\r\n"
				+ "Within 7 day:          75%\r\n"
				+ "\r\n"
				+ "Within 5 day:          100%\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "RESERVE\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Domestic - Standard\r\n"
				+ "\r\n"
				+ "24 Hour Notice (50% charge between 12-24 hours, 100% within 12 hours)*\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Domestic - Peak and High Demand\r\n"
				+ "\r\n"
				+ "72 Hour Notice (25% charge between 48-72 hours, 50% for 24-48, 100% within 24 hours)*\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "International - Standard\r\n"
				+ "\r\n"
				+ "72 Hour Notice (25% charge between 48-72 hours, 50% for 24-48, 100% within 24 hours)*\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "International - Peak and High Demand\r\n"
				+ "\r\n"
				+ "120 Hour Notice (25% charge between 48-120 hours, 50% 24-48, 100% within 24 hours)*\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "*For all flights to/from Hawaii on peak/non-peak days, the cancellation penalty is 50% between 120-48 hours prior to departure and 100% for less than 48 hours.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "WI-FI POLICY: Complimentary Wi-Fi is included only for domestic itineraries (excludes AK and HI) but not guaranteed to be available on a flights International Wi-Fi, if available, will be an additional charge, and Client acknowledges charges may be substantial.  Should Wi-Fi be inoperative for any portion of any flight, CHARTER OPERATOR will not discount nor make any revisions to the Quote Amount.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "NON-PREFERRED FBO POLICY: All Quotes will by default use CHARTER OPERATOR’S preferred FBO facility at each airport. If Client is requesting to use a facility other than CHARTER OPERATOR’S preferred FBO, upon CHARTER OPERATOR’s written acceptance to use a non-preferred FBO an additional fee determined by the CHARTER OPERATOR will apply for each non-preferred FBO location requested.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "PET FEE: If a pet(s) is crated for the duration of the flight, no pet cleaning fee will be charged. Regardless of whether a pet(s) was to be crated, if in the determination of CHARTER OPERATOR a pet(s) soils the aircraft or a pet(s) that was supposed to be crated was uncrated for a portion of a flight, the Client will be charged the below fees on per flight day basis:\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "- Light/Mid: $600 \r\n"
				+ "\r\n"
				+ "- Super Mid: $800 \r\n"
				+ "\r\n"
				+ "- Heavy (Large/ULR): $1,000\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "SURCHARGE:  CHARTER OPERATOR will apply a surcharge of 25% for all catering and ground coordinated through CHARTER OPERATOR.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "SLIDING DEPARTURE TIMES: All departure times are fixed with a window of sixty (60) minutes beyond the scheduled departure time to accommodate Clients who may be running late. Should more than a sixty (60) minute window be desired, Client must advise CHARTER OPERATOR at the time of booking. Such extended departure window, if agreed by CHARTER OPERATOR, may result in an additional charge.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "NO SHOW POLICY:  If a Client does not arrive for a flight departure within the allotted sixty (60) minutes beyond the scheduled departure time of a leg listed in the Itinerary, at CHARTER OPERATOR’s sole discretion the Client may be charged an additional amount equal to 15% of the Quote total, and all remaining legs of the Itinerary may be cancelled without refund. Furthermore, CHARTER OPERATOR will not be obligated to provide any additional flight services under this Agreement.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "PASSENGER HEALTH QUESTIONNAIRE:  Client must ensure that a Passenger Health Questionnaire related to COVID-19 provided by the CHARTER OPERATOR will be completed and returned to the CHARTER OPERATOR prior to the start of the Itinerary.  Client represents and warrants that the Passenger Health Questionnaire will be free of any willful or knowing omissions (“Omissions”).  In the event the Passenger Health Questionnaire does contain Omissions, which the Client will provide prompt and reasonable assistance as may be requested by the CHARTER OPERATOR to investigate and substantiate, any unflown portion of the Itinerary may be subject to cancellation with no refund, and the Client may be required to pay all damages to CHARTER OPERATOR that are related to the Omissions.  \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "APPLICABLE LAW: This Agreement shall be governed by and construed and interpreted in accordance with the laws of the State of California, the laws of which the Client hereby expressly elects to apply to this Agreement, without giving effect to provisions for choice of law thereunder.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "BINDING ARBITRATION: Any dispute, controversy or claim arising out of, relating to, or in connection with this Agreement or the breach, termination or validity thereof, shall be finally resolved by arbitration in accordance with the American Arbitration Association (\"AAA\") Commercial Arbitration Rules (\"Arbitration Rules\") in effect at the time of the arbitration, except as they may be modified herein or by mutual agreement of the parties. The seat of the arbitration shall be the City of Los Angeles, California in the United States.  Notwithstanding the Applicable Law section of this Agreement, the arbitration and this Section shall be governed by the United States Federal Arbitration Act, 9 USC �� 1 et seq.  The arbitration shall be conducted by an arbitration panel consisting of three arbitrators, each of whom shall be a neutral arbitrator subject, inter alia, to disqualification for the reasons specified in Section 19 of the Arbitration Rules. The party or parties initiating arbitration (\"Claimant(s)\") shall nominate an arbitrator in the notice of intention to arbitrate (\"Demand\"). The other party or parties (\"Respondent(s)\") shall nominate an arbitrator within thirty (30) days of receipt of the Demand and shall notify the Claimant(s) of such nomination in writing. The first two arbitrators nominated or appointed in accordance with this provision shall nominate a third arbitrator within thirty (30) days after the receipt by Claimant(s) of the notification by Respondent(s) of the nomination of an arbitrator by Respondent(s) or, in the event of a failure by a party or parties to nominate, within thirty (30) days after the AAA has notified the parties and any arbitrator already nominated or appointed of the AAA's appointment of an arbitrator on behalf of the party or parties failing to nominate. \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "The third arbitrator shall act as Chair of the arbitration panel. The three (3) arbitrators shall collectively be referred to as the \"Arbitral Panel.\" In addition to the authority conferred on the arbitration panel by the Arbitration Rules, the arbitration panel shall have the authority to (i) order reasonable discovery, including the production of documents and depositions, and (ii)  make such orders for interim relief, including injunctive relief, as it may deem just and equitable. The arbitral award shall be in writing, state the reason for the award and be final and binding on the parties. The award may grant any remedy that is permissible under the laws of the State of California, including without limitation specific performance and injunctive relief, and may include an award of costs, including reasonable attorneys' fees and disbursements. Judgment upon the award may be entered by any court having jurisdiction thereof or having jurisdiction over the parties or their assets. \r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "THE PARTIES UNDERSTAND THAT THEY WOULD HAVE HAD A RIGHT OR OPPORTUNITY TO LITIGATE THROUGH A COURT AND TO HAVE A JUDGE OR JURY DECIDE THEIR CASE, BUT THEY CHOOSE TO HAVE ANY AND ALL DISPUTES DECIDED THROUGH ARBITRATION. BY SIGNING THIS AGREEMENT, THE PARTIES ARE GIVING UP ANY RIGHT THEY MIGHT HAVE TO SUE EACH OTHER.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "");
		driver.switchTo().defaultContent();
	}

	@And("Click edit button in terms and condition")
	public void Click_edit_button_in_terms_and_condition() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvVersion_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvVersion_imbView_0"));
		ele.click();
	}

	@Then("Modify the details in terms and condition")
	public void Modify_the_details_in_terms_and_condition() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele1 = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		String text = ele1.getText();
		ele1.clear();
		Thread.sleep(2000);
		ele2 = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele2.sendKeys(text);
	}

	@Then("Click update button in terms and condition")
	public void Click_update_button_in_terms_and_condition() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnUpdate")));
		ele = driver.findElement(By.id("cpWheelsUp_btnUpdate"));
		ele.click();
	}

	@Then("Click the special day button in quote")
	public void Click_the_special_day_button_in_quote() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liQuote\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liQuote\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"SPL\"]/a/span"));
		ele1.click();
	}

	@And("Click add new button in special day")
	public void Click_add_new_button_in_special_day() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@Then("Click back button in special day")
	public void Click_back_button_in_special_day() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}

	@And("Click save button in special day")
	public void Click_save_button_in_special_day() {
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
			System.out.println(" No Alert message is displayed ");
		}
	}

	@And("Enter valid details in special day")
	public void Enter_valid_details_in_special_day() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlDemandDay")));
		//select demand day
		ele = driver.findElement(By.id("cpWheelsUp_ddlDemandDay"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);

		//Select valid start date
		ele1 = driver.findElement(By.id("cpWheelsUp_txtstartdate"));
		ele1.click();
		Thread.sleep(2000);
		ele2 = driver.findElement(By.id("cpWheelsUp_CalendarExtender2_day_0_0"));
		ele2.click();

		//Select valid end date
		ele3 = driver.findElement(By.id("cpWheelsUp_txtenddate"));
		ele3.click();
		Thread.sleep(2000);
		ele4 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_5_6"));
		ele4.click();
		Thread.sleep(2000);
		//Enter valid notes
		ele5 = driver.findElement(By.id("cpWheelsUp_txtnotes"));
		ele5.sendKeys("Test");
		Thread.sleep(2000);
		//Select no radio button
		ele6 = driver.findElement(By.id("cpWheelsUp_rblActiveNo"));
		ele6.click();
	}

	@Then("Click clear button in special day")
	public void Click_clear_button_in_special_day() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}
	
	@And("Click edit button in special day")
	public void Click_edit_button_in_special_day() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvSpecialDays_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvSpecialDays_imbView_0"));
		ele.click();
	}
	
	@And("Modify valid details in special day")
	public void Modify_valid_details_in_special_day() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtnotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtnotes"));
		String text = ele.getText();
		ele.clear();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_txtnotes"));
		ele1.sendKeys(text);
	}
	
	@Then("Click update button in special day")
	public void Click_update_button_in_special_day() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSave"));
		ele.click();
	}
	
}


