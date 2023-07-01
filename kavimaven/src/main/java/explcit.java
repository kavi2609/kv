import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explcit {
	
	@Test
	public void main()
	{
		System.setProperty("webdriver.chrome.driver","C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		//create an object for chromedriver class
		 ChromeDriver c = new ChromeDriver();
		c.get("https://www.google.com");
		
		WebDriverWait n =new WebDriverWait(c,8);
		
		//n.until(ExpectedConditions.titleIs("Google"));
	//	n.until(ExpectedConditions.titleContains("oo"));
		
		//n.until(ExpectedConditions.alertIsPresent());
		//n.until(ExpectedConditions.elementSelectionStateToBe(By.linkText("img"), true));
		//n.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Gmail")));
		//n.until(ExpectedConditions.elementToBeClickable(By.linkText("Images")));
		c.quit();
		
	}

}
