import org.openqa.selenium.WebDriver;

public abstract class BaseManager {
 protected WebDriver driver;
 
 public BaseManager(WebDriver driver){
	 this.driver = driver;
 }
 
 public void navigateTo(String url) {
	 driver.get(url);
 }
	
}
