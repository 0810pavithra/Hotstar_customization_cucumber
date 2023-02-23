package steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.HomePage;
import utils.BrowserManager;
import utils.QaProps;
import utils.TestDataReader;

import java.util.HashMap;


public class StepDefinitions  {
    private WebDriver driver;
    HomePage homePage;
    String url;
    HashMap<String,String> data;
    Scenario scenario;
    WebElement b;
    public StepDefinitions(BrowserManager browserManager){
        this.driver = browserManager.getDriver();

    }
    @Before(order = 1)
    public void before(Scenario scenario){
        this.scenario = scenario;
    }
    //testcase1
    @Given("The user navigates to the home page.")
    public void the_user_navigates_to_the_home_page() {
        url = QaProps.getvalue("url");
        driver.get(url);
        homePage = new HomePage(driver);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("The user enter  the movies name.")
    public void the_user_enter_the_movies_name()throws InterruptedException {
        Thread.sleep(2000);
        homePage. getSearchField().sendKeys(data.get("TypeValue"));
        homePage. getSearchField().sendKeys(Keys.ENTER);
    }
    @Then("The movies result should be display")
    public void the_movies_result_should_be_display()throws InterruptedException {
        Thread.sleep(2000);
        String text = homePage.getSearchResult().getText();
        Assert.assertEquals(text,data.get("TypeValue"));
    }


    //testcase2
    @When("The user clicked the  Channels should be displayed.")
    public void the_user_clicked_the_channels_should_be_displayed()throws InterruptedException {
        homePage.getMenu().click();
        Thread.sleep(2000);
        homePage.getChannels().click();
        Thread.sleep(3000);
    }
    @Then("Then user can selected the Channels.")
    public void then_user_can_selected_the_channels()throws InterruptedException  {
        homePage.getSearchChannels().click();
        Thread.sleep(3000);
    }


    //testcase3
    @When("The user clicked the Language list should be displayed.")
    public void the_user_clicked_the_language_list_should_be_displayed() throws InterruptedException {
        homePage.getMenu().click();
        Thread.sleep(2000);
        homePage.getLanguages().click();
        Thread.sleep(2000);
    }
    @Then("Then user can selected the Language.")
    public void then_user_can_selected_the_language() throws InterruptedException {
        homePage.getSearchLanguage().click();
        Thread.sleep(2000);
    }


    //testcase4
    @Given("The user need to clicked the menu list,categories should be visible.")
    public void the_user_need_to_clicked_the_menu_list_categories_should_be_visible()throws InterruptedException {
        url = QaProps.getvalue("url");
        driver.get(url);
        homePage = new HomePage(driver);
        Thread.sleep(2000);
        homePage.getMenu().click();
        Thread.sleep(2000);
    }
    @When("The user clicked the Genres list should be displayed.")
    public void the_user_clicked_the_genres_list_should_be_displayed() throws InterruptedException{
        homePage.getGenres().click();
        Thread.sleep(2000);

    }
    @Then("Then user can selected the movies.")
    public void then_user_can_selected_the_movies()throws InterruptedException {
        homePage.getMovies().click();
        Thread.sleep(2000);
    }

    //testcase5
    @Given("The user clicked the kids,it will move to kids section.")
    public void the_user_clicked_the_kids_it_will_move_to_kids_section() {
        url = QaProps.getvalue("url");
        driver.get(url);
        homePage = new HomePage(driver);
    }

    @When("The user enter  the kids movies name.")
    public void the_user_enter_the_kids_movies_name() throws InterruptedException {
        WebElement element;
        Actions action = new Actions(driver);
        element = homePage.getKids();
        Thread.sleep(4000);
        action.moveToElement(element).click().perform();
        Thread.sleep(4000);
        homePage. getSearchKids().sendKeys("princess");
        homePage. getSearchKids().sendKeys(Keys.ENTER);

    }

    @When("The kids movies result should be display.")
    public void the_kids_movies_result_should_be_display() throws InterruptedException {
        Thread.sleep(2000);
        String text = homePage.getSearchKidsResult().getText();
        Assert.assertEquals(text,"princess");
        Thread.sleep(2000);

    }

    @Then("Get back to the home page.")
    public void get_back_to_the_home_page() throws InterruptedException {
        homePage.getReturnHome().click();
        Thread.sleep(2000);
    }
    //scenario Outline
    @When("The user enter  the search as {string} .")
    public void the_user_enter_the_search_as(String srg0) throws InterruptedException {
        Thread.sleep(2000);
        WebElement b = homePage. getSearchField();
        b.sendKeys(srg0);
        b.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
    @Then("The result should be display.")
    public void the_result_should_be_display()throws InterruptedException {


    }

}