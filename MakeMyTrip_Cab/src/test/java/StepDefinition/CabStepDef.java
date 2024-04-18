package StepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverSetup.SetupDriver;
import PageFactory.CabPF;
import PageFactory.CabPFRound;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CabStepDef {
     static WebDriver driver;
	 CabPF cpf;
	 CabPFRound cbr;
	
	
	@Given("User is on Homepage")
	public void user_is_on_homepage() throws InterruptedException 
	{
	  driver=SetupDriver.chromeDriver();
	  
	}

	@When("User selects Cab option")
	public void user_selects_cab_option() throws InterruptedException 
	{
	   cpf=new CabPF(driver);
       cpf.clickCab();

	}

	@And("User selects Outstaion One-Way option")
	public void user_selects_outstaion_one_way_option() 
	{
		//cpf.clickOneWay();
		System.out.println("One way clicked");
	}

	@And("User enters the details {string},{string},{string} and {string}")
	public void user_enters_the_details_and(String source, String destin, String date, String time) throws InterruptedException, AWTException {
	
     cpf.enterSource(source);
     cpf.enterDest(destin);
     cpf.enterDate(date);
     cpf.enterTime(time);
	}

	@And("click on Search button")
	public void click_on_search_button() {
		cpf.SearchOneWay();
	}

	@Then("Landing page of Outstaion One-Way is opened")
	public void landing_page_of_outstaion_one_way_is_opened() throws InterruptedException 
	{
	   
	   //System.out.println(cpf.landingPage());
	   String msg = cpf.landingPage();
		Assert.assertTrue(msg.contains("cabs from Mumbai to Delhi"));
		//driver.close();
	}



   
	
//--------------------------------------------Scenario 2-----------------------
	@When("User clicks on Outstation Round-Trip")
	public void user_clicks_on_outstation_round_trip() 
	{
		 cpf.clickRoundTrip();
	}

	@When("User enters {string},{string},{string},{string} ,{string} and {string}")
	public void user_enters_and(String source, String destina, String depat_date, String return_date, String pick_time, String drop_time) throws InterruptedException, AWTException 
	{
	    cpf.enterSource(source);
	    cpf.enterDest(destina);
	    cpf.enterDateRound();
	    cpf.enterTime(pick_time);   
	}

	@When("Click on the Search button")
	public void click_on_the_search_button() 
	{
	    cpf.roundSearch();
	}

	@Then("Landing page of Outstation Round-Trip is opened")
	public void landing_page_of_outstation_round_trip_is_opened() 
	{
		 String msg=cpf.landing_pageRound();
		   Assert.assertTrue(msg.contains("cabs from Mumbai to Pune"));
		   //driver.close();
	}

//-------------------------------------Scenario 3---------------------------------------
	
	@When("User clicks on Airport Transfer")
	public void user_clicks_on_airport_transfer() {
	  cpf.clickAirportTransfer();
	}
	
	@When("User enter the details")
	public void user_enters_the_details(DataTable dataTable) throws InterruptedException, AWTException {
	    List<List<String>> data=dataTable.asLists(String.class);
	    cpf.clickPickType(data.get(0).get(1));
	    cpf.fromPort(data.get(1).get(1));
	    cpf.toLocation(data.get(2).get(1));
	    cpf.enterDate(data.get(3).get(1));
	    cpf.enterrTime(data.get(4).get(1));

	    
	}
	@When("Click on the search button")
	public void click_on_the_search_button_from_port() {
	    cpf.portSearch();
	}
	
	@When("User click on book cab from the given options")
	public void user_click_on_book_cab_from_the_given_options() throws AWTException {
	    cpf.bookCab();
	}
	
	@Then("Landing page of cab booking is opened and user review the booking")
	public void landing_page_of_cab_booking_is_opened_and_user_review_the_booking() {
	  String msg=cpf.fromPortLanding();
	  Assert.assertTrue(msg.contains("Review Booking"));
	  //driver.close();
	}
	
	
//-----------------------------------------------------Scenario 4-------------------------------------
	@When("User clicks on Hourly Rental")
	public void user_clicks_on_hourly_rental() 
	{
	 cpf.bookRental();
	}
	@When("User enters the details of trip")
	public void user_enters_the_details_of_trip(DataTable dataTable) throws InterruptedException, AWTException {
		List<List<String>> data=dataTable.asLists(String.class);
		  cpf.rentFromLoc(data.get(0).get(1));
		  cpf.rentalDate(data.get(1).get(1));
		  cpf.enter_rental_time(data.get(2).get(1));
		  cpf.packages(data.get(3).get(1));
	}
	
	@And("click on search button")
	public void click_on_search_rental_button() {
	    
	    cpf.rentalSearch();
	}
	
	@Then("Landing page of Hourly Rental is opened")
	public void landing_page_of_hourly_rental_is_opened() {
	  System.out.println( cpf.landingPageRental());
	}
	
	@And("User applies for an EV cab")
	public void user_applies_for_an_ev_cab() {
	 cpf.fuelType();
	}
	
	@And("User click on Book cab")
	public void user_click_on_book_cab() {
	cpf.bookRentalCab();
	}
	
	@Then("review page of booking is opened")
	public void review_page_of_booking_is_opened() {
	String msg=cpf.booking_review_rental();
	Assert.assertTrue(msg.contains("Review Booking"));
	//driver.close();
	}
	
//-----------------------------------------------Scenario 5-----------------------------------------
	

	@When("user clicks on airport transfer")
	public void user_clicks_on_airport_transfer1() {
	    cpf.clickAirportTransfer();
	}
	
	@And("user enters the details of trip from one airport to another airport")
	public void user_enters_the_details_of_trip_from_one_airport_to_another_airport(DataTable dataTable) throws AWTException, InterruptedException {
	    List<List<String>> data=dataTable.asLists(String.class);
	    cpf.toAirportTransfer(data.get(0).get(0));
	    cpf.toSourcePort(data.get(0).get(1));
	    cpf.toPort(data.get(0).get(2));
	    cpf.enterDate(data.get(0).get(3));
	    cpf.enterrTime(data.get(0).get(4));
	    
	}
	
	@And("click on the search button")
	public void click_on_the_search_button1() {
		cpf.portSearch();
	}
	
	@Then("list of cabs are displayed")
	public void list_of_cabs_are_displayed() {
	   String msg=cpf.landingToPort();
	   System.out.println(msg);
       Assert.assertTrue(msg.contains("Showing"));
	   
	}
	
	
	
//-----------------------------------------------------------------------------------------
    @AfterStep
	public static void takeScreendown(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	


    }
}
