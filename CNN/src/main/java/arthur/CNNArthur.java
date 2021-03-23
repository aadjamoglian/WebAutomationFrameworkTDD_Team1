package arthur;

import common.WebAPI;
import org.openqa.selenium.By;

public class CNNArthur extends WebAPI {

    // Action Methods

    // Checking nav bar

    public void checkNavLinkUs () throws InterruptedException {
        driver.findElement(By.linkText("US")).click();
        sleepFor(2);
    }

    public void checkNavLinkWorld () throws InterruptedException {
        driver.findElement(By.linkText("World")).click();
        sleepFor(2);
    }

}
