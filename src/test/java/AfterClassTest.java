import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;


public class AfterClassTest{

    private WebDriver driver;

    @Test
    public void afterClassTest() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        driver = new ChromeDriver();
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
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        Assert.assertEquals(driver.getTitle(), "Zła nazwa", "Tytuły nie są równe");

    }

    @AfterClass
    public void tearDown() {
        System.out.println("Wykonuje się po klasie");
        driver.quit();
    }
}