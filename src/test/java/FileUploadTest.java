import com.travelers.tests._BaseSeleniumTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends _BaseSeleniumTest {

    @Test
    public void aploadFileTest () {
        driver.get("file:///C:/Users/Admin/Desktop/Skibi/KursSeleniumWebDriver/PlikiPotrzebneDoKursu/fileUpload.html");
        String patch = new File("src/main/resources/test280962000.png").getAbsolutePath();
        driver.findElement(By.id("myFile")).sendKeys(patch);

    }
}
