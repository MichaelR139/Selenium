package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HW {
    /*
    go to https://the-internet.herokuapp.com/dynamic_controls
click on checkbox and click on remove
verify the text
click on enable verify the textbox is enabled
enter text and click disable
verify the textbox is disabled
     */
    static String url = "https://the-internet.herokuapp.com/dynamic_controls";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        WebElement removeCB = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        removeCB.click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement textM = driver.findElement(By.xpath("//p[@id='message']"));
        String gettextM = textM.getText();
        if (gettextM.equals("It's gone!")) {
            System.out.println("Correct");
        } else {
            System.out.println("Not correct");
        }
        WebElement enabledisableButon=driver.findElement(By.xpath("//button[@onclick='swapInput()']"));
        enabledisableButon.click();
        WebDriverWait wait1 = new WebDriverWait(driver, 20);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        WebElement textMMM=driver.findElement(By.xpath("//p[@id='message']"));
        String gettextMMM = textM.getText();
        if (gettextM.equals("It's enabled!")) {
            System.out.println("Text correct");
        } else {
            System.out.println("Text not correct");
        }
    }
}
