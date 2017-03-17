/**
 * 
 */
package com.selenium.advanced;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Dell
 *
 */
public class GeckoDriverDemo {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver;
				System.setProperty("webdriver.firefox.marionette", "D:\\stwn\\StwnRepo\\jars\\geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://newtours.demoaut.com/");
				Thread.sleep(5000);
				driver.quit();		
	}

}
