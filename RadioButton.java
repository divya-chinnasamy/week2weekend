package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver obj = new ChromeDriver();
		
		obj.get("https://leafground.com/radio.xhtml");
		obj.manage().window().maximize();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		obj.findElement(By.xpath("//label[@for='j_idt87:console1:2']/preceding-sibling::div")).click();
		obj.findElement(By.xpath("//label[@for='j_idt87:city2:1']/preceding-sibling::div")).click();
		
		String Text= obj.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
		System.out.println(Text);
		
		String Age=obj.findElement(By.xpath("//label[@for='j_idt87:age:1']")).getText();
		System.out.println(Age);
		
		if (Age!= "21-40 Years") {
			obj.findElement(By.xpath("//label[@for='j_idt87:age:0']")).click();
			System.out.println("Age 1-20 years clicked");
		}	
	}

}
