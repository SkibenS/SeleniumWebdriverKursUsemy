import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WaitsTest extends _BaseSeleniumTest {

    @Test
    public void waitsTest() throws InterruptedException {

        driver.get("file:///C:/Users/Admin/Desktop/Skibi/KursSeleniumWebDriver/PlikiPotrzebneDoKursu/Waits.html");
        driver.findElement(By.id("clickOnMe")).click();
        Thread.sleep(5000);                 // nie jest metodą dynamiczną
        WebElement paragraph = driver.findElement(By.tagName("p"));
        WebElement textPowitalny = driver.findElement(By.tagName("h1"));

        System.out.println(paragraph.getText());
        System.out.println(textPowitalny.getText());

        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
        Assert.assertEquals(textPowitalny.getText(),"Witaj na stronie testowej");

    }
}
