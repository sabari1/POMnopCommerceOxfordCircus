package POMnopCommerceOxfordCircus;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by SONY on 22-Oct-14.
 */
public class BaseTest extends BasePage {
    @Before
    public static void before()
    {
        driver = new FirefoxDriver();
        driver.get("http://sangajala2-001-site1.smarterasp.net/");
        driver.manage().window().maximize();
    }

    @After
    public static void after() {
        driver.quit();
        driver = null;
    }
}