package com.travelers.tests;

import com.travelers.pages.HopePage;
import com.travelers.pages.ResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchHotelTest extends _BaseSeleniumTest {

    @Test
    public void setCityHotel() {
        driver.get("http://www.kurs-selenium.pl/demo/");
        HopePage hopePage = new HopePage(driver);
        hopePage.sendKeysToCityInput("Dubai")
                .setDateRange("01/05/2020", "08/05/2020")
                .openTravellersModal()
                .addChildPerson()
                .addChildPerson()
                .performSearchButton();

        ResultPage resultPage = new ResultPage(driver);

        List <String> hotelName = resultPage.getHotelNames();
        Assert.assertEquals("Jumeirah Beach Hotel", hotelName.get(0));
        Assert.assertEquals("Oasis Beach Tower", hotelName.get(1));
        Assert.assertEquals("Rose Rayhaan Rotana", hotelName.get(2));

        List<String> hotelPrice = resultPage.getHotelPrices();
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
