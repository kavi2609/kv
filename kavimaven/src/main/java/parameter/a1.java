package parameter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class a1 {
	
	@Parameters({"emailId","password"})
	@Test(groups = "one")
	public void main(String email,String pass) {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver n= new ChromeDriver();
		
		n.get("https://www.facebook.com");
		n.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(n.getTitle());
		
		n.findElementByName("email").sendKeys(email);
		n.findElementById("pass").sendKeys(pass);
		n.findElementByLinkText("Log in").click();
		
		
	}

}
