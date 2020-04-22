import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class KlikanieNaElementy{

    @Test
    public void googleOpenTest() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");

        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();

    }
}