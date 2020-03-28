package com.qa.crm.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase {
	
	public static Properties prop;
	public static WebDriver driver;

	public Testbase()
	{
		try {
			
			 prop=new Properties();

			FileInputStream fp=new FileInputStream("C:\\Users\\Shilpa Khandge\\eclipse-workspace\\CucumberPOMDemo\\src\\main\\java"
					+ "\\com\\qa\\crm\\config\\config.properties");
			prop.load(fp);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void initialization()
	{
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("Url");
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shilpa Khandge\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
			 driver=new ChromeDriver();
			
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(testUtil.pageloadtime, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(testUtil.implicittime, TimeUnit.SECONDS);
		driver.get(url);

	}
}

