import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;
import pages.Productpage;
import pages.Cartpage;

public class testcart {
    public static void main(String[] args) throws InterruptedException {
       
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();

        Homepage homepage = new Homepage(driver);

      
        homepage.clickTrgovina();
        Thread.sleep(200);

        Productpage productpage = new Productpage(driver);

        productpage.clickProduct();
        Thread.sleep(200);
        productpage.clickCart();
        Thread.sleep(200);
        
        Cartpage cartpage = new Cartpage(driver);

        cartpage.clickCheckout();
        Thread.sleep(200);
        cartpage.clickName();
        Thread.sleep(200);
        cartpage.inputName("Kupac");
        cartpage.inputSurname("Kupić");
        cartpage.inputStreet("Prve Čajne Brigade 12");
        cartpage.inputCity("Čajnik");
        cartpage.inputRegion("FBiH");
        cartpage.inputPost("71000");
        cartpage.inputPhone("033-225-883");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");
        Thread.sleep(200);
        cartpage.clickEmail();
        Thread.sleep(200);
        cartpage.inputEmail("kupac.kupic@gmail.com");

        if (driver.getCurrentUrl().contains("https://espresso.ba/blagajna/")) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test unsuccessful");
        }

        driver.quit();
    }
}