package DNStests;

import DnsMainPage.DNSMainPage;
import DnsMainPage.SearchPage;
import DriverSetup.DriverSetup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class UrlTest extends DriverSetup {
    private static final Logger logger = LogManager.getLogger(UrlTest.class);

    @Test
    public void clickSmart1() {
        driver.get("https://www.dns-shop.ru/");
        DNSMainPage dnsMainPage = new DNSMainPage(driver);
        assertTrue(dnsMainPage.isInitialized());
        dnsMainPage.chooseSmartPhones2019();
        SearchPage searchPage = new SearchPage(driver);
        searchPage.tickThePriceRange();
        //searchPage.isInitialized();
        //searchPage.tickAmountOfMemory();
        //searchPage.tickManufacturer();
    }
}
