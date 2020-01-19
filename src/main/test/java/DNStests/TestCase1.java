package DNStests;

import DnsMainPage.DNSMainPage;
import DnsMainPage.SearchPage;
import DriverSetup.DriverSetup;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestCase1 extends DriverSetup {

    @Test
    public void filterSmartPhones() {
        driver.get("https://www.dns-shop.ru/");
        DNSMainPage dnsMainPage = new DNSMainPage(driver);
        assertTrue(dnsMainPage.isInitialized());
        dnsMainPage.chooseSmartPhones2019();
        SearchPage searchPage = new SearchPage(driver);
        searchPage.tickManufacturer();
        searchPage.tickThePriceRange();
        searchPage.tickAmountOfMemory();
        searchPage.applyFilters();
    }
}