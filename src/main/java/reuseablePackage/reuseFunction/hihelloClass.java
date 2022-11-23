
package reuseablePackage.reuseFunction;
import reuseablePackage.feature.AllActions;
import org.openqa.selenium.WebDriver;
public class hihelloClass{
	
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public hihelloClass(ThreadLocal<WebDriver> driver) {

		this.driver=driver;
	}
	AllActions actions = new AllActions();