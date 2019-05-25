package ReviewClass1;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class Task1 extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setUpDriver("chrome", "https://www.toolsqa.com/automation-practice-form/");
		//we used advance loop
		List<WebElement> list=driver.findElements(By.cssSelector("input[name='sex']"));
		for(WebElement ele:list) {
			if(ele.isEnabled()) {
			ele.click();
			Thread.sleep(4000);
			}
		}
		
		Iterator<WebElement> it=list.iterator();
		while(it.hasNext()) {
			it.next().click();
			Thread.sleep(2000);
		}
		
		driver.close();
	}
}
