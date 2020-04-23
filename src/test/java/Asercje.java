import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Asercje{

    @Test
    public void asercje() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.pl/");

        WebElement googleSearchbox = driver.findElement(By.name("q"));
        googleSearchbox.sendKeys("Selenium");
        googleSearchbox.sendKeys(Keys.ENTER);

        WebElement seleniumPageLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3"));
        seleniumPageLink.click();

        String expectedTitle = "SeleniumHQ Browser Automation";
        System.out.println(driver.getTitle());
        Assert.assertEquals(expectedTitle,driver.getTitle());
        Assert.assertNotEquals("Test1","Test2");
        Assert.assertTrue(expectedTitle.equals(driver.getTitle()));

        driver.quit();
    }
}