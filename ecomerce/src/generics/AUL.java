package generics;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.bcel.verifier.exc.StaticCodeConstraintException;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AUL {
	public static String getProperty(String path,String key)
	{
		String v="";
		Properties p = new Properties();
		try
		{

			p.load(new FileInputStream(path));

		}
		catch(Exception e)
		{

		}
		v=p.getProperty(key);
		return v;
	}

	public static void Takephoto(String folder,String Testname,WebDriver driver)
	{

		String dateTime = new Date().toString().replaceAll(":","_");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcFile= t.getScreenshotAs(OutputType.FILE);
		String dstPath = folder+Testname+dateTime+".png";
		try
		{

			FileUtils.copyFile(srcFile,new File(dstPath));
		}
		catch(Exception e)
		{

		}

	}
/*public static String getcellvalue(String path,int sheet,int row,int c)
{
	String r="";
	
	try{
		WorkbookFactory w= WorkbookFactory.create(path);
		String v= w.
		
	}
	catch(Exception e)
	{
		
	}
}*/
}
