import com.travelers.tests._BaseSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClickTest extends _BaseSeleniumTest {

    @Test
    public void doubleClickTest() {
        _SeleniumHelper helper = new _SeleniumHelper(driver);
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\doubleclick.html");
        WebElement clickMeTwiceButton = driver.findElement(By.id("bottom"));
        Actions action = new Actions(driver);
        action.moveToElement(clickMeTwiceButton).doubleClick().build().perform();
        helper.takeScreenShot();
        Assert.assertTrue(driver.getWindowHandles().size()>1);

    }
}
