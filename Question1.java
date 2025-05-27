package day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Question1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		driver.get("https://the-internet.herokuapp.com/windows");

		driver.manage().window().maximize();
		  WebElement clickHere = driver.findElement(By.linkText("Click Here"));
          clickHere.click();
          
          String originalWindow = driver.getWindowHandle();

       // Wait and switch to the new window
          Set<String> allWindows = driver.getWindowHandles();
          for (String windowHandle : allWindows) {
              if (!windowHandle.equals(originalWindow)) {
                  driver.switchTo().window(windowHandle);
                  break;
              }
          }

          // Verify that "New Window" text is present
          WebElement newWindowText = driver.findElement(By.className("example"));
          System.out.println(newWindowText.getText());
          if (newWindowText.getText().equals("New Window")) {
              System.out.println("Text verification PASSED in new window");
          } else {
              System.out.println("Text verification FAILED in new window");
          }
          driver.close();
          System.out.println("new window closed sucesssfully");
          
       // Switch back to the original window
          driver.switchTo().window(originalWindow);

          // Verify that we're back on the original window
          if (driver.getTitle().contains("The Internet")) {
              System.out.println("Returned to original window successfully");
          } else {
              System.out.println("unable to find original window");
          }
          
          driver.quit();

	}
}


    