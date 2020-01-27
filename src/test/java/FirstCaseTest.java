import findTransportDirection.HomePage;
import findTransportDirection.TimetablePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;


class FirstCaseTest extends Settings {
    private TimetablePage timetablePage;
    @Test
    void findTheWay() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);

        homePage.open();
        homePage.whereFrom("Кемерово");
        homePage.whereTo("Москва");
        homePage.departureDate("22 июля");
        homePage.searchButtonClick();
        homePage.successfulSearch();
    }

    @Test
    void durationTest() {
        timetablePage = PageFactory.initElements(driver, TimetablePage.class);
        findTheWay();
        assertTrue(timetablePage.duration());
    }

    @Test
    void transportIconTest() {
        timetablePage = PageFactory.initElements(driver, TimetablePage.class);
        findTheWay();
        assertTrue(timetablePage.transportIcon());
    }

    @Test
    void tittleTest() {
        timetablePage = PageFactory.initElements(driver, TimetablePage.class);
        findTheWay();
        assertTrue(timetablePage.tittle());
    }
}

