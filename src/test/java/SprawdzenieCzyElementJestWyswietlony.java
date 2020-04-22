import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SprawdzenieCzyElementJestWyswietlony{

    @Test
    public void sprawdzenieCzyElementJestWyswietlony() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");

        WebElement topSecretElement = driver.findElement(By.className("topSecret"));
        if (topSecretElement.isDisplayed()) {
            System.out.println("Element jest widoczny");
            System.out.println(topSecretElement.getText());
        } else {
            System.out.println("Element nie jest wyświetlony");
            System.out.println(topSecretElement.getAttribute("textContent"));
        }


    }
}