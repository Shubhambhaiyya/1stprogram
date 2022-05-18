package mainjava;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BaseClass{
	@FindBy(xpath="//h1[text()='Dashboard']")
	WebElement titleDashBoard;
	
	@FindBy(id="welcome")
	WebElement drpDownForLogout;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement logoutOption;
	
//	@FindBy(xpath="//*[@id='notification']")
//	WebElement iconBell;
	
	// Initialization
	public DashboardPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	// Steps
	public boolean titleOfDashBoard() {
		String title = titleDashBoard.getText();
		if(title.equals("Dashboard"))
			return true;
		else
			return false;
	}
	
	public void logoutProcess() {
		drpDownForLogout.click();
		WebDriverWait driverWait= new WebDriverWait(driver, Duration.ofSeconds(10));
		driverWait.until(ExpectedConditions.elementToBeClickable(logoutOption));
		logoutOption.click();
	}
}



