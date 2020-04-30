package com.travelers.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class _BaseSeleniumTest {

    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("Before Test");
        String driverpatch = "C:\\Users\\Admin\\IdeaProjects\\SeleniumWebdriverKursUsemy\\src\\main\\resources\\executables\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpatch);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown() {
        System.out.println("After Test");
        driver.quit();
    }
}