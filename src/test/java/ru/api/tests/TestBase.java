package ru.api.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import ru.api.appManager.ApiPage;
import java.util.concurrent.TimeUnit;

public class TestBase  {
    static WebDriver wd;
    public  ApiPage apiPage=new ApiPage();

    public void click(By object) {
        WebElement elem = new WebDriverWait(wd, 4).until(ExpectedConditions.elementToBeClickable(object));
        elem.click();
    }

    public  void setValue(By field, String value) {

        WebElement elem = new WebDriverWait(wd, 4).until(ExpectedConditions.elementToBeClickable(field));
        elem.clear();
        elem.sendKeys(value);
    }
    public  void checkCurrentURL(String expectedURL) {
        String url =wd.getCurrentUrl();
        Assert.assertEquals(url, expectedURL);
    }

    public  String getText(By object) {
        WebElement elem = new WebDriverWait(wd, 4).until(ExpectedConditions.visibilityOfElementLocated(object));
        return elem.getText();
    }

    @BeforeTest
    public void init() {

        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        wd.get("https://api.encoding.com");
    }

    @AfterTest
    public void closing()
    {
        wd.quit();
    }

}
