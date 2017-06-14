package appModules;
import org.openqa.selenium.WebDriver;
import utility.ExcelUtils;

public class SignIn_Action {
	public static void Execute(WebDriver driver) throws Exception{
		 
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

		String sUserName = ExcelUtils.getCellData(1, 1);

		String sPassword = ExcelUtils.getCellData(1, 2);
		
	}
}
