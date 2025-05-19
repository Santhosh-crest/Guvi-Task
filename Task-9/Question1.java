package day21;

import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Step1 Setup Driver
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

		// Step2 load the url
		driver.get("http://google.com");

		// Step3 window Maximize
		driver.manage().window().maximize();

		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
		driver.navigate().refresh();
		driver.close();
	}

}
