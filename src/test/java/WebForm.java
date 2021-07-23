import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class WebForm extends BasePage{

    private final String EMAIL_TO_REGISTER = "example@example1222.comm";

    private final String FIRST_NAME = "First Name";
    private final String LAST_NAME = "Last Name";
    private final String PASS = "testpass";
    private final String COMPANY = "companyname";
    private final String ADDRESS = "Lake Shore Drive 123";
    private final String ZIP = "99657";
    private final String MOBILE_PHONE = "446535455";
    private final String CITY = "Tampa";

    @FindBy(id = "email_create")
    private WebElement registerEmailAddressInput;

    @FindBy(id = "SubmitCreate")
    private WebElement createAnAccountBtn;

    @FindBy(id = "id_gender1")
    private WebElement genderRadioBtnM;

    @FindBy(id = "id_gender2")
    private WebElement genderRadioBtnF;

    @FindBy(id = "customer_firstname")
    private WebElement firstNameFormInput;

    @FindBy(id = "customer_lastname")
    private WebElement lastNameFormInput;

    @FindBy(id = "passwd")
    private WebElement passwordFormInput;

    @FindBy(id = "days")
    private WebElement daysDropDown;

    @FindBy(id = "months")
    private WebElement monthsDropDown;

    @FindBy(id = "years")
    private WebElement yearsDropDown;

    @FindBy(id = "uniform-newsletter")
    private WebElement newsletterCheckBox;

    @FindBy(id = "firstname")
    private WebElement firstNameInput;

    @FindBy(id = "firstname")
    private WebElement lastNameInput;

    @FindBy(id = "company")
    private WebElement companyNameInput;

    @FindBy(id = "address1")
    private WebElement address1Input;

    @FindBy(id = "city")
    private WebElement cityInput;

    @FindBy(id = "id_state")
    private WebElement idStateDropdown;

    @FindBy(id = "postcode")
    private WebElement zipCodeInput;

    @FindBy(id = "phone_mobile")
    private WebElement mobilePhoneInput;

    @FindBy(id = "submitAccount")
    private WebElement submitBtn;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterEmailToRegister(){
        this.waitForElementToBeVisible(registerEmailAddressInput);
        this.registerEmailAddressInput.sendKeys(EMAIL_TO_REGISTER);
    }

    public void clickCreateAnAccountButton(){
        this.waitForElementToBeVisible(createAnAccountBtn);
        this.createAnAccountBtn.click();
    }

    public void selectMr(){
        this.waitForElementToBeVisible(genderRadioBtnM);
        this.genderRadioBtnM.click();
    }

    public void selectMrs(){
        this.waitForElementToBeVisible(genderRadioBtnF);
        this.genderRadioBtnF.click();
    }

    public void enterFirstNameInSignUpForm(){
        this.waitForElementToBeVisible(firstNameFormInput);
        this.firstNameFormInput.sendKeys(FIRST_NAME);
    }

    public void enterLastNameInSignUpForm(){
        this.waitForElementToBeVisible(lastNameFormInput);
        this.lastNameFormInput.sendKeys(LAST_NAME);
    }

    public void enterPasswordInSignUpForm(){
        this.waitForElementToBeVisible(passwordFormInput);
        this.passwordFormInput.sendKeys(PASS);
    }

    public void selectDayInForm(){
        this.scrollElementIntoView(monthsDropDown);
        Select days = new Select(daysDropDown);
        days.selectByValue("2");
    }

    public void selectMonthInForm(){
        Select months = new Select(monthsDropDown);
        months.selectByValue("5");
    }

    public void selectYearInForm(){
        Select years = new Select(yearsDropDown);
        years.selectByValue("1990");
    }

    public void checkNewsletterBox(){
        this.waitForElementToBeVisible(newsletterCheckBox);
        this.newsletterCheckBox.click();
    }

    public void enterFirstNameInSignUp(){
        this.waitForElementToBeVisible(firstNameInput);
        this.firstNameInput.sendKeys(FIRST_NAME);
    }
    public void enterLastNameInSignUp(){
        this.waitForElementToBeVisible(lastNameInput);
        this.lastNameInput.sendKeys(LAST_NAME);
    }

    public void enterCompanyNameInSignUp(){
        this.waitForElementToBeVisible(companyNameInput);
        this.companyNameInput.sendKeys(COMPANY);
    }

    public void enterAddressInSignUp(){
        this.waitForElementToBeVisible(address1Input);
        this.address1Input.sendKeys(ADDRESS);
    }

    public void enterCityInSignUp(){
        this.waitForElementToBeVisible(cityInput);
        this.cityInput.sendKeys(CITY);
    }

    public void selectStateInForm(){
        Select state = new Select(idStateDropdown);
        state.selectByValue("5");
    }

    public void enterZipInSignUp(){
        this.waitForElementToBeVisible(zipCodeInput);
        this.zipCodeInput.sendKeys(ZIP);
    }

    public void enterMobileInSignUp(){
        this.waitForElementToBeVisible(mobilePhoneInput);
        this.mobilePhoneInput.sendKeys(MOBILE_PHONE);
    }

    public void clickSubmitBtn(){
        this.waitForElementToBeVisible(submitBtn);
        this.submitBtn.click();
    }
}