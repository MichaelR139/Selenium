package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HW {
    /*
    HW
Go to aa.com/homePage.do
select depart dates
select return date
select destination
click on search
quit the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://aa.com/homePage.do");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //select depart dates
        WebElement departD = driver.findElement(By.className("ui-datepicker-trigger"));
        departD.click();
        WebElement nextButton = driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
        WebElement monthD = driver.findElement(By.className("ui-datepicker-month"));
        String monthText = monthD.getText();
        while (!monthText.equals("May")) {
            nextButton.click();
            monthD = driver.findElement(By.className("ui-datepicker-month"));
            monthText = monthD.getText();
            nextButton = driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
        }
        List<WebElement> departDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement departDate : departDates) {
            if (departDate.getText().equals("13")) {
                departDate.click();
                break;
            }
        }
        //select return date
        WebElement returnD = driver.findElement(By.id("reservationFlightSearchForm"));
        departD.click();
        WebElement nextButton1 = driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
        WebElement returnMonthD = driver.findElement(By.className("ui-datepicker-month"));
        String monthText1 = monthD.getText();
        while (!monthText.equals("October")) {
            nextButton.click();
            returnMonthD = driver.findElement(By.className("ui-datepicker-month"));
            monthText = monthD.getText();
            nextButton1 = driver.findElement(By.xpath("//a[@aria-label='Next Month']"));
        }
        List<WebElement> returnDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement returnDate : returnDates) {
            if (returnDate.getText().equals("13")) {
                returnDate.click();
                break;
            }

        }
        //select destination
        WebElement destination= driver.findElement(By.name("destinationAirport"));
        destination.click();
        destination.sendKeys("MEX", Keys.ENTER);

        //click on search
        WebElement searchButton = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        searchButton.click();
        //quit the browser
        driver.quit();
    }
}




/*


        WebElement searchButton = driver.findElement(By.id("flightSearchForm.button.reSubmit"));
        searchButton.click();
        //quit the browser
        driver.quit();

    }

}
 */





