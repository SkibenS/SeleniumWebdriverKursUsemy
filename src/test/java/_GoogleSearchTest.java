import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;


public class _GoogleSearchTest extends  _BaseSeleniumTest{

        @Test
        public void googleSearchTest() {
        _SeleniumHelper helper = new _SeleniumHelper(driver);           // Tworzymy obiekt typu helper
        driver.get("https://www.google.pl/");
        WebElement googleSearchbox = driver.findElement(By.name("q"));
        googleSearchbox.sendKeys("Selenium");
        helper.takeScreenShot();                                        // wywołujemy stworzenie screenshota
        googleSearchbox.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click();
        helper.takeScreenShot();                                        // wywołujemy stworzenie screenshota
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }
}