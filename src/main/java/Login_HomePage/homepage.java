package Login_HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.BaseClass;

public class homepage extends BaseClass{
	// ================= LOGIN =================
	By log = By.xpath("//*[@id=\"navbar\"]/a");
	By user = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[1]/input");
	By pass = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[2]/input");
	By logbtn = By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div[2]/form/div[3]/button/span");
	

	
    // ================= LOGIN METHODS =================

    public void loginAccount() {
    driver.findElement(log).click();	
    driver.findElement(user).sendKeys("diti2019");	
    driver.findElement(pass).sendKeys("diti@123456");	
    driver.findElement(logbtn).click();	

    	
    
    }
}

