package org.test1.Test1;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
			System.out.println("Project Started");
			
	}
	
	@AfterClass
	public static void afterClass() {
			System.out.println("Project Completed");
		}
		
	@Before
	
	public void before() {
		System.out.println("Test Started");
	}
	
	@After
	public void after() {
		System.out.println("Test Ended");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	
	@Test
	public void TC_AD_001() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtUserName.sendKeys("Rahulxyz07");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("qwepoi");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='login']"));
		btnLogin.click();		
		
		
	}
	
	@Test
	public void TC_AD_002() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtUserName.sendKeys("Rahulxyz07");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("qwepoii");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='login']"));
		btnLogin.click();
	}
	
	@Test
	public void TC_AD_003() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtUserName.sendKeys("Rahulxy07");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("qwepoi");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='login']"));
		btnLogin.click();
	}
	
	@Test
	public void TC_AD_004() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtUserName.sendKeys("Rahulxy07");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("qwepoii");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='login']"));
		btnLogin.click();
	}
	
	@Test
	public void TC_AD_005() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
		WebElement txtUserName = driver.findElement(By.xpath("//input[@name='username']"));
		txtUserName.sendKeys("Rahulxyz07");
		
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("qwepoi");
		
		WebElement btnLogin = driver.findElement(By.xpath("//input[@name='login']"));
		btnLogin.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement ddLocation = driver.findElement(By.xpath("//select[@name='location']"));
		Select locationselect = new Select(ddLocation);
		locationselect.selectByIndex(5);
		
		WebElement ddHotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select hotelsSelect = new Select(ddHotels);
		hotelsSelect.selectByIndex(3);
		
		WebElement ddRoomType = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select roomTypeSelect = new Select(ddRoomType);
		roomTypeSelect.selectByIndex(2);
		
		WebElement ddNumOfRooms = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select numOfRoomsSelect = new Select(ddNumOfRooms);
		numOfRoomsSelect.selectByIndex(4);
		
		WebElement ddChkInDate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		ddChkInDate.sendKeys("02/11/2025");
		
		WebElement ddChkOutDate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		ddChkOutDate.sendKeys("05/11/2025");
		
		WebElement ddAdultsPerRoom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select adultsPerRoomSelect = new Select(ddAdultsPerRoom);
		adultsPerRoomSelect.selectByIndex(3);
		
		WebElement ddChildPerRoom = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select childPerRoomSelect = new Select(ddChildPerRoom);
		childPerRoomSelect.selectByIndex(1);
	
		WebElement btnSearch = driver.findElement(By.xpath("//input[@name='Submit']"));
		btnSearch.click();
		
	}
	
	@Test
	public void TC_AD_006() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Rahulxyz07");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qwepoi");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Select ddLocation = new Select ( driver.findElement(By.xpath("//select[@name='location']")));
		ddLocation.selectByIndex(5);
		
		Select ddNumOfRooms = new Select( driver.findElement(By.xpath("//select[@name='room_nos']")));
		ddNumOfRooms.selectByIndex(4);
		
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("02/11/2025");
		
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("05/11/2025");
		
		Select ddAdultsPerRoom = new Select (driver.findElement(By.xpath("//select[@name='adult_room']")));
		ddAdultsPerRoom.selectByIndex(3);
	
		WebElement btnSearch = driver.findElement(By.xpath("//input[@name='Submit']"));
		btnSearch.click();

		
}
	
	@Test
	public void TC_AD_007() {
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Rahulxyz07");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qwepoi");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Select ddLocation = new Select(driver.findElement(By.xpath("//select[@name='location']")));
		ddLocation.selectByIndex(5);
	
		Select ddHotels = new Select (driver.findElement(By.xpath("//select[@name='hotels']")));
		ddHotels.selectByIndex(3);
		
		Select ddRoomType = new Select(driver.findElement(By.xpath("//select[@name='room_type']")));
		ddRoomType.selectByIndex(2);
		
		Select ddNumOfRooms = new Select (driver.findElement(By.xpath("//select[@name='room_nos']")));
		ddNumOfRooms.selectByIndex(4);
		
		driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("02/11/2025");
		
		driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("05/11/2025");
		
		Select ddChildPerRoom = new Select (driver.findElement(By.xpath("//select[@name='child_room']")));
		ddChildPerRoom.selectByIndex(1);
	
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
	
	
	}
}