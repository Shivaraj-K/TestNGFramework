package frameWork.RealMPro1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentSelection extends CommonClass {

	WebDriver  d;
	PaymentSelection(WebDriver  d)
	{
		super(d);
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Select Country']")
	WebElement country;
	//Actions a=new Actions(d);
	
	@FindBy(xpath="//section/button")
	List<WebElement> l;
	@FindBy(linkText="PLACE ORDER")
	WebElement t;
	public void selectCountry(String countryName) throws InterruptedException
	{
//		Actions a=new Actions(d);
//		a.moveToElement(country).click().sendKeys(countryName).perform();
		country.sendKeys(countryName);
		for(WebElement w:l)
			{
				if(w.getText().equals("India"))
				{
					w.click();
					break;
				}
			}
		Thread.sleep(4000);
		t.click();

	}
//	a.moveToElement(d.findElement(By.xpath("//input[@placeholder='Select Country']"))).click().sendKeys("ind").perform();
//	
////	d.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys("ind");
//	List<WebElement> ll=d.findElements(By.xpath("//section/button"));
//	for(WebElement w:ll)
//	{
//		if(w.getText().equals("India"))
//		{
//			w.click();
//			break;
//		}
//	}
//	d.findElement(By.linkText("PLACE ORDER")).click();
//
}
