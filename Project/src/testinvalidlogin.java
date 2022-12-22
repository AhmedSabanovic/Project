import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;

public class testinvalidlogin {
    public static void main(String[] args) throws InterruptedException {
        // Create a new WebDriver object
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();

        // Create a new Homepage object
        Homepage homepage = new Homepage(driver);

        // Use the Homepage object to click the login/register button
        homepage.clickLogin();
        Thread.sleep(200);
        homepage.enterUsername("Kupac");
        Thread.sleep(200);
        homepage.enterPassword("INVALID_PASSWORD");
        homepage.clickLoguj();
        Thread.sleep(200);
        // Check the result of the login attempt
        if (driver.getCurrentUrl().contains("wp-login.php")) {
            System.out.println("Login failed as expected");
        } else {
            System.out.println("Unexpected result for login attempt");
        }

        // Close the browser
        driver.quit();
    }
}