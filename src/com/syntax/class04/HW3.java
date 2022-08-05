package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    /*
    HRMS Application Negative Login:
Open chrome browser
Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
Enter valid username
Leave password field empty
Click on login button
Verify error message with text "Password cannot be empty" is displayed.
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        Thread.sleep(2000);
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys(" ");
        WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();
        WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
        if(errorMessage.isDisplayed()){
            System.out.println("Password cannot be empty");
            driver.quit();

        }
    }

}
