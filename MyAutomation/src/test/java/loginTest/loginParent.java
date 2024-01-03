package loginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class loginParent {
	static WebDriver driver = null;

	@BeforeClass()
	public static void startExecution() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	}

	@AfterClass()
	public static void endExecution() {
		driver.close();
		driver.quit();

	}
}
