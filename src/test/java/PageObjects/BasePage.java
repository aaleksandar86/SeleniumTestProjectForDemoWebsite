package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

public class BasePage {
        protected WebDriver driver;

        @FindBy(className = "login")
        private WebElement signInHomePageBtn;

        public void navigateToHomePage() {
            driver.get(Utils.BASE_URL);
            driver.manage().window().maximize();
        }

        public void clickSignInOnHomePage() {
            this.signInHomePageBtn.click();
        }

        public BasePage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }

        public void waitForElementToBeVisible(WebElement we){
            // explicit wait - to wait for the compose button to be click-able
            WebDriverWait wait = new WebDriverWait(driver,30);
            wait.until(ExpectedConditions.visibilityOf(we));
        }

        public void scrollElementIntoView(WebElement we){
            //This will scroll the page till the element is found
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", we);
        }
    }

