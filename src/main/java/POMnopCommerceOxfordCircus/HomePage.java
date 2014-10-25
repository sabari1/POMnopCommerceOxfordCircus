package POMnopCommerceOxfordCircus;

import org.openqa.selenium.By;

/**
 * Created by SONY on 22-Oct-14.
 */
public class HomePage extends BasePage {

    public void goToHomePage(){
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img")).click();
    }
}
