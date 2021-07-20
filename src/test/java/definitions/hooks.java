package definitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {
    public static WebDriver driver;

    @Before
    public static void setup(){
        System.setProperty("webDriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();

    }
   @After
    public static void  tearDown(){
        driver.manage().deleteAllCookies();
        driver.close();
   }

}
