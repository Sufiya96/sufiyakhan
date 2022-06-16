package automation1;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	 public class home {
  
    	WebDriver driver;
    	@Test
    	public void Lanching_the_Browser() {
    	System.setProperty("webdriver.chrome.driver", "./source/chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.get("https://mobileworld.azurewebsites.net");
    	driver.manage().window().maximize();
    	}}

   

