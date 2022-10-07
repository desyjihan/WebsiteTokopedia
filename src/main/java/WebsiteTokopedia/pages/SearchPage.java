package WebsiteTokopedia.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import WebsiteTokopedia.drivers.DriverSingleton;

public class SearchPage {
	
private WebDriver driver;
	
	public SearchPage() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div[1]/div/div")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//*[@id=\"header-main-wrapper\"]/div[2]/div[2]/div[1]/div/div/div/input")
	private WebElement inputSearch;
	
	@FindBy(xpath = "//*[@id=\"zeus-root\"]/div/div[2]/div/div[2]/div[3]/div[2]/div[2]")
	private WebElement chooseItem;
	
	public void Search() {
		btnSearch.click();
	}
	
	public void searchItem(String search) {
		inputSearch.sendKeys();
		inputSearch.sendKeys(Keys.ENTER);
	}

	public void chooseItem() {
		chooseItem.click();
	}

}
