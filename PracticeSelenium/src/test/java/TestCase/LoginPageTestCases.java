package TestCase;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automationProj.Base;



public class LoginPageTestCases extends Base{
	public WebDriver driver;
	@BeforeMethod
	public void initalization() throws Exception {
		driver = browzerInitialization("chrome");
		driver.get("https://qalegend.com/crm/index.php/signin");
		driver.manage().window().maximize();
	}
	@Test
	public void tc001() {
		System.out.println("TC001: Blank UserName & Blank Password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(" ");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void tc002() {
		System.out.println("TC002: Blank UserName & Correct Password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void tc003() {
		System.out.println("TC003: Blank UserName & Incorrect Password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void tc004() {
		System.out.println("TC004: Correct UserName & Blank Password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(" ");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void tc005() {
		System.out.println("TC005: Correct UserName & Correct Password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void tc006() {
		System.out.println("TC006: Correct UserName & Incorrect Password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@admin.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void tc007() {
		System.out.println("TC007: Incorrect UserName & Blank Password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(" ");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void tc008() {
		System.out.println("TC008: Incorrect UserName & Correct Password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void tc009() {
		System.out.println("TC009: Incorrect UserName & Incorrect Password");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password1");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
@Test(dataProvider = "data")
	public void tc010(String email, String password) {
		System.out.println("TC010: Using DATA PROVIDER");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
@DataProvider(name = "data")
public Object[][] testData(){
	Object[][] newData = new Object[3][2];
	newData[0][0] = " ";
	newData[0][1] = " ";
	newData[1][0] = " ";
	newData[1][1] = "Password";
	newData[2][0] = "admin";
	newData[2][1] = "Password1";
	return newData;
}
}
