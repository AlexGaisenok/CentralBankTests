package DnsMainPage;

import UItests.BasePage.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DnsMainPage extends BasePage {
    private static final String HOME_PAGE_URL = "https://www.dns-shop.ru/";

    @FindBy(xpath = "//*[text()='Смартфоны']")
    // my xpath //div["menu-mobile__root-info"]/span[@class="menu-mobile__root-title"] - 10 элементов
    ///html/body/div[1]/div[2]/div[2]/div[4]/div/div[2]/div[1]/span

    private WebElement smartPhonesL1;

    @FindBy(xpath = "//*[text()='Смартфоны и гаджеты']")
    //my xpath //div[@class="menu-mobile__childs-wrap"]//a[1] - 3 элемента
    ///html/body/div[1]/div[2]/div[2]/div[4]/div/div[2]/div[2]/a[1]
    private WebElement smartPhonesL2;

    @FindBy(xpath = "//*[text()='Смартфоны и гаджеты']")
    //my xpath //div[@class="menu-mobile__childs-wrap"]//a[1] - 3 элемента
    ///html/body/div[1]/div[2]/div[2]/div[4]/div/div[2]/div[2]/a[1]
    private WebElement smartPhonesL3;

    DnsMainPage() {
        PageFactory.initElements(driver, this);
    }
}