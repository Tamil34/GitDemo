package com.edureka.Excel;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import javax.imageio.ImageIO;

public class TakeScreenshotInterface {

	public static void main(String[] args) throws IOException 
	{
     System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
     WebDriver driver=new EdgeDriver();
     driver.get("https://www.browserstack.com/");
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     driver.manage().window().maximize();
    TakesScreenshot shot=(TakesScreenshot) driver;
    File SrcFile=shot.getScreenshotAs(OutputType.FILE);
    File descFile=new File("C:\\Users\\tamilselvi.murugesan\\Downloads\\seleniumTests\\screenshot.png");
    FileUtils.copyFile(SrcFile, descFile);
    Screenshot  screenshot=new AShot()
    		.shootingStrategy(ShootingStrategies.viewportPasting(1000))
    		.takeScreenshot(driver);
    ImageIO.write(screenshot.getImage(), "PNG", new File("C:\\Users\\tamilselvi.murugesan\\Downloads\\seleniumTests\\fullpage.png"));
    driver.quit();
	}

}
