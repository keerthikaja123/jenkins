package swagerTest;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabs.generic.BaseClass;
import com.swaglabs.pom.Home;
import com.swaglabs.pom.Info;

public class BoltTest extends BaseClass{
@Test(groups="smoke")
public void addCart() throws IOException
{
	//WebDriver driver = null;
	
	
	Home hm=new Home(driver);
	hm.addShirt();
	Info i=new Info(driver);
	i.custInfo();
	i.fin();
	String ab=driver.findElement(By.xpath("//span[text()='Checkout: Complete!']")).getText();
	Assert.assertEquals(ab,"CHECKOUT: COMPLETE!");
	
	
	
			
}

@Test(groups="regression")
public void listOfitems()
{
	List<WebElement> j = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
	for(WebElement w:j) {
		System.out.println(w.getText());
	}
}

}
