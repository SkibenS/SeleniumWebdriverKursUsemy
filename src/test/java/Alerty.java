import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Alerty{

    @Test
    public void googleOpenTest() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");

        Alert alert = driver.switchTo().alert();    // obsługa alertów
        alert.accept();                             // obsługa alertów
        alert.dismiss();                            // obsługa alertów


    }
}