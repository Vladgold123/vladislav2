import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class secondSelenium {
    FirefoxDriver wd;
    
    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    
    @Test
    public void secondSelenium() {
        wd.get("https://www.bugfinders.com/");
        wd.findElement(By.linkText("SIGN IN")).click();
        wd.findElement(By.id("un")).click();
        wd.findElement(By.id("un")).clear();
        wd.findElement(By.id("un")).sendKeys("krimgold@gmail.com");
        wd.findElement(By.id("pw")).click();
        wd.findElement(By.id("pw")).clear();
        wd.findElement(By.id("pw")).sendKeys("Zx362452");
        wd.findElement(By.id("form-submit-btn")).click();
        wd.findElement(By.id("nav-home")).click();
        wd.findElement(By.linkText("[Details]Watching Videos>Video is displayed incorrectly")).click();
    }
    
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
    
    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
