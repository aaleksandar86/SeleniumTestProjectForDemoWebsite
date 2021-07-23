import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{

    private final String EMAIL_TO_LOGIN = "a_aleksandar86@yahoo.com";
    private final String PASSWORD = "testtest";

    @FindBy(id = "email")
    private WebElement loginRegistered;

    @FindBy(id = "passwd")
    private WebElement pwRegistered;

    @FindBy(className = "blockbestsellers")
    private WebElement blockbestsellersCat;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmailAddressRegistered(){
        this.waitForElementToBeVisible(loginRegistered);
        this.loginRegistered.sendKeys(EMAIL_TO_LOGIN);
    }

    public void enterPWAddressRegistered(){
        this.waitForElementToBeVisible(pwRegistered);
        this.pwRegistered.sendKeys(PASSWORD);
    }

    public int countPopularItems(){
        List<WebElement> elementName = driver.findElements(By.cssSelector("#homefeatured .product-container"));
        return elementName.size();
    }

    public int countBestSellerItems(){
        List<WebElement> elementName = driver.findElements(By.cssSelector("#blockbestsellers .product-container"));
        return elementName.size();
    }

    public void enterBestSellersCat(){
        this.waitForElementToBeVisible(blockbestsellersCat);
        this.blockbestsellersCat.click();
    }

}
