package com.syntax.class09;

import com.sun.xml.internal.bind.v2.runtime.reflect.Accessor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    /*
    HW
Go to http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
click on leave
click on leave list
choose from "From calendar"
choose from "To calendar"
click only on cancelled and rejected checkboxes
uncheck Pending Approval
select IT support from DD
click search
quit the browser
     */
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();

        WebElement leavebutton = driver.findElement(By.id("menu_leave_viewLeaveModule"));
        leavebutton.click();
        WebElement leaveListButton = driver.findElement(By.id("menu_leave_viewLeaveList"));
        leaveListButton.click();
        WebElement fromCalendar = driver.findElement(By.id("calFromDate"));
        fromCalendar.click();
        WebElement monthD = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select = new Select(monthD);
        select.selectByVisibleText("Sep");
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class= 'ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement date : dates) {
            String dateText = date.getText();
            if (dateText.equals("13")) ;
            date.click();
            break;
        }
        WebElement toCalendar = driver.findElement(By.id("calToDate"));
        toCalendar.click();
        WebElement monthDD = driver.findElement(By.className("ui-datepicker-month"));
        Select select1 = new Select((monthDD));
        select1.selectByVisibleText("Aug");
        List<WebElement>dates1=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement date1:dates1){
            String dateText= date1.getText();
            if(dateText.equals("14")){
                date1.click();
                break;
            }
            WebElement canceledCB=driver.findElement(By.id("leaveList_chkSearchFilter_0"));
            canceledCB.click();
            WebElement rejectedCB=driver.findElement(By.id("leaveList_chkSearchFilter_-1"));
            rejectedCB.click();
            WebElement pendingCB=driver.findElement(By.id("leaveList_chkSearchFilter_1"));
            pendingCB.click();
            WebElement subDD=driver.findElement(By.id("leaveList_cmbSubunit"));
            Select select2=new Select(subDD);
            select2.selectByVisibleText("IT Support");
            WebElement searchButton=driver.findElement(By.id("btnSearch"));
            searchButton.click();
            driver.quit();

        }


    }
}
