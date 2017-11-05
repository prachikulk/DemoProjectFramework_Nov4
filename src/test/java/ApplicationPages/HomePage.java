package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver ldriver){
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//span[text()=' Log In']")
	WebElement logInLink;
	
	@FindBy(xpath="//span[text()='Home']")
	WebElement homePageLink;
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement myAccountLink;
	
	@FindBy(xpath="//span[text()='My Cart']")
	WebElement myCartLink;
	
	@FindBy(xpath="//span[text()='Wishlist']")
	WebElement wishListLink;
	
	public void clickOnHomeLink(){
		homePageLink.click();
	}
	
	public void clickOnLogInLink(){
		logInLink.click();
	}
	
	public void clickOnMyAccountLink(){
		myAccountLink.click();
	}
	
	public void clickOnMyCartLink(){
		myCartLink.click();
	}
	
	public void clickOnWishListLink(){
		wishListLink.click();
	}
	
	public String getApplicationTitle(){
		return (driver.getTitle());
	}
}
