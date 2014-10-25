package POMnopCommerceOxfordCircus;

import org.openqa.selenium.By;

/**
 * Created by SONY on 22-Oct-14.
 */
public class BooksPage extends BasePage {

    public void goToBookPage(){
        driver.findElement(By.linkText("Books")).click();
    }
}
