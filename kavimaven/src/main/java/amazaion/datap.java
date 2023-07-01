package amazaion;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class datap {
	
	
	@DataProvider(name= "kavi")
	public static Object[][] dataset(){
		Object[][] obj = {
				{"vaild us ","6380606117","kavi2426"},
				{"invaild u,p","kk","78yu"},	
		};
		return obj;
		
	}
	@Test(dataProvider = "kavi")
	public void Dataprosample(String type,String name,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\software testing\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver  n= new ChromeDriver();
		 
		 n.get("https://www.facebook.com");
		 
		 n.findElementById("email").sendKeys(name);
		 n.findElementByName("pass").sendKeys(password);
		 n.findElementByName("login").click();
		 
		 if(type.equals("vaild")) {
			 System.out.println("in home");
			 n.findElementByLinkText("Log in").click();
		 }
		 else
		 {
			 System.out.println("in vaild ");
			 Thread.sleep(3000);
			 n.quit();
		 }

		  
	}

}
