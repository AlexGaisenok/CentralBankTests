package DnsMainPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'18 001 - 27 000')]")
    private WebElement priceRangeRBtn;

    @FindBy(xpath = "//a[@class='ui-link ui-link_blue ui-link_pseudolink ui-list-controls__link ui-list-controls__link_fold']//span")
    private WebElement allManufacturers;

    @FindBy(xpath = "//label[@class='ui-checkbox ui-checkbox_list']/child::input[@value='xiaomi']")
    private WebElement xiaomiChkbox;

    @FindBy(xpath = "//span[contains(text(),'Объем встроенной памяти')]")
    private WebElement intMemBtn;

    @FindBy(xpath = "//span[contains(text(),'64 ГБ')]//..//span[@class='ui-checkbox__box ui-checkbox__box_list']")
    private WebElement intMem64Gbchkbox;

    @FindBy(xpath = "//label[@class='ui-checkbox ui-checkbox_list']//span[contains(text(),'128')]")
    private WebElement intMem128Gbchkbox;

    @FindBy(xpath = "//button[contains(text(),'Применить') and @class='button-ui button-ui_brand left-filters__button']")
    private WebElement applyFiltersButton;

    public void tickManufacturer(){
        allManufacturers.click();
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", xiaomiChkbox);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void tickAmountOfMemory(){
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", intMemBtn);

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", intMem128Gbchkbox);

        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", intMem64Gbchkbox);
    }
    public void tickThePriceRange(){
        priceRangeRBtn.click();
    }
    public void applyFilters(){
        applyFiltersButton.click();
    }
}