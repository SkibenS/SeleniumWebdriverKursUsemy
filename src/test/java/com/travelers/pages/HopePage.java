package com.travelers.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.nio.file.WatchEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HopePage {

    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
    private WebElement searchSpan;

    @FindBy(xpath = "//div[@id='select2-drop']//input") //table[@class='class="bgwhite table table-striped']
    private WebElement searchCityInput;

    @FindBy(name = "checkin")
    private WebElement checkInInput;

    @FindBy(name = "checkout")
    private WebElement checkOutInput;

    @FindBy(id = "travellersInput")
    private WebElement travellersInput;

    @FindBy(id = "adultPlusBtn")
    private WebElement adultPlusButton;

    @FindBy(id = "childPlusBtn")
    private WebElement childPlusButton;

    @FindBy(xpath = "//button[text()=' Search']")
    private WebElement performSearchButton;

    @FindBy(xpath = "//table[@class='bgwhite table table-striped']")
    private WebElement resultsTable;

    public HopePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToCityInput(String CityName) throws InterruptedException {
        searchSpan.click();
        searchCityInput.sendKeys(CityName);
        Thread.sleep(5000);
        searchCityInput.sendKeys(Keys.ENTER);
    }

    public void setDateRange (String checkInDate, String checkOutDate) {
        checkInInput.sendKeys(checkInDate);
        checkOutInput.sendKeys(checkOutDate);
        checkOutInput.click();
    }

    public void openTravellersInput () throws InterruptedException {
        Thread.sleep(2000);
        travellersInput.click();
    }

    public void addAdultPerson() {
        adultPlusButton.click();
    }

    public void addChildPerson() {
        childPlusButton.click();
    }

    public void performSearchButton() {
        performSearchButton.click();
    }

    public List<String> getHotelNames() throws InterruptedException {
        List<String> hotelNames = new ArrayList<>();
        Thread.sleep(3000);
        List<WebElement> hotelNamesWebElements = resultsTable.findElements(By.xpath("//h4//b"));
        for (WebElement hotelNameElement : hotelNamesWebElements) {
            System.out.println(hotelNameElement.getText());
            hotelNames.add((hotelNameElement.getText()));
        }
        return hotelNames;
    }

    public List<String> getHotelPrices() throws InterruptedException {
        List<String> hotelPrices = new ArrayList<>();
        Thread.sleep(3000);
        List<WebElement> hotelPricesWebElements = resultsTable.findElements(By.xpath("//div[contains(@class,'price_tab')]//b"));
        for (WebElement hotelPriceElement: hotelPricesWebElements) {
            System.out.println(hotelPriceElement.getText());
            hotelPrices.add(hotelPriceElement.getText());
        }
        return hotelPrices;
    }

/*  public List<String> getHotelPrices() {
        List<WebElement> hotelPrices = resultsTable.findElements(By.xpath("//div[contains(@class,'price_tab')]//b"));
        List <String> prices = hotelPrices.stream().map(element -> element.getText()).collect(Collectors.toList());
        return prices;
    } */
}
