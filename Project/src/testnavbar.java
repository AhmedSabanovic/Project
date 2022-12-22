import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.Homepage;

public class testnavbar {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();

       
        Homepage homepage = new Homepage(driver);

        homepage.hoverClick();
        Thread.sleep(200);
        homepage.cajClick();
        Thread.sleep(200);
        if (driver.getCurrentUrl().contains("https://espresso.ba/kategorija-proizvoda/caj/")) {
            System.out.println("Test succesfull");
        } else {
            System.out.println("Test unsuccesfull");
        }

        homepage.hoverClick();
        Thread.sleep(200);
        homepage.kafaClick();
        if (driver.getCurrentUrl().contains("https://espresso.ba/kategorija-proizvoda/espresso-kafa/")) {
            System.out.println("Test succesfull");
        } else {
            System.out.println("Test unsuccesfull");
        }

        Thread.sleep(200);
        homepage.hoverClick();
        Thread.sleep(200);
        homepage.cokoClick();
        if (driver.getCurrentUrl().contains("https://espresso.ba/kategorija-proizvoda/topla-cokolada/")) {
            System.out.println("Test succesfull");
        } else {
            System.out.println("Test unsuccesfull");
        }



      
       driver.quit();
    }
}