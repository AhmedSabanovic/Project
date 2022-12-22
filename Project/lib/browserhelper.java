import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class browserhelper {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new EdgeDriver();
        driver.get("https://espresso.ba/");
        driver.manage().window().maximize();
        WebElement LoginButton = driver.findElement(By.className("login"));
        LoginButton.click();

        WebElement LoginBox = driver.findElement(By.className("input"));
        Thread.sleep(200);
        LoginBox.click();
        LoginBox.sendKeys("Kupac");

        WebElement PasswordBox = driver.findElement(By.name("pwd"));
        Thread.sleep(200);
        PasswordBox.click();
        PasswordBox.sendKeys("Kupac123");

        WebElement Loguj = driver.findElement(By.name("wp-submit"));
        Thread.sleep(200);
        Loguj.click();

        //driver.quit();   
    }
}
///metode