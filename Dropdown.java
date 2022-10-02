package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver obj = new ChromeDriver();
		
		obj.get("https://leafground.com/select.xhtml");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement source = obj.findElement(By.xpath("//div[@class='grid formgrid']/div/select"));
		Select dd = new Select(source);	
		dd.selectByVisibleText("Selenium");
		
		Thread.sleep(5000);
		
		WebElement source1 = obj.findElement(By.xpath("//div[@class='grid formgrid']/div/div/div[2]/select"));
		Select dd1 = new Select(source1);
		dd1.selectByVisibleText("India");
	
		
		
		
	}

}
