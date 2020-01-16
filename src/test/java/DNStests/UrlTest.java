package DNStests;

import UItests.BasePage.BasePage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringEndsWith.endsWith;

public class UrlTest extends BasePage {
    private static final Logger logger = LogManager.getLogger(UrlTest.class);

    @Test
    public void get(){
        driver = new ChromeDriver();

        try{
            driver.get("https://www.dns-shop.ru/");
        } catch (Exception ex){
            logger.error(ex);
        }
    }

    @Test
    public void getCurrentUrl(){
        driver = new ChromeDriver();
        driver.get("https://angular.io/");
        driver.findElement(By.cssSelector("a.button.hero-cta")).click();
        String url = driver.getCurrentUrl();
        logger.info("Current url: {}", url);
        assertThat(url, endsWith("angular.io/start"));
    }
}
