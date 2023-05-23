package frameWork.RealMPro1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Catalog extends CommonClass {

	WebDriver d;
	Product_Catalog(WebDriver d)
	{
		super(d);
		this.d=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(css=".ng-tns-c31-1")
	WebElement y;
	By loc=By.xpath("//button[@routerlink='/dashboard/cart']");
	By locator=By.cssSelector(".mb-3");
	
	@FindBy(xpath="//button[@routerlink='/dashboard/cart']")
	WebElement pp;
	@FindBy(css=".mb-3")
	List<WebElement> l;
	@FindBy(xpath="//div[@class='cartSection']/h3")
	WebElement check;
	
	public List<WebElement> getProducts()
	{
		waitForElements(locator);
		return l;
	}
	public WebElement product(String pro_Name)
	{
		WebElement e=getProducts().stream().filter(p -> p.findElement(By.cssSelector("b")).getText().equals(pro_Name)).findFirst().orElse(null);
		//e.findElement(By.cssSelector(".card-body button:last-of-type")).click();
		return e;
	}
	public String productChecking()
	{
		waitForElement(check);
		return check.getText();
	}
	
	public CheckOutPage addToCart(String pro_Name)
	{
		product(pro_Name).findElement(By.cssSelector(".card-body button:last-of-type")).click();
		waitForElements1(y);
		pp.click();
		CheckOutPage c=new CheckOutPage(d);
		return c;
		
	}
	
}
