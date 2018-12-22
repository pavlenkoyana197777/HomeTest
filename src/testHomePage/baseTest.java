package testHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

//класс который родитель методов//сборник методов//

public class baseTest {
    public WebDriver driver= new ChromeDriver () ;

    @BeforeMethod//@BeforeSuite
    //запускает этот метод перед каждым тестом в основном классе

    public void initWebDriver(){
        driver.get("https://mish.sheygam.com/#/wellcome");
        driver.manage().window().maximize();
    }
    @AfterSuite//после всех тестов выполняется этот методб=указывает на место где запускать//
    public void  tearDown(){
        driver.quit ();
    }

    public void waitUntilElementIsLoaded(WebDriver driver, By Locator, int time) {
        try {
            //определяет прогрузился ли элемент нужного локатора, замена задержкию максимальное время параметр тайм
            //(можно завязаться по локатору в случае списка элементов в локатореюпросто по локаторую после кликаю когда исчезнет
            new WebDriverWait ( driver, time ).until ( ExpectedConditions.presenceOfElementLocated ( Locator ) );

        } catch (Exception e) {
            e.printStackTrace ();
        }
    }}