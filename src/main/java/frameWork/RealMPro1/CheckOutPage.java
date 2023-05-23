package frameWork.RealMPro1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends CommonClass{

	WebDriver d;
	public CheckOutPage(WebDriver d) {
		// TODO Auto-generated constructor stub
		super(d);
		this.d=d;
		PageFactory.initElements(d, this);
	}

	By loc=By.xpath("//button[normalize-space()='Checkout']");
//	ww.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Checkout']")));
//	d.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();
	@FindBy(xpath="//button[normalize-space()='Checkout']")
	WebElement cart;
	public PaymentSelection addToCart1()
	{
		//script();
		waitForElements( loc);
		cart.click();
		PaymentSelection p=new PaymentSelection(d);
		return p;
	}
	
	
	
}
