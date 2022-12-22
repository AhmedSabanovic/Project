import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;
import pages.Passwordpage;

public class testforgotmypassword {
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
        homepage.passowordbutton();

        Passwordpage passwordpage = new Passwordpage(driver);

        passwordpage.clickBox();
        passwordpage.inputPass("kupac@gmail.com@gma");
        passwordpage.clickSend();

        
        // Check the result of the register attempt
        if (driver.getCurrentUrl().contains("https://espresso.ba/mojracun/lost-password/")) {
            System.out.println("Password recovery unsuccesfull as expected");
        } else {
            System.out.println("Unexpected result for password recovery attempt");
        }

        // Close the browser
        driver.quit();
    }
}