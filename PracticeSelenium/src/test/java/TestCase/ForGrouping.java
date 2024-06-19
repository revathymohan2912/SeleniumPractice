package TestCase;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import automationProj.Base;

public class ForGrouping extends Base{
	public WebDriver driver;
	@BeforeMethod
	public void initalization() {
		driver = browzerInitialization("chrome");
		driver.get("https://selenium.qabible.in/index.php");
		driver.manage().window().maximize();
	}

	@Test(groups = {"RegressionTest"})
	public void tc001() {
		System.out.println("TC001");
	}
	@Test(groups = {"RegressionTest"})
	public void tc002() {
		System.out.println("TC002");
	}
	@Test(groups = {"SanityTest"})
	public void tc003() {
		System.out.println("TC003");
	}
	@Test(groups = {"SmokeTest"})
	public void tc004() {
		System.out.println("TC004");
	}
	@Test(groups = {"SmokeTest"})
	public void tc005() {
		System.out.println("TC005");
	}
	@Test(groups = {"SanityTest"})
	public void tc006() {
		System.out.println("TC006");
	}
	@Test
	public void tc007() {
		System.out.println("TC007");
	}
	@Test(groups = {"SmokeTest"})
	public void tc008() {
		System.out.println("TC008");
	}
	@Test(groups = {"SanityTest"})
	public void tc009() {
		System.out.println("TC009");
	}
	@Test(groups = {"RegressionTest"})
	public void tc010() {
		System.out.println("TC010");
	}
	
}
