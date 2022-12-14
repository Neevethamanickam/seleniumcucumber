package seleniumpractisework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/TextChange.html");
		driver.manage().window().maximize();
		WebDriverWait w = new WebDriverWait(driver,10);
		WebElement ele = driver.findElement(By.id("btn"));
		w.until(ExpectedConditions.visibilityOf(ele)).click();
		Thread.sleep(5000);
		driver.close();

	}

}
