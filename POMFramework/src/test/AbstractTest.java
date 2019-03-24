package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import UI_Components.FlightReservationPageComponents;
import UI_Components.LoginComponents;

public class AbstractTest {
	
	LoginComponents loginComponent;
	FlightReservationPageComponents reservationPageComponent;
	WebDriver driver;
	
	public AbstractTest()
	{
		loginComponent = new LoginComponents();
		reservationPageComponent = new FlightReservationPageComponents();
	}
	
	@BeforeTest
	public void setUpEnvironment()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		PageFactory.initElements(driver, loginComponent);
		PageFactory.initElements(driver, reservationPageComponent);
	}
	
	@AfterTest
	public void afterenvironment()
	{
		driver.close();
	}
	
	

}
