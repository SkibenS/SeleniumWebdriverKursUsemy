import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CheckBoxyIRadioButtony{

    @Test
    public void checkBoxyIRadioButtony() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");

        WebElement checkbox = driver.findElement(By.xpath("/html/body/label[2]/input"));
        checkbox.click();
        checkbox.click();

        WebElement radioButton = driver.findElement(By.xpath("/html/body/form[1]/input[2]"));
        radioButton.click();

    }
}