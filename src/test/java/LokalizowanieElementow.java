import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class LokalizowanieElementow {

    @Test
    public void lokazilowanieElementow(){
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");

        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        WebElement firstNameInout = driver.findElement(By.name("fname"));
        WebElement w3schoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));
        WebElement w3schoolLink2 = driver.findElement(By.partialLinkText("mWeirdLink"));
        WebElement topSecretParagraf = driver.findElement(By.className("topSecret"));

        WebElement fistInput = driver.findElement(By.tagName("label"));
        WebElement link = driver.findElement(By.tagName("a"));

        WebElement clickOnMeCssButton = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement linkCss = driver.findElement(By.cssSelector("a"));
        WebElement topSecretCss = driver.findElement(By.cssSelector("p"));
        WebElement topSecretCss2 = driver.findElement(By.cssSelector(".topSecret"));
        WebElement tabelkaCss = driver.findElement(By.cssSelector("td:first-child"));

        WebElement clickOnMeButtonXpatch = driver.findElement(By.xpath("/html/body/button"));
        WebElement clickOnMeButtonXpatch2 = driver.findElement(By.xpath("//button"));
        WebElement linksXpatch = driver.findElement(By.xpath("/html/body/a"));
        WebElement topSecretCssXpatch = driver.findElement(By.xpath("//p[@class='topSecret']"));
        WebElement topSecretCssXpatch2 = driver.findElement(By.xpath("//*[@class='topSecret']"));
        WebElement linktextxpatch = driver.findElement(By.xpath("//a[text()='Visit W3Schools.com!']"));

        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        System.out.println("Znalezio "  + linkElements.size() + " linki  !");
        if (linkElements.size() > 0) {
            System.out.println("Linki istanieją !");
        } else {
            System.out.println("Linki nie istanieją !");
        }
    }
}

