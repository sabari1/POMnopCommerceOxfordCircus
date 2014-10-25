package POMnopCommerceOxfordCircus;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;



/**
 * Created by Liju on 22-Oct-14.
 */
public class SmokeTestSuite extends BaseTest{

    //Test Data
    String email="test@test.com", password="tester";
    Integer timeMilliSec;



    //Creating Objects
    LoginPage loginPage = new LoginPage();
    Utils utils = new Utils();
    BooksPage bookspage = new BooksPage();

    //Test
    @Test
    public void successfulCustomerAddandDeleteBookFromCart(){

        //Go to Login Page
        loginPage.goTologinPage();
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Returning Customer"));

        //Login with valid credentials
        loginPage.login(email,password);

        //Assert Login Page
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains(email));
        utils.waitForSomeMilliSeconds(5000);

        //Assert home Page
        Assert.assertTrue(driver.getTitle().contains("Your store"));

        //Go To Books Page
        bookspage.goToBookPage();
        utils.waitForSomeMilliSeconds(5000);

        //Assert if in Books Page
        Assert.assertTrue(driver.getTitle().contains("Your store. Books"));

        driver.findElement(By.linkText("Selenium Book")).click();
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Selenium WebDriver"));

        //Click on Add to Cart
        driver.findElement(By.id("add-to-cart-button-2")).click();
        utils.waitForSomeMilliSeconds(10000);

        //Go to Shopping Cart
        goToShoppingCart();
        utils.waitForSomeMilliSeconds(5000);
        //Assert in shopping cart
        Assert.assertTrue(driver.getTitle().contains("Your store. Shopping Cart"));

        //Selecting the item to remove
        driver.findElement(By.name("removefromcart")).click();

        //Click on update shopping cart
        driver.findElement(By.name("updatecart")).click();

        //Assert if shopping cart is empty
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Your Shopping Cart is empty!"));
    }
}
