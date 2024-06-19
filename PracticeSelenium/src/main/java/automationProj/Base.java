package automationProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base {
	public WebDriver driver;	//interface
	public WebDriver browzerInitialization(String browzerName){
		if(browzerName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			}
		else if(browzerName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		return driver;
	}

}
