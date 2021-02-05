package cts.seleniumday6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDay6Tasks {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\intel\\eclipse-workspace\\cts.seleniumday6\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Day06 task03
	/*	 driver.get("http://greenstech.in/selenium-course-content.html");
		 WebElement btninterview = driver.findElement(By.xpath("//div[@id='heading20']"));
		btninterview.click();
		Thread.sleep(2000);
		WebElement rightClick = driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"));
		Actions n = new Actions(driver);
		n.contextClick(rightClick).perform();
		Robot click = new Robot();
		for(int i=1; i<=2;i++) {
		click.keyPress(KeyEvent.VK_DOWN);
		click.keyRelease(KeyEvent.VK_DOWN);
		click.keyPress(KeyEvent.VK_ENTER);
		click.keyRelease(KeyEvent.VK_ENTER); 
		}                                                                           */
		
		//// Day06 task04
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnclk = driver.findElement(By.xpath("(//h2[@class='mb-0'])[6]"));
		Actions framewrk = new Actions(driver);
		framewrk.contextClick(btnclk).perform();
		Robot rightclk= new Robot();
		for (int i = 1; i <=8; i++) {
			rightclk.keyPress(KeyEvent.VK_DOWN);
			rightclk.keyRelease(KeyEvent.VK_DOWN);
	}
		rightclk.keyPress(KeyEvent.VK_ENTER);
		rightclk.keyRelease(KeyEvent.VK_ENTER);                     */
		
		// Day06 task05
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnmodelresume = driver.findElement(By.xpath("(//h2[@class='mb-0'])[2]"));
	    btnmodelresume.click();
	    WebElement rightclk = driver.findElement(By.xpath("//a[text()='Resume Model-4 ']"));
	    Actions rcc = new Actions(driver);
	    rcc.contextClick(rightclk).perform();
	    Robot cc = new Robot();
	    for (int i = 1; i < 5; i++) {
	    	cc.keyPress(KeyEvent.VK_DOWN);
	    	cc.keyRelease(KeyEvent.VK_DOWN);
			}
	    cc.keyPress(KeyEvent.VK_ENTER);
	    cc.keyRelease(KeyEvent.VK_ENTER);                   */
	    
		// Day06 task06
/*		driver.get(" http://greenstech.in/selenium-course-content.html");
	    WebElement clkRPA = driver.findElement(By.xpath("//a[@title='RPA Training in chennai']"));
	    Actions cc = new Actions(driver);
	    cc.contextClick(clkRPA).perform();
     	Robot aa = new Robot();
   	   for (int i = 1; i < 7; i++) {
		aa.keyPress(KeyEvent.VK_DOWN);
    	aa.keyRelease(KeyEvent.VK_DOWN);
		}
	    aa.keyPress(KeyEvent.VK_ENTER);
        aa.keyRelease(KeyEvent.VK_ENTER);                                                   */
		//Day06 task07
	/*	driver.get("http://greenstech.in/selenium-course-content.html");
		WebElement btnclk = driver.findElement(By.xpath("//div[@class='card-headercore-sel d-flex align-items-center justify-content-between']"));
		btnclk.click();
		WebElement btnselenium = driver.findElement(By.xpath("//a[@href='http://greenstech.in/August-2019/Selenium Day6.txt']"));
		Actions b = new Actions(driver);
		b.contextClick(btnselenium).perform();
		Robot c = new Robot();
		for (int i =1 ; i <=6; i++) {
			c.keyPress(KeyEvent.VK_DOWN);
			c.keyRelease(KeyEvent.VK_DOWN);
			
		}
		c.keyPress(KeyEvent.VK_ENTER);
		c.keyRelease(KeyEvent.VK_ENTER);                                                    */
		
		//Day Task09
	/*	driver.get(" https://www.amazon.in/");
		WebElement btndropdown = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
		Actions dropdown = new Actions(driver);
		dropdown.moveToElement(btndropdown).perform();
		WebElement btnsign = driver.findElement(By.xpath("(//span[@class='nav-action-inner'])[1]"));
		btnsign.click();
		WebElement btnclk = driver.findElement(By.xpath("//input[@id='ap_email']"));
		btnclk.sendKeys("9667744");
		Actions s = new Actions(driver);
		WebElement btn = driver.findElement(By.xpath("//input[@id='ap_email']"));
		s.doubleClick(btn).perform();
		WebElement xpathrightclick = driver.findElement(By.xpath("//input[@id='ap_email']"));
		Actions p =new Actions(driver);
		p.contextClick(xpathrightclick).perform();
		Robot n = new Robot();
		for (int i = 1; i <=1; i++) {
		n.keyPress(KeyEvent.VK_DOWN);
		n.keyRelease(KeyEvent.VK_DOWN);
		}
		n.keyPress(KeyEvent.VK_ENTER);
		n.keyRelease(KeyEvent.VK_ENTER);                                                    */
		//task 12
	/*	driver.get("https://www.flipkart.com/");
		WebElement btnclose = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		btnclose.click();
	    WebElement selectitem = driver.findElement(By.xpath("(//div[@class='_3LU4EM'])[2]"));
	    Actions oo= new Actions(driver);
	    oo.contextClick(selectitem).perform();
	    Robot m = new Robot();
	    for (int i = 1; i <5; i++) {
	    m.keyPress(KeyEvent.VK_DOWN);
	    m.keyRelease(KeyEvent.VK_DOWN);
	    }
	    m.keyPress(KeyEvent.VK_ENTER);
	    m.keyRelease(KeyEvent.VK_ENTER);                           */
		
		//day 06 task 01
/*		driver.get("https://www.facebook.com/");
		WebElement txtbox = driver.findElement(By.xpath("//input[@id='email']"));
	    Robot e =  new Robot();
	    //email write
	    e.keyPress(KeyEvent.VK_G);
	    e.keyRelease(KeyEvent.VK_G);
	    e.keyPress(KeyEvent.VK_U);
	    e.keyRelease(KeyEvent.VK_U);
	    e.keyPress(KeyEvent.VK_N);
	    e.keyRelease(KeyEvent.VK_N);
	    e.keyPress(KeyEvent.VK_A);
	    e.keyRelease(KeyEvent.VK_A);
	    e.keyPress(KeyEvent.VK_2);
	    e.keyRelease(KeyEvent.VK_2);
	    e.keyPress(KeyEvent.VK_8);
	    e.keyRelease(KeyEvent.VK_8);
	    //to select all corresponding value
	    e.keyPress(KeyEvent.VK_CONTROL);
	    e.keyPress(KeyEvent.VK_A);
	    e.keyRelease(KeyEvent.VK_CONTROL);
	    e.keyRelease(KeyEvent.VK_A);
	    //to cut the value
	    e.keyPress(KeyEvent.VK_CONTROL);
	    e.keyPress(KeyEvent.VK_X);
	    e.keyRelease(KeyEvent.VK_CONTROL);
	    e.keyRelease(KeyEvent.VK_X);
	    //to press tab key
	    e.keyPress(KeyEvent.VK_TAB);
	    e.keyRelease(KeyEvent.VK_TAB);
	    //to paste corresponding value
	    e.keyPress(KeyEvent.VK_CONTROL);
	    e.keyPress(KeyEvent.VK_V);
	    e.keyRelease(KeyEvent.VK_CONTROL);
	    e.keyRelease(KeyEvent.VK_V);
	     //to press tab key
	    e.keyPress(KeyEvent.VK_TAB);
	    e.keyRelease(KeyEvent.VK_TAB);
	    //press login key
	    e.keyPress(KeyEvent.VK_ENTER);
	    e.keyRelease(KeyEvent.VK_ENTER);
	
                                                               */
		//Day06 task02
	/*	driver.get("https://www.google.co.in/webhp");
		WebElement txtboxGoogle = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		txtboxGoogle.sendKeys("velmurugan");
		Actions txt =new Actions(driver);
		WebElement txtboxragu = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		txt.doubleClick(txtboxragu).perform();
		WebElement txtboxcut = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		Robot acc = new Robot();
		acc.keyPress(KeyEvent.VK_CONTROL);
		acc.keyPress(KeyEvent.VK_X);
		acc.keyRelease(KeyEvent.VK_CONTROL);
		acc.keyRelease(KeyEvent.VK_X);                                                      */
		

		
		
	}
	}


		
		
		
		
		
		
		


