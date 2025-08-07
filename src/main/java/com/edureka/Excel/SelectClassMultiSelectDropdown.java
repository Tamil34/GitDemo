package com.edureka.Excel;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectClassMultiSelectDropdown
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\tamilselvi.murugesan\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
        driver.get("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        driver.manage().window().maximize();

        WebElement multiSelect = driver.findElement(By.name("multipleselect[]"));
        Select select = new Select(multiSelect);

        if (select.isMultiple()) 
        {
            select.selectByVisibleText("Selection Item 1");
            //select.selectByVisibleText("Selection Item 2");
            select.selectByIndex(2); // Selection Item 3
        }
        Select dropdownbutton=new Select(driver.findElement(By.name("dropdown")));
        List<WebElement> elementCount=dropdownbutton.getOptions();
        System.out.println(elementCount.size());
        dropdownbutton.selectByIndex(5);
         select.deselectAll();
         driver.quit();
		}

}
