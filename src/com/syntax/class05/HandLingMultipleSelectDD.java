package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandLingMultipleSelectDD {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement statesDD = driver.findElement(By.name("States"));
        Select select = new Select(statesDD);
        boolean isMultiple = select.isMultiple();
        System.out.println(isMultiple);

        if(isMultiple) {
            List<WebElement> options = select.getOptions();
            for(WebElement option: options) {
                String optionText = option.getText();
                select.selectByVisibleText(optionText);
                Thread.sleep(1000);
            }
        }

        //select.deselectByIndex(5);
        select.deselectAll();
    }
}
/*
/*
    WebElement month = driver.findElement(By.cssSelector("select[id='month']"));
    Select monthDD = new Select(month);

        if (!monthDD.isMultiple()) {
        List<WebElement> options1 = monthDD.getOptions();
        if (options1.size() == 12) {
        System.out.println("Month DD has 12 options.");
        } else {
        System.out.println("Month DD does NOT have 12 options.");

        }
        }
        Thread.sleep(1000);
        monthDD.selectByVisibleText("Jul");

        WebElement day = driver.findElement(By.cssSelector("select[id='day']"));
        Select dayDD = new Select(day);

        if (!dayDD.isMultiple()) {
        List<WebElement> options2 = dayDD.getOptions();
        if (options2.size() == 31) {
        System.out.println("Day DD has 31 options.");
        } else {
        System.out.println("Day DD does NOT have 31 options.");

        }
        }
        Thread.sleep(1000);
        dayDD.selectByIndex(10);

        WebElement year = driver.findElement(By.cssSelector("select[id='year']"));
        Select yearDD = new Select(year);

        if (!dayDD.isMultiple()) {
        List<WebElement> options3 = yearDD.getOptions();
        if (options3.size() == 115) {
        System.out.println("Year DD has 115 options.");
        } else {
        System.out.println("Year DD does NOT have 115 options.");

        }
        }
        Thread.sleep(1000);
        yearDD.selectByValue("1990");

        Thread.sleep(1000);
        driver.quit();




        -----------------------------
        ystem.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);

        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(1000);

        driver.findElement(By.name("firstname")).sendKeys("Michael");
        driver.findElement(By.name("lastname")).sendKeys("Newman");
        driver.findElement(By.name("reg_email__")).sendKeys("opyt6754mnj123@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("opyt6754mnj123@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("asdasd");


        WebElement month = driver.findElement(By.cssSelector("select[id='month']"));
        Select monthDD = new Select(month);
        if (!monthDD.isMultiple()) {
            monthDD.selectByVisibleText("Jul");
        }
        Thread.sleep(1000);

        WebElement day = driver.findElement(By.cssSelector("select[id='day']"));
        Select dayDD = new Select(day);
        if (!dayDD.isMultiple()) {
            dayDD.selectByIndex(10);
        }
        Thread.sleep(1000);

        WebElement year = driver.findElement(By.cssSelector("select[id='year']"));
        Select yearDD = new Select(year);

        if (!dayDD.isMultiple()) {
            yearDD.selectByValue("1990");
        }
        Thread.sleep(1000);

        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='radio']"));

        for (WebElement checkBox : checkBoxes
        ) {
            String text = checkBox.getAttribute("value");
            //System.out.println(text);
            if (text.equals("2")) {
                checkBox.click();
                break;
            }
        }

        Thread.sleep(1000);

        driver.findElement(By.name("websubmit")).click();

        Thread.sleep(1000);

        driver.quit();

        -------------------------------

       Select categoriesDD = new Select(driver.findElement(By.cssSelector("select[id='gh-cat']")));
        List<WebElement> options = categoriesDD.getOptions();

        for (WebElement option:options
        ) {
            System.out.println(option.getText());
        }

        categoriesDD.selectByValue("58058");
        Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.cssSelector("input[type='submit']"));
        searchButton.click();
        Thread.sleep(1000);

        //System.out.println(driver.getTitle());

        if(driver.getTitle().equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay"))
        {
            System.out.println("Title is verified.");
        }else{
            System.out.println("Title is NOT verified.");
        }

        Thread.sleep(1000);
        driver.quit();
    }
} Select categoriesDD = new Select(driver.findElement(By.cssSelector("select[id='gh-cat']")));
        List<WebElement> options = categoriesDD.getOptions();

        for (WebElement option:options
        ) {
            System.out.println(option.getText());
        }


        categoriesDD.selectByValue("58058");
        Thread.sleep(1000);

        WebElement searchButton = driver.findElement(By.cssSelector("input[type='submit']"));
        searchButton.click();
        Thread.sleep(1000);

        //System.out.println(driver.getTitle());

        if(driver.getTitle().equals("Computers, Laptops, Tablets & Network Hardware for Sale - eBay"))
        {
            System.out.println("Title is verified.");
        }else{
            System.out.println("Title is NOT verified.");
        }

        Thread.sleep(1000);
        driver.quit();
    }
 */






