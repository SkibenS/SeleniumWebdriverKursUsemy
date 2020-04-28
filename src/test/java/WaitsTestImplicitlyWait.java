import com.travelers.tests._BaseSeleniumTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitsTestImplicitlyWait extends _BaseSeleniumTest {

    @Test
    public void waitsTestImplicitlyWait() {

        driver.manage().timeouts().implicitlyWait(20L, TimeUnit.SECONDS);

        driver.get("file:///C:/Users/Admin/Desktop/Skibi/KursSeleniumWebDriver/PlikiPotrzebneDoKursu/Waits2.html");
        driver.findElement(By.id("clickOnMe")).click();

        WebElement paragraph = driver.findElement(By.tagName("p"));
        WebElement textPowitalny = driver.findElement(By.tagName("h1"));

        System.out.println(paragraph.getText());
        System.out.println(textPowitalny.getText());

        Assert.assertEquals(paragraph.getText(), "Dopiero się pojawiłem!");
        Assert.assertEquals(textPowitalny.getText(),"Witaj na stronie testowej");

    }
}
