import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Registerpage;
import pages.Homepage;

public class testregister {
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
        homepage.clickRegister();

        // Create a new Registerpage object
        Registerpage registerpage = new Registerpage(driver);

        // Use the Registerpage object to enter the username,password and click button
       registerpage.enterName();
       registerpage.typeName("KupacKupac");
       Thread.sleep(200);
       registerpage.clickPassword();
       registerpage.enterPassword("Kup4c123");
       Thread.sleep(200);
       registerpage.clickRegister();
        
        // Check the result of the register attempt
        if (driver.getCurrentUrl().contains("https://espresso.ba/mojracun/")) {
            System.out.println("Registration failed because the website is not accepting the creation of new accounts");
        } else {
            System.out.println("Registrstion succesfull");
        }

        // Close the browser
        driver.quit();
    }
}