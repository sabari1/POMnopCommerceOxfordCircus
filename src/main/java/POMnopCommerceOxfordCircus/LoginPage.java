package POMnopCommerceOxfordCircus;

import org.openqa.selenium.By;

/**
 * Created by SONY on 22-Oct-14.
 */
public class LoginPage extends BasePage {
    public void goTologinPage(){
        driver.findElement(By.linkText("Log in")).click();
    }
public void login(String email, String password){
    driver.findElement(By.id("Email")).sendKeys(email);
    driver.findElement(By.id("Password")).sendKeys(password);
    driver.findElement(By.xpath
            ("html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
   }
}