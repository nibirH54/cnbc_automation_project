package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cnbcSearchFunctionalityTest {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void searchTest() throws InterruptedException {
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//span[normalize-space()='Search quotes, news & videos']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder='Search quotes, news, & videos']")).sendKeys("AMZN");
        driver.findElement(By.id("querySearchButton")).click();
        Thread.sleep(3000);
        String pageUrl = driver.getCurrentUrl();
        Assert.assertEquals(pageUrl, "https://www.cnbc.com/quotes/AMZN?qsearchterm=AMZN");
        driver.close();
    }
}
