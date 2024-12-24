import org.openqa.selenium.WebDriver;

public class ChromePage extends BaseManager {

	public ChromePage(WebDriver driver) {
		super(driver);
	}
	public void navigateTo(String url) {
		driver.get(url);
	}
}
