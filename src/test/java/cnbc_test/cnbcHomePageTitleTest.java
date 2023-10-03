package cnbc_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cnbcHomePageTitleTest {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void homePageTitleTest() throws InterruptedException {
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String homePageTitle = driver.getTitle();
        System.out.println("The CNBC HomePage Title is: " + homePageTitle);
        driver.close();
    }
}
