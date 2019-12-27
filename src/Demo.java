import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test
		// Create a class for CHROME
		// We will strictly implement methods of WebDriver  
				
		// Invoke the Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Aditya B\\1 - IMC Projects\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		// Get Current URL
		driver.get("http://www.google.com");  // Hit url on the Browser
						
		// Get Title
		System.out.println(driver.getTitle());  // Validate if your Page Title is correct
		
		System.out.println(driver.getCurrentUrl()); // Verify you landed on correct page 
		
		driver.get("http://www.yahoo.com");
		driver.navigate().to("hhtp://www.yahoo.com");
		
		
		// driver.close();

	}

}
