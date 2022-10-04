
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingAssignment {
	//setting up webdriver
	public static String browser="chrome";
	public static WebDriver driver;
	

	public static void main(String[] args) {
		if(browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
	   }
		//opening the given URL
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		driver.manage().window().maximize();
		//getting title
		String title=driver.getTitle();
		System.out.println(title);
		//testing login functionality using valid test data
		driver.findElement(By.name("username")).sendKeys("sunita");
		driver.findElement(By.name("password")).sendKeys("sunita1234");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div/form/div[3]/input")).click();
		
	}

}
