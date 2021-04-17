

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage extends BaseClass {

	public ThirdPage() {
		PageFactory.initElements(d,this);
	}
	
	@FindBy (xpath="//input[@id='radiobutton_0']")
	private WebElement radiobutton;
    public WebElement getRadiobutton() {
		return radiobutton;
	}
	@FindBy (xpath="//input[@id='continue']")
	private WebElement accept;
	public WebElement getAccept() {
		return accept;
	}
	@FindBy(id="first_name")
	private WebElement firstname;
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}

	@FindBy (id="last_name")
	private WebElement lastname;
	
	@FindBy (id="address")
	private WebElement add;
	@FindBy (xpath="//input[@id='cc_num']")
	private WebElement cardno;
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCardno() {
		return cardno;
	}
	
	@FindBy (xpath="//select[@id='cc_type']")
	private WebElement cardtype;
	
	@FindBy (xpath="//select[@id='cc_exp_month']")
	private WebElement expmonth;
	
	@FindBy (xpath="//select[@id='cc_exp_year']")
	private WebElement expyear;
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpmonth() {
		return expmonth;
	}
	public WebElement getExpyear() {
		return expyear;
	}
	
	
	@FindBy (id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	@FindBy (id="order_no")
	private WebElement orderno;
	public WebElement getOrderno() {
		return orderno;
	}
	
	
	
	
}
