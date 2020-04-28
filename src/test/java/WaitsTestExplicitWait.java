import com.travelers.tests._BaseSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitsTestExplicitWait extends _BaseSeleniumTest {

    @Test
    public void waitsTestExplicitWait() {

        driver.get("file:///C:/Users/Admin/Desktop/Skibi/KursSeleniumWebDriver/PlikiPotrzebneDoKursu/Waits.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForWebElement(By.tagName("p"));
        WebElement paragraph = driver.findElement(By.tagName("p"));
        System.out.println(paragraph.getText());
        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
    }

    public void waitForWebElement (By locator) {

        Wait<WebDriver> wait = new WebDriverWait(driver, 10L);
        //  wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
}
