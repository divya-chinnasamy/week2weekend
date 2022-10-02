package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InputPage {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver obj = new ChromeDriver();
		
		obj.get("https://leafground.com/input.xhtml");
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		obj.findElement(By.id("j_idt88:name")).sendKeys("Divya");
		String appendcountry = obj.findElement(By.name("j_idt88:j_idt91")).getText();
		obj.findElement(By.name("j_idt88:j_idt91")).sendKeys(appendcountry +   ", India");
		System.out.println(obj.findElement(By.id("j_idt88:j_idt93")).isEnabled());
		obj.findElement(By.id("j_idt88:j_idt95")).clear();
//		String text = obj.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getText();
//		System.out.println(text);
		obj.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("divya.chinnasamy@gmail.com", Keys.TAB);
		obj.findElement(By.id("j_idt88:j_idt101")).sendKeys("I'm in Selenium weekday class");
		obj.findElement(By.xpath("//div[@class='ql-editor ql-blank']")).sendKeys("Typing text to test");
		obj.findElement(By.id("j_idt106:thisform:age")).sendKeys("",Keys.ENTER);
		String ageerror = obj.findElement(By.xpath("//span[@class='ui-message-error-icon']/following-sibling::span")).getText();
		System.out.println(ageerror);
		if(ageerror.contains("Age")) {
			System.out.println("Error message confirmed");
		}
		else {
			System.out.println("error message not confirmed");
		}
		obj.findElement(By.xpath("//input[@id='j_idt106:float-input']")).click();
		System.out.println(obj.findElement(By.xpath("//input[@id='j_idt106:float-input']")).getLocation());
	}

}
