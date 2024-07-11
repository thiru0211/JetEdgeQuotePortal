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

public class JE_QP_5_Masters {
	public WebDriver driver;
	public WebElement ele, ele1, ele2, ele3, ele4, ele5, ele6, ele7, ele8, ele9;
	public WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(5));

	@Given("To Check masters User is navigating to JetEdge URL is {string}")
	public void user_is_navigating_to_jet_edge_Signin_url_is(String URL) {
		System.setProperty("webdriver.chrome.driver", ".\\Driver\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
	    //option.addArguments("--headless=new");
		driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@When("To Check masters User Enter username and password are {string} and {string}")
	public void username_and_password_are_and(String UserName, String Password) {
		driver.findElement(By.id("txtUserName")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		System.out.println("Username and password entered");
	}

	@And("click the Signin button To Check masters")
	public void click_the_SignIn_button() {
		driver.findElement(By.id("ibLogin")).click();
		System.out.println("login button clicked");

	}

	@And("close the masters Page")
	public void close_the_Signin_Page() {
		driver.quit();
		System.out.println("Page is closed");
	}

	@Then("Click the price formula in masters")
	public void Click_the_price_rules_button_in_quote() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		ele1 = driver.findElement(By.xpath("//*[@id=\"PFM\"]/a/span"));
		ele1.click();
	}

	@And("Click excel upload button in price formula")
	public void Click_excel_upload_button_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnExcUpload")));
		ele = driver.findElement(By.id("cpWheelsUp_btnExcUpload"));
		ele.click();
	}

	@And("Click copy from button in price formula")
	public void Click_copy_from_button_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnCopyFrom")));
		ele = driver.findElement(By.id("cpWheelsUp_btnCopyFrom"));
		ele.click();
	}

	@Then("Click close button in copy formula")
	public void Click_close_button_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnConfirmNo")));
		ele = driver.findElement(By.id("cpWheelsUp_btnConfirmNo"));
		ele.click();
	}

	@Then("Select valid copy from in price formula")
	public void Select_valid_copy_from_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlOldFormuah")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlOldFormuah"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
	}

	@And("Enter new formula name in price formula")
	public void Enter_new_formula_name_in_price_formula() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNewFormula")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNewFormula"));
		ele.sendKeys("Test");
	}

	@Then("Click copy button in price formula")
	public void Click_copy_button_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnConfirmYes")));
		ele = driver.findElement(By.id("cpWheelsUp_btnConfirmYes"));
		ele.click();
	}

	@And("Click add new button in price formula")
	public void click_add_new_button_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@Then("Click back button in price formula")
	public void click_back_button_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}

	@Then("Click save button in price formula")
	public void click_save_button_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Click Component radio button in price formula")
	public void click_Component_radio_button_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblType_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rblType_0"));
		ele.click();
	}

	@And("Select valid component in price formula")
	public void Select_valid_component_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlFormula")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFormula"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Click add to list in formula details")
	public void click_add_to_list_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddToList")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddToList"));
		ele.click();
	}

	@And("Click delete button in formula details")
	public void click_delete_button_in_formula_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvFormula_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvFormula_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Alert message displayed like : " + text);
		alert.accept();
	}

	@And("Select valid conditions in price formula")
	public void Select_valid_conditions_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lbCondition")));
		ele = driver.findElement(By.id("cpWheelsUp_lbCondition"));
		Select sel = new Select(ele);
		sel.selectByIndex(0);
	}

	@Then("Select valid options in price formula")
	public void Select_valid_options_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lbOptions")));
		ele = driver.findElement(By.id("cpWheelsUp_lbOptions"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Select valid choose country in price formula")
	public void Select_valid_choose_country_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lbCountry")));
		ele = driver.findElement(By.id("cpWheelsUp_lbCountry"));
		Select sel = new Select(ele);
		sel.selectByValue("1");
	}

	@Then("Click add to list in airport details")
	public void click_add_to_list_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAirportAddtoList")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAirportAddtoList"));
		ele.click();
	}

	@Then("Click choose tail button in aircraft")
	public void Click_choose_tail_button_in_aircraft() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_LinkButton3")));
		ele = driver.findElement(By.id("cpWheelsUp_LinkButton3"));
		ele.click();
	}

	@Then("Click the checkbox in aircraft group")
	public void Click_the_checkbox_in_aircraft_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvFleetGroup_checkAll")));
		ele = driver.findElement(By.id("cpWheelsUp_gvFleetGroup_checkAll"));
		ele.click();
	}

	@And("Click add to list button in aircraft group")
	public void Click_add_to_list_button_in_aircraft_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnFleetgroupSaved")));
		ele = driver.findElement(By.id("cpWheelsUp_btnFleetgroupSaved"));
		ele.click();
	}

	@And("Click aircraft Type radio button in aircraft")
	public void Click_aircraft_Type_radio_button_in_aircraft() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblTailBy_1")));
		ele1 = driver.findElement(By.id("btnCloe"));
		ele1.click();
		ele = driver.findElement(By.id("cpWheelsUp_RblTailBy_1"));
		ele.click();
	}

	@Then("Click the checkbox in aircraft Type")
	public void Click_the_checkbox_in_aircraft_Type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAircraftType_checkAll")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAircraftType_checkAll"));
		ele.click();
	}

	@And("Click add to list button in aircraft Type")
	public void Click_add_to_list_button_in_aircraft_Type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button2")));
		ele = driver.findElement(By.id("cpWheelsUp_Button2"));
		ele.click();
	}

	@And("Click tail group radio button in aircraft")
	public void Click_tail_group_radio_button_in_aircraft() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblTailBy_1")));
		ele1 = driver.findElement(By.id("btnCloe"));
		ele1.click();
		ele = driver.findElement(By.id("cpWheelsUp_RblTailBy_2"));
		ele.click();
	}

	@Then("Click the checkbox in tail group")
	public void Click_the_checkbox_in_tail_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAirportGroup_chkChoose_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAirportGroup_chkChoose_0"));
		ele.click();
	}

	@And("Click add to list button in tail group")
	public void Click_add_to_list_button_in_tail_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button4")));
		ele = driver.findElement(By.id("cpWheelsUp_Button4"));
		ele.click();
	}

	@And("Click specific tail radio button in aircraft")
	public void Click_specific_tail_radio_button_in_aircraft() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblTailBy_1")));
		ele1 = driver.findElement(By.id("btnCloe"));
		ele1.click();
		ele = driver.findElement(By.id("cpWheelsUp_RblTailBy_3"));
		ele.click();
	}

	@Then("Click the checkbox in specific tail")
	public void Click_the_checkbox_in_specific_tail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvPopTailDetails_checkAll")));
		ele = driver.findElement(By.id("cpWheelsUp_gvPopTailDetails_checkAll"));
		ele.click();
	}

	@And("Click add to list button in specific tail")
	public void Click_add_to_list_button_in_specific_tail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_Button3")));
		ele = driver.findElement(By.id("cpWheelsUp_Button3"));
		ele.click();
	}

	@And("Click fleet radio button in aircraft")
	public void Click_fleet_radio_button_in_aircraft() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RblTailBy_0")));
		ele = driver.findElement(By.id("cpWheelsUp_RblTailBy_0"));
		ele.click();
	}

	@Then("Click close button in aircraft group")
	public void Click_close_button_in_aircraft_group() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/div[5]/div/div/div[1]/div/div[2]/a/i")));
		ele = driver.findElement(By.xpath(
				"/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/div[5]/div/div/div[1]/div/div[2]/a/i"));
		ele.click();
	}

	@And("Enter formula name in price formula")
	public void Enter_formula_name_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFormulaName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFormulaName"));
		ele.sendKeys("Test");
	}

	@Then("Click clear button in price formula")
	public void Click_clear_button_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}

	@And("Click edit button in price formula")
	public void Click_edit_button_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvPriceFormula_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvPriceFormula_imbView_0"));
		ele.click();
	}

	@And("Modify valid details in price formula")
	public void Modify_valid_details_in_price_formula() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFormulaName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFormulaName"));
		String text = ele.getText();
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtFormulaName"));
		ele1.sendKeys(text);
	}

	@Then("Click the price component in masters")
	public void Click_the_price_component_in_masters() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"REV\"]/a/span"));
		ele1.click();
	}

	@And("Click add new button in price component")
	public void Click_add_new_button_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@Then("Click back button in price component")
	public void Click_back_button_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}

	@Then("Click save button in price component")
	public void Click_save_button_in_price_component() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Click add group button in price component")
	public void Click_add_group_button_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_imgAddGroup")));
		ele = driver.findElement(By.id("cpWheelsUp_imgAddGroup"));
		ele.click();
	}

	@And("Click close button in price component")
	public void Click_close_button_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btlcloseGroup")));
		ele = driver.findElement(By.id("cpWheelsUp_btlcloseGroup"));
		ele.click();
	}

	@And("Click add new button in add group")
	public void Click_add_new_button_in_add_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnGAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnGAddNew"));
		ele.click();
	}

	@Then("Click close button in add component group")
	public void Click_close_button_in_add_component_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btlcloseGroup")));
		ele = driver.findElement(By.id("cpWheelsUp_btlcloseGroup"));
		ele.click();
	}

	@Then("Click save button in add component group")
	public void Click_save_button_in_add_component_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSaveGroup")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSaveGroup"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Enter valid group name in add group")
	public void Enter_valid_group_name_in_add_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroup")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroup"));
		ele.sendKeys("Test");
	}

	@And("Enter print sequence in add group")
	public void Enter_print_sequence_in_add_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGDisSeq")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGDisSeq"));
		ele.sendKeys("10");
	}

	@Then("Click valid radio button in add group")
	public void Click_valid_radio_button_in_add_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblCosLin_0")));
		// Lineitem
		ele = driver.findElement(By.id("cpWheelsUp_rblCosLin_0"));
		ele.click();

		// ORA
		ele1 = driver.findElement(By.id("cpWheelsUp_rblORA_0"));
		ele1.click();

		// Active
		ele2 = driver.findElement(By.id("cpWheelsUp_rblGActive_0"));
		ele2.click();
	}

	@Then("Click no radio button in add group")
	public void Click_no_radio_button_in_add_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblCosLin_1")));
		// Lineitem
		ele = driver.findElement(By.id("cpWheelsUp_rblCosLin_1"));
		ele.click();

		// ORA
		ele1 = driver.findElement(By.id("cpWheelsUp_rblORA_1"));
		ele1.click();

		// Active
		ele2 = driver.findElement(By.id("cpWheelsUp_rblGActive_1"));
		ele2.click();
	}

	@And("Click edit button in add group")
	public void Click_edit_button_in_add_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvGroup_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvGroup_imbView_0"));
		ele.click();
	}

	@Then("Modify valid details in add group")
	public void Modify_valid_details_in_add_group() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroup")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroup"));
		String text = ele.getAttribute("value");
		System.out.println("Text is :" + text);
		ele.clear();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_txtGroup"));
		ele1.sendKeys(text);
	}

	@Then("Enter valid component name in price component")
	public void enter_valid_component_name_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtExpenseName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtExpenseName"));
		ele.sendKeys("Test");
	}

	@And("Enter valid sequence in price component")
	public void enter_valid_sequence_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDisSeq")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDisSeq"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtDisSeq"));
		ele1.sendKeys("1");
	}

	@Then("Select valid unit type in price component")
	public void select_valid_unit_type_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlSetupBy")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlSetupBy"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
	}

	@And("Click no radio button in price component")
	public void click_no_radio_button_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblActive_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblActive_1"));
		ele.click();
	}

	@Then("Click yes radio button in minimums in price component")
	public void click_yes_radio_button_in_minimums_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblMinimums_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblMinimums_1"));
		ele.click();
	}

	@And("Enter valid per day value in price component")
	public void enter_valid_per_day_value_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtPerFlightDay")));
		ele = driver.findElement(By.id("cpWheelsUp_txtPerFlightDay"));
		ele.sendKeys("1.5");
	}

	@Then("Select valid group name in price component")
	public void select_valid_group_name_in_price_component() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlGroupName"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		ele1 = driver.findElement(By.id("cpWheelsUp_ddlORAGroup"));
		Select sel1 = new Select(ele1);
		sel1.selectByIndex(1);
	}

	@And("Click clear button in price component")
	public void click_clear_button_in_price_component() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}

	@And("Select valid type name in price component")
	public void select_valid_type_name_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlCompType")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlCompType"));
		Select sel = new Select(ele);
		sel.selectByIndex(0);
	}

	@Then("Select valid status in price component")
	public void select_valid_status_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlFilterActive")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFilterActive"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
	}

	@And("Click edit button in price component")
	public void click_edit_button_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvCostSetup_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvCostSetup_imbView_0"));
		ele.click();
	}

	@Then("Modify valid component name in price component")
	public void modify_valid_component_name_in_price_component() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtExpenseName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtExpenseName"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtExpenseName"));
		ele1.sendKeys(text);
	}

	@Then("Click the user setup in masters")
	public void click_the_user_setup_in_masters() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"USR\"]/a/span"));
		ele1.click();
	}

	@And("Select valid status in user setup")
	public void select_valid_status_in_user_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlFStatus")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFStatus"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Enter valid name in user setup")
	public void enter_valid_name_in_user_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSearch"));
		ele.sendKeys("Test");
	}

	@And("Click search button in user setup")
	public void click_search_button_in_user_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSubmit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSubmit"));
		ele.click();
	}

	@And("Click add new button in user setup")
	public void click_add_new_button_in_user_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@Then("Click save button in user setup")
	public void click_save_button_in_user_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@And("Enter valid details in user details")
	public void Enter_valid_details_in_user_details() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFirstName")));
		// First name
		ele = driver.findElement(By.id("cpWheelsUp_txtFirstName"));
		ele.sendKeys("Test");
		Thread.sleep(2000);
		// Last name
		ele1 = driver.findElement(By.id("cpWheelsUp_txtLastName"));
		ele1.sendKeys("Test");
		Thread.sleep(2000);
		// Email ID
		ele2 = driver.findElement(By.id("cpWheelsUp_txtEmail"));
		ele2.sendKeys("0211thiru@gmail.com");
		Thread.sleep(2000);
		// User role
		ele3 = driver.findElement(By.id("cpWheelsUp_ddlUserRole"));
		Select sel = new Select(ele3);
		sel.selectByVisibleText("Support Team");
		Thread.sleep(2000);
	}

	@And("Click no radio button in 2FA tab")
	public void Click_no_radio_button_in_2FA_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblNo")));
		ele = driver.findElement(By.id("cpWheelsUp_rblNo"));
		ele.click();
	}

	@And("Click close button in user setup")
	public void Click_close_button_in_user_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele = driver.findElement(By.id("btnClose"));
		ele.click();
	}

	@Then("Click submit button in 2FA tab")
	public void Click_submit_button_in_2FA_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnsavetwofa")));
		ele = driver.findElement(By.id("cpWheelsUp_btnsavetwofa"));
		ele.click();
	}

	@Then("Click 2FA tab button in user setup")
	public void Click_2FA_tab_button_in_user_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ancTwoFA")));
		ele = driver.findElement(By.id("cpWheelsUp_ancTwoFA"));
		ele.click();
	}

	@Then("Click All tail radio button in assign tail")
	public void click_all_tail_radio_button_in_assign_tail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblTailFlag_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rblTailFlag_0"));
		ele.click();
	}

	@And("Click submit button in assign tail")
	public void click_submit_button_in_assign_tail() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSaveTail")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSaveTail"));
		ele.click();
	}

	@Then("Click screen rights tab in user setup")
	public void click_screen_rights_tab_in_user_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ancScreenRights")));
		ele = driver.findElement(By.id("cpWheelsUp_ancScreenRights"));
		ele.click();
	}

	@And("Click copy from user button in screen rights")
	public void click_cop_from_user_button_in_screen_rights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnCopy")));
		ele = driver.findElement(By.id("cpWheelsUp_btnCopy"));
		ele.click();
	}

	@Then("Select valid copy from in copy setup")
	public void select_valid_copy_from_in_copy_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlCopyFrom")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlCopyFrom"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Click submit button in copy setup")
	public void click_submit_button_in_copy_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnCopySave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnCopySave"));
		ele.click();
	}

	@And("Click edit button in user setup")
	public void click_edit_button_in_copy_setup() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvUser_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvUser_imbView_0"));
		ele.click();
	}

	@And("Select hide radio button in screen rights")
	public void select_hide_radio_button_in_screen_rights() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvScreen")));
		Thread.sleep(2000);
		By HideRadioButtonLocator = By.xpath("//input[@type='radio' and @value='OF']"); // Replace with a suitable
		// locator
		List<WebElement> HideRadioButtons = driver.findElements(HideRadioButtonLocator);
		// Click each "show" radio button
		for (WebElement radioButton : HideRadioButtons) {
			if (!radioButton.isSelected()) {
				radioButton.click();
			}
		}
	}

	@Then("Select show radio button in screen rights")
	public void select_show_radio_button_in_screen_rights() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvScreen")));
		Thread.sleep(2000);
		By HideRadioButtonLocator = By.xpath("//input[@type='radio' and @value='ON']"); // Replace with a suitable
		// locator
		List<WebElement> HideRadioButtons = driver.findElements(HideRadioButtonLocator);
		// Click each "show" radio button
		for (WebElement radioButton : HideRadioButtons) {
			if (!radioButton.isSelected()) {
				radioButton.click();
			}
		}
	}

	@Then("Select view rights radio button in screen rights")
	public void select_view_rights_radio_button_in_screen_rights() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvScreen")));
		Thread.sleep(2000);
		By HideRadioButtonLocator = By.xpath("//input[@type='radio' and @value='VR']"); // Replace with a suitable
		// locator
		List<WebElement> HideRadioButtons = driver.findElements(HideRadioButtonLocator);
		// Click each "show" radio button
		for (WebElement radioButton : HideRadioButtons) {
			if (!radioButton.isSelected()) {
				radioButton.click();
			}
		}
	}

	@Then("Select all right radio button in screen rights")
	public void select_all_right_radio_button_in_screen_rights() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvScreen")));
		Thread.sleep(2000);
		By HideRadioButtonLocator = By.xpath("//input[@type='radio' and @value='AR']"); // Replace with a suitable
		// locator
		List<WebElement> HideRadioButtons = driver.findElements(HideRadioButtonLocator);
		// Click each "show" radio button
		for (WebElement radioButton : HideRadioButtons) {
			if (!radioButton.isSelected()) {
				radioButton.click();
			}
		}
	}

	@And("Click submit button in screen rights")
	public void Click_submit_button_in_screen_rights() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSaveScreen")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSaveScreen"));
		ele.click();
	}

	@Then("Click quote rights tab in user setup")
	public void click_quote_rights_tab_in_user_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ancQuoteRights")));
		ele = driver.findElement(By.id("cpWheelsUp_ancQuoteRights"));
		ele.click();
	}

	@And("Click copy quote in quote rights")
	public void click_copy_quote_in_quote_rights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnCopyQte")));
		ele = driver.findElement(By.id("cpWheelsUp_btnCopyQte"));
		ele.click();
	}

	@Then("Select valid rights in copy quote rights")
	public void select_valid_rights_in_copy_quote_rights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlqteRightsCopyFrom")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlqteRightsCopyFrom"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Click submit button in copy quote rights")
	public void click_submit_button_in_copy_quote_rights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnCopyR")));
		ele = driver.findElement(By.id("cpWheelsUp_btnCopyR"));
		ele.click();
	}

	@And("Select no radio button in quote rights")
	public void select_no_radio_button_in_quote_rights() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 0)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rdFHNo")));
		Thread.sleep(2000);
		By HideRadioButtonLocator = By.xpath("//input[@type='radio' and @text='No']"); // Replace with a suitable
		// locator
		List<WebElement> HideRadioButtons = driver.findElements(HideRadioButtonLocator);
		// Click each "show" radio button
		for (WebElement radioButton : HideRadioButtons) {
			if (!radioButton.isSelected()) {
				radioButton.click();
			}
		}
	}

	@And("Click submit button in quote rights")
	public void click_submit_button_in_quote_rights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnUpdateQte")));
		ele = driver.findElement(By.id("cpWheelsUp_btnUpdateQte"));
		ele.click();
	}

	@Then("Click the account in masters")
	public void click_the_account_in_masters() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"Li2\"]/a/span"));
		ele1.click();
	}

	@And("Select valid status in account")
	public void select_valid_status_in_account() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlQuoteFlag")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlQuoteFlag"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Select valid account type in account")
	public void select_valid_accoun_type_in_account() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlFChannel")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFChannel"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Enter account name in search box in account")
	public void enter_account_name_in_search_box_in_account() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSearchCustomer")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSearchCustomer"));
		ele.sendKeys("Test 123");
	}

	@Then("Click search button in account")
	public void click_search_button_in_account() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}

	@And("Click add new button in account")
	public void click_add_new_button_in_account() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@Then("Click back button in account")
	public void click_back_button_in_account() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}

	@Then("Click save button in account")
	public void click_save_button_in_account() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Enter valid account name in account details")
	public void enter_valid_account_name_in_account_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtCustomer")));
		ele = driver.findElement(By.id("cpWheelsUp_txtCustomer"));
		ele.sendKeys("Test");
	}

	@And("Select valid account type in account details")
	public void select_valid_account_type_in_account_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlAccType")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlAccType"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
	}

	@And("Click close button in account details")
	public void click_close_button_in_account_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele = driver.findElement(By.id("btnClose"));
		ele.click();
	}

	@And("Click clear button in account details")
	public void click_clear_button_in_account_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}

	@Then("Click add contact button in contact details")
	public void click_add_contact_button_in_contact_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddCont")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddCont"));
		ele.click();
	}

	@And("Click close button in contact details")
	public void click_close_button_in_contact_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCloseGroup")));
		ele = driver.findElement(By.id("btnCloseGroup"));
		ele.click();
	}

	@And("Click save button in contact details")
	public void click_save_button_in_contact_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSavePopDetails")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSavePopDetails"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@And("Enter valid details in contact details")
	public void enter_valid_details_in_contact_details() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtPConName")));
		// Enter contact name
		ele = driver.findElement(By.id("cpWheelsUp_txtPConName"));
		ele.sendKeys("Test");
		Thread.sleep(2000);
		// Country
		ele1 = driver.findElement(By.id("cpWheelsUp_ddlPCountry"));
		Select sel = new Select(ele1);
		sel.selectByValue("1");
		Thread.sleep(2000);
		// State
		ele2 = driver.findElement(By.id("cpWheelsUp_ddlPCountry"));
		Select sel1 = new Select(ele2);
		sel1.selectByValue("1");
		Thread.sleep(2000);
		// Email
		ele3 = driver.findElement(By.id("cpWheelsUp_txtPConName"));
		ele3.sendKeys("0211thiru@gmail.com");
	}

	@And("Click clear button in contact details")
	public void click_clear_button_in_contact_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnPClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnPClear"));
		ele.click();
	}

	@And("Click edit button in account")
	public void click_edit_button_in_account() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvReq_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvReq_imbView_0"));
		ele.click();
	}

	@Then("Modify details in account details")
	public void modify_details_in_account_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtCustomer")));
		ele = driver.findElement(By.id("cpWheelsUp_txtCustomer"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtCustomer"));
		ele1.sendKeys(text);
	}

	@Then("Click contact details tab in account")
	public void click_contact_details_tab_in_account() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ancContDet")));
		ele = driver.findElement(By.id("cpWheelsUp_ancContDet"));
		ele.click();
	}

	@Then("Modify details in contact details")
	public void modify_details_in_contact_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddCont")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddCont"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCloseGroup")));
		ele1 = driver.findElement(By.id("btnCloseGroup"));
		ele1.click();
	}

	@Then("Click the account type in masters")
	public void click_the_account_type_in_masters() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		Thread.sleep(2000);
		ele1 = driver.findElement(By.xpath("//*[@id=\"CUS\"]/a/span"));
		ele1.click();
	}

	@And("Select valid status in account type")
	public void select_valid_status_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlQuoteFlag")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlQuoteFlag"));
		Select sel = new Select(ele);
		sel.selectByIndex(0);
	}

	@Then("Enter valid name in account type")
	public void enter_valid_name_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSearchCustomer")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSearchCustomer"));
		ele.sendKeys("JE Managed Tail");
	}

	@And("Click search button in account type")
	public void click_search_button_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSearch")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSearch"));
		ele.click();
	}

	@And("Click add new button in account type")
	public void click_add_new_button_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@Then("Click back button in account type")
	public void click_back_button_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}

	@Then("Click save button in account type")
	public void click_save_button_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Enter valid account type in account type")
	public void enter_valid_account_type_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtCustomer")));
		ele = driver.findElement(By.id("cpWheelsUp_txtCustomer"));
		ele.sendKeys("Test");
	}

	@And("Uncheck the checkbox in account type")
	public void uncheck_the_checkbox_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_cbActiveAgent")));
		ele = driver.findElement(By.id("cpWheelsUp_cbActiveAgent"));
		ele.click();
	}

	@Then("Click clear button in account type")
	public void click_clear_button_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ancContDet")));
		ele = driver.findElement(By.id("cpWheelsUp_ancContDet"));
		ele.click();
	}

	@Then("Click contact details tab in account type")
	public void click_contact_details_tab_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ancContDet")));
		ele = driver.findElement(By.id("cpWheelsUp_ancContDet"));
		ele.click();
	}

	@And("Click edit button in account type")
	public void click_edit_button_in_account_type() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvReq_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvReq_imbView_0"));
		ele.click();
	}

	@Then("Click add contact button in account type")
	public void click_add_contact_button_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddCont")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddCont"));
		ele.click();
	}

	@And("Click close button in account type")
	public void click_close_button_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCloseGroup")));
		ele = driver.findElement(By.id("btnCloseGroup"));
		ele.click();
	}

	@And("Click save button in address details")
	public void click_save_button_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSavePopDetails")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSavePopDetails"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@And("Enter valid contact name in address details")
	public void enter_valid_contact_name_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtPConName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtPConName"));
		ele.sendKeys("Test");
	}

	@Then("Select valid country name in address details")
	public void select_valid_country_name_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlPCountry")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlPCountry"));
		Select sel = new Select(ele);
		sel.selectByValue("1");
	}

	@And("Select valid state name in address details")
	public void select_valid_state_name_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlPState")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlPState"));
		Select sel = new Select(ele);
		sel.selectByValue("1");
	}

	@Then("Enter valid emaild in address details")
	public void enter_valid_emaild_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtPEmail")));
		ele = driver.findElement(By.id("cpWheelsUp_txtPEmail"));
		ele.sendKeys("0211thiru@gmail.com");
	}

	@And("Click clear button in address details")
	public void click_clear_button_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnPClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnPClear"));
		ele.click();
	}

	@Then("Click Tax Setup tab in account type")
	public void click_tax_setup_tab_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ancTax")));
		ele = driver.findElement(By.id("cpWheelsUp_ancTax"));
		ele.click();
	}

	@And("Click valid radio button in FET Applicable")
	public void click_valid_radio_button_in_fet_applicable() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblExcempt_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rblExcempt_0"));
		ele.click();
	}

	@Then("Click valid radio button in Segment Fee")
	public void click_valid_radio_button_in_segment_fee() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblSegFee_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rblSegFee_0"));
		ele.click();
	}

	@And("Attach valid file in tax setup")
	public void attach_valid_file_in_tax_setup() throws InterruptedException, AWTException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
				"/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/div[3]/div/div/div/div[2]/div/div[4]/div/div[4]/div[2]/input")));
		Thread.sleep(2000);
		ele = driver.findElement(By.xpath(
				"/html/body/form/div[5]/div/div[2]/div[2]/div/div/div/div/div[3]/div/div/div/div[2]/div/div[4]/div/div[4]/div[2]/input"));
		ele.click();
		// Upload the file
		Thread.sleep(2000);
		String FilePath = "C:\\Users\\thirumaran\\eclipse-workspace\\JetEdgeQuotePortal\\Files\\Blank.xlsx";
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

	@Then("click save button in tax setup")
	public void click_save_button_in_tax_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnTUpdate")));
		ele = driver.findElement(By.id("cpWheelsUp_btnTUpdate"));
		ele.click();
	}

	@And("Click no radio button in FET Applicable")
	public void click_no_radio_button_in_fet_applicable() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblExcempt_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rblExcempt_0"));
		ele.click();
	}

	@Then("Click no radio button in Segment Fee")
	public void click_no_radio_button_in_segment_fee() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblSegFee_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rblSegFee_0"));
		ele.click();
	}

	@And("Click delete button in tax setup")
	public void click_delete_button_in_tax_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_imgDelAttach1")));
		ele = driver.findElement(By.id("cpWheelsUp_imgDelAttach1"));
		ele.click();
	}

	@Then("Click close button in tax setup")
	public void click_close_button_in_tax_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele = driver.findElement(By.id("btnClose"));
		ele.click();
	}

	@And("Click yes radio button in FET Applicable")
	public void click_yes_radio_button_in_fet_applicable() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblExcempt_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblExcempt_1"));
		ele.click();
	}

	@Then("Click yes radio button in Segment Fee")
	public void click_yes_radio_button_in_segment_fee() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblSegFee_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblSegFee_1"));
		ele.click();
	}

	@Then("Click Quote Rights tab in account type")
	public void click_quote_rights_tab_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ancQteRights")));
		ele = driver.findElement(By.id("cpWheelsUp_ancQteRights"));
		ele.click();
	}

	@And("Click Yes radio button in integration")
	public void click_yes_radio_button_in_integration() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblZenDeskIn_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblZenDeskIn_1"));
		ele.click();
	}

	@Then("Click Yes radio button in DocuSign")
	public void click_yes_radio_button_in_docu_sign() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblDocuSign_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblDocuSign_1"));
		ele.click();
	}

	@And("Click No radio button in integration")
	public void click_no_radio_button_in_integration() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblZenDeskIn_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rblZenDeskIn_0"));
		ele.click();
	}

	@Then("Click No radio button in DocuSign")
	public void click_no_radio_button_in_docu_sign() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblDocuSign_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rblDocuSign_0"));
		ele.click();
	}

	@And("Click update button in quote rights")
	public void click_update_button_in_quote_rights() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnQteRightsUpdatedBY")));
		ele = driver.findElement(By.id("cpWheelsUp_btnQteRightsUpdatedBY"));
		ele.click();
	}

	@Then("Click Tail Setup tab in account type")
	public void click_tail_setup_tab_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_anRatioReq")));
		ele = driver.findElement(By.id("cpWheelsUp_anRatioReq"));
		ele.click();
	}

	@And("Click Yes radio button in Tail Setup")
	public void click_yes_radio_button_in_tail_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rdlRatio_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rdlRatio_1"));
		ele.click();
	}

	@Then("Click No radio button in Tail Setup")
	public void click_No_radio_button_in_tail_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rdlRatio_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rdlRatio_0"));
		ele.click();
	}

	@Then("Select valid tail in Tail Setup in account type")
	public void select_valid_tail_in_tail_setup_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cpWheelsUp_ddltail")));
		ele = driver.findElement(By.id("cpWheelsUp_ddltail"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Click update button in Tail Setup in account type")
	public void click_update_button_in_tail_setup_in_account_type() throws InterruptedException {
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnRequestorSave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnRequestorSave"));
		ele.click();
	}

	@Then("Click close button in Tail Setup in account type")
	public void click_close_button_in_tail_setup_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele = driver.findElement(By.id("btnClose"));
		ele.click();
	}

	@Then("Modify details in account type")
	public void modify_details_in_account_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtCustomer")));
		ele = driver.findElement(By.id("cpWheelsUp_txtCustomer"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtCustomer"));
		ele1.sendKeys(text);
	}

	@Then("Click the Flying Hour Setup in masters")
	public void click_the_flying_hour_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FHS\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"FHS\"]/a/span"));
		ele1.click();

	}

	@And("Click great circle mapper tab in Flying Hour Setup")
	public void click_great_circle_mapper_tab_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_GC")));
		ele = driver.findElement(By.id("cpWheelsUp_GC"));
		ele.click();
	}

	@Then("Click add new button in Flying Hour Setup")
	public void click_add_new_button_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnFleetAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnFleetAddNew"));
		ele.click();
	}

	@And("Click close button in setup by fleet")
	public void click_close_button_in_setup_by_fleet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("imgDenialsClose")));
		ele = driver.findElement(By.id("imgDenialsClose"));
		ele.click();
	}

	@And("Click save button in setup by fleet")
	public void click_save_button_in_setup_by_fleet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnCopySave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnCopySave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@And("Choose valid fleet in setup by fleet")
	public void choose_valid_fleet_in_setup_by_fleet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cpWheelsUp_ddlFleet")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlFleet"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Enter minimum speed in setup by fleet")
	public void enter_minimum_speed_in_setup_by_fleet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtMinSpeed")));
		ele = driver.findElement(By.id("cpWheelsUp_txtMinSpeed"));
		ele.sendKeys("2");
	}

	@And("Enter average speed in setup by fleet")
	public void enter_average_speed_in_setup_by_fleet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtAvgSpeed")));
		ele = driver.findElement(By.id("cpWheelsUp_txtAvgSpeed"));
		ele.sendKeys("2");
	}

	@Then("Enter maximum speed in setup by fleet")
	public void enter_maximum_speed_in_setup_by_fleet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtMaxSpeed")));
		ele = driver.findElement(By.id("cpWheelsUp_txtMaxSpeed"));
		ele.sendKeys("2");
	}

	@And("Select valid effective from date in setup by fleet")
	public void select_valid_effective_from_date_in_setup_by_fleet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtEffFrom")));
		ele = driver.findElement(By.id("cpWheelsUp_txtEffFrom"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_CalendarExtender1_day_0_0")));
		ele = driver.findElement(By.id("cpWheelsUp_CalendarExtender1_day_0_0"));
		ele.click();

	}

	@Then("Enter valid notes in setup by fleet")
	public void enter_valid_notes_in_setup_by_fleet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele.sendKeys("Test");
	}

	@And("Click Wind Temp Calculation radio button in Flying Hour Setup")
	public void click_wind_temp_calculation_radio_button_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblFlightHours_0")));
		ele = driver.findElement(By.id("cpWheelsUp_rblFlightHours_0"));
		ele.click();
	}

	@Then("Click Great Circle Mapper API radio button in Flying Hour Setup")
	public void click_great_circle_mapper_api_radio_button_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblFlightHours_2")));
		ele = driver.findElement(By.id("cpWheelsUp_rblFlightHours_2"));
		ele.click();
	}

	@And("Click Great Circle Formula radio button in Flying Hour Setup")
	public void click_great_circle_formula_radio_button_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblFlightHours_3")));
		ele = driver.findElement(By.id("cpWheelsUp_rblFlightHours_3"));
		ele.click();
	}

	@Then("Enter valid notes in Flying Hour Setup")
	public void enter_valid_notes_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFNotes"));
		ele.sendKeys("Test");
	}

	@And("Click update button in Flying Hour Setup")
	public void click_update_button_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnFHSave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnFHSave"));
		ele.click();
	}

	@Then("Click Fore Flight API radio button in Flying Hour Setup")
	public void click_fore_flight_api_radio_button_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblFlightHours_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblFlightHours_1"));
		ele.click();
	}

	@And("Clear the notes in in Flying Hour Setup")
	public void clear_the_notes_in_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtFNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtFNotes"));
		ele.clear();
	}

	@And("Click close button in Flying Hour Setup")
	public void click_close_button_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnClose")));
		ele = driver.findElement(By.id("btnClose"));
		ele.click();
	}

	@Then("Click edit button in Flying Hour Setup")
	public void click_edit_button_in_flying_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvFleetWise_imbView_1")));
		ele = driver.findElement(By.id("cpWheelsUp_gvFleetWise_imbView_1"));
		ele.click();
	}

	@And("Modify valid details in Setup by fleet")
	public void modify_valid_details_in_setup_by_fleet() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtMinSpeed")));
		ele = driver.findElement(By.id("cpWheelsUp_txtMinSpeed"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtMinSpeed"));
		ele1.sendKeys(text);
	}

	@And("Click delete button in fore flight API")
	public void click_delete_button_in_fore_flight_api() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvForeFlight_imbDelete_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvForeFlight_imbDelete_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		// ele.click();
		// alert.accept();
	}

	@Then("Click the Fleet group Setup in masters")
	public void click_the_fleet_group_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"FGM\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"FGM\"]/a/span"));
		ele1.click();
	}

	@And("Click add new button in Fleet group")
	public void click_add_new_button_in_fleet_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@Then("Click back button in Fleet group")
	public void click_back_button_in_fleet_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}

	@Then("Click save button in Fleet group")
	public void click_save_button_in_fleet_group() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Enter valid group code in group details")
	public void enter_valid_group_code_in_group_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupCode")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupCode"));
		ele.sendKeys("TEST");
	}

	@And("Enter valid Seat Capacity in group details")
	public void enter_valid_seat_capacity_in_group_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSeatCapacity")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSeatCapacity"));
		ele.sendKeys("16");
	}

	@Then("Enter valid Default Seat Count in group details")
	public void enter_valid_default_seat_count_in_group_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDefaultCount")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDefaultCount"));
		ele.sendKeys("12");
	}

	@And("Enter valid group Name in group details")
	public void enter_valid_group_name_in_group_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupName"));
		ele.sendKeys("TEST");
	}

	@Then("Enter valid Display Sequence in group details")
	public void enter_valid_display_sequence_in_group_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDisSeq")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDisSeq"));
		ele.sendKeys("2");
	}

	@And("Click no radio button in group details")
	public void click_no_radio_button_in_group_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblActive_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblActive_1"));
		ele.click();
	}

	@Then("Enter valid Display Name in PDF Setup")
	public void enter_valid_display_name_in_pdf_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDisplayName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDisplayName"));
		ele.sendKeys("Test Aircraft");
	}

	@And("Enter valid Operator Name in PDF Setup")
	public void enter_valid_operator_name_in_pdf_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtOperatorName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtOperatorName"));
		ele.sendKeys("Tester");
	}

	@Then("Enter valid Product Term in PDF Setup")
	public void enter_valid_product_term_in_pdf_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtProductTerm")));
		ele = driver.findElement(By.id("cpWheelsUp_txtProductTerm"));
		ele.sendKeys("Test Flight");
	}

	@And("Click clear button in Fleet group")
	public void click_clear_button_in_fleet_group() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,0)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}

	@Then("Click valid checkbox in fleet details")
	public void click_valid_checkbox_in_fleet_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvFleet_chkChoose_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvFleet_chkChoose_0"));
		ele.click();
	}

	@And("Select valid aircraft in Flying Hour Setup")
	public void select_valid_aircraft_in_flying_hour_setup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.crollHeight)");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlAircraft")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlAircraft"));
		Select sel = new Select(ele);
		sel.selectByIndex(1);
	}

	@And("Click edit button in Fleet group")
	public void click_edit_button_in_fleet_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvCostSetup_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvCostSetup_imbView_0"));
		ele.click();
	}

	@Then("Modify valid details in Fleet group")
	public void modify_valid_details_in_fleet_group() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtGroupCode")));
		ele = driver.findElement(By.id("cpWheelsUp_txtGroupCode"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtGroupCode"));
		ele.sendKeys(text);
	}

	@Then("Click the Airport Setup in masters")
	public void click_the_airport_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"AIR\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"AIR\"]/a/span"));
		ele1.click();
	}

	@And("Click add button in Airport Setup")
	public void click_add_button_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@Then("Click save button in Airport Setup")
	public void click_save_button_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Click add button in access tab")
	public void click_add_button_in_access_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ImageButton3")));
		ele = driver.findElement(By.id("cpWheelsUp_ImageButton3"));
		ele.click();
	}

	@And("Click save button in access tab")
	public void click_save_button_in_access_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSaveAccess")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSaveAccess"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Enter valid details in access tab")
	public void enter_valid_details_in_access_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtAccessName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtAccessName"));
		ele.sendKeys("Test");
	}

	@And("Select valid access name in access tab")
	public void select_valid_access_name_in_access_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlAccess")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlAccess"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
	}

	@Then("Click edit button in access tab")
	public void click_edit_button_in_access_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ImageButton4")));
		ele = driver.findElement(By.id("cpWheelsUp_ImageButton4"));
		ele.click();
	}

	@And("modify valid details in access tab")
	public void modify_valid_details_in_access_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtAccessName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtAccessName"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtAccessName"));
		ele1.sendKeys(text);
	}

	@Then("Enter valid details in ICAO in airport details")
	public void enter_valid_details_in_icao_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtStartICAO")));
		ele = driver.findElement(By.id("cpWheelsUp_txtStartICAO"));
		ele.sendKeys("TEST");
	}

	@Then("Enter valid details in IATA in airport details")
	public void enter_valid_details_in_iata_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtIATA")));
		ele = driver.findElement(By.id("cpWheelsUp_txtIATA"));
		ele.sendKeys("TES");
	}

	@Then("Select valid country name in airport details")
	public void select_valid_country_name_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlCountry")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlCountry"));
		Select sel = new Select(ele);
		sel.selectByValue("1");
	}

	@Then("Select valid State name in airport details")
	public void select_valid_state_name_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlStateNew")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlStateNew"));
		Select sel = new Select(ele);
		sel.selectByIndex(2);
	}

	@Then("Enter valid details in Airport Name in airport details")
	public void enter_valid_details_in_airport_name_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtAirportName")));
		ele = driver.findElement(By.id("cpWheelsUp_txtAirportName"));
		ele.sendKeys("Test Airport");
	}

	@Then("Enter valid details in Standard TimeZone in airport details")
	public void enter_valid_details_in_standard_time_zone_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtStndTimeZone")));
		ele = driver.findElement(By.id("cpWheelsUp_txtStndTimeZone"));
		ele.sendKeys("Pacific Standard Time");
	}

	@Then("Enter valid details in TimeZone in airport details")
	public void enter_valid_details_in_time_zone_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtTimeZone")));
		ele = driver.findElement(By.id("cpWheelsUp_txtTimeZone"));
		ele.sendKeys("-5");
	}

	@Then("Enter valid details in Lattitude in airport details")
	public void enter_valid_details_in_lattitude_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtLattitude")));
		ele = driver.findElement(By.id("cpWheelsUp_txtLattitude"));
		ele.sendKeys("12.975971");
	}

	@Then("Enter valid details in Longitude in airport details")
	public void enter_valid_details_in_longitude_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtLattitude")));
		ele = driver.findElement(By.id("cpWheelsUp_txtLattitude"));
		ele.sendKeys("80.2212092");
	}

	@Then("Enter valid details in Area Id in airport details")
	public void enter_valid_details_in_area_id_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtAreaId")));
		ele = driver.findElement(By.id("cpWheelsUp_txtAreaId"));
		ele.sendKeys("TEST");
	}

	@Then("Enter valid details in Alternate in airport details")
	public void enter_valid_details_in_alternate_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtAlternate1")));
		ele = driver.findElement(By.id("cpWheelsUp_txtAlternate1"));
		ele.sendKeys("TEST");
	}

	@Then("Enter valid details in Operation Hours in airport details")
	public void enter_valid_details_in_operation_hours_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtOperationHours")));
		ele = driver.findElement(By.id("cpWheelsUp_txtOperationHours"));
		ele.sendKeys("TEST");
	}

	@Then("Enter valid details in Sunrise Shift in airport details")
	public void enter_valid_details_in_sunrise_shift_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSunRiseShift")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSunRiseShift"));
		ele.sendKeys("2");
	}

	@Then("Enter valid details in Sunset Shift in airport details")
	public void enter_valid_details_in_sunset_shift_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSunSetShift")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSunSetShift"));
		ele.sendKeys("2");
	}

	@Then("Enter valid details in Custom Days in airport details")
	public void enter_valid_details_in_custom_days_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtCuatomDays")));
		ele = driver.findElement(By.id("cpWheelsUp_txtCuatomDays"));
		ele.sendKeys("234");
	}

	@Then("Enter valid details in Crew Member Rest Cost in airport details")
	public void enter_valid_details_in_crew_member_rest_cost_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtCrewMemRestCost")));
		ele = driver.findElement(By.id("cpWheelsUp_txtCrewMemRestCost"));
		ele.sendKeys("234");
	}

	@Then("Click no radio button in airport details")
	public void click_no_radio_button_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblIsBoldIQ_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblIsBoldIQ_1"));
		ele.click();
	}

	@And("Choose valid airport in Airport Setup")
	public void choose_valid_airport_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtStartAirport")));
		ele = driver.findElement(By.id("cpWheelsUp_txtStartAirport"));
		ele.sendKeys("AGGH");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"cpWheelsUp_divFilter\"]/label")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"cpWheelsUp_divFilter\"]/label"));
		ele1.click();
	}

	@Then("Click edit button in Airport Setup")
	public void click_edit_button_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAirportSetup_imbView_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAirportSetup_imbView_0"));
		ele.click();
	}

	@And("Click hub setup tab in airport setup")
	public void click_hub_setup_tab_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_HS")));
		ele = driver.findElement(By.id("cpWheelsUp_HS"));
		ele.click();
	}

	@Then("Click add tail button in Airport Setup")
	public void click_add_tail_button_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAdd")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAdd"));
		ele.click();
	}

	@And("Click close button in tail setup in Airport Setup")
	public void click_close_button_in_tail_setup_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnCloeFore")));
		ele = driver.findElement(By.id("btnCloeFore"));
		ele.click();
	}

	@And("Select valid checkbox in tail setup in Airport Setup")
	public void select_valid_checkbox_in_tail_setup_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAircraft_chkStatus_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAircraft_chkStatus_0"));
		ele.click();
	}

	@Then("Click save button in tail setup in Airport Setup")
	public void click_save_button_in_tail_setup_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSaveFleet")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSaveFleet"));
		ele.click();
	}

	@And("Click aircraft type radio button in tail setup")
	public void click_aircraft_type_radio_button_in_tail_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblSetupBy_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblSetupBy_1"));
		ele.click();
	}

	@And("Select valid checkbox in aircraft type")
	public void select_valid_checkbox_in_aircraft_type() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvAircraft_chkStatus_1")));
		ele = driver.findElement(By.id("cpWheelsUp_gvAircraft_chkStatus_1"));
		ele.click();
	}

	@Then("Click delete button in tail setup in Airport Setup")
	public void click_delete_button_in_tail_setup_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvFleetMapping_imbDel_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvFleetMapping_imbDel_0"));
		ele.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		ele.click();
		alert.accept();
	}

	@Then("Enter valid airport1 in airport setup")
	public void enter_valid_airport1_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNearestAirport1")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNearestAirport1"));
		ele.sendKeys("Test");
	}

	@And("Enter valid airport2 in airport setup")
	public void enter_valid_airport2_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNearestAirport2")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNearestAirport2"));
		ele.sendKeys("Test");
	}

	@Then("Enter valid airport3 in airport setup")
	public void enter_valid_airport3_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNearestAirport3")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNearestAirport3"));
		ele.sendKeys("Test");
	}

	@And("Enter valid airport4 in airport setup")
	public void enter_valid_airport4_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNearestAirport4")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNearestAirport4"));
		ele.sendKeys("Test");
	}

	@Then("Click save button in tail setup")
	public void click_save_button_in_tail_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnHubUpdate")));
		ele = driver.findElement(By.id("cpWheelsUp_btnHubUpdate"));
		ele.click();
	}

	@And("Click runway details tab in airport setup")
	public void click_runway_details_tab_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_RD")));
		ele = driver.findElement(By.id("cpWheelsUp_RD"));
		ele.click();
	}

	@Then("Enter valid length in runway details")
	public void enter_valid_length_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtLength")));
		ele = driver.findElement(By.id("cpWheelsUp_txtLength"));
		ele.sendKeys("1234");
	}

	@And("Enter valid Threshold in runway details")
	public void enter_valid_threshold_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtThershold")));
		ele = driver.findElement(By.id("cpWheelsUp_txtThershold"));
		ele.sendKeys("1");
	}

	@Then("Enter valid Width in runway details")
	public void enter_valid_width_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtWidth")));
		ele = driver.findElement(By.id("cpWheelsUp_txtWidth"));
		ele.sendKeys("123");
	}

	@And("Enter valid Elevation in runway details")
	public void enter_valid_elevation_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtElevation")));
		ele = driver.findElement(By.id("cpWheelsUp_txtElevation"));
		ele.sendKeys("13");
	}

	@Then("Enter valid ACN in runway details")
	public void enter_valid_acn_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtACNPN")));
		ele = driver.findElement(By.id("cpWheelsUp_txtACNPN"));
		ele.sendKeys("13AC");
	}

	@And("Enter valid Single Wheel in runway details")
	public void enter_valid_single_wheel_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSingWheel")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSingWheel"));
		ele.sendKeys("13");
	}

	@Then("Enter valid Dual Wheel in runway details")
	public void enter_valid_dual_wheel_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDualWheel")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDualWheel"));
		ele.sendKeys("13");
	}

	@And("Enter valid Dual Tandem in runway details")
	public void enter_valid_dual_tandem_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDualTandem")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDualTandem"));
		ele.sendKeys("13");
	}

	@Then("Enter valid Double Dual in runway details")
	public void enter_valid_double_dual_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDblDual")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDblDual"));
		ele.sendKeys("13");
	}

	@And("Enter valid Max Lnd Weight in runway details")
	public void enter_valid_max_lnd_weight_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtMaxLndWeight")));
		ele = driver.findElement(By.id("cpWheelsUp_txtMaxLndWeight"));
		ele.sendKeys("13");
	}

	@Then("Enter valid Single Axle Limit in runway details")
	public void enter_valid_single_axle_limit_in_runway_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSingleAxleLimit")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSingleAxleLimit"));
		ele.sendKeys("13");
	}

	@And("Click address details tab in Airport Setup")
	public void click_address_details_tab_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ADDET")));
		ele = driver.findElement(By.id("cpWheelsUp_ADDET"));
		ele.click();
	}

	@Then("Enter valid airport owner name in address details")
	public void enter_valid_airport_owner_name_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtAirportOwn")));
		ele = driver.findElement(By.id("cpWheelsUp_txtAirportOwn"));
		ele.sendKeys("Test");
	}

	@And("Enter valid City in address details")
	public void enter_valid_city_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtStartCity")));
		ele = driver.findElement(By.id("cpWheelsUp_txtStartCity"));
		ele.sendKeys("Test");
	}

	@Then("Enter valid Address1 in address details")
	public void enter_valid_address1_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtAddress1")));
		ele = driver.findElement(By.id("cpWheelsUp_txtAddress1"));
		ele.sendKeys("Test");
	}

	@And("Enter valid Address2 in address details")
	public void enter_valid_address2_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtAddress2")));
		ele = driver.findElement(By.id("cpWheelsUp_txtAddress2"));
		ele.sendKeys("Test");
	}

	@Then("Enter valid Website in address details")
	public void enter_valid_website_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtWebSite")));
		ele = driver.findElement(By.id("cpWheelsUp_txtWebSite"));
		ele.sendKeys("Test");
	}

	@And("Enter valid Email in address details")
	public void enter_valid_email_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtEmail")));
		ele = driver.findElement(By.id("cpWheelsUp_txtEmail"));
		ele.sendKeys("Test");
	}

	@Then("Enter valid Phone in address details")
	public void enter_valid_phone_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtPhone")));
		ele = driver.findElement(By.id("cpWheelsUp_txtPhone"));
		ele.sendKeys("Test");
	}

	@And("Click update button in address details")
	public void click_update_button_in_address_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAllAirAdd")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAllAirAdd"));
		ele.click();
	}

	@And("Click allowed aircraft tab in Airport Setup")
	public void click_allowed_aircraft_tab_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ALAIR")));
		ele = driver.findElement(By.id("cpWheelsUp_ALAIR"));
		ele.click();
	}
	@Then("Select valid Aircraft Type Name in allowed aircraft")
	public void select_valid_aircraft_type_name_in_allowed_aircraft() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlAirTypeName")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlAirTypeName"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}
	@And("Enter valid turn time in allowed aircraft")
	public void enter_valid_turn_time_in_allowed_aircraft() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtTurnTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtTurnTime"));
		ele.sendKeys("12");
	}
	@Then("Click save button in allowed aircraft")
	public void click_save_button_in_allowed_aircraft() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSaveAllAirType")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSaveAllAirType"));
		ele.click();
	}

	@And("Click airport closure hours tab in Airport Setup")
	public void click_airport_closure_hours_tab_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ACLH")));
		ele = driver.findElement(By.id("cpWheelsUp_ACLH"));
		ele.click();
	}

	@Then("Click add new button in airport setup")
	public void click_add_new_button_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddCloHours")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddCloHours"));
		ele.click();
	}

	@And("Click back button in airport setup")
	public void click_back_button_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnCloseCl")));
		ele = driver.findElement(By.id("cpWheelsUp_btnCloseCl"));
		ele.click();
	}

	@And("Click save button in Airport Closure Hours")
	public void click_save_button_in_Airport_Closure_Hours() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSaveClos")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSaveClos"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@And("Enter valid start time in Arrivals Closed")
	public void enter_valid_start_time_in_arrivals_closed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtArrStartTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtArrStartTime"));
		ele.sendKeys("12");
	}
	@Then("Enter valid end time in Arrivals Closed")
	public void enter_valid_end_time_in_arrivals_closed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtArrEndTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtArrEndTime"));
		ele.sendKeys("12");
	}
	@And("Enter valid start time in Departures Closed")
	public void enter_valid_start_time_in_departures_closed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDepStartTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDepStartTime"));
		ele.sendKeys("12");
	}
	@And("Enter valid start time in Customs Closed")
	public void enter_valid_start_time_in_customs_closed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtCStartTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtCStartTime"));
		ele.sendKeys("12");
	}

	@Then("Enter valid end time in Departures Closed")
	public void enter_valid_end_time_in_departures_closed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDepEndTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDepEndTime"));
		ele.sendKeys("12");
	}
	@Then("Enter valid end time in Customs Closed")
	public void enter_valid_end_time_in_customs_closed() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtCEndTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtCEndTime"));
		ele.sendKeys("12");
	}

	@And("Click Airport Suspended Hours tab in Airport Setup")
	public void click_airport_suspended_hours_tab_in_airport_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ASUSH")));
		ele = driver.findElement(By.id("cpWheelsUp_ASUSH"));
		ele.click();
	}
	@Then("Click save button in Airport Suspended Hours")
	public void click_save_button_in_airport_suspended_hours() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSusSave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSusSave"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@Then("Enter valid start time in Airport Suspended Hours")
	public void enter_valid_start_time_in_airport_suspended_hours() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSusStartTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSusStartTime"));
		ele.sendKeys("10");
	}
	@And("Enter valid end time in Airport Suspended Hours")
	public void enter_valid_end_time_in_airport_suspended_hours() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtSusEndTime")));
		ele = driver.findElement(By.id("cpWheelsUp_txtSusEndTime"));
		ele.sendKeys("14");
	}

	@And("modify details in airport details")
	public void modify_details_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtStartICAO")));
		ele = driver.findElement(By.id("cpWheelsUp_txtStartICAO"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtStartICAO"));
		ele1.sendKeys(text);
	}
	@Then("Click save button in airport details")
	public void click_save_button_in_airport_details() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
	}

	@Then("Click the tail Setup in masters")
	public void click_the_tail_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TAST\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"TAST\"]/a/span"));
		ele1.click();
	}

	@And("Select unassigned option in tail setup")
	public void select_unassigned_option_in_tail_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlassigned")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlassigned"));
		Select sel=new Select(ele);
		sel.selectByIndex(1);
	}

	@Then("Click save button in tail setup in masters")
	public void click_save_button_in_tail_setup_in_masters() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSave")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSave"));
		ele.click();
	}

	@And("Click valid checkbox in tail setup in masters")
	public void click_valid_checkbox_in_tail_setup_in_masters() throws InterruptedException {
		Thread.sleep(6000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvTail_CbActive_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvTail_CbActive_0"));
		ele.click();
	}

	@And("Select assigned option in tail setup")
	public void select_assigned_option_in_tail_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_ddlassigned")));
		ele = driver.findElement(By.id("cpWheelsUp_ddlassigned"));
		Select sel=new Select(ele);
		sel.selectByIndex(0);
	}
	@And("unselect checkbox in tail setup in masters")
	public void unselect_checkbox_in_tail_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_gvTail_CbActive_0")));
		ele = driver.findElement(By.id("cpWheelsUp_gvTail_CbActive_0"));
		ele.click();
	}

	@Then("Click the tax Setup in masters")
	public void click_the_tax_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"TSET\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"TSET\"]/a/span"));
		ele1.click();
	}
	@And("Click 225mile airport button in tax setup")
	public void click_225mile_airport_button_in_tax_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_lnk225Miles")));
		ele = driver.findElement(By.id("cpWheelsUp_lnk225Miles"));
		ele.click();
	}
	@Then("Click go to setup button in tax setup")
	public void click_go_to_setup_button_in_tax_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnTaxSetup")));
		ele = driver.findElement(By.id("cpWheelsUp_btnTaxSetup"));
		ele.click();
	}

	@Then("Click add new button in tax setup")
	public void click_add_new_button_in_tax_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnAddNew")));
		ele = driver.findElement(By.id("cpWheelsUp_btnAddNew"));
		ele.click();
	}

	@And("Click back button in tax setup")
	public void click_back_button_in_tax_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnBack")));
		ele = driver.findElement(By.id("cpWheelsUp_btnBack"));
		ele.click();
	}

	@And("Click save button in tax setup in masters")
	public void click_save_button_in_tax_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
		try {
			Alert alert = driver.switchTo().alert();
			String text = alert.getText();
			System.out.println("Alert message displayed like : " + text);
			alert.accept();
		} catch (NoAlertPresentException e) {
			System.out.println("No alert message is displayed");
		}
	}

	@And("Enter airport code in tax setup in masters")
	public void enter_airport_code_in_tax_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtAirport")));
		ele = driver.findElement(By.id("cpWheelsUp_txtAirport"));
		ele.sendKeys("TEST");
	}
	@Then("Click no radio button in tax setup in masters")
	public void click_no_radio_button_in_tax_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_rblActive_1")));
		ele = driver.findElement(By.id("cpWheelsUp_rblActive_1"));
		ele.click();
	}
	@And("Enter valid notes in tax setup in masters")
	public void enter_valid_notes_in_tax_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtNotes")));
		ele = driver.findElement(By.id("cpWheelsUp_txtNotes"));
		ele.sendKeys("TEST");
	}
	@Then("Click clear button in tax setup in masters")
	public void click_clear_button_in_tax_setup_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnClear")));
		ele = driver.findElement(By.id("cpWheelsUp_btnClear"));
		ele.click();
	}


	@Then("Click edit button in domestic taxes")
	public void click_edit_button_in_domestic_taxes() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnFET")));
		ele = driver.findElement(By.id("cpWheelsUp_btnFET"));
		ele.click();
	}
	@Then("Click go to tax setup in domestic taxes")
	public void click_go_to_tax_setup_in_domestic_taxes() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Go to Tax Setup")));
		ele = driver.findElement(By.linkText("Go to Tax Setup"));
		ele.click();
	}

	@Then("Click edit button in alaska tab")
	public void click_edit_button_in_alaska_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnTax")));
		ele = driver.findElement(By.id("cpWheelsUp_btnTax"));
		ele.click();
	}
	@Then("Click go to tax setup in alaska tab")
	public void click_go_to_tax_setup_in_alaska_tab() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Go to Tax Setup")));
		ele = driver.findElement(By.linkText("Go to Tax Setup"));
		ele.click();
	}
	
	@Then("Click the Global Config in masters")
	public void click_the_global_config_in_masters() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"liMasters\"]/a/span[2]")));
		ele = driver.findElement(By.xpath("//*[@id=\"liMasters\"]/a/span[2]"));
		ele.click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"GLCO\"]/a/span")));
		ele1 = driver.findElement(By.xpath("//*[@id=\"GLCO\"]/a/span"));
		ele1.click();
		
	}
	@And("Modify valid details in block hour setup")
	public void modify_valid_details_in_block_hour_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtDepartMin")));
		ele = driver.findElement(By.id("cpWheelsUp_txtDepartMin"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtDepartMin"));
		ele1.sendKeys(text);
	}
	@Then("Modify valid details in Turn Time Setup")
	public void modify_valid_details_in_turn_time_setup() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_txtPreRepo")));
		ele = driver.findElement(By.id("cpWheelsUp_txtPreRepo"));
		String text = ele.getAttribute("value");
		ele.clear();
		ele1 = driver.findElement(By.id("cpWheelsUp_txtPreRepo"));
		ele1.sendKeys(text);
	}
	@And("Click update button in Global Config")
	public void click_update_button_in_global_config() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(1));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("cpWheelsUp_btnSumbit")));
		ele = driver.findElement(By.id("cpWheelsUp_btnSumbit"));
		ele.click();
	}
}
