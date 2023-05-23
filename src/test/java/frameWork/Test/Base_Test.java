package frameWork.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import frameWork.RealMPro1.LoginPage;

public class Base_Test {

	public WebDriver d;
	public LoginPage l;
	public WebDriver loginTo() throws IOException
	{
		//String path=System.getProperty("user.dir");
		Properties p=new Properties();
		FileInputStream f=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\frameWork\\resourse\\generic.properties");
		p.load(f);
		String browserName=p.getProperty("browser");
		if(browserName.contains("chrome"))
		{
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--remote-allow-origins=*");
		 d=new ChromeDriver(c);
		
		}
		else if(browserName.contains("firefox"))
		{
			 d=new FirefoxDriver();
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return d;
	}
	@BeforeMethod
	public LoginPage initializeMethods() throws IOException
	{
		 d=loginTo();
		 WebDriverWait ww=new WebDriverWait(d,Duration.ofSeconds(50));
		  l=new LoginPage(d);
		l.goTo();
		return l;
	}
	
	
	
}
