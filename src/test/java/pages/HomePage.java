package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;



    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    //testcase1
    @FindBy(id = "searchField")
    WebElement searchField;

    public WebElement getSearchField() {
        return searchField;
    }
    @FindBy(xpath = "//span[contains(text(), 'movies')]")
    WebElement searchResult;

    public WebElement getSearchResult() {
        return searchResult;
    }

    //testcase2
    @FindBy(xpath = "//div[@id='btn-hamburger']")
     WebElement menu;

    public WebElement getMenu() {
        return menu;
    }
    @FindBy(linkText = ("Channels"))
    WebElement Channels;

    public WebElement getChannels() {
        return Channels;
    }
    @FindBy(xpath = "//article[@class=\"channel-card normal\"]//a[1]")
    WebElement searchChannels;

    public WebElement getSearchChannels() {
        return searchChannels;
    }

    //testcase3
    @FindBy(linkText = "Languages")
    WebElement Languages;

    public WebElement getLanguages() {
        return Languages;
    }
    @FindBy(xpath = ".//span[text()='Hindi']")
    WebElement searchLanguage;

    public WebElement getSearchLanguage() {
        return searchLanguage;
    }

    //testcase4
    @FindBy(linkText = ("Genres"))
     WebElement Genres;

    public WebElement getGenres() {
        return Genres;
    }
    @FindBy(xpath=".//span[text()='DRAMA']")
     WebElement movies;

    public WebElement getMovies() {
        return movies;
    }

    //testcase5
    @FindBy(xpath = "//div[@class ='navigations']/ul/li[5]/div//a[@class ='nav-link']")
    WebElement kids;

    public WebElement getKids() {
        return kids;
    }
    @FindBy(id = "searchField")
    WebElement searchKids;

    public WebElement getSearchKids() {
        return searchKids;
    }
    @FindBy(xpath = ".//span[contains(text(), 'princess')]")
    WebElement searchKidsResult;

    public WebElement getSearchKidsResult() {
        return searchKidsResult;
    }
    @FindBy(xpath = "//button[@type ='button']")
    WebElement returnHome;

    public WebElement getReturnHome() {
        return returnHome;
    }

    //testcase 6
    @FindBy(xpath = "//div[@class='signIn']")
    WebElement searchLogin;

    public WebElement getSearchLogin() {
        return searchLogin;
    }
    @FindBy(id = "phoneNo")
    WebElement enterLogin;

    public WebElement getEnterLogin() {
        return enterLogin;
    }
}
