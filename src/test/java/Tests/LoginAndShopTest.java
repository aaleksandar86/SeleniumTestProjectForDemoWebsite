package Tests;

import PageObjects.LoginPage;
import PageObjects.Utils;
import jdk.jshell.execution.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginAndShopTest {

    private static final WebDriver driver = new ChromeDriver();
    private static final LoginPage loginPage = new LoginPage(driver);

    @BeforeSuite(alwaysRun = true)
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(priority = 0)
    public static void navigateToHomePage() {
        loginPage.navigateToHomePage();
    }

    @Test(priority = 1)
    public static void clickOnSignInBtn() {
        loginPage.clickSignInOnHomePage();
    }

    @Test(priority = 2)
    public static void enterEmailToSignIn() {
        loginPage.enterEmailAddressRegistered();
    }

    @Test(priority = 3)
    public static void enterPWToSignIn() {
        loginPage.enterPWAddressRegistered();
    }

    @Test(priority = 4)
    public static void checkNumberOfItemsInPopularCategory() {
        loginPage.navigateToHomePage();
        int actual = loginPage.countPopularItems();
        Assert.assertEquals(actual,7);
    }

    @Test(priority = 5)
    public static void goToBestSellers() {
        loginPage.enterBestSellersCat();
    }

    @Test(priority = 6)
    public static void checkNumberOfItemsInBestSellersCategory() {
        int actual = loginPage.countBestSellerItems();
        Assert.assertEquals(actual,7);
    }


    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
