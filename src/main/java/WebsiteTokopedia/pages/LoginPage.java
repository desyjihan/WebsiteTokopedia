package WebsiteTokopedia.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebsiteTokopedia.drivers.DriverSingleton;

public class LoginPage {
	
	private WebDriver driver;

	public LoginPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[5]/button[1]")
	private WebElement btnMasuk;
	
	@FindBy(xpath = "//*[@id=\"email-phone\"]")
	private WebElement inputEmail;
	
	@FindBy(xpath = "//*[@id=\"email-phone-submit\"]")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//*[@id=\"password-input\"]")
	private WebElement inputPassword;
	
	@FindBy(xpath = "//span[@class='css-16s5os-unf-checkbox__area e3y1k2n1']")
	private WebElement checkbox;
	
	@FindBy(xpath = "//span[@aria-label='login-button']")
	private WebElement btnLogin;
	
	public void Masuk() {
		btnMasuk.click();
	}
	
	public void inputEmail(String email) {
		this.inputEmail.sendKeys(email);
		btnSubmit.click();
	}
	
	public void inputPassword(String password) {
		this.inputPassword.sendKeys(password);
		btnLogin.click();
	}
}
