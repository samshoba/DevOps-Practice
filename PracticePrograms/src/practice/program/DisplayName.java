package practice.program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DisplayName
{
	WebDriver driver;
	public void invokeBrowser()
	{
		try {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Shobana\\Desktop\\Shobana-Documents\\SeleniumJarFiles\\chromedriver_win32\\chromedriver.exe");
			driver =  new ChromeDriver(); 
			driver.get("https:\\www.facebook.com");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DisplayName d = new DisplayName();
		d.invokeBrowser();

	}
}

	
