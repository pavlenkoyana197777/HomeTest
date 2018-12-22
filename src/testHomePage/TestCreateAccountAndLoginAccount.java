package testHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCreateAccountAndLoginAccount extends baseTest {
@Test
    public void  CreateNewAccountHome() throws InterruptedException {
    waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]" ),20);


        WebElement createAccount = driver.findElement( By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement( By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("yanina318@gmail.com");


        WebElement passwordField = driver.findElement( By.xpath("//input[@formcontrolname='password']"));
    Assert.assertTrue(passwordField.getAttribute ("formcontrolname")
            .equals("password"));

            passwordField.click();
        passwordField.sendKeys("123456");

        WebElement repPasswordField = driver.findElement( By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
    waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]"),20);

        repPasswordField.sendKeys("123456");

        WebElement registrationButton = driver.findElement( By.xpath("//span[contains(text(),'Registration')]"));//span[contains(text(),'Registration')]
    Assert.assertTrue(registrationButton.getText()
            .equals("Registration"));
        registrationButton.click();
    waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]"),20);

        WebElement cancelButton = driver
                .findElement( By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        cancelButton.click();
    waitUntilElementIsLoaded(driver,By.xpath ( "//mat-icon[@mattooltip='Menu']"),20);

        WebElement menuButton = driver.findElement( By.xpath("//mat-icon[@mattooltip='Menu']"));
        menuButton.click();

        WebElement logOutMenu = driver.findElement( By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
    waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Login')]"),20);





    }
    @Test
    public void CreateNewAccountAndLogInHome() {

        waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Create Account')]"),20);
        WebElement createAccount = driver.findElement( By.xpath("//span[contains(text(),'Create Account')]"));
        createAccount.click();

        WebElement mailField = driver.findElement( By.xpath("//input[@formcontrolname='email']"));
        mailField.click();
        mailField.sendKeys("yana252@gmail.com");


        WebElement passwordField = driver.findElement( By.xpath("//input[@formcontrolname='password']"));
        passwordField.click();
        passwordField.sendKeys("123456");

        WebElement repPasswordField = driver.findElement( By.xpath("//input[@formcontrolname='passwordRep']"));
        repPasswordField.click();
        repPasswordField.sendKeys("123456");

        WebElement registrationButton = driver.findElement( By.xpath("//span[contains(text(),'Registration')]"));
        registrationButton.click();
        waitUntilElementIsLoaded(driver,By.xpath ( "//button[@type='button']//span[contains(text(),'Cancel')]/.."),20);

        WebElement cancelButton = driver
                .findElement( By.xpath("//button[@type='button']//span[contains(text(),'Cancel')]/.."));

        cancelButton.click();
        waitUntilElementIsLoaded(driver,By.xpath ( "//mat-icon[@mattooltip='Menu']"),20);
        WebElement menuButton = driver.findElement( By.xpath("//mat-icon[@mattooltip='Menu']"));

        menuButton.click();
        //waitUntilElementIsLoaded(driver,By.xpath ( "//span[@class='marginLeft']"),20);
        WebElement logOutMenu = driver.findElement( By.xpath("//span[@class='marginLeft']"));
        logOutMenu.click();
        waitUntilElementIsLoaded(driver,By.xpath ( "//span[contains(text(),'Login')]"),20);

        //----------Login created user----------

        WebElement login = driver.findElement( By.xpath("//span[contains(text(),'Login')]"));
        login.click();

        WebElement emailReg = driver.findElement( By.xpath("//input[@formcontrolname='email']"));
        emailReg.click();
        emailReg.sendKeys("mishUser13@gmail.com");
        waitUntilElementIsLoaded(driver,By.xpath ( "//input[@formcontrolname='password']"),20);

        WebElement passReg =  driver.findElement( By.xpath("//input[@formcontrolname='password']"));
        passReg.click();
        passReg.sendKeys("example");

        WebElement log_In = driver.findElement( By.xpath("//span[contains(text(),'Log in')]"));
        log_In.click();
        waitUntilElementIsLoaded(driver,By.xpath ( "//h1[@class='classCentr']"),20);
        WebElement registration =  driver.findElement( By.xpath("//h1[@class='classCentr']"));
        Assert.assertTrue (registration.getText ().equals ( "Registration" )  );
        WebElement changeAvatar  =driver.findElement ( By.xpath ( "//h5[contains(text(),'Change avatar')] ") ) ;
        Assert.assertTrue ( changeAvatar.getText ().equals (  "Change avatar") );
    }
}




