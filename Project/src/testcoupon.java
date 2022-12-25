import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;
import pages.Productpage;
import pages.Cartpage;

public class testcoupon {
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
        productpage.clickAmount();
        productpage.clickCart();
        Thread.sleep(200);
        
        Cartpage cartpage = new Cartpage(driver);

        cartpage.clickCoupon();
        cartpage.inputCoupon("Kupac");

        if (cartpage.isAmountDisplayed2()) {
        System.out.println("Test successful");
        } else {
        System.out.println("Test unsuccessful");
        }

        driver.quit();
    }
}