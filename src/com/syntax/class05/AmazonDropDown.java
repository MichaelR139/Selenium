package com.syntax.class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AmazonDropDown {
    static String url = "https://www.amazon.com";

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.get(url);
            WebElement categoriesDD = driver.findElement(By.id("searchDropdownBox"));
            Select select = new Select(categoriesDD);

            List<WebElement> options = select.getOptions();
            for(WebElement option:options) {
                String optionText = option.getText();
                System.out.println(optionText);
            }

            select.selectByValue("search-alias=appliances");
        }
    }
    /*
    public class AddLanguagesSteps {
    @When("user clicks on Admin option")
    public void user_clicks_on_admin_option() {
        // click(employeeSearchPage.pimOption);
        click(addLanguagesPage.adminOption);

    }

    @When("user clicks on Qualification option")
    public void user_clicks_on_qualification_option() {
        click(addLanguagesPage.qualificationOption);
    }

    @When("user clicks on languages in drop down list")
    public void user_clicks_on_languages_in_drop_down_list() {
     click(addLanguagesPage.langList);
    }

    @When("user clicks on Add button")
    public void user_clicks_on_add_button() {
        click(addLanguagesPage.addBttn);
    }

    @When("user enters a language")
    public void user_enters_a_language() {
        sendText(addLanguagesPage.langField,"Italian");

    }

    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        click(addLanguagesPage.saveBtn);
    }

    @Then("language added successfully")
    public void language_added_successfully() {


    }


}

     */
