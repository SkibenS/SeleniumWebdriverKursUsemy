package com.travelers.tests;

import com.travelers.pages.HopePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SearchHotelTest extends _BaseSeleniumTest{

    @Test
    public void setCityHotel() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");
        HopePage hopePage = new HopePage(driver);
        hopePage.sendKeysToCityInput("Dubai");
        hopePage.setDateRange("01/05/2020", "08/05/2020");
        hopePage.openTravellersInput();
        hopePage.addAdultPerson();
        hopePage.addChildPerson();
        hopePage.performSearchButton();

        List <String> hotelName = hopePage.getHotelNames();
        Assert.assertEquals("Jumeirah Beach Hotel", hotelName.get(0));
        Assert.assertEquals("Oasis Beach Tower", hotelName.get(1));
        Assert.assertEquals("Rose Rayhaan Rotana", hotelName.get(2));

        List<String> hotelPrice = hopePage.getHotelPrices();
        Assert.assertEquals("$22", hotelPrice.get(0));
        Assert.assertEquals("$50", hotelPrice.get(1));
        Assert.assertEquals("$80", hotelPrice.get(2));
        /*
        List<String> prices = hopePage.getHotelPrices();
        Assert.assertEquals("$22", prices.get(0));
        Assert.assertEquals("$50", prices.get(1));
        Assert.assertEquals("$80", prices.get(2));
         */

    }
}
