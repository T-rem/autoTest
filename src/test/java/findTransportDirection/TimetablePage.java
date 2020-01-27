package findTransportDirection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TimetablePage {
    private WebDriver driver;
    private List<WebElement> list;

    public TimetablePage(WebDriver driver) {
        this.driver = driver;
    }

    private By transportIconLocator = By.cssSelector("[class=\"TransportIcon__icon\"]");
    private By durationLocator = By.cssSelector("[class=\"SearchSegment__duration\"]");
    private By tittleLocator = By.cssSelector("[class=\"SegmentTitle__title\"]");

    public boolean transportIcon() {
        list = driver.findElements(transportIconLocator);
        return list.size() == 4;
    }

    public boolean duration() {
        list = driver.findElements(durationLocator);
        return list.size() == 4;
    }

    public boolean tittle() {
        list = driver.findElements(tittleLocator);
        return list.size() == 4;

    }
}
