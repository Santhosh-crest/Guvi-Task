package day21;
import org.openqa.selenium.Keys;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.get("https://www.wikipedia.org/");

		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchInput")).sendKeys("Artificial intelligence"+Keys.ENTER);
		
		driver.findElement(By.id("toc-History")).click();
		
		 WebElement historyTitle = driver.findElement(By.id("History"));
	     System.out.println("Section title: " + historyTitle.getText());

		//driver.close();
	}


}
