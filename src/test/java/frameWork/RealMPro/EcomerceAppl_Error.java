package frameWork.RealMPro;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import frameWork.RealMPro1.CheckOutPage;
import frameWork.RealMPro1.LoginPage;
import frameWork.RealMPro1.PaymentSelection;
import frameWork.RealMPro1.Product_Catalog;
import frameWork.Test.Base_Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EcomerceAppl_Error extends Base_Test {

	@Test
	public void submitOrder() throws InterruptedException, IOException  {

		String pro_Name="IPHONE 13 PRO";
		l.loginpage("anshika@gmail.com", "Iamking@0000");
		Assert.assertEquals("Incorrect email or password.", l.errorMessage());
	}
	@Test
	public void chickingProduct() throws InterruptedException, IOException  {

		String pro_Name="IPHONE 13 PRO";
		Product_Catalog pro=l.loginpage("anshika@gmail.com", "Iamking@000");
		List<WebElement> z=pro.getProducts();
		CheckOutPage check=pro.addToCart(pro_Name);
		Assert.assertEquals(pro_Name, pro.productChecking());
		System.out.println(pro.productChecking());
		
	}
}
