package POMnopCommerceOxfordCircus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by SONY on 22-Oct-14.
 */
public class BasePage {
    protected static WebDriver driver;
    public void goToShoppingCart(){
        driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
    }
}
