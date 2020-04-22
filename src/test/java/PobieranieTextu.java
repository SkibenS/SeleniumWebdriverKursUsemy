import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class PobieranieTextu{

    @Test
    public void pobieranieTextu() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");

        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Skibi");
        System.out.println("Wartość dla wprowadzonego inputa to :" + firstNameInput.getAttribute("value"));


        WebElement labelDoPobrania = driver.findElement(By.tagName("label"));
        System.out.println("Wartość dla labela to: " + labelDoPobrania.getText());


    }
}