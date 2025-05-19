package day21;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;

public class Question2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step1 Setup Driver
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		// Step2 load the url
		driver.get("https://www.demoblaze.com/");

		// Step3 window Maximize
		driver.manage().window().maximize();
		String Tit="STORE";

		String Title = driver.getTitle();
		if(Tit.equals(Title)) {
			System.out.println("Page landed on Correct website");
		} else {
			System.out.println("Page not landed on Correct website");
		}
		
		//driver.close();
	}

}
