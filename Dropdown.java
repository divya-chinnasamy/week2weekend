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
		
		//Thread.sleep(5000);
		obj.findElement(By.xpath("//div[@id='j_idt87:country']")).click();
		obj.findElement(By.xpath("//div[@id='j_idt87:country_panel']/div/ul/li[@data-label='India']")).click();
		
		Thread.sleep(3000);
		
		obj.findElement(By.xpath("//div[@id='j_idt87:city']/div[3]")).click();
		
		Thread.sleep(3000);
		obj.findElement(By.xpath("//div[@id='j_idt87:city_panel']/div/ul/li[@data-label='Chennai']")).click();
		String city = obj.findElement(By.xpath("//div[@id='j_idt87:city_panel']/div/ul/li[@data-label='Chennai']")).getText();
		System.out.println(city);
		
		if (city.equals("Chennai")) {
			System.out.println("City belongs to Country - Confirmed!!!");
		} 
		else if (city.equals("Delhi")){
			System.out.println("City belongs to Country - confirmed!!!");
		}
		else if (city.equals("Bengaluru")){
			System.out.println("City belongs to country - confirmed!!!");
		}
		else{
			System.out.println("City not belongs to country");
		}
		
		obj.findElement(By.xpath("//div[@id='j_idt87:auto-complete']/button/span")).click();
		
		obj.findElement(By.xpath("//li[text()='AWS']")).click();
		obj.findElement(By.xpath("//label[text()='Select Language']")).click();
		obj.findElement(By.xpath("//li[text()='Tamil']")).click();
		Thread.sleep(3000);
		obj.findElement(By.xpath("//label[text()='Select Values']")).click();
		obj.findElement(By.xpath("//li[text()='இரண்டு']")).click();
		
	}

}
