package DnsMainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DNSMainPage extends PageObject {
    public DNSMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class='ui-link menu-desktop__root-title' and contains(text(),'Смартфоны')]")
    private WebElement smartPhonesL1;

    @FindBy(xpath = "//a[@class='ui-link menu-desktop__second-level' and contains(text(),'Смартфоны')]")
    private WebElement smartPhonesL2;

    @FindBy(xpath = "//a[@class='ui-link menu-desktop__popup-link' and contains(text(),'2019 года')]")
    private WebElement year2019;

    public boolean isInitialized() {
        return smartPhonesL1.isDisplayed();
    }

    public void chooseSmartPhones2019(){

        Actions builder = new Actions(driver);
        builder.moveToElement(smartPhonesL1).build().perform();
        builder.moveToElement(smartPhonesL2).build().perform();
        this.year2019.click();
    }
}