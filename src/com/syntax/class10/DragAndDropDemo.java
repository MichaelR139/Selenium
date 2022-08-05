package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

    public static String url = "https://jqueryui.com/droppable/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
/*
        Actions action = new Actions(driver);
        //action.dragAndDrop(draggable, droppable).perform();
        action.clickAndHold(draggable).moveToElement(droppable).release().build().perform();
        1. If Parent is having unique identification
        parentXpath/childTagName
        2. If immediate child is having unique identification
        childXpath/..
        3. If the next element is having unique identification
        nextElementXpath/preceding-sibling::tagName
        4. If the previous element is having unique identification
        previousElementXpath/following-sibling::tagName

        moveToElement(toElement) It shifts the mouse to the center of the element.
contextClick() Makes a context/right click at the existing mouse location.
doubleClick() It performs a double-click at the existing mouse location.
dragAndDrop(source, target) Invokes click-and-hold at the source location and moves to
the location of the target element before releasing the
mouse.
Parameters:
source – element to grab.
target – element to release.
        */

    }
}