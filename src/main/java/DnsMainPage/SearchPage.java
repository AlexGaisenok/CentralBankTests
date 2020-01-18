package DnsMainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "")
    private WebElement priceRangeRBtn;

    @FindBy(xpath = "")
    private WebElement manufacturerNamechkbox;

    @FindBy(xpath = "")
    private WebElement intMem64Gbchkbox;

    @FindBy(xpath = "")
    private WebElement intMem128Gbchkbox;

    @FindBy(xpath = "")
    private WebElement applyFiltersButton;
}
