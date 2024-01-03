package testScripts;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GUITest extends Parent {

	@Test(priority = 1)
	public static void loginTest() throws InterruptedException {

		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@Test(priority = 2, dependsOnMethods = "loginTest")
	public static void adminTest() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(1500);
		String adminTitle = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]"))
				.getAccessibleName();
		System.out.println(adminTitle);
		Assert.assertEquals("Admin", adminTitle);

	}

	@Test(priority = 3, dependsOnMethods = "loginTest")
	public static void pimTest() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
		Thread.sleep(1500);
		String pimTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"))
				.getAccessibleName();
		System.out.println(pimTitle);
		Assert.assertEquals("PIM", pimTitle);

	}

	@Test(priority = 4, dependsOnMethods = "loginTest")
	public static void leaveTest() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();
		Thread.sleep(1500);
		String leaveTitle = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"))
				.getAccessibleName();
		System.out.println(leaveTitle);
		Assert.assertEquals("Leave", leaveTitle);

	}

	@Test(priority = 5, dependsOnMethods = "loginTest")
	public static void timeTest() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")).click();
		Thread.sleep(1500);
		String timeTitle = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[1]"))
				.getAccessibleName();
		System.out.println(timeTitle);
		Assert.assertEquals("Time", timeTitle);

	}

	@Test(priority = 5, dependsOnMethods = "loginTest")
	public static void myInfoTest() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span")).click();
		Thread.sleep(1500);
		String myInfoTitle = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/h6"))
				.getAccessibleName();
		System.out.println(myInfoTitle);
		Assert.assertEquals("Personal Details", myInfoTitle);

	}

	@Test(priority = 6, dependsOnMethods = "loginTest")
	public static void directoryTest() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[9]/a")).click();
		Thread.sleep(1500);
		String directoryTitle = driver
				.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6"))
				.getAccessibleName();
		System.out.println(directoryTitle);
		Assert.assertEquals("Directory", directoryTitle);

	}

	@Test(priority = 7, dependsOnMethods = "loginTest")
	public static void supportPageTest() throws InterruptedException {
		Thread.sleep(1500);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/help/support");

	}

	@Test(priority = 8, dependsOnMethods = "loginTest")
	public static void myTrackerTest() throws InterruptedException {
		Thread.sleep(1500);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/performance/viewMyPerformanceTrackerList");

	}

	@Test(priority = 9, dependsOnMethods = "loginTest")
	public static void vacanciesTest() throws InterruptedException {
		Thread.sleep(1500);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/recruitment/viewJobVacancy");

	}

	@Test(priority = 10, dependsOnMethods = "loginTest")
	public static void homePageTest() throws InterruptedException {
		Thread.sleep(1500);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")).click();

	}
}
