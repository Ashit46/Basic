package Basic.Bash;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest {
    @Test
    public void shouldAnswerWithTrue()
    {
	System.out.println("Samdur");

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("//https:google.com");
	String title =driver.getTitle();
	System.out.println(title);
	
	
	
	
        
    }
}
