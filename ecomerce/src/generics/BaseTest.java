package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import generics.AUL;
import generics.IAutoConst;

public class BaseTest implements IAutoConst{
	public static WebDriver driver;
	static
	{
		System.setProperty(Chrome_key, Chrome_Value);
	}

	@BeforeMethod
	public void openBrowser()
	{

			driver = new ChromeDriver();
			String url=AUL.getProperty(SETTING_PATH, "URL");
			driver.get(url);
			String strITO=AUL.getProperty(SETTING_PATH, "ITO");
			long ITO=Long.parseLong(strITO);
			driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		}

	@AfterMethod
	public void closeBrowser(ITestResult res)
	{
		String testName=res.getName();
		if(res.getStatus()==2)
		{
			AUL.Takephoto(PHOTO_PATH,testName, driver);
		}
		driver.quit();
	}

}
