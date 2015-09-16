/**
 * Created by yanamikhaylenko on 9/15/15.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class JavaSample {

    public static final String USERNAME = "USERNAME";
    public static final String AUTOMATE_KEY = "ACCESS_KEY";

    public static final String URL = "http://" + System.getProperty("selenium.hub.ip") + ":4444/wd/hub";


    public static void main(String[] args) throws Exception {

        System.out.println(System.getProperty("selenium.hub.ip"));
        DesiredCapabilities caps = new DesiredCapabilities("firefox", "", Platform.ANY);
        //caps.setCapability();
        //caps.setCapability("browserName", "firefox");
        //caps.setCapability("browser_version", "40.0");
        //caps.setCapability("os", "OS X");
        //caps.setCapability("os_version", "Yosemite");
        //caps.setCapability("resolution", "1024x768");
        //caps.setCapability("browserstack.debug", "true");

        WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
        driver.get("http://www.google.com/ncr");
        WebElement element = driver.findElement(By.name("q"));

        element.sendKeys("BrowserStack");
        element.submit();

        System.out.println(driver.getTitle());
        driver.quit();

    }
}