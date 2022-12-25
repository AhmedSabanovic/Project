package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Productpage {
    WebDriver driver;

    public Productpage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickProduct() {
        WebElement Product = driver.findElement(By.linkText("ALMOND PIE ČAJ"));
        Product.click();
    }
    public void clickCart() {
        WebElement Cart = driver.findElement(By.name("add-to-cart"));
        Cart.click();
    }
    public void clickPrice() {
        WebElement Price = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/div[1]/form/ul/li/span"));
        Actions actions = new Actions(driver);
        actions.moveToElement(Price);
        actions.perform();
    }
    public void clickList() {
        WebElement List = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/div[1]/form/ul/li/ul/li[5]/a"));
        List.click();
    }
    public void clickProduct2() {
        WebElement Pro = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/div[3]/div/div[5]/div/div[1]/a/img"));
        Pro.click();
    }
    public void clickAmount() {
        WebElement Ammount = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/div[2]/div[2]/form/div/input[2]"));
        Ammount.click();
    }
    public void typeAmount(String number) {
        WebElement Ambox = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/div[2]/div[2]/form/div/input[2]"));
        Ambox.sendKeys(number);
    }
    public void cliclCart() {
        WebElement Cart = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/div[2]/div[2]/form/button"));
        Cart.click();
    }
}