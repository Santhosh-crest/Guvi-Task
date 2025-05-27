package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Question2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();
		 // Switch to iframe that contains drag-and-drop elements
        WebElement iframe = driver.findElement(By.className("demo-frame"));
        driver.switchTo().frame(iframe);

        // Find the draggable and droppable elements
        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));

        // Perform drag and drop
        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, target).perform();

        // Verify the text has changed to "Dropped!"
        String dropText = target.getText();
        System.out.println("Target element text: " + dropText);
        if (dropText.equals("Dropped!")) {
            System.out.println("Text verification PASSED");
        } else {
            System.out.println("Text verification FAILED");
        }

        // Verify the background color (optional - prints the color)
        String backgroundColor = target.getCssValue("background-color");
        System.out.println("Target element background color: " + backgroundColor);


	}
}
