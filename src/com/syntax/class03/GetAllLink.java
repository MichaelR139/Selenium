package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GetAllLink {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://ebay.com");
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of linck" + allLinks.size());

        for (WebElement link : allLinks) {
            String linkText = link.getText();
            String fullLink=link.getAttribute("href");
            if (!linkText.isEmpty()) {
                System.out.println(linkText+" "+fullLink);
            }
        }
    }
}

