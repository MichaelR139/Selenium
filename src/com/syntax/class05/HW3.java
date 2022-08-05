package com.syntax.class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class HW3 {
    /*
    HW2
Go to ebay.com
get all the categories and print them in the console
select Computers/Tables & Networking
click on search
verify the header
     */
    static String url = "https://www.ebay.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement categoriesDD = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select select = new Select(categoriesDD);
        List<WebElement>dropD=select.getOptions();
        for(WebElement dD:dropD){
            System.out.println(dD.getText());
        }
        Thread.sleep(1000);
            select.selectByValue("58058");
        //System.out.println(driver.getTitle());
        WebElement searchButton=driver.findElement(By.xpath("//input[@id='gh-btn']"));
        searchButton.click();
        Thread.sleep(1000);
        if(driver.getTitle().equals("Computers/Tables & Networking")){
            System.out.println("The Title verify correct");
        }else{
            System.out.println("Not correct");
        }
        driver.quit();

    }
}

