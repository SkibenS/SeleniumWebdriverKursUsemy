import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;


public class _GoogleSearchTest extends  _BaseSeleniumTest{

        @Test
        public void googleSearchTest() {
        driver.get("https://www.google.pl/");
        WebElement googleSearchbox = driver.findElement(By.name("q"));
        googleSearchbox.sendKeys("Selenium");
        googleSearchbox.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click();
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }
}