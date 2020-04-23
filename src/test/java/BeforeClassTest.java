import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BeforeClassTest{

    private WebDriver driver;

    @BeforeClass
    public void setUp (){
        System.out.println("Wykonuje się przed klasą");
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void beforeClassTest() {
        driver.get("https://www.google.pl/");
        WebElement googleSearchbox = driver.findElement(By.name("q"));
        googleSearchbox.sendKeys("Selenium");
        googleSearchbox.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div[1]/a/h3")).click();
        Assert.assertEquals(driver.getTitle(),"SeleniumHQ Browser Automation");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Wykonuje się po klasie");
        driver.quit();
    }
}