import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;


public class _AnnotationsTest extends _BaseSeleniumTest {

        @FindBys({
                @FindBy (tagName = "table" ),
                @FindBy (className = "tableHeader")

        })
        private List<WebElement> elements;

        @Test
        public void googleSearchTest() {
        _SeleniumHelper helper = new _SeleniumHelper(driver);
        PageFactory.initElements(driver, this);
        driver.get("file:///C:/Users/Admin/Desktop/Skibi/KursSeleniumWebDriver/PlikiPotrzebneDoKursu/test.html");
        System.out.println("Element size is : " + elements.size());
    }
}