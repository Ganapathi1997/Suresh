
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class SecondPage extends BaseClass {
public SecondPage(){
		PageFactory.initElements(d, this);
		
	}
	
	@FindBy (id="location")
	private WebElement location;
	public WebElement getLocation() {
		return location;
	}
	
	@FindBy (id="hotels")
	private WebElement hotels;
	public WebElement getHotels() {
		return hotels;
	}
	
	@FindBy (id="room_type")
	private WebElement rooms;
	public WebElement getRooms() {
		return rooms;
	}

    @FindBy (id="room_nos")
	private WebElement nosofrooms;
	public WebElement getNosofrooms() {
		return nosofrooms;
	}

	@FindBy (id="datepick_in")
	private WebElement checkin;
	public WebElement getCheckin() {
		return checkin;
	}
	
	@FindBy (id="datepick_out")
	private WebElement checkout;
	public WebElement getCheckout() {
		return checkout;
	}
	@FindBy(id="adult_room")
	private WebElement adults;
	public WebElement getAdults() {
		return adults;
	}
	
	@FindBy(id="child_room")
	private WebElement child;
	public WebElement getChild() {
		return child;
	}
	
	@FindBy(xpath="//input[@value='Search']")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}

	
}
