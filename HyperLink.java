package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLink {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver obj = new ChromeDriver();
		
		obj.get("https://leafground.com/link.xhtml");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		obj.findElement(By.linkText("Go to Dashboard")).click();
		System.out.println(obj.getTitle());
		
		System.out.println(obj.getCurrentUrl());
		
		obj.findElement(By.linkText("Broken?")).click();
		System.out.println(obj.getTitle());
		
	}
}
