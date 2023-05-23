package frameWork.RealMPro1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderrr extends CommonClass{

	WebDriver d;
	public Orderrr(WebDriver d)
	{
		super(d);
		this.d=d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(xpath="//tbody//tr//td[2]")
	List<WebElement> pro;
	
	public Boolean product(String pro_Name)
	{
//		waitForElement(pro);
		
		Boolean b=pro.stream().anyMatch(p ->p.getText().equalsIgnoreCase(pro_Name));
		return b; 
		
	}

}
