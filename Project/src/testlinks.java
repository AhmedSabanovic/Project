import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.Set;


import pages.Homepage;

public class testlinks {
    public static void main(String[] args) throws InterruptedException {
        // Create a new WebDriver object
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();

        // Create a new Homepage object
        Homepage homepage = new Homepage(driver);

        homepage.igButton();
        Thread.sleep(2000);
        // Check the result of the register attempt
        Set<String> windowHandles = driver.getWindowHandles();
        if (windowHandles.size() == 2) {
            System.out.println("Ig page is not opened as expected");
        } else {
            System.out.println("Unexpected result opening Ig page");
        }

        homepage.fbButton();
        Thread.sleep(2000);
        // Check the result of the register attempt
        Set<String> windowHandle = driver.getWindowHandles();
        if (windowHandle.size() == 3) {
            System.out.println("Fb page is opened as expected");
        } else {
            System.out.println("Unexpected result opening Fb page");
        }
        
        homepage.gButton();
        Thread.sleep(2000);
        Set<String> windowHandlez = driver.getWindowHandles();
        if (windowHandlez.size() == 4) {
            System.out.println("Google maps page is opened as expected");
        } else {
            System.out.println("Unexpected result opening G page");
        }

        // Close the browser
        driver.quit();
    }
}