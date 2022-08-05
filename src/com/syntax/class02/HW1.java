package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    /**
     navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
     fill out the form
     click on register
     close the browser


     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver() ;
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Michael");
        driver.findElement(By.id("customer.lastName")).sendKeys("Pol");
        driver.findElement(By.id("customer.address.street")).sendKeys("Nelson st.");
        driver.findElement(By.id("customer.address.city")).sendKeys("Burnaby");
        driver.findElement(By.id("customer.address.state")).sendKeys("Canada");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("1M9E5J");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("238939345");
        driver.findElement(By.id("customer.ssn")).sendKeys("1234567");
        driver.findElement(By.id("customer.username")).sendKeys("Michael123");
        driver.findElement(By.id("customer.password")).sendKeys("Michael1234");
        driver.findElement(By.id("repeatedPassword")).sendKeys("Michael1234");
        Thread.sleep(5000);
        driver.findElement(By.partialLinkText("Register")).click();
        Thread.sleep(5000);
        driver.quit();
        }
    }


