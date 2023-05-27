package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://blazedemo.com/");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));

		Select drp = new Select(ele);
		// System.out.println(drp.len);

		drp.selectByValue("Portland");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));

		Select drp1 = new Select(ele1);

		drp1.selectByValue("London");

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[2]/td[1]/input")).click();
		Thread.sleep(2000);

		driver.close();
	}

}
