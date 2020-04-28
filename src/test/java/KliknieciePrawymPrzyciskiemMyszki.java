import com.travelers.tests._BaseSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.*;


public class KliknieciePrawymPrzyciskiemMyszki extends _BaseSeleniumTest {

    @Test
    public void kliknieciePrawymPrzyciskiemMyszki() {
        driver.get("https://www.google.pl/");
        WebElement googleSearchbox = driver.findElement(By.name("q"));
        googleSearchbox.sendKeys("Selenium");
        // Kliknięcie prawym przycoskiem myszy

        Actions action = new Actions(driver);
        action.contextClick().build().perform();

        googleSearchbox.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click();
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }
}