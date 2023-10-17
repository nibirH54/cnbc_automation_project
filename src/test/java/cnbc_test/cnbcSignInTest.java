package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cnbcSignInTest {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void signInTest() throws InterruptedException {
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='SignInMenu-signInMenu']")).click();
        driver.findElement(By.name("email")).sendKeys("hasannibir54@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Cnbc@1234");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@form='sign-in']")).click();
        Thread.sleep(4000);
        String pageUrl = driver.getCurrentUrl();
        System.out.println("The current Page Url is: " + pageUrl);
        driver.close();
    }




}
