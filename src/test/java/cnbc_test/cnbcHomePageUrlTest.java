package cnbc_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cnbcHomePageUrlTest {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void homePageUrlTest() throws InterruptedException {
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String homePageUrl = driver.getCurrentUrl();
        System.out.println("The CNBC HomePage URL is: " + homePageUrl);
        driver.close();
    }
}
