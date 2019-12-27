import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "D:\\Aditya B\\1 - IMC Projects\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get("http://www.facebook.com");
	driver.findElement(By.id("email")).sendKeys("aditya.bhoot@gmail.com");
	
	driver.findElement(By.name("pass")).sendKeys("Sab@2807");
	driver.findElement(By.linkText("Forgotten account?")).click();
	
	
	
	
		
		
		
		
		
	}
	
	
	
	
}
