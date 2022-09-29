package com.application;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebApplication {

	
	public static void main(String[] args){

	//For Chrome Browser

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\durgasindhu\\Downloads\\chromedriver_win32/chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	//get title of page
	System.out.println("Title:"+driver.getTitle());
	WebElement email=driver.findElement(By.id("email"));
	//email.sendKeys("ravi10thstudent@gmail.com");
	email.sendKeys("admin@gmail.com");
	
	WebElement pass=driver.findElement(By.id("pass"));
	//pass.sendKeys("ravi28394");
	pass.sendKeys("admin123");
	try {
        Thread.sleep(2000);
    } catch (Exception e) {
        e.printStackTrace();
    }
	WebElement login=driver.findElement(By.name("login_source"));
	login.submit();

	}
	}

