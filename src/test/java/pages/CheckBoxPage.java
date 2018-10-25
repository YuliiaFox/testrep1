package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckBoxPage extends BasePage {
    public CheckBoxPage(WebDriver driver) {
        super(driver, "https://seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckBox;

    @FindBy(xpath = "//div[@id ='txtAge']")
    private WebElement ageText;

    public String clickSingleCheckBox() {
        singleCheckBox.click();
        return ageText.getText();
    }
}
