import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;

public class testsearch {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();

        Homepage homepage = new Homepage(driver);

        homepage.searchClick();
        Thread.sleep(200);
        homepage.searchType("crni čaj");
        Thread.sleep(200);
        homepage.searchbutton();
        
        if (driver.getCurrentUrl().contains("https://espresso.ba/?term=0&s=crni+%C4%8Daj&post_type=product&taxonomy=product_cat")) {
            System.out.println("Test succesfull");
        } else {
            System.out.println("Test unsuccesfull");
        }

        driver.quit();
    }
}