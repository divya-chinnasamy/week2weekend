package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver obj = new ChromeDriver();
		
		obj.get("https://leafground.com/button.xhtml");
		obj.manage().window().maximize();
		String title = obj.getTitle();
		obj.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//obj.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
		//String title2 = obj.getTitle();
		if (title.contains("Button")) {
			System.out.println("Title is " + title + " confirmed");
		}
		else {
			System.out.println("Title is ");
		}
		System.out.println(obj.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled());
		org.openqa.selenium.Point location = obj.findElement(By.id("j_idt88:j_idt94")).getLocation();
		int x=location.getX();
		int y=location.getY();
		System.out.println(x);
		System.out.println(y);
		
		String css = obj.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");
		System.out.println(css);
		
		org.openqa.selenium.Point location1 = obj.findElement(By.id("j_idt88:j_idt98")).getLocation();
		int a=location1.getX();
		int b=location1.getY();
		System.out.println(a);
		System.out.println(b);
	}

}
