import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;


public class _AnnotationsTest extends _BaseSeleniumTest {

        @FindBy(xpath = "//input")
        private List<WebElement> inputs;

        @FindBy(xpath = "//button")
        private  List<WebElement> buttons;

        @FindAll({
                @FindBy(xpath = "//input"),
                @FindBy(xpath = "//button")
        })
        private List<WebElement> inputsAndButtons;

        @Test
        public void googleSearchTest() {
        _SeleniumHelper helper = new _SeleniumHelper(driver);
        PageFactory.initElements(driver, this);
        driver.get("file:///C:/Users/Admin/Desktop/Skibi/KursSeleniumWebDriver/PlikiPotrzebneDoKursu/test.html");
        System.out.println("Inputs are: " + inputs.size());
        System.out.println("Buttons are: " + buttons.size());
        System.out.println("Inputs and buttons are: " +inputsAndButtons.size());
    }
}