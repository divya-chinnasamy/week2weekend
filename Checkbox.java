package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver obj = new ChromeDriver();
		
		obj.get("https://leafground.com/checkbox.xhtml");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		obj.findElement(By.xpath("//div[@id='j_idt87:j_idt89']/div[2]")).click();
		obj.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[2]")).click();
		
		obj.findElement(By.xpath("//label[text()='Javascript']/preceding-sibling::div")).click();
		obj.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]")).click();
		obj.findElement(By.xpath("//div[@id='j_idt87:j_idt100']")).click();
		
		System.out.println(obj.findElement(By.xpath("//div[@id='j_idt87:j_idt102']")).isDisplayed());
		
		obj.findElement(By.xpath("//div[@id='j_idt87:multiple']")).click();
		Thread.sleep(3000);
		
		obj.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[2]/ul/li")).click();
		
		
				
	}

}
