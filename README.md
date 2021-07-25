# SeleniumTestProjectForDemoWebsite

**Selenium project with Java Maven and TestNG**

Automated tests are needed for functional system end-to-end tests for the testing website http://automationpractice.com/index.php .

For the purpose of the task, a Selenium Java Maven project will be used to automate the tests. All steps will e run on maximum window resolution and Chrome and Firefox will be used for running the tests in visible and also in headless mode.

For running the tests on Chrome, a chromedriver.exe is needed. The driver version corresponds with the Chrome browser version. For example a Chrome Version 92.0.4515.107 (Official Build) (64-bit) would require a ChromeDriver 92.0.4515.43, as stated in https://sites.google.com/chromium.org/driver/downloads where you can find the suitable chromedriver. Choose the appropriate driver for you Operating system, for example, if you use Windows choose chromedriver_win32.zip

This project implements the Project Object Model

## Run tests

To run the tests right click on Tests.SignUpTest or Tests.LoginAndShopTest

## Improvements needed

- Incorporate geckodriver for Firefox
-  Implement driver auto update
- Implement user order test  for 2+ products and checkout
- Separate test files from page object files
- Put test files references in test suite in xml file
- Make the tests able to run via terminal commands
- Implement headless test running mode
