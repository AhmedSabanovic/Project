import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;
import pages.Productpage;
import pages.Cartpage;

public class testcartammount {
    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();

        Homepage homepage = new Homepage(driver);

      
        homepage.clickTrgovina();
        Thread.sleep(1000);

        Productpage productpage = new Productpage(driver);

        productpage.clickPrice();
        Thread.sleep(200);
        productpage.clickList();
        productpage.clickProduct2();
        productpage.clickAmmount();
        productpage.typeAmmount("10000000000000000000");
        productpage.clickCart();
        Thread.sleep(250);
        
        Cartpage cartpage = new Cartpage(driver); 
        if (cartpage.isAmountDisplayed()) {
        System.out.println("Test successful");
        } else {
        System.out.println("Test unsuccessful");
        }
        
        driver.quit();
    }
}