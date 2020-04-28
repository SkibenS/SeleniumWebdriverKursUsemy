import com.travelers.tests._BaseSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HoverTest extends _BaseSeleniumTest {

    @Test
    public void howerTest() {

        driver.get("https://www.w3schools.com/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.id("navbtn_tutorials"))).build().perform();
    }
}
