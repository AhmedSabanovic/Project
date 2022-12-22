package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Passwordpage {
    WebDriver driver;

    public Passwordpage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickBox() {
        WebElement Box = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/section/article/div/form/p[2]/input"));
        Box.click();
    }
    public void inputPass(String pass) {
        WebElement PBox = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/section/article/div/form/p[2]/input"));
        PBox.sendKeys(pass);
    }
    public void clickSend() {
        WebElement SBox = driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/div/section/article/div/form/p[3]/button"));
        SBox.click();
    }
}