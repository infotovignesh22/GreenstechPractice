package Org.Tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracEx1 {

	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		System.out.println("Hi Vignesh");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	}

}
