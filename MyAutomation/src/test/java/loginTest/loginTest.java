package loginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class loginTest {
	static String excelPathInput = "C:\\Users\\PC\\eclipse-workspace\\MyAutomation\\ExcelData\\LoginData.xlsx";
	static String sheetNameInput = "Sayfa1";
	static WebDriver driver;
	static int rowCount;
	static int colCount;

	public static Object[][] testData(String excelPath, String sheetName) {

		loginExcelUtility excel = new loginExcelUtility(excelPathInput, sheetNameInput);
		rowCount = excel.getRowCount();
		colCount = excel.getColCount();

		Object data[][] = new Object[rowCount - 1][colCount];

		for (int i = 1; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {

				String cellData = excel.getCellDataString(i, j);

				data[i - 1][j] = cellData;

				// System.out.print(cellData + " ");
			}
			System.out.println();

		}
		return data;
	}

	@DataProvider(name = "TestData1")
	public Object[][] getData() {

		Object data[][] = testData(excelPathInput, sheetNameInput);
		return data;
	}

	@Test(dataProvider = "TestData1")
	public void testCase1(String userName, String password) throws InterruptedException {
		

		for (int i = 0; i < rowCount; i++) {

			String curURL = driver.getCurrentUrl();
			System.out.println(userName + "   " + password);
			if (curURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {

				driver.findElement(By.name("username")).sendKeys(userName);
				driver.findElement(By.name("password")).sendKeys(password);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
						.click();
				Thread.sleep(2000);
				String curSecURL = driver.getCurrentUrl();
				if (!curSecURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
					System.out.println(
							"Used Credentials : " + " " + userName + " " + password + " " + "Login Succesfull");

					break;
				} else {
					System.out.println("Used Credentials : " + " " + userName + " " + password + " " + "Login Failed");
					break;
				}

			}

			else {

				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a"))
						.click();
				Thread.sleep(1000);
				driver.findElement(By.name("username")).sendKeys(userName);
				driver.findElement(By.name("password")).sendKeys(password);
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
						.click();
				Thread.sleep(1000);
				String curThrURL = driver.getCurrentUrl();
				if (!curThrURL.equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
					System.out.println(
							"Used Credentials : " + " " + userName + " " + password + " " + "Login Succesfull");

					break;
				} else {
					System.out.println("Used Credentials : " + " " + userName + " " + password + " " + "Login Failed");
					break;
				}

			}
		}
	}

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
