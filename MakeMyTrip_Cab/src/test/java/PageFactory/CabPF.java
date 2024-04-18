package PageFactory;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class CabPF{
	static WebDriver driver;
	
	public CabPF(WebDriver driver) 
	{   
		this.driver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	 public void ExplicitWait(WebElement webElement,int time){
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
			wait.until(ExpectedConditions.elementToBeClickable(webElement));
	 }
	 //Actions act=new Actions(driver);
	 @FindBy(xpath="//ul[@class=\"makeFlex font12 headerIconsGap\"]/child::li[7]/child::span/child::a")
	 WebElement homepageCab;
   
	@FindBy(xpath="//ul[@class=\"latoBlack greyText b2c_cswTabs\"]/child::li[1]")
	WebElement oneWay;
	
	@FindBy(xpath="//span[contains(text(),'From')]")
	WebElement source;
	
	@FindBy(xpath="//div[@class=\"csw outstationOneway\"]/child::div[1]/child::div/child::label/child::input[@id=\"to\"]")
	WebElement destination;
	
	@FindBy(xpath="//a[@data-cy=\"OutstationOneWayWidget_64\"]")
	WebElement searchOneWay;
	
	@FindBy(xpath="//input[contains(@placeholder,'From')]")
	WebElement sourceInput;
	
	@FindBy(xpath="//div[@role=\"combobox\"]/child::input")
	WebElement destInput;
	
	@FindBy(xpath="//div[contains(@role,'listbox')]")
	WebElement destList;
	
	@FindBy(xpath="//li[@role=\"option\"][1]")
	WebElement destReq;
	
    @FindBy(xpath="//label[contains(@for,'departure')]")
    WebElement dateDeparture;
    
    @FindBy(xpath="//div[@data-cy=\"OutstationRoundTripWidget_73\"]/label")
    WebElement dateDepartureR;
	
	@FindBy(xpath="//div[@class=\"DayPicker-Months\"]/child::div[1]/child::div[1]/child::div")
	WebElement monthAndYear;
	
	@FindBy(xpath="//div[@class=\"DayPicker-Months\"]/child::div[1]/child::div[1]/child::div[1]")
	WebElement monthAndYearR;
	
	@FindBy(xpath="//div[@class=\"DayPicker-Day\"]")
	List<WebElement> datePath;
	
	@FindBy(xpath="//div[@class=\"DayPicker-Day\"]")
	List<WebElement> datePathR;
	
	@FindBy(xpath="//div[@class=\"DayPicker-wrapper\"]/child::div/child::span[2]")
	WebElement nextButton;
	
	@FindBy(xpath="//li[@data-cy=\"HrSlots_81\"]")
	List<WebElement> hrTime;
	
	@FindBy(xpath="//ul[@class=\"newTimeSlotMinUl\"]/li")
	List<WebElement> minTime;
	
	@FindBy(xpath="//ul[@class=\"newTimeSlotMerUl\"]/li")
	List<WebElement> merTime;
	
	@FindBy(xpath="//span[@class=\"applyBtnText\"]")
	WebElement applyBtn;
	
	@FindBy(xpath="//ul[@class=\"newTimeSlotHrUl\"]")
	WebElement hrList;
	
	@FindBy(xpath="//ul[@class=\"newTimeSlotMinUl\"]")
    WebElement minList;
	
	@FindBy(xpath="//li[contains(@data-cy,'outstationRoundTrip')]")
	WebElement roundTrip;
	
    @FindBy(xpath="//li[@data-cy=\"airportTransfer\"]")
    WebElement airportTransfer;
    
    @FindBy(xpath="//label[contains(@for,'pickupType')]")
    WebElement pickType;
    
    @FindBy(xpath="//ul[@class=\"pickupTypePopup blackText\"]/child::li[1]")
    WebElement fromAirport;
    
    @FindBy(xpath="//ul[@class=\"pickupTypePopup blackText\"]/child::li[2]")
    WebElement toAirport;
    
    @FindBy(xpath="//input[@placeholder=\"AIRPORT\"]")
    WebElement fromPortInput;
    
    @FindBy(xpath="//ul[@role=\"listbox\"]/child::li[1]")
    WebElement dropdown;
    
    @FindBy(xpath="//div[@data-cy=\"AirportTransferWidget_30\"]")
    WebElement toClick;
    
    @FindBy(xpath="//input[contains(@placeholder,'To')]")
    WebElement portToLocation;
    
    @FindBy(xpath="//div[@data-cy=\"AirportTransferWidget_32\"]")
    WebElement timeClick;
    
    @FindBy(xpath="//div[@id=\"List\"]/child::div[1]/child::div/child::div[3]/child::div/child::a/child::span")
    WebElement cab_book;
    
    @FindBy(xpath="//li[@data-cy=\"hourlyRental\"]")
    WebElement hourlyRental;
    
    @FindBy(xpath="//span[@aria-label=\"Previous Month\"]")
	WebElement prevDateBtn;
	
	@FindBy(xpath="//span[@aria-label=\"Next Month\"]")
	WebElement nxtDateBtn;
	
	@FindBy(xpath="//span[@aria-label=\"Next Month\"]")
	WebElement nxtDateBtnR;	
	
	@FindBy(xpath="//span[@class=\"font16 tundoraBlackColor latoRegular\"]")
	WebElement landingPageOneWay;
	
	@FindBy(xpath="//div[@aria-label=\"Wed Apr 24 2024\"]")
	WebElement depRoundDate;
	
	@FindBy(xpath="//div[@aria-label=\"Sat Apr 27 2024\"]")
	WebElement retRoundDate;
	
	@FindBy(xpath="//a[@data-cy=\"OutstationRoundTripWidget_78\"]")
	WebElement searchRound;
	
	@FindBy(xpath="//span[@class=\"font16 tundoraBlackColor latoRegular\"]")
	WebElement landingPageRound;
	
	@FindBy(xpath="//div[@data-cy=\"HourlyCabRentalWidget_44\"]")
	WebElement rentalFromElement;
	
	@FindBy(xpath="//input[contains(@placeholder,'From')]")
	WebElement rentalLocInput;
	
	@FindBy(xpath="//div[@data-cy=\"HourlyCabRentalWidget_47\"]")
	WebElement packageClick;
	
	@FindBy(xpath="//li[@data-cy=\"Duration_43\"]")
	WebElement packages;
	
	@FindBy(xpath="//a[@data-cy=\"HourlyCabRentalWidget_49\"]")
	WebElement rentalSearch;
	
	@FindBy(xpath="//div[@class=\"headingText\"]")
	WebElement landingPageFromPort;
	
	@FindBy(xpath="//a[@data-cy=\"AirportTransferWidget_34\"]")
	WebElement portSearch;
	
	@FindBy(xpath="//ul[@class=\"react-autosuggest__suggestions-list\"]")
	WebElement rentFromSuggestion;
	
	@FindBy(xpath="//ul[@class=\"react-autosuggest__suggestions-list\"]/li[1]")
	WebElement reqLocation;
	
	@FindBy(xpath="//div[@data-cy=\"HourlyCabRentalWidget_45\"]")
	WebElement dateOptionRental;
	
	@FindBy(xpath="//div[@aria-label=\"Tue Apr 30 2024\"]")
	WebElement rental_date;
	
	@FindBy(xpath="//span[@class=\"font16 tundoraBlackColor latoRegular\"]")
	WebElement landingPageRental;
	
	@FindBy(xpath="//p[contains(text(),'Fuel Type')]/following::div[1]/child::span")
	WebElement evFuel;
	
	@FindBy(xpath="(//a[@data-testid=\"book_now_button\"])[1]")
    WebElement book_rental;  
    
	@FindBy(xpath="//div[contains(text(),'Review Booking')]")
	WebElement booking_review_rental;
	
	@FindBy(xpath="//div[@data-cy=\"HourlyCabRentalWidget_46\"]")
	WebElement rentalTime;
	
	@FindBy(xpath="//span[@class=\"applyBtnText\"]")
	WebElement applyBtnRental;
	
	@FindBy(xpath="//ul[@class=\"durationTimePopup blackText\"]/child::li[contains(text(),'2 hrs 20 kms')]")
	WebElement reqPack;
	
	@FindBy(xpath="//input[contains(@placeholder,'From')]")
	WebElement toSourceInput;
	
	@FindBy(xpath="//input[contains(@placeholder,'AIRPORT')]")
    WebElement  toPortInput;   
  
	public void clickCab() {
		homepageCab.click();
	}
	
	public void clickOneWay() {
		oneWay.click();
	}
    public void enterSource(String s) throws InterruptedException, AWTException  {
    	
    	ExplicitWait(source,10);
    	source.click();
    	ExplicitWait(sourceInput,10);
    	sourceInput.sendKeys(s);
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);	       
        r.keyRelease(KeyEvent.VK_ENTER);
    }
    public void enterDest(String dest) throws AWTException, InterruptedException  
        {
    	ExplicitWait(destInput,10);
    	destInput.sendKeys(dest);
    	ExplicitWait(destList,10);
    	ExplicitWait(destReq,10);
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);	       
        r.keyRelease(KeyEvent.VK_ENTER);
   
         }
    public void enterDate(String dep_date) throws InterruptedException  {
    	ExplicitWait(dateDeparture,10);
    
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
    		   ExplicitWait(nextButton,10);
    		   nextButton.click();
    	   }
    	   
    	}
    	
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
    
	
    public void enterDateRound() throws InterruptedException  {
//    	//ExplicitWait(dateDepartureR,2);
//    
//    	JavascriptExecutor js=(JavascriptExecutor) driver;
//    	js.executeScript("window.scrollBy(0,150)");
//    	String[] date=dep_date.split(",");
//    	String day=date[0];
//    	String monthYear=date[1];
//    	Boolean flag=true;
//    	while(flag==true) 
//    	{  
//    	   if(monthYear.equalsIgnoreCase(monthAndYearR.getText()))
//    	    {  flag=false;
//    		    break;
//    		    
//    	    }
//    	   else {
//    		   ExplicitWait(nxtDateBtn,6);
//    		   nxtDateBtn.click();
//    	   }
//    	   
//    	}
//    	//List<WebElement> days=datePath;
//    	for(WebElement d:datePathR)
//    	{   ExplicitWait(d,3);
//    		String dayOfDate=d.getText();
//    		if(dayOfDate.equals(day)) 
//    		{
//    			d.click();
//    			break;
//    		}
//    	}
    	ExplicitWait(depRoundDate,10);
    	depRoundDate.click();
    	ExplicitWait(retRoundDate,10);
    	retRoundDate.click();
    	
    	
    }
    
    
    
    public void enterTime(String timee) {
    	String[] tim=timee.split(":");
    	String hr=tim[0];
    	String min=tim[1];
    	String meredian=tim[2];
    	
    	for (WebElement  hour: hrTime) 
    	{

            //  Selecting the hour based on text
    		ExplicitWait(hrList,10);
            if (hour.getText().equals(hr)) {
            	ExplicitWait(hour,10);
                hour.click();
                break; 
            }
        }
    	ExplicitWait(minList,10);
    	for(WebElement minute:minTime) {
    		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",minute);
    		
    		if(minute.getText().equals(min)){
    			minute.click();
    			break;
    		}
    	}
    	for(WebElement mer:merTime) {
    		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", mer);
    		if(mer.getText().equals(meredian)) {
    			mer.click();
    			break;
    		}
    	}
    	applyBtn.click();
    	
    }
    public void SearchOneWay() {
    	ExplicitWait(searchOneWay,10);
		searchOneWay.click();
	}
    
    public String landingPage() {
    	ExplicitWait(landingPageOneWay,10);
    	String output=landingPageOneWay.getText();
    	return output;
    }
    public void clickRoundTrip()
    {
    	ExplicitWait(roundTrip,10);
        roundTrip.click();	
    }
    
    public void roundSearch() {
    	searchRound.click();
    }
    
    public String landing_pageRound() {
    	ExplicitWait(landingPageRound,10);
    	String msg=landingPageRound.getText();
    	return msg;
    }
    public void clickAirportTransfer() {
    	ExplicitWait(airportTransfer,10);
    	airportTransfer.click();
    }
    public void toAirportTransfer(String s) {
    	pickType.click();
    	ExplicitWait(toAirport,10);
    	toAirport.click();
    }
    public void clickPickType(String s) {
    	pickType.click();
    	ExplicitWait(fromAirport,10);
    	fromAirport.click();	
    }
    public void fromPort(String s) throws AWTException {
    	ExplicitWait(fromPortInput,10);
    	fromPortInput.sendKeys(s);
    	ExplicitWait(dropdown,10);
        dropdown.click();
    	Robot r=new Robot();
    	r.mouseMove(350, 350);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

    	
    }
    public void toLocation(String s) throws AWTException, InterruptedException {
        
        toClick.click();
    	portToLocation.sendKeys(s);
    	ExplicitWait(dropdown,10);
    	dropdown.click();
    	Robot r=new Robot();
    	r.mouseMove(420, 520);
        r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
    public void enterrTime(String s) {
    	ExplicitWait(timeClick,10);
    	timeClick.click();
    	applyBtn.click();
    	
    }
    
    public void portSearch() {
    	ExplicitWait(portSearch,10);
    	portSearch.click();
    }
    
    public String fromPortLanding() {
    	ExplicitWait(landingPageFromPort,10);
    	String msg=landingPageFromPort.getText();
    	return msg;
    }
    
    public void bookCab() throws AWTException {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,150)");
    	ExplicitWait(cab_book,10);
    	cab_book.click();  	
    }
    
    public void rentalSearch() {
    	ExplicitWait(rentalSearch,10);
    	rentalSearch.click();
    }
    public void bookRental() {
    	ExplicitWait(hourlyRental,10);
    	hourlyRental.click();
    }
    
    public void rentFromLoc(String s) throws AWTException, InterruptedException {
   
    	ExplicitWait(rentalFromElement,10);
    	rentalFromElement.click();
    	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
    	ExplicitWait(rentalLocInput,10);
    	rentalLocInput.sendKeys(s);
    	Thread.sleep(2000);
    	ExplicitWait(rentFromSuggestion,10);
    	ExplicitWait(reqLocation,10);
    	reqLocation.click();
    	
    	
    }
    public void rentalDate(String s) {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("window.scrollBy(0,200)");
    	ExplicitWait(dateOptionRental,10);
    	dateOptionRental.click();
    	ExplicitWait(rental_date,10);
    	rental_date.click();
    }
    public void enter_rental_time(String s) {
    	ExplicitWait(rentalTime,10);
    	rentalTime.click();
    	ExplicitWait(applyBtnRental,10);
    	applyBtnRental.click();
    	
    }
    
    public void packages(String s) throws AWTException, InterruptedException {
    	ExplicitWait(packageClick,10);
    	packageClick.click();
        ExplicitWait(reqPack,10);
        reqPack.click();

    }
    public String landingPageRental() {
    	ExplicitWait(landingPageRental,10);
    	String msg=landingPageRental.getText();
    	return msg;
    }
    
    public void fuelType() {
    	ExplicitWait(evFuel,10);
    	evFuel.click();
    }
    public void bookRentalCab() {
    	ExplicitWait(book_rental,10);
    	book_rental.click();
    }
    public String booking_review_rental() {//rental booking
    	ExplicitWait(booking_review_rental,10);
    	String msg=booking_review_rental.getText();
    	return msg;
    	
    }
    @FindBy(xpath="//div[@data-cy=\"AirportTransferWidget_27\"]")
    WebElement sourceWidget;
    
    @FindBy(xpath="//div[@data-cy=\"AirportTransferWidget_28\"]")
    WebElement toWidget;
    @FindBy(xpath="//div[@role=\"listbox\"]")
    WebElement suggestBox;
    @FindBy(xpath="//p[@class=\"appendBottom30 alertText textCenter\"]")
    WebElement landingPageToPort;
    
    public void toSourcePort(String s) throws AWTException {
    	//ExplicitWait(sourceWidget,6);
    	//sourceWidget.click();
    	ExplicitWait(toSourceInput,10);
    	toSourceInput.sendKeys(s);
    	ExplicitWait(suggestBox,10);
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);	       
        r.keyRelease(KeyEvent.VK_ENTER);
    }
    public void toPort(String s) throws AWTException {
    	ExplicitWait(toPortInput,10);
    	toPortInput.sendKeys(s);
    	ExplicitWait(suggestBox,10);
    	Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        r.keyPress(KeyEvent.VK_ENTER);	       
        r.keyRelease(KeyEvent.VK_ENTER);
    }
    public String landingToPort() {
    	ExplicitWait(landingPageToPort,10);
    	String msg=landingPageToPort.getText();
    	return msg;
    }
    
    
    
    


    
	
}