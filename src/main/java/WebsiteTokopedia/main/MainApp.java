package WebsiteTokopedia.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import WebsiteTokopedia.drivers.DriverSingleton;
import WebsiteTokopedia.pages.LoginPage;
import WebsiteTokopedia.pages.SearchPage;

public class MainApp {

	public static void main(String[] args) {
		
		LoginPage loginPage = new LoginPage();
		SearchPage searchPage = new SearchPage();
		
		DriverSingleton.getInstance("Chrome");
		WebDriver driver = DriverSingleton.getDriver();
		String url = "https://www.tokopedia.com";
		driver.get(url);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		/* LOGIN TOKOPEDIA */
		loginPage.Masuk();
		delay(3);
		loginPage.inputEmail("jihandesy12@gmail.com");
		delay(3);
		loginPage.inputPassword("desyjihan12");
		delay(3);

		
		/* SEARCH ITEM */
		searchPage.Search();
		delay(3);
		searchPage.searchItem("Flatshoes");
		delay(3);
		
		
		/* CHOOSE ITEM */
		searchPage.chooseItem();
		delay(3);
		
		delay(3);
		driver.quit();
	}
		
	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

	static void scroll(int vertikal, JavascriptExecutor driver) {
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+vertikal+")");
}
}
