package com.travelers.pages;

import com.travelers.helpers.SeleniumHelper;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


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


    @FindBy(xpath = "//div[@class='select2-result-label']")
    private WebElement selectResult;

    private SeleniumHelper helper;

    private WebDriver driver;

    public HopePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.helper = new SeleniumHelper(driver);
        this.driver = driver;
    }

    public HopePage sendKeysToCityInput(String CityName) {
        searchSpan.click();
        searchCityInput.sendKeys(CityName);
        /*By locationLabel = By.xpath("//div[@class='select2-result-label']");
        helper.waitForElementToBeDisplaced(locationLabel);*/
        helper.waitForElementToBeDisplaced(selectResult);       // Lokalizowanie elemetu za pomocą WebElementu
        searchCityInput.sendKeys(Keys.ENTER);
        return this;
    }

    public HopePage setDateRange (String checkInDate, String checkOutDate) {
        checkInInput.sendKeys(checkInDate);
        checkOutInput.sendKeys(checkOutDate);
        checkOutInput.click();
        return this;
    }

    public HopePage openTravellersModal() {
        travellersInput.click();
        return this;
    }

    public HopePage addAdultPerson() {
        adultPlusButton.click();
        return this;
    }

    public HopePage addChildPerson() {
        helper.waitForElementToBeDisplaced(childPlusButton);
        childPlusButton.click();
        return this;
    }

    public void performSearchButton() {
        performSearchButton.click();
    }
}
