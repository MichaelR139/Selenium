package com.syntax.class05;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW2 {
    /*
    HW1
Go to facebook sign up page
Fill out the whole form
Click signup
     */
    static String url = "https://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Michael");
        driver.findElement(By.name("lastname")).sendKeys("Rad");
        driver.findElement(By.name("reg_email__")).sendKeys("mrd1139@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("mrd1139@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("asdfh");
        Thread.sleep(1000);
        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select monthDD = new Select(month);
        monthDD.selectByVisibleText("Sep");
        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select dayDD = new Select(day);
        dayDD.selectByValue("13");
        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select yearDD = new Select(year);
        yearDD.selectByValue("1976");
        Thread.sleep(1000);
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//span[@data-name='gender_wrapper']"));
        for (WebElement checkBox : checkBoxes) {
            String text = checkBox.getAttribute("value");
            if (checkBox.equals("2")) {
                checkBox.click();
                break;
            }
        }
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        driver.quit();
    }
}






