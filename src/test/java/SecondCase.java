import findTransportDirection.HomePage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SecondCase  extends Settings{
    @Test
    void unsuccessfulSearch() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.open();
        homePage.whereFrom("Кемерово проспект ленина");
        homePage.whereTo("Кемерово Бакинский переулок");
        homePage.departureDate("среда");
        homePage.autobusButtonClick();
        homePage.searchButtonClick();
        assertTrue(homePage.unsuccessfulSearch());
    }

}
