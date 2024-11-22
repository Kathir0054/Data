package dataFactoryModel;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	
	public static void main(String[] args) {
		String excepFilePath ="C:\\Users\\gbraj\\Downloads\\book.xlsx)";
		TestDataProvider provider = DataProviderFactory.getProvider(DataSource.EXCEL, excepFilePath);
		Map<String,String>testData =provider.getData();
		System.out.println("Test Data From Excel:"+testData);
		
		provider = DataProviderFactory.getProvider(DataSource.FAKER, null);
		testData =provider.getData();
		System.out.println("Test Data From FAKER:"+testData);
		
		provider = DataProviderFactory.getProvider(DataSource.HARDCODED, null);
		testData =provider.getData();
		System.out.println("Test Data From HARDCODED:"+testData);
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys(testData.get("name"));
		driver.findElement(By.id("password")).sendKeys(testData.get("password"));
		driver.quit();
		
		
		
		
		
	
	}

}
