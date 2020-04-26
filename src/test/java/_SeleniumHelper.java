import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class _SeleniumHelper {

    private WebDriver driver;

    public _SeleniumHelper(WebDriver newDriver) {
        this.driver = newDriver;
    }

    public void takeScreenShot () {
        try {
            TakesScreenshot screenshooter = (TakesScreenshot) driver;
            File screenShot = screenshooter.getScreenshotAs(OutputType.FILE);
            Files.copy(screenShot.toPath(), Paths.get("src/main/resources/test.png"));
        } catch (IOException e) {
            System.out.println("Nie znaleziono pliku");
        }
    }
}
