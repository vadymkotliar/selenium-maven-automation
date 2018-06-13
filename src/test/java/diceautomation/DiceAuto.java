package diceautomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DiceAuto {
    

    public static void main(String[] args) {
	WebDriverManager.chromedriver().setup(); // it replaces System.set
//	System.setProperty("webdriver.chrome.driver", 
//		"D:\\Java\\Selenium dependencies\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();  // of fullscreen() || make a browser full screen
	
	driver.get("http://dice.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // Adding a wait
	driver.findElement(By.id("search-field-keyword")).sendKeys("java programmer");
	driver.findElement(By.id("search-field-location")).clear();
	driver.findElement(By.id("search-field-location")).sendKeys("Virginia"+Keys.ENTER);
	
//	driver.findElement(By.id("findTechJobs")).click();
	WebElement a = driver.findElement(By.id("posiCountId"));
	System.out.println(a.getText());
	
	driver.close();
    }
}
