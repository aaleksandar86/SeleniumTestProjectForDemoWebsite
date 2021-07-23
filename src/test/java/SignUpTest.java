import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SignUpTest {
    private static final WebDriver driver = new ChromeDriver();
    private static final WebForm webForm = new WebForm(driver);

    @BeforeSuite(alwaysRun = true)
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(priority = 0)
    public static void navigateToHomePageAndEnterAuthenticatePage() {
        webForm.navigateToHomePage();
        webForm.clickSignInOnHomePage();
    }

    @Test(priority = 1)
    public static void enterEmailAddressOnAuthenticatePageForUserSignUp() {
        webForm.enterEmailToRegister();
        webForm.clickCreateAnAccountButton();
    }

    @Test(priority = 2)
    public static void testMrRadioButton() {
        webForm.selectMr();
    }

    @Test(priority = 3)
    public static void testMrsRadioButton() {
        webForm.selectMrs();
    }

    @Test(priority = 4)
    public static void enterFirstNameInSignUpForm() {
        webForm.enterFirstNameInSignUpForm();
    }

    @Test(priority = 5)
    public static void enterLastNameInSignUpForm() {
        webForm.enterLastNameInSignUpForm();
    }

    @Test(priority = 6)
    public static void enterPasswordInSIgnUpForm(){
        webForm.enterPasswordInSignUpForm();
    }

    @Test(priority = 7)
    public static void selectDayInForm(){
        webForm.selectDayInForm();
    }

    @Test(priority = 8)
    public static void selectMonthInForm(){
        webForm.selectMonthInForm();
    }

    @Test(priority = 9)
    public static void selectYearInForm(){
        webForm.selectYearInForm();
    }

    @Test(priority = 10)
    public static void checkNewsLetterBox(){
        webForm.checkNewsletterBox();
    }

    @Test(priority = 11)
    public static void enterFirstName(){
        webForm.enterFirstNameInSignUp();
    }

    @Test(priority = 11)
    public static void enterLastName(){
        webForm.enterLastNameInSignUp();
    }

    @Test(priority = 12)
    public static void enterCompanyName(){
        webForm.enterCompanyNameInSignUp();
    }

    @Test(priority = 13)
    public static void enterAddress(){
        webForm.enterAddressInSignUp();
    }

    @Test(priority = 14)
    public static void enterCityName(){
        webForm.enterCityInSignUp();
    }

    @Test(priority = 15)
    public static void selectState(){
        webForm.selectStateInForm();
    }

    @Test(priority = 16)
    public static void enterZipCode(){
        webForm.enterZipInSignUp();
    }

    @Test(priority = 17)
    public static void enterMobilePhone(){
        webForm.enterMobileInSignUp();
    }

    @Test(priority = 18)
    public static void clickSubmit(){
        webForm.clickSubmitBtn();
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}