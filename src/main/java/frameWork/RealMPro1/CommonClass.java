package frameWork.RealMPro1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonClass {

	WebDriver d;
	WebDriverWait ww;
	CommonClass(WebDriver d)
	{
		this.d=d;
		 ww=new WebDriverWait(d,Duration.ofSeconds(50));
		
	}
	
	public void script()
	{
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("window.scrollBy(0,1000)");
	}
	
	public void waitForElements(By locator)
	{
		//WebDriverWait ww=new WebDriverWait(d,Duration.ofSeconds(50));
		ww.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	public void waitForElement(WebElement w)
	{
		ww.until(ExpectedConditions.visibilityOf(w));
	}
	public void waitForElements1(WebElement y)
	{
		//WebDriverWait ww=new WebDriverWait(d,Duration.ofSeconds(50));
		ww.until(ExpectedConditions.invisibilityOf(y));
	}
}
