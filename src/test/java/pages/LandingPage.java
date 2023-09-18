package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class LandingPage {

    @FindBy(xpath = "//img[@height='92']")
    private WebElement googleImage;

    public void validation(String titleName){
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(titleName.contains(actualTitle));
    }

}
