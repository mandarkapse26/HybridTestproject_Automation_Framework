package Formfillup_Homepg;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Base.BaseClass;
import Login_HomePage.homepage;

public class formfillupPg extends homepage {
	
	By name = By.xpath("//*[@id='post-body-3077692503353518311']//input[1]");
    By lastName = By.xpath("(//*[@type='text'])[2]");
    By gender = By.id("sex-0");
    By dateofbirth = By.id("datepicker");
    By manual = By.id("profession-0"); 
    By automations = By.xpath("//*[@id=\"profession-1\"]");
    By tool = By.xpath("//*[@id=\"tool-0\"]");
    By selenDriver = By.xpath("//*[@id=\"tool-2\"]");
    By continents = By.xpath("//*[@id=\"continents\"]/option[5]");
    By photo = By.id("photo");
    String path = "M:\\WhatsApp Image 2024-10-05 at 11.04.36_4435c351.jpg";
    
    By soures = By.id("drag1"); 
    By destine = By.id("div2");
    
      By dclick = By.xpath("//*[@ondblclick=\"myFunction()\"]");
      By rclick = By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div[2]/span");
      By editbt = By.xpath("/html/body/ul/li");
      By finalSub = By.xpath("(//*[@id='submit'])[2]");
      By backbt = By.id("submit");
      
    public void Access() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    	driver.findElement(name).sendKeys("Mandar");
    	driver.findElement(lastName).sendKeys("Kapse");
    	driver.findElement(gender).click();
    	driver.findElement(dateofbirth).sendKeys("23/04/2001");
    	driver.findElement(manual).click();    	
    	driver.findElement(automations).click();
    	driver.findElement(tool).click();
    	driver.findElement(selenDriver).click();
    	driver.findElement(continents).click();
    	
    	Thread.sleep(3000);
    	driver.findElement(photo).sendKeys(path);
    	
    	WebElement src = driver.findElement(soures);
        WebElement dest = driver.findElement(destine);
        Actions drop = new Actions(driver);
        drop.dragAndDrop(src, dest).perform();
        
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,1500)");
        
        Thread.sleep(5000); 
       WebElement doublec = driver.findElement(dclick);
 	   Actions mb = new Actions(driver);
 	   mb.doubleClick(doublec).build().perform();
 	  Thread.sleep(4000);
 	   Alert alert =driver.switchTo().alert();
 	   alert.accept();
 	   
 	  WebElement click = driver.findElement(rclick);
 	  Actions clicka = new Actions(driver);
 	  clicka.contextClick(click).build().perform();
 	  driver.findElement(editbt).click();
 	 
 	  driver.findElement(finalSub).click();
 	  Thread.sleep(2000);
 	  driver.findElement(backbt).click();
        
      

    	
    }

}
