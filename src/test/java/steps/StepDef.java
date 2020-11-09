package steps;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import page.SetSkyBlueBackground;
import page.SetWhiteBackground;
import util.BrowserFactory;

public class StepDef {
	
	WebDriver driver;
	LoginPage login;
	SetSkyBlueBackground setskyblue;
	SetWhiteBackground setwhite;



	@Before
	public void BeforeRun() {
		driver = BrowserFactory.launchBrowser();
		login = PageFactory.initElements(driver, LoginPage.class);
		setskyblue = PageFactory.initElements(driver, SetSkyBlueBackground.class);
		setwhite = PageFactory.initElements(driver, SetWhiteBackground.class);
		
}


	@Given ("^User is able to go to the todo list website$")
	public void User_is_able_to_go_to_the_todo_list_website() {
	driver.get("http://techfios.com/test/101/.");
}

	@When ("^User clicks on the set SkyBlue Background button$")
	public void User_clicks_on_the_set_SkyBlue_Background_button() throws InterruptedException {
		setskyblue.clickOnSetSkyBlueBackgroundButton();
		Thread.sleep(4000);
	}
	
	@Then("^The Background Color Should Change to SkyBlue$")
	public void The_Background_Color_Should_Change_to_SkyBlue() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)(driver);
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SourceFile, new File("C:\\Users\\14435\\screenshot5.png"));
		
	}
	
	@When ("^User clicks on the set White Background button$")
	public void User_clicks_on_the_set_White_Background_button() throws InterruptedException {
		setwhite.clickOnSetWhiteBackgroundButton();
		Thread.sleep(4000);

	}
	
	@Then("^The Background color Should Change to White$")
	public void The_Background_color_Should_Change_to_White() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)(driver);
		File SourceFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SourceFile, new File("C:\\Users\\14435\\screenshot6.png"));
		
		
		
		
	}
	@After
	public void afterRun() {
		driver.close();
		driver.quit();
	}

}
