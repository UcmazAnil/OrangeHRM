package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionalTest extends Parent {

	@Test(priority = 1)
	public static void loginTest() throws InterruptedException {

		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
	}

	@Test(priority = 2)
	public static void webScraping() throws InterruptedException {
		Thread.sleep(1250);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();
		Thread.sleep(1250);
		WebElement input = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
		input.sendKeys("Charlie Carter");
		Thread.sleep(1250);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(1250);
		actions.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1250);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/button[2]")).click();
		Thread.sleep(5250);
	}

	@Test(priority = 3)
	public static void pimTest() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[3]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input"))
				.sendKeys("Ahmet");

		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input"))
				.sendKeys("Mehmet");

		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input"))
				.sendKeys("Mahmut");

		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"))
				.sendKeys("2580");

		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input"))
				.sendKeys("Ahmet2580");

		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"))
				.sendKeys("Anil1998");

		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"))
				.sendKeys("Anil1998");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();

	}

	@Test(priority = 4)
	public static void formSubmission() throws InterruptedException {

		// This is a MyInfo/EmergencyContacts/SaveEmergencyContact test method.
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(
				"#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(6) > a"))
				.click();
		Thread.sleep(1250);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]/div[3]/a"))
				.click();
		Thread.sleep(1250);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/div/button"))
				.click();
		Thread.sleep(1250);
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input"))
				.sendKeys("Semra Kaya");
		Thread.sleep(1250);
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input"))
				.sendKeys("Wife");
		Thread.sleep(1250);
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[1]/div/div[2]/input"))
				.sendKeys("0(326)123 45");
		Thread.sleep(1250);
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[2]/div/div[2]/input"))
				.sendKeys("0(539) 123 45 67");
		Thread.sleep(1250);
		driver.findElement(By.xpath(
				"//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div/div[3]/div/div[2]/input"))
				.sendKeys("0(541) 987 65 43");
		driver.findElement(
				By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/button[2]"))
				.click();
	}

	@Test(priority = 5)
	public static void aboutDataTest() throws InterruptedException {

		// This is a MyInfo/EmergencyContacts/SaveEmergencyContact test method.
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		Thread.sleep(1250);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[1]/a")).click();
		String aboutTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[2]/div/div/div/div[1]/h6"))
				.getAccessibleName();
		Assert.assertEquals("About", aboutTitle);
	}

}
