package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class cnbcSignOutTest {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void signOutTest() throws InterruptedException {
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='SignInMenu-signInMenu']")).click();
        driver.findElement(By.name("email")).sendKeys("hasannibir54@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Cnbc@123");
        Thread.sleep(3000);
        driver.findElement(By.name("signin")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[@class='SignInMenu-dropdownArrow']")).click();
        driver.findElement(By.xpath("//li[@data-text='Sign Out']")).click();
        String pageTitle = driver.getTitle();
        System.out.println("The title of the page is: "  + pageTitle);
        driver.close();



    }
}
