import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;

public class testnewsletter {
    public static void main(String[] args) throws InterruptedException {
     
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();

        Homepage homepage = new Homepage(driver);

        homepage.newsletterButton();
        homepage.newsletterText("123456");
        homepage.newsButton();
        
        if (driver.getCurrentUrl().contains("https://espresso.ba/")) {
            System.out.println("Registration for newsletter unsuccesfull as expected");
        } else {
            System.out.println("Unexpected result for newsletter signup attempt");
        }

        driver.quit();
    }
}
