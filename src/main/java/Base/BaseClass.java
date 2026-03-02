package Base;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public static WebDriver driver;
    public static Properties prop;
    private static final Logger log = LogManager.getLogger(BaseClass.class);

    // ✅ Setup Method
    public void setup() {

        log.info("Start code");

        try {
            prop = new Properties();
            FileInputStream ff = new FileInputStream(
                    "C:\\Users\\manda\\eclipse-workspace\\HybridTestproject_Automation_Framework\\config.properties");

            prop.load(ff);
            log.info("Config file loaded");

        } catch (Exception e) {
            e.printStackTrace();
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(prop.getProperty("url"));

        log.info("URL opened");
    }

    // ✅ Screenshot Method
    public void takeScreenshot(String testName) {

        try {

            String timeStamp =
                    new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

            File src = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            File dest = new File(System.getProperty("user.dir")
                    + "/ScreenShots/" + testName + "_" + timeStamp + ".jpg");

            FileUtils.copyFile(src, dest);

            log.info("Screenshot taken successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}