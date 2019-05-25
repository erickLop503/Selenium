package ReviewClass1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import utils.CommonMethods;

public class Task2 extends CommonMethods{

	public static void main(String[] args) {
		
		CommonMethods.setUpDriver("chrome", "http://www.facebook.com/");
		driver.findElement(By.name("firstname")).sendKeys("Erick");
		driver.findElement(By.name("lastname")).sendKeys("Lopez");
		driver.findElement(By.name("reg_email__")).sendKeys("gmail.com");
		driver.findElement(By.cssSelector("input[data-type='password']")).sendKeys("123");
		
		WebElement months=driver.findElement(By.cssSelector("select[id='month']"));
		Select month=new Select(months);
		month.selectByVisibleText("Dec");
		
		WebElement days=driver.findElement(By.cssSelector("select[id='day']"));
		Select day=new Select(days);
		day.selectByIndex(6);
		
		WebElement years=driver.findElement(By.cssSelector("select[id='year']"));
		Select year=new Select(years);
		year.selectByVisibleText("1986");
		
		
	}
}
