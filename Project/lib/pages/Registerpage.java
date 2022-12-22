package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerpage {
    WebDriver driver;

    public Registerpage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName() {
        WebElement Namebox = driver.findElement(By.name("username"));
        Namebox.click();
    }

    public void typeName(String name) {
        WebElement Namebox = driver.findElement(By.name("username"));
        Namebox.sendKeys(name);
    }
    public void clickPassword() {
        WebElement PasswordBox = driver.findElement(By.name("password"));
        PasswordBox.click();
    }
    public void enterPassword(String password) {
        WebElement PasswordBox = driver.findElement(By.name("password"));
        PasswordBox.sendKeys(password);
    }
    public void clickRegister() {
        WebElement RegButton = driver.findElement(By.name("login"));
        RegButton.click();
    }
    
}