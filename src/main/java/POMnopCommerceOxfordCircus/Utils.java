package POMnopCommerceOxfordCircus;

import java.util.concurrent.TimeUnit;

/**
 * Created by SONY on 22-Oct-14.
 */
public class Utils extends BasePage {

    public void waitForSomeMilliSeconds(Integer timeMilliSec){
        //driver.manage().timeouts().implicitlyWait(timeinseconds, TimeUnit.SECONDS);
        try {
            Thread.sleep(timeMilliSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
