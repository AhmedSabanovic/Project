import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;

public class testsale {
    public static void main(String[] args) throws InterruptedException {
 
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();

        Homepage homepage = new Homepage(driver);

        homepage.saleButton();
     
        if (driver.getCurrentUrl().contains("https://espresso.ba/snizeno/")) {
            System.out.println("Sale page is opened successfully");
        } else {
            System.out.println("Unexpected result while opening sale page");
        }

        driver.quit();
    }
}
