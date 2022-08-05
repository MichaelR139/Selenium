package com.syntax.review;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumReview {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        WebElement username=driver.findElement(By.xpath("//input[@id='userName']"));
        username.sendKeys("Michael");
        username.clear();
        username.sendKeys("fire");

    }
}
///html/body/div[2/divdiv/div[2]/div[2]/div[2]/form/div[2]/div[2]/input