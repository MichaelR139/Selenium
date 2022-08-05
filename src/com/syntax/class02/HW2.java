package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    /*
    navigate to fb.com
     click on create new account
     fill up all the textboxes
     click on sign up button
     close the pop up
     close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers" +
                "/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://fb.com");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("Michael");
        driver.findElement(By.name("lastname")).sendKeys("Michael");
        driver.findElement(By.name("reg_email__")).sendKeys("33445566");
        driver.findElement(By.name("reg_passwd__")).sendKeys("323145");
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
        driver.findElement(By.cssSelector("_8ien._8idr ")).click();
        driver.quit();
    }
}
