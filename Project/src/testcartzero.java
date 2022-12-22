import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;
import pages.Productpage;
import pages.Cartpage;

public class testcartzero {
    public static void main(String[] args) throws InterruptedException {
        // create web driver instance
        WebDriver driver = new EdgeDriver();
        // navigate to website
        driver.get("https://espresso.ba/");
        // maximize browser window
        driver.manage().window().maximize();

        // create Homepage object and click the 'Trgovina' button
        Homepage homepage = new Homepage(driver);
        homepage.clickTrgovina();
        Thread.sleep(1000);

        // create Productpage object, sort products by price, and select a product
        Productpage productpage = new Productpage(driver);
        productpage.clickPrice();
        Thread.sleep(200);
        productpage.clickList();
        productpage.clickProduct2();
        productpage.clickAmmount();
        productpage.typeAmmount("10000000000000000000");
        productpage.clickCart();
        Thread.sleep(200);
        
        // create Cartpage object, edit the cart, and check if the amount is displayed
        Cartpage cartpage = new Cartpage(driver);
        cartpage.clickEdit2();
        cartpage.clickConfirm();
        if (cartpage.isAmountDisplayed()) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test unsuccessful");
        }

        // close the web driver
        driver.quit();
    }
}
