package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Cartpage {
    WebDriver driver;

    public Cartpage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckout() {
        WebElement Checkout = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div[3]/div[2]/div/div/a[1]"));
        Checkout.click();
    }
    public void clickName() {
        WebElement Name = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div/div/div/div/form/div/div[1]/div/div[1]/div/div/p[1]/span/input"));
        Name.click();
    }
    public void inputName(String name) {
        WebElement Name = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div/div/div/div/form/div/div[1]/div/div[1]/div/div/p[1]/span/input"));
        Name.sendKeys(name);
    }
    public void inputSurname(String surname) {
        WebElement Surname = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div/div/div/div/form/div/div[1]/div/div[1]/div/div/p[2]/span/input"));
        Surname.sendKeys(surname);
    }
    public void inputStreet(String sname) {
        WebElement SName = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div/div/div/div/form/div/div[1]/div/div[1]/div/div/p[4]/span/input"));
        SName.sendKeys(sname);
    }
    public void inputCity(String cname) {
        WebElement CName = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div/div/div/div/form/div/div[1]/div/div[1]/div/div/p[5]/span/input"));
        CName.sendKeys(cname);
    }
    public void inputRegion(String rname) {
        WebElement RName = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div/div/div/div/form/div/div[1]/div/div[1]/div/div/p[6]/span/input"));
        RName.sendKeys(rname);
    }
    public void inputPost(String pname) {
        WebElement PName = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div/div/div/div/form/div/div[1]/div/div[1]/div/div/p[7]/span/input"));
        PName.sendKeys(pname);
    }
    public void inputPhone(String tname) {
        WebElement TName = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div/div/div/div/form/div/div[1]/div/div[1]/div/div/p[8]/span/input"));
        TName.sendKeys(tname);
    }
    public void clickEmail() {
        WebElement EmNm = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div/div/div/div/form/div/div[1]/div/div[1]/div/div/p[9]/span/input"));
        EmNm.click();
    }
    public void inputEmail(String emname) {
        WebElement EmName = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div/div/div/div/form/div/div[1]/div/div[1]/div/div/p[9]/span/input"));
        EmName.clear(); 
        EmName.sendKeys(emname);
    }
    public boolean isAmountDisplayed() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div[3]/div[2]/div/table/tbody/tr[2]/td/strong/span"));
        String elementText = element.getText();
        return elementText.equals("830.103.483.316.929.822.720,00 KM");
    }
    public void clickCoupon() {
        WebElement Cou = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div[3]/div[1]/form/table/tbody/tr[2]/td/div/input[1]"));
        Cou.click();
    }
    public void inputCoupon(String coupon) {
        WebElement Coup = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div[3]/div[1]/form/table/tbody/tr[2]/td/div/input[1]"));
        Coup.sendKeys(coupon);
    }
    public boolean isAmountDisplayed2() {
        WebElement element = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div[3]/div[2]/div/table/tbody/tr[2]/td/strong/span"));
        String elementText = element.getText();
        return elementText.equals("90,00 KM");
    }
    public void clickDecrease() {
        WebElement De = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div[3]/div[1]/form/table/tbody/tr[1]/td[5]/div/input[1]"));
        De.click();
    }
    public void clickConfirm() {
        WebElement Conf = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div[3]/div[1]/form/table/tbody/tr[2]/td/input[1]"));
        Conf.click();
    }
    public void clickEdit() {
        WebElement Edt = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div[3]/div[1]/form/table/tbody/tr[1]/td[5]/div/input[2]"));
        Edt.click();
    }
    public void clickEdit2() {
        WebElement textBox = driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/section/article/div/div[3]/div[1]/form/table/tbody/tr[1]/td[5]/div/input[2]"));
        textBox.click(); 
        textBox.clear();  
        textBox.sendKeys("0");  

    }
    
}