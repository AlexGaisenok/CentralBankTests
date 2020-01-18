package DNStests;

import DriverSetup.DriverSetup;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class UrlTest extends DriverSetup {
    private static final Logger logger = LogManager.getLogger(UrlTest.class);

    @Test
    public void getCurrentUrl(){
        driver.get("https://angular.io/");
        driver.findElement(By.cssSelector("a.button.hero-cta")).click();
        String url = driver.getCurrentUrl();
        logger.info("Current url: {}", url);
        assertThat(url, endsWith("angular.io/start"));
    }

    @Test
    public void clickSmart1(){
        driver.get("https://www.dns-shop.ru/");

    }
}
