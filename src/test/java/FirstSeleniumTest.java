import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FirstSeleniumTest {

    @Test
    public void googleOpenTest() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");

        WebElement checkbox = driver.findElement(By.xpath("/html/body/label[2]/input"));
        if (checkbox.isSelected()) {
            System.out.println("Checkbox jest zaznaczony");
            checkbox.click();
            System.out.println("Checkbox został odznaczony");
        } else {
            System.out.println("Checkbox nie jest zaznaczony");
        }
    }
}