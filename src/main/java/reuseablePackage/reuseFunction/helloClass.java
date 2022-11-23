
package reuseablePackage.reuseFunction;
import reuseablePackage.feature.AllActions;
import org.openqa.selenium.WebDriver;
public class helloClass{
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public helloClass(ThreadLocal<WebDriver> driver) {

		this.driver=driver;
	}
	AllActions actions = new AllActions();
String ddv;