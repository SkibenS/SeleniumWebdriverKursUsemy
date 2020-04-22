import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;


public class PowrotDoPoprzedniegoOkna{

    @Test
    public void powrotDoPoprzedniegoOkna() {
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\Admin\\Desktop\\Skibi\\KursSeleniumWebDriver\\PlikiPotrzebneDoKursu\\test.html");

        WebElement newPageButton = driver.findElement(By.id("newPage"));
        String currentWindowName = driver.getWindowHandle();
        newPageButton.click();
        switchToNewWindow(driver,currentWindowName);
        System.out.println("Tytuł strony to :" + driver.getTitle());
        System.out.println("To jest nas obecny URL: " + driver.getCurrentUrl());
        driver.switchTo().window(currentWindowName);
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("Skibi");
    }

    private void switchToNewWindow(WebDriver driver, String currentWindowName) {
        System.out.println("Wartość dla obecnego okna to :" + currentWindowName);
        Set<String> windows  = driver.getWindowHandles();
        System.out.println("Ilość okien przeglądarki :" + windows.size());
        for (String window : windows) {
            if (!window.equals(currentWindowName)) {
                driver.switchTo().window(window);
            }
        }
    }

}