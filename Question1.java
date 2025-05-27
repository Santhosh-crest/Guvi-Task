package day26;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.get("https://jqueryui.com/datepicker/");

		driver.manage().window().maximize();
		
		   // Switch to the iframe that contains the datepicker
        WebElement iframe = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(iframe);

        // Open the datepicker by clicking the input field
        WebElement dateInput = driver.findElement(By.id("datepicker"));
        dateInput.click();

        // Click the next month button
        WebElement nextButton = driver.findElement(By.className("ui-datepicker-next"));
        nextButton.click();

        // Select the date 22
        WebElement date = driver.findElement(By.xpath("//a[text()='22']"));
        date.click();

        // Get the selected date value
        String selectedDate = dateInput.getAttribute("value");
        System.out.println("Selected date is: " + selectedDate);

	}
}
