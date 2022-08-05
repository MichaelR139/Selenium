package com.syntax.review05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    /* @here goto syntax hrms application
     In the table in PIM/EmployeeList
     just pick one random username and check it,
     no need to delete it , just make sure it is checked.
     share the screen shot  of the webpage in channel (edited)

     */
    static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement userName= driver.findElement(By.xpath("//input[@id='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//input[@id='txtPassword']"));
        password.sendKeys("Hum@nhrm123");
        WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
        login.click();
        WebElement clickPim=driver.findElement(By.id("menu_pim_viewPimModule"));
        clickPim.click();

        List<WebElement>tableRow=driver.findElements(By.id("//table[@id='resultTable']/tbody/tr"));
        for(int i=1;i<tableRow.size();i++) {

            WebElement row1 = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i+1) + "]/td[3]"));
            String name = row1.getText();
            //System.out.println(name);
            if(name.contains("Dashik")){

            }
                //driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + (i+1) + "]/td[3]/input")).click();

            }
        }

    }
//}



