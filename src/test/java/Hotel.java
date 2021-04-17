

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.TestNGException;

public class Hotel extends BaseClass {
    @BeforeClass
	private void beforeClass() {
    	launchBrowser("Chrome");
		
	}
	@Test
	private void test1() {
		
		launchUrl("https://adactinhotelapp.com/index.php");
		FirstPage f=new FirstPage();
		sendKeys(f.getUsername(), "Ganapathi");
		sendKeys(f.getPassword(), "Ganapathi@97");
        click(f.getLogin());
		
	
		SecondPage s=new SecondPage();
		click(s.getLocation());
		selectbytext(s.getLocation(),"Sydney");
		selectbyvalue(s.getHotels(), "Hotel Creek");
		selectbyvalue(s.getRooms(), "Double");
		selectbyvalue(s.getNosofrooms(), "1");
	    clear(s.getCheckin());
	    sendKeys(s.getCheckin(), "01/04/2021");
	    clear(s.getCheckout());
		sendKeys(s.getCheckout(), "03/04/2021");
		selectbyvalue(s.getAdults(), "2");
		selectbyvalue(s.getChild(), "0");
		click(s.getSearch());
		
		
	}
		
		@Test
		private void test3() {
		ThirdPage t=new ThirdPage();
		click(t.getRadiobutton());
		click(t.getAccept());
		sendKeys(t.getFirstname(), "Rethina");
		sendKeys(t.getLastname(), "Ganapathi");
		sendKeys(t.getAdd(), "Chennai");
		sendKeys(t.getCardno(), "1458 4589 9999 6696");
		click(t.getCardtype());
		selectbyindex(t.getCardtype(), 2);
		click(t.getExpmonth());
		selectbyindex(t.getExpmonth(), 6);
		click(t.getExpyear());
		selectbyvalue(t.getExpyear(), "2022");
		sendKeys(t.getCvv(), "345");
		click(t.getBooknow());
		
		
		
		System.out.println(getAttribute(t.getOrderno()));
	}		
		
		
		
		
	
	
	
}
