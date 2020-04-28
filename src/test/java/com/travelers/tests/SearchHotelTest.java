package com.travelers.tests;

import com.travelers.pages.HopePage;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchHotelTest extends _BaseSeleniumTest{

    @Test
    public void searchHotelTest () throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");
        HopePage hopePage = new HopePage(driver);
        hopePage.sendKeysToCityInput("Dubai");

    }
}
