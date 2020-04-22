import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class SprawdzenieCzyElementIstnieje {

    @Test
    public void sprawdzenieCzyElementIstnieje() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");


        checkIfElementExist(driver, By.tagName("a"));
        checkIfElementExist(driver, By.tagName("aaaa"));
    }
     public void checkIfElementExist(WebDriver driver,By locator){
        try {
            driver.findElement(locator);
            System.out.println("Element istnieje na stronie");

        }catch (NoSuchElementException exp) {
            System.out.println("Element nie istanieje !");
        }
     }
}