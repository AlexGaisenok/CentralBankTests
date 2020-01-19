package DnsMainPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageObject {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'18 001 - 27 000')]")
    private WebElement priceRangeRBtn;

    @FindBy(xpath = "//button[@class='pagination-widget__show-more-btn']")
    private WebElement allManufacturers;

    @FindBy(xpath = "//*[@class='ui-link ui-link_blue ui-link_pseudolink ui-list-controls__link ui-list-controls__link_fold']")
    private WebElement manufacturerNamechkbox;

    @FindBy(xpath = "//label[@class='ui-checkbox ui-checkbox_list']/child::input[@value='xiaomi']")
    private WebElement xiaomiChkbox;

    @FindBy(xpath = "//span[contains(text(),'Объем встроенной памяти')]//..//..//a[@class='ui-link ui-collapse__link_left " +
                    "ui-collapse__link ui-collapse__link_list ui-collapse__link_in']")
    private WebElement intMemBtn;

    @FindBy(xpath = "//span[contains(text(),'64 ГБ')]//..//span[@class='ui-checkbox__box ui-checkbox__box_list']")
    private WebElement intMem64Gbchkbox;

    @FindBy(xpath = "//span[contains(text(),'128 ГБ')]//..//span[@class='ui-checkbox__box ui-checkbox__box_list']")
    private WebElement intMem128Gbchkbox;

    @FindBy(xpath = "//button[contains(text(),'Применить') and @class='button-ui button-ui_brand left-filters__button']")
    private WebElement applyFiltersButton;

    public void tickManufacturer(){
        allManufacturers.click();
        manufacturerNamechkbox.click();
        xiaomiChkbox.click();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void tickAmountOfMemory(){
        intMemBtn.click();
        intMem64Gbchkbox.click();
        intMem128Gbchkbox.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void tickThePriceRange(){
        priceRangeRBtn.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        applyFiltersButton.click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
