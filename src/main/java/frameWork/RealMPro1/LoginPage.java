package frameWork.RealMPro1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonClass {

	WebDriver d;
	public LoginPage(WebDriver d)
	{
		super(d);
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(id="userEmail")
	WebElement user;
	
	@FindBy(id="userPassword")
	WebElement pass;
	
	@FindBy(id="login")
	WebElement login;
	
	@FindBy(xpath="//div[@role='alert']")
	WebElement error;
	public String errorMessage()
	{
		 waitForElement(error);
		return error.getText();
	}
	
	@FindBy(xpath="//button[@routerlink='/dashboard/myorders']")
	WebElement click;
	public Boolean clickOrder(String name)
	{
		click.click();
		Orderrr o=new Orderrr(d);
		return o.product(name);
	}
	public Product_Catalog loginpage(String userp,String passs)
	{
		user.sendKeys(userp);
		pass.sendKeys(passs);
		login.click();
		Product_Catalog pro=new Product_Catalog(d);
		return pro;
	}
	
	public void goTo()
	{
		d.get("https://rahulshettyacademy.com/client/");
	}
	
}
