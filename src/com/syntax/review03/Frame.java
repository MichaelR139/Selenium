package com.syntax.review03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
    public static String url = "https://chercher.tech/practice/frames";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frameElement);
        frameElement = driver.findElement(By.xpath("//iframe[@id='frame3']"));
        driver.switchTo().frame(frameElement);

        WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));

        checkBox.click();

    }
}

