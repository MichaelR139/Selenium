package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HW1 {
    /*
    TC 1: Facebook dropdown verification
Open chrome browser
Go to "https://www.facebook.com"
click on create new account
Verify:
month dd has 12 month options
day dd has 31 day options
year dd has 115 year options
Select your date of birth
Quit browser




     */
       static String url="https://www.facebook.com";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.get(url);
        driver.findElement(By.partialLinkText("new account")).click();
        Thread.sleep(2000);
        WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
        Select monthDD=new Select(month);
        List<WebElement> allOptions = monthDD.getOptions();
        int size = allOptions.size();
        System.out.println("Month DD "+size);
        monthDD.selectByVisibleText("Sep");
        Thread.sleep(1000);
        WebElement day= driver.findElement(By.cssSelector("select[id='day']"));
        Select dayDD=new Select(day);
        List<WebElement>allOption1=dayDD.getOptions();
        int size1= allOption1.size();
        System.out.println("Day DD "+size1);
        dayDD.selectByValue("13");
        Thread.sleep(1000);
        WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select yearDD= new Select(year);
        List<WebElement>allOption2=yearDD.getOptions();
        int size2= allOption2.size();
        System.out.println("Year "+size2);
        yearDD.selectByValue("1976");
        Thread.sleep(1000);
        driver.quit();



    }
}
