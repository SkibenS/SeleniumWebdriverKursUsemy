import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;


public class _GoogleSearchTest extends _BaseSeleniumTest {

        @FindBy(name = "q")
        private WebElement searchInput;

        @Test
        public void googleSearchTest() {
        _SeleniumHelper helper = new _SeleniumHelper(driver);
        PageFactory.initElements(driver, this);
        driver.get("https://www.google.pl/");
        searchInput.sendKeys("Selenium");
        searchInput.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click();
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }
}