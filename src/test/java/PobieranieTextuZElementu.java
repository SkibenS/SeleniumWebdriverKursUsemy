import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;


public class PobieranieTextuZElementu{

    @Test
    public void pobieranieTextuZElementu() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");

        WebElement labelDoPobrania = driver.findElement(By.tagName("label"));
        System.out.println("Wartość dla labela to: " + labelDoPobrania.getText());


        List<WebElement> wszystkieLabelki = driver.findElements(By.tagName("label"));
        for (WebElement element: wszystkieLabelki) {
            System.out.println(element.getText());
        }


    }
}