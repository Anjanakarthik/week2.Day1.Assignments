package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();

driver.findElement(By.linkText("CRM/SFA")).click();
Thread.sleep(3000);
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anjana");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("s");
driver.findElement(By.id("createLeadForm_firstNameLocal"));
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("dept");
driver.findElement(By.id("createLeadForm_description")).sendKeys("description");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anjanas223@gmail.com");
WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

Select statedropdown = new Select (state);
statedropdown.selectByVisibleText("New York");
driver.findElement(By.name("submitButton")).click();
String title=driver.getTitle();
driver.findElement(By.linkText("Duplicate Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Oracle");
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Amrutha");
driver.findElement(By.className("smallSubmit")).click();
String newtitle = driver.getTitle();
System.out.println(newtitle);


	}

}
