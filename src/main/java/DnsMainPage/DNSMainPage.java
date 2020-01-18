package DnsMainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DNSMainPage extends PageObject {
    public DNSMainPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "")
    private WebElement smartPhonesL1;

    @FindBy(xpath = "")
    private WebElement smartPhonesL2;

    @FindBy(xpath = "")
    private WebElement year2019;

}
