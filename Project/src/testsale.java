import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;

public class testsale {
    public static void main(String[] args) throws InterruptedException {
        // Create a new WebDriver object
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();

        // Create a new Homepage object
        Homepage homepage = new Homepage(driver);

        homepage.saleButton();
        // Check the result of the register attempt
        if (driver.getCurrentUrl().contains("https://espresso.ba/snizeno/")) {
            System.out.println("Sale page is opened successfully");
        } else {
            System.out.println("Unexpected result while opening sale page");
        }

        // Close the browser
        driver.quit();
    }
}