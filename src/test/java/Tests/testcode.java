package Tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Base.BaseClass;
import Formfillup_Homepg.formfillupPg;
import Login_HomePage.homepage;

public class testcode extends formfillupPg {

@BeforeMethod
	
	public void firstp() {
	//testcode obj = new testcode();
	setup();
	loginAccount();
	
}
		
		@Test
		public void second() throws InterruptedException {
			//testcode obj = new testcode();
			Access();
			takeScreenshot("ScreenShots");
	}

	@AfterMethod
	public void closebr() {
		driver.close();

	}
}

