package cnbc_test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class cnbcVerifyProfileSaveChangesFunctionality {

    WebDriver driver = new FirefoxDriver();

    @Test
    public void verifyProfileSaveChangesFunctionality() throws InterruptedException {
        driver.get("https://www.cnbc.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[@class='SignInMenu-signInMenu']")).click();
        driver.findElement(By.name("email")).sendKeys("hasannibir54@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Cnbc@123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@form='sign-in']")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[@class='SignInMenu-dropdownArrow']")).click();
        driver.findElement(By.xpath("//a[@title='profile']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("firstname")).sendKeys("Mohammed");
        driver.findElement(By.id("lastname")).sendKeys("Imrul");
        driver.findElement(By.xpath("//button[@class='ProfileForm-saveChangeButton']")).click();
        Thread.sleep(4000);
        String successMessage = driver.findElement(By.xpath("//div[@class='ProfileForm-successMessage']")).getText();
        Assert.assertEquals(successMessage, "Your changes have been saved.");
        System.out.println("The success Message is: " + successMessage);
        driver.close();

    }
}
