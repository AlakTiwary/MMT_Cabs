package PageFactory;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CabPFRound 
{
		WebDriver driver;
		public CabPFRound(WebDriver driver) 
		{
		   this.driver=driver;
		   PageFactory.initElements(driver,this);  
		}
		public void ExplicitWait(WebElement element,int time)
		{
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.elementToBeSelected(element));
		}
		@FindBy(xpath="//span[@aria-label=\"Previous Month\"]")
		WebElement prevDateBtn;
		
		@FindBy(xpath="//span[@aria-label=\"Next Month\"]")
		WebElement nxtDateBtn;
		
	    @FindBy(xpath="//label[contains(@for,'departure')]")
	    WebElement dateDeparture;
	    
		@FindBy(xpath="//div[@class=\"DayPicker-Months\"]/child::div[1]/child::div[1]/child::div")
		WebElement monthAndYear;

	    @FindBy(xpath="//div[@class=\"DayPicker-Day\"]")
        List<WebElement> datePath;
		
	    public void enterDate(String dep_date) throws InterruptedException  {
	    	ExplicitWait(dateDeparture,2);
	    
	    	JavascriptExecutor js=(JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,150)");
	    	String[] date=dep_date.split(",");
	    	String day=date[0];
	    	String monthYear=date[1];
	    	Boolean flag=true;
	    	while(flag==true) 
	    	{
	    	   if(monthYear.equalsIgnoreCase(monthAndYear.getText()))
	    	    {
	    		    break;
	    	    }
	    	   else {
	    		   ExplicitWait(nxtDateBtn,2);
	    		   nxtDateBtn.click();
	    	   }
	    	   
	    	}
	    	//List<WebElement> days=datePath;
	    	for(WebElement d:datePath)
	    	{
	    		String dayOfDate=d.getText();
	    		if(dayOfDate.equals(day)) 
	    		{
	    			d.click();
	    			break;
	    		}
	    	}
	    	
	    }
		
}