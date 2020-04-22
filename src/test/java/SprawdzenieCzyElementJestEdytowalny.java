import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;


public class SprawdzenieCzyElementJestEdytowalny{

    @Test
    public void sprawdzenieCzyElementJestEdytowalny() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");

        WebElement firsNameInput = driver.findElement(By.name("fname"));
        if (firsNameInput.isEnabled()){
            System.out.println("Element jest zablokowany");
        } else {
            System.out.println("Element nie jest zablokonway");
        }


    }
}