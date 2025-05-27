package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.get("http://the-internet.herokuapp.com/nested_frames");

		driver.manage().window().maximize();
		// Switch to the top frame (frame-top)
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));

        // Verify three child frames exist inside top frame
        int frameCount = driver.findElements(By.xpath("//frame")).size();
        System.out.println("No.of top frame: " + frameCount);
        if (frameCount == 3) {
            System.out.println("Frame count verification PASSED");
        } else {
            System.out.println("Frame count verification FAILED");
        }
        
        // Switch to left frame
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-left']")));
        WebElement leftText = driver.findElement(By.xpath("//body"));
        System.out.println("Left Frame Text: " + leftText.getText());
        if (leftText.getText().trim().equalsIgnoreCase("LEFT")) {
            System.out.println("Left frame text verification PASSED");
        }
     // Back to top frame
        driver.switchTo().parentFrame();
        // Switch to middle frame
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
        WebElement middleText = driver.findElement(By.xpath("//div[@id='content']"));
        System.out.println("Middle Frame Text: " + middleText.getText());
        if (middleText.getText().trim().equals("MIDDLE")) {
            System.out.println("Middle frame text verification PASSED");
        }

        // Back to top frame
        driver.switchTo().parentFrame();

        // Switch to right frame
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-right']")));
        WebElement rightText = driver.findElement(By.xpath("//body"));
        System.out.println("Right Frame Text: " + rightText.getText());
        if (rightText.getText().trim().equals("RIGHT")) {
            System.out.println("Right frame text verification PASSED");
        }
        driver.switchTo().defaultContent();

        // Switch to bottom frame
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
        WebElement bottomText = driver.findElement(By.xpath("//body"));
        System.out.println("Bottom Frame Text: " + bottomText.getText());
        if (bottomText.getText().trim().equals("BOTTOM")) {
            System.out.println("Bottom frame text verification PASSED");
        }

        // Back to top frame
        driver.switchTo().defaultContent();
        System.out.println("Reached Top Frame");
        driver.quit();

	}	

}
