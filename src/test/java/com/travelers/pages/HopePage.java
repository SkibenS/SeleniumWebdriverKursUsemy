package com.travelers.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HopePage {

    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
    private WebElement searchSpan;

    @FindBy(xpath = "//div[@id='select2-drop']//input")
    private WebElement searchCityInput;

    public HopePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void sendKeysToCityInput(String CityName) throws InterruptedException {
        searchSpan.click();
        searchCityInput.sendKeys(CityName);
        Thread.sleep(5000);
        searchCityInput.sendKeys(Keys.ENTER);
    }



}
