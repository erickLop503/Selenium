package HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static void main(String[] args) {

		// TC 1: Users Application Form Fill1.Open chrome browser2.Go to
		// “http://uitestpractice.com/”3.Click on “Forms” link4.Fill out the entire
		// form5.Close the browser
		
		String url="http://uitestpractice.com";
		String browser="chrome";
		
		setUpDriver(browser, url);
		
		driver.findElement(By.linkText("Form")).click();
		driver.findElement(By.id("firstname")).sendKeys("Erick");
		driver.findElement(By.id("lastname")).sendKeys("Lopez");
		
		WebElement el=driver.findElement(By.xpath("//input[@type='radio']"));
		el.click();
		
		WebElement el1=driver.findElement(By.xpath("//input[@value='read']"));
        el1.click();
        
        WebElement dropDown=driver.findElement(By.xpath("//select[@id='sel1']"));
        Select drop=new Select(dropDown);
        drop.selectByVisibleText("El Salvador");
        
        driver.findElement(By.cssSelector("input[id*='da']")).click();
        driver.findElement(By.cssSelector("input[id*='da']")).sendKeys("12/06/86");;

        driver.findElement(By.cssSelector("input[id*=ph]")).sendKeys("703-123-4567");
        
	}
}
