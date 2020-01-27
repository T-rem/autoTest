package findTransportDirection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public void open() {
        driver.get("https://rasp.yandex.ru/");
    }


    private By whereFromLocator = By.cssSelector("[placeholder=\"Откуда\"]");
    private By whereToLocator = By.cssSelector("[placeholder=\"Куда\"]");
    private By departureDateLocator = By.cssSelector("[placeholder=\"Когда\"]");
    private By searchButton = By.cssSelector("[class=\"Button SearchForm__submit\"]");
    private By successPage = By.cssSelector("[class=\"SearchTitle\"]");
    private By unsuccessPage = By.cssSelector("[class=\"ErrorPageSearchForm__title\"]");
    private By autobusButtonLocator = By.xpath("//*[@id=\"root\"]/div/div[2]/header/div[1]/div/div[4]/span/label[5]");

    public void whereFrom(String city) {
        driver.findElement(whereFromLocator).clear();
        driver.findElement(whereFromLocator).sendKeys(city);
    }

    public void whereTo(String city) {
        driver.findElement(whereToLocator).sendKeys(city);

    }

    public void departureDate(String date) {
        driver.findElement(departureDateLocator).clear();
        driver.findElement(departureDateLocator).sendKeys(date);
    }

    public void searchButtonClick() {
        driver.findElement(searchButton).click();
    }

    public void successfulSearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(successPage));
    }

    public boolean unsuccessfulSearch() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(unsuccessPage));
        return driver.findElement(unsuccessPage).getText().equals("Пункт отправления не найден. Проверьте правильность написания или выберите другой город.");
    }

    public void autobusButtonClick() {
        driver.findElement(autobusButtonLocator).click();
    }
}
