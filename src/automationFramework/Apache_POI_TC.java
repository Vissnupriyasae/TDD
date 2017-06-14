package automationFramework;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import utility.Constant;
import appModules.SignIn_Action;


// Import Package utility.*

import utility.ExcelUtils;




	public class Apache_POI_TC {
		 
		

	public static void main(String[] args) throws Exception {

    //This is to open the Excel file. Excel path, file name and the sheet name are parameters to this method

    ExcelUtils.setExcelFile(Constant.Path_TestData,"Sheet1");

    String exePath = "/Users/Documents/devops_priya/chrome/chromedriver";
	System.setProperty("webdriver.chrome.driver", exePath);
	WebDriver driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    driver.get(Constant.URL);

    SignIn_Action.Execute(driver);

    System.out.println("Login Successfully, now it is the time to Log Off buddy.");


    driver.quit();

    //This is to send the PASS value to the Excel sheet in the result column.

    ExcelUtils.setCellData("Pass", 1, 3);

	}

}

