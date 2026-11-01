package tests;

import pages.WebsitePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebsitePage;

public class LoginTest {

    @Test
    public void verifyLogin() throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://hap-testing.heliusapp.com/helius_testing_hapteam/login.html");

        WebsitePage login = new WebsitePage(driver);

        login.enterUsername("8316");
        login.enterPassword("Helius@123");
        login.clickLogin();

        String expectedResult = "HAP";
        String actualResult = driver.getTitle();

        Assert.assertEquals(actualResult, expectedResult);

        //Thread.sleep(5000);

        WebsitePage page = new WebsitePage(driver);

        page.acceptPopup();

        driver.quit();
    }
}