package stepDefinition;

import java.time.Duration;

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

public class JE_QP_4_Groups {
	public WebDriver driver;
	public WebElement ele,ele1,ele2,ele3,ele4,ele5,ele6,ele7,ele8,ele9;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(5));


	@Given("To Check Groups User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		//option.addArguments("--headless=new");
		driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check Groups User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check Groups")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");

	}

	@And("close the Groups Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Click the date group in groups")
	public void Click_the_price_rules_button_in_quote() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liSetup\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liSetup\"]/a/span[2]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"DAT\"]/a/span"));
		ele1.click();
	}

	@And("Click add new button in date group")
	public void Click_add_new_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}
	
	@Then("Click back button in date group")
	public void Click_back_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}
	
	@Then("Click save button in date group")
	public void Click_save_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is displayed");
		}
	}
	
	@Then("Click add to list button in date group")
	public void Click_add_to_list_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddToList")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddToList"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is displayed");
		}
	}
	
	@Then("Select valid effective date in date mapping")
	public void Select_valid_effective_date_in_date_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtStartDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtStartDate"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender2_day_0_0"));
		ele1.click();
	}
	
	@And("Select valid discontinue date in date mapping")
	public void Select_valid_Discontinue_date_in_date_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtEndDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtEndDate"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_5_6"));
		ele1.click();
	}
	
	@And("Click edit button in date mapping")
	public void Click_edit_button_in_date_mapping()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvDateList_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvDateList_imbView_0"));
		ele.click();
	}
	
	@Then("Modify details in date group")
	public void Modify_details_in_date_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtStartDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtStartDate"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender2_day_0_0"));
		ele1.click();
	}
	
	@And("Click delete button in date mapping")
	public void Click_delete_button_in_date_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvDateList_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvDateList_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}
	
	@And("Enter valid group name in date group")
	public void Enter_valid_group_name_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele.sendKeys("Test");
	}
	
	@Then("Enter valid notes in date group")
	public void Enter_valid_notes_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele.sendKeys("Test");
	}
	
	@And("Click no radio button in date group")
	public void Click_no_radio_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblActiveNo")));
		ele = driver.findElement(By.id("cpWheelsUp_rblActiveNo"));
		ele.click();
	}
	
	@Then("Click clear button in date group")
	public void Click_clear_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}
	
	@And("Select inactive status in date group")
	public void Select_inactive_status_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlFilterActive")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFilterActive"));
		Select sel=new Select(ele);
		sel.selectByIndex(2);
	}
	
	@And("Click search button in date group")
	public void Click_search_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	
	@Then("Click edit button in date group")
	public void Click_edit_button_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvDateGroup_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvDateGroup_imbView_0"));
		ele.click();
	}
	
	@And("Modify valid details in date group")
	public void Modify_valid_details_in_date_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		String text = ele.getText();
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele1.sendKeys("Test");
	}
	
	@Then("Click the airport group in groups")
	public void Click_the_airport_group_in_groups() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liSetup\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liSetup\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"AGP\"]/a/span"));
		ele1.click();
	}
	
	@And("Click add new button in airport group")
	public void Click_add_new_button_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}
	
	@Then("Click back button in airport group")
	public void Click_back_button_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}
	
	@Then("Click save button in airport group")
	public void Click_save_button_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is displayed");
		}
	}
	
	@Then("Click add new setup button in airport group")
	public void Click_add_new_setup_button_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnNewSetup")));
		ele = driver.findElement(By.id("cpWheelsUp_btnNewSetup"));
		ele.click();
	}
	
	@And("Click add to list button in add group")
	public void Click_add_to_list_button_in_add_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnRouteAdd")));
		ele = driver.findElement(By.id("cpWheelsUp_btnRouteAdd"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is displayed");
		}
	}
	
	@And("Enter airport name in add group")
	public void Enter_airport_name_in_add_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFromICAO")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFromICAO"));
		ele.sendKeys("KMMU");
	}
	
	@And("Click country radio button in airport group")
	public void Click_country_radio_button_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblDepartureSetup_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblDepartureSetup_1"));
		ele.click();
	}
	
	@Then("Click the checkbox in country")
	public void Click_the_checkbox_in_country() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvCountry_checkAll")));
		ele = driver.findElement(By.id("cpWheelsUp_gvCountry_checkAll"));
		ele.click();
	}
	
	@And("Click state radio button in airport group")
	public void Click_state_radio_button_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblDepartureSetup_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rblDepartureSetup_2"));
		ele.click();
	}
	
	@Then("Select valid country in state")
	public void Select_valid_country_in_state() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlCountry")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlCountry"));
		Select sel=new Select(ele);
		sel.selectByValue("1");
	}
	
	@Then("Click the checkbox in state")
	public void Click_the_checkbox_in_state() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvStates_checkAll")));
		ele = driver.findElement(By.id("cpWheelsUp_gvStates_checkAll"));
		ele.click();
	}
	
	@Then("Click close button in add group")
	public void Click_close_button_in_add_group() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button2")));
		ele = driver.findElement(By.id("cpWheelsUp_Button2"));
		ele.click();
	}
	
	
	@And("Click the delete button in country")
	public void Click_the_delete_button_in_country() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAirportMapping_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAirportMapping_imbDel_0"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true)", ele);
		Thread.sleep(2000);
		ele.click();
	}
	
	
	@And("Enter group name in airport group")
	public void Enter_group_name_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele.sendKeys("Test");
	}
	
	@Then("Enter notes in airport group")
	public void Enter_notes_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele.sendKeys("Test");
	}
	
	@And("Select valid effective date in airport group")
	public void Select_valid_effective_date_in_airport_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtEffectiveDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtEffectiveDate"));
		ele.click();
		Thread.sleep(3000);
		ele1 = driver.findElement(By.id("CalendarExtender2_day_0_0"));
		ele1.click();
		Thread.sleep(2000);
		ele2 = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele2.click();
		
	}
	
	@Then("Select valid Discontinue date in airport group")
	public void Select_valid_Discontinue_date_in_airport_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDiscontinueDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDiscontinueDate"));
		ele.click();
		Thread.sleep(3000);
		ele1 = driver.findElement(By.id("CalendarExtender4_day_5_6"));
		ele1.click();
		Thread.sleep(2000);
		ele2 = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele2.click();
	}
	
	@And("Click clear button in airport group")
	public void Click_clear_button_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}
	
	@And("Click edit button in airport groups")
	public void Click_edit_button_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAirportGroup_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAirportGroup_imbView_0"));
		ele.click();
	}
	
	@Then("Modify valid details in airport groups")
	public void Modify_valid_details_in_airport_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		String text = ele.getText();
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele1.sendKeys(text);
	}
	
	@Then("Click the Tail group in groups")
	public void Click_the_Tail_group_in_groups() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liSetup\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liSetup\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"TLG\"]/a/span"));
		ele1.click();
	}
	
	@And("Click add new button in Tail group")
	public void click_add_new_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}
	
	@Then("Click back button in Tail group")
	public void click_back_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}
	
	@Then("Click save button in Tail group")
	public void click_save_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is displayed");
		}
	}
	
	@And("Click add tail button in Tail group")
	public void click_add_tail_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnNewSetup")));
		ele = driver.findElement(By.id("cpWheelsUp_btnNewSetup"));
		ele.click();
	}
	
	@Then("Click close button in Tail mapping details")
	public void Click_close_button_in_Tail_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnCloseGroup")));
		ele = driver.findElement(By.id("cpWheelsUp_btnCloseGroup"));
		ele.click();
	}
	
	@And("Select valid checkbox in Tail mapping details")
	public void Select_valid_checkbox_in_Tail_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvPopTailDetails_chkChoose_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvPopTailDetails_chkChoose_0"));
		ele.click();
	}
	
	@Then("Click add to list button in Tail mapping details")
	public void Click_add_to_list_button_in_Tail_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSavePopDetails")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSavePopDetails"));
		ele.click();
	}
	
	@And("Click delete button in Tail mapping details")
	public void Click_delete_button_in_Tail_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvMapping_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvMapping_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : "+text);
		alert.accept();
	}
	
	@Then("Enter valid group name in tail group")
	public void Enter_valid_group_name_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele.sendKeys("Testing");
	}
	
	@And("Enter valid notes in tail group")
	public void Enter_valid_notes_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele.sendKeys("Testing");
	}
	
	@Then("Select valid effective date in tail group")
	public void Select_valid_effective_date_in_tail_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupEff")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupEff"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_0_0"));
		ele1.click();
	}
	
	@And("Select valid discontinue date in tail group")
	public void Select_valid_Discontinue_date_in_tail_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtExpiryDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtExpiryDate"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_calendar12_day_5_6"));
		ele1.click();
	}
	
	@Then("Click no radio button in tail group")
	public void Click_no_radio_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblActiveNo")));
		ele = driver.findElement(By.id("cpWheelsUp_rblActiveNo"));
		ele.click();
	}
	
	@And("Click clear button in tail group")
	public void Click_clear_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}
	
	@And("Select status in dropdown in Tail group")
	public void Select_status_in_dropdown_in_tail_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlFilterActive")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFilterActive"));
		Select sel=new Select(ele);
		sel.selectByIndex(2);
	}
	
	@Then("Enter valid name in Tail group")
	public void Enter_valid_name_in_tail_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSearch"));
		ele.sendKeys("Testing");
	}
	
	@And("Click Search button in Tail group")
	public void Click_search_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	
	@And("Click edit button in Tail group")
	public void Click_edit_button_in_tail_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAirportGroup_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAirportGroup_imbView_0"));
		ele.click();
	}
	
	@Then("Modify valid details in Tail group")
	public void Modify_valid_details_in_tail_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		String text = ele.getText();
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele1.sendKeys(text);
	}
	
	@Then("Click the account group in groups")
	public void click_the_account_group_in_groups() throws InterruptedException {
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liSetup\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liSetup\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"CGP\"]/a/span"));
		ele1.click();
	}
	
	@And("Click add new button in account group")
	public void click_add_new_button_in_account_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}
	
	@Then("Click back button in account group")
	public void click_back_button_in_account_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}
	
	@Then("Click save button in account group")
	public void click_save_button_in_account_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is displayed");
		}
	}
	
	@Then("Click add account type button in account group")
	public void click_add_account_type_button_in_account_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnNewSetup")));
		ele = driver.findElement(By.id("cpWheelsUp_btnNewSetup"));
		ele.click();
	}
	
	@And("Click close button in Account Type Mapping Details")
	public void click_close_button_in_account_type_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddClose")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddClose"));
		ele.click();
	}
	
	@And("Select valid checkbox in Account Type Mapping Details")
	public void Select_valid_checkbox_in_Account_Type_Mapping_Details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvPopCustomerDetails_chkChoose_1")));
		ele = driver.findElement(By.id("cpWheelsUp_gvPopCustomerDetails_chkChoose_1"));
		ele.click();
	}
	
	@And("Click add to list button in Account Type Mapping Details")
	public void click_add_to_list_button_in_account_type_mapping_details() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSavePopDetails")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSavePopDetails"));
		ele.click();
	}
	
	@Then("Click delete button in account group")
	public void click_delete_button_in_account_group() {
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
	
	@Then("Enter valid group name in account group")
	public void Enter_valid_group_name_in_account_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele.sendKeys("Test");
	}
	
	@And("Enter valid notes in account group")
	public void Enter_valid_notes_in_account_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele.sendKeys("Test");
	}
	
	@Then("Select valid effective date in account group")
	public void Select_valid_effective_date_in_account_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtEffectiveDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtEffectiveDate"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("CalendarExtender2_day_0_0"));
		ele1.click();
	}
	
	@And("Select valid discontinue date in account group")
	public void Select_valid_discontinue_date_in_account_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtExpiryDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtExpiryDate"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("CalendarExtender1_day_5_6"));
		ele1.click();
	}
	

	
	@Then("Click no radio button in account group")
	public void Click_no_radio_button_in_account_group(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblActiveNo")));
		ele = driver.findElement(By.id("cpWheelsUp_rblActiveNo"));
		ele.click();
	}
	
	@And("Click clear button in account group")
	public void Click_clear_button_in_account_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}
	
	@Then("Modify valid details in account group")
	public void Modify_valid_details_in_account_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		String text = ele.getText();
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele1.sendKeys(text);
	}
	
	@And("Select valid status in account group")
	public void Select_valid_status_in_account_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlFilterActive")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFilterActive"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	
	@Then("Enter valid name in account group")
	public void Enter_valid_name_in_account_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSearch"));
		ele.sendKeys("Test");
	}
	
	@And("Click search button in account group")
	public void Click_search_button_in_account_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCloe")));
		ele1 = driver.findElement(By.id("btnCloe"));
		ele1.click();
	}
	
	@And("Click edit button in account group")
	public void Click_edit_button_in_account_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvRatioGroup_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvRatioGroup_imbView_0"));
		ele.click();
	}
	
	
	
	
	
	
	
	
	
	@Then("Click the ratio group in groups")
	public void click_the_ratio_group_in_groups() throws InterruptedException {
	    WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liSetup\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liSetup\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"RGP\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"RGP\"]/a/span"));
		ele1.click();
		
		
		//Accept alert message but need to remove
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCloe")));
		ele = driver.findElement(By.id("btnCloe"));
		ele.click();
	}
	
	@And("Click add new button in ratio group")
	public void click_add_new_button_in_ratio_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}
	
	@Then("Click back button in ratio group")
	public void click_back_button_in_ratio_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}
	
	@Then("Click save button in ratio group")
	public void click_save_button_in_ratio_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message is displayed like : "+text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert is displayed");
		}
	}
	
	@Then("Click add new button in ratio range")
	public void click_add_new_button_in_ratio_range() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnNewSetup")));
		ele = driver.findElement(By.id("cpWheelsUp_btnNewSetup"));
		ele.click();
	}
	
//	@And("Click close button in add group")
//	public void click_close_button_in_add_group() {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button2")));
//		ele = driver.findElement(By.id("cpWheelsUp_Button2"));
//		ele.click();
//	}
	
	@And("Enter valid start range in add group")
	public void Enter_valid_start_range_in_add_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDayStart")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDayStart"));
		ele.sendKeys("5");
	}
	
	@And("Enter valid start range in hours radio in add group")
	public void Enter_valid_start_range_in_hours_radio_in_add_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtHoursStart")));
		ele = driver.findElement(By.id("cpWheelsUp_txtHoursStart"));
		ele.sendKeys("5");
	}
	
	@Then("Enter valid end range in add group")
	public void Enter_valid_end_range_in_add_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDayEnd")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDayEnd"));
		ele.sendKeys("10");
	}
	
	@Then("Enter valid end range in hours radio in add group")
	public void Enter_valid_end_range_in_hours_radio_in_add_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtHoursEnd")));
		ele = driver.findElement(By.id("cpWheelsUp_txtHoursEnd"));
		ele.sendKeys("10");
	}
	
//	@And("Click add to list button in add group")
//	public void click_add_to_list_button_in_add_group() {
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnRouteAdd")));
//		ele = driver.findElement(By.id("cpWheelsUp_btnRouteAdd"));
//		ele.click();
//	}
	
	@Then("Click hours radio button in add group")
	public void click_hours_radio_button_in_add_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblSetup_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblSetup_1"));
		ele.click();
	}
	
	@Then("Click delete button in ratio group")
	public void click_delete_button_in_ratio_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAirportMapping_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAirportMapping_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : "+text);
		alert.dismiss();
		ele.click();
		alert.accept();
	}
	
	@Then("Enter valid group name in ratio group")
	public void Enter_valid_group_name_in_ratio_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele.sendKeys("Test");
	}
	
	@And("Enter valid notes in ratio group")
	public void Enter_valid_notes_in_ratio_group() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele.sendKeys("Test");
	}
	
	@Then("Select valid effective date in ratio group")
	public void Select_valid_effective_date_in_ratio_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtEffectiveDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtEffectiveDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender2_day_0_0")));
		ele1 = driver.findElement(By.id("CalendarExtender2_day_0_0"));
		ele1.click();
	}
	
	@And("Select valid discontinue date in ratio group")
	public void Select_valid_discontinue_date_in_ratio_group() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDiscontinueDate")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDiscontinueDate"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("CalendarExtender4_day_5_6")));
		ele1 = driver.findElement(By.id("CalendarExtender4_day_5_6"));
		ele1.click();
	}
	
	@Then("Click no radio button in ratio group")
	public void Click_no_radio_button_in_ratio_group(){
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblActiveNo")));
		ele = driver.findElement(By.id("cpWheelsUp_rblActiveNo"));
		ele.click();
	}
	
	@And("Click clear button in ratio group")
	public void Click_clear_button_in_ratio_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}
	
	@Then("Modify valid details in ratio group")
	public void Modify_valid_details_in_ratio_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		String text = ele.getText();
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele1.sendKeys(text);
	}
	
	@And("Select valid status in ratio group")
	public void Select_valid_status_in_ratio_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlFilterActive")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFilterActive"));
		Select sel=new Select(ele);
		sel.selectByIndex(2);
	}
	
	@Then("Enter valid name in ratio group")
	public void Enter_valid_name_in_ratio_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSearch"));
		ele.sendKeys("Test");
	}
	
	@And("Click search button in ratio group")
	public void Click_search_button_in_ratio_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}
	
	@And("Click edit button in ratio group")
	public void Click_edit_button_in_ratio_group()  {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvCustomerGroup_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvCustomerGroup_imbView_0"));
		ele.click();
	}
}


