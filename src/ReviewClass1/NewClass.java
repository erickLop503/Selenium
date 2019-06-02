package ReviewClass1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import utils.CommonMethods;

public class NewClass extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {

		String url = "https://jqueryui.com/";
		setUpDriver("chrome", url);

		WebElement datePicker = driver.findElement(By.xpath("//a[contains(.,'Datepicker')]"));
		datePicker.click();

		WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		switchToFrame(frame);
		driver.findElement(By.id("datepicker")).click();

		String year = "2019";
		String month = "August";
		String date = "10";

		WebElement currentYear = driver
				.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']"));
		currentYear.getText();
		if (!currentYear.equals(year)) {
			do {
				driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
			} while (!driver
					.findElement(By.xpath("//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-year']"))
					.getText().equals(year));
		}

		String currentMonth = driver
				.findElement(By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]"))
				.getText();
		if (!currentMonth.equalsIgnoreCase(month)) {
			do {
				driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
			} while (!driver
					.findElement(
							By.xpath("(//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month'])[1]"))
					.getText().equalsIgnoreCase(month));
		}

		List<WebElement> cells = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
		for (WebElement cell : cells) {
			String cellText = cell.getText();
			if (cellText.equals(date)) {
				cell.click();
			}
		}

		String result = driver.findElement(By.id("datepicker")).getAttribute("value");

		if (result.equalsIgnoreCase("08/10/2019")) {
			System.out.println("Date has been entered successfully");
		} else {
			System.out.println("error");
		}

		Thread.sleep(2000);
		driver.close();

	}
}
