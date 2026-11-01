package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebsitePage {

    WebDriver driver;

    By username = By.xpath("//*[@id=\"username\"]");
    By password = By.xpath("//*[@id=\"password\"]");
    By loginButton = By.xpath("//*[@class=\"usersubmit\"]");

    public WebsitePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String user) {
        driver.findElement(username).sendKeys(user);
    }

    public void enterPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();

    }

    public void acceptPopup() {
        By okButton = By.xpath("//button[normalize-space()='OK']");

        WebDriverWait wait =
                new WebDriverWait(driver, Duration.ofSeconds(15));

        wait.until(ExpectedConditions.elementToBeClickable(okButton)).click();
    }
    }