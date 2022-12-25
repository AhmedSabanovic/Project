import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;

public class testnewsletter {
    public static void main(String[] args) throws InterruptedException {
        // Create a new WebDriver object
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();

        // Create a new Homepage object
        Homepage homepage = new Homepage(driver);

        homepage.newsletterButton();
        homepage.newsletterText("123456");
        homepage.newsButton();
        
        // Check the result of the register attempt
        if (driver.getCurrentUrl().contains("https://espresso.ba/")) {
            System.out.println("Registration for newsletter unsuccesfull as expected");
        } else {
            System.out.println("Unexpected result for newsletter signup attempt");
        }

        // Close the browser
        driver.quit();
    }
}