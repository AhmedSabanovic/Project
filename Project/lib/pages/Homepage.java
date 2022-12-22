package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage {
    WebDriver driver;

    public Homepage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLogin() {
        WebElement LoginButton = driver.findElement(By.className("login"));
        LoginButton.click();
    }

    public void clickRegister() {
        WebElement RegisterButton = driver.findElement(By.className("register-link"));
        RegisterButton.click();
    }
    public void clickLoginBox() {
        WebElement LoginBox = driver.findElement(By.className("input"));
        LoginBox.click();
    }

    public void enterUsername(String username) {
        WebElement LoginBox = driver.findElement(By.className("input"));
        LoginBox.sendKeys(username);
    }
    public void clickPasswordBox() {
        WebElement PasswordBox = driver.findElement(By.name("pwd"));
        PasswordBox.click();
    }

    public void enterPassword(String password) {
        WebElement PasswordBox = driver.findElement(By.name("pwd"));
        PasswordBox.sendKeys(password);
    }

    public void clickLoguj() {
        WebElement Loguj = driver.findElement(By.name("wp-submit"));
        Loguj.click();
    }
    public void hoverClick() {
        WebElement Hover = driver.findElement(By.xpath("/html/body/div[4]/header/div/div[3]/div/div/div"));
        Actions actions = new Actions(driver);
        actions.moveToElement(Hover);
        actions.perform();
    }
    public void cajClick() {
        WebElement Caj = driver.findElement(By.xpath("/html/body/div[4]/header/div/div[3]/div/div/div/div[2]/div/ul/li[1]/a"));
        Caj.click();
    }
    public void kafaClick() {
        WebElement Kafa = driver.findElement(By.xpath("/html/body/div[4]/header/div/div[3]/div/div/div/div[2]/div/ul/li[2]/a"));
        Kafa.click();
    }
    public void cokoClick() {
        WebElement Coko = driver.findElement(By.xpath("/html/body/div[4]/header/div/div[3]/div/div/div/div[2]/div/ul/li[3]"));
        Coko.click();
    }
    public void trgovinaClick() {
        WebElement Trgovina = driver.findElement(By.xpath("/html/body/div[4]/header/div/div[3]/div/div/nav/div/ul/li[2]/a"));
        Trgovina.click();
    }
    public void searchClick() {
        WebElement Search = driver.findElement(By.cssSelector("#header > div > div.header-content > div > div.alus-header-search > div > form > div > input.search-field"));
        Search.click();
    }
    public void searchType(String word) {
        WebElement Searchtype = driver.findElement(By.cssSelector("#header > div > div.header-content > div > div.alus-header-search > div > form > div > input.search-field"));
        Searchtype.sendKeys(word);
    }
    public void searchbutton() {
        WebElement Searchbutton = driver.findElement(By.xpath("/html/body/div[4]/header/div/div[2]/div/div[3]/div/form/div/button"));
        Searchbutton.click();
    }
    public void passowordbutton() {
        WebElement Passbutton = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/p[5]/a"));
        Passbutton.click();
    }
    public void newsletterButton() {
        WebElement Newslbutton = driver.findElement(By.xpath("/html/body/div[4]/footer/div[1]/div/div/div[1]/div[5]/div/div/div/div/div/div/form/div[3]/div[1]/input"));
        Newslbutton.click();
    }
    public void newsletterText(String text) {
        WebElement Newstext = driver.findElement(By.xpath("/html/body/div[4]/footer/div[1]/div/div/div[1]/div[5]/div/div/div/div/div/div/form/div[3]/div[1]/input"));
        Newstext.sendKeys(text);
    }
    public void newsButton() {
        WebElement Newsbutton = driver.findElement(By.xpath("/html/body/div[4]/footer/div[1]/div/div/div[1]/div[5]/div/div/div/div/div/div/form/div[3]/div[3]/input"));
        Newsbutton.click();
    }
    public void saleButton() {
        WebElement Salebutton = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div[4]/div/div/div/div[4]/a"));
        Salebutton.click();
    }
    public void igButton() {
        WebElement Igbutton = driver.findElement(By.xpath("/html/body/div[6]/ul/li[2]/a/i"));
        Igbutton.click();
    }
    public void fbButton() {
        WebElement Fbbutton = driver.findElement(By.xpath("/html/body/div[6]/ul/li[1]/a/i"));
        Fbbutton.click();
    }
    public void gButton() {
        WebElement Gbutton = driver.findElement(By.xpath("/html/body/div[6]/ul/li[3]/a/i"));
        Gbutton.click();
    }
}