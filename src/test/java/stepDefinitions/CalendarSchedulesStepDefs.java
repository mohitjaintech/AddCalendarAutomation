package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import Utils.AddScheduleReccurrenceKeywords;
import Utils.CalendarSchedulesRecurrencePayload;
import groovy.util.logging.Log;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/** CalendarSchedulesStepDefs class contains step definition of Add_Schedule_Recurrences_Automation_Scenarios.feature*/

public class CalendarSchedulesStepDefs {
	private static final String BASE_URL = "https://api-staging.docasap.com";
	private static final String ADD_SCHEDULE_URL_STRING = "/schedule-management/rules/add";
	static Logger log = Logger.getLogger(Log.class.getClass());
	String log4jConfPath = "log4j.properties";
	private static Response response;

	public CalendarSchedulesStepDefs()
	{
		PropertyConfigurator.configure(log4jConfPath);
	}
	
	// calendarIsAvailable is just created here to make feature file readability in terms of functionality point of view
	@Given("^CalendarAPI is available to set custom schedule with recurrences$")
	public void calendarIsAvailable() {
		log.info("CalendarAPI is available..");

	}
	
	//step def to verify the daily recurrence
	@When("^Set Daily Recurrence with User Provided Start Date , Ends on Never$")
	public void setDailyRecurrence(List<Map<String, String>> calendarSchedulesParams) {

		log.info("Adding a new daily reccurrence schedule event in Calendar");

		String ruleName = calendarSchedulesParams.get(0).get("RuleName");
		String startDate = calendarSchedulesParams.get(0).get("StartDate");
		String repeatEvery = calendarSchedulesParams.get(0).get("RepeatEvery");
		String endDate = calendarSchedulesParams.get(0).get("EndDate");
		String numOfOccurrences = calendarSchedulesParams.get(0).get("NumOfOccurrences");

		RequestSpecification request = setBaseURI();
		request.header("Content-Type", "application/json");
		CalendarSchedulesRecurrencePayload dailyRecurrencePayloadObj= AddScheduleReccurrenceKeywords.AddDailyReccurrenceRule(ruleName, startDate, repeatEvery, endDate, numOfOccurrences);
		response= request.given().when().body(dailyRecurrencePayloadObj).post(ADD_SCHEDULE_URL_STRING);
		
		
	}
	
	//step def to verify the weekly recurrence
	@When("^Set Weekly Recurrence with User Provided Start Date , Ends on Never$")
	public void setWeeklyRecurrence(List<Map<String, String>> calendarSchedulesParams) {

		log.info("Adding a new Weekly reccurrence schedule event in Calendar");

		String ruleName = calendarSchedulesParams.get(0).get("RuleName");
		String startDate = calendarSchedulesParams.get(0).get("StartDate");
		String repeatEvery = calendarSchedulesParams.get(0).get("RepeatEvery");
		String repeatBy = calendarSchedulesParams.get(0).get("RepeatBy");
		String endDate = calendarSchedulesParams.get(0).get("EndDate");
		String numOfOccurrences = calendarSchedulesParams.get(0).get("NumOfOccurrences");

		RequestSpecification request = setBaseURI();
		request.header("Content-Type", "application/json");
		CalendarSchedulesRecurrencePayload weeklyRecurrencePayloadObj= AddScheduleReccurrenceKeywords.AddWeeklyReccurrenceRule(ruleName, startDate, repeatEvery, repeatBy, endDate, numOfOccurrences);
		response= request.given().when().body(weeklyRecurrencePayloadObj).post(ADD_SCHEDULE_URL_STRING);
		
	}
	
	//step def to verify the monthly recurrence
	@When("^Set Monthly Recurrence with User Provided Start Date , Ends on Never$")
	public void setMonthlyRecurrence(List<Map<String, String>> calendarSchedulesParams) {

		log.info("Adding a new Monthly reccurrence schedule event in Calendar");

		String ruleName = calendarSchedulesParams.get(0).get("RuleName");
		String startDate = calendarSchedulesParams.get(0).get("StartDate");
		String repeatEvery = calendarSchedulesParams.get(0).get("RepeatEvery");
		String repeatBy = calendarSchedulesParams.get(0).get("RepeatBy");
		String endDate = calendarSchedulesParams.get(0).get("EndDate");
		String numOfOccurrences = calendarSchedulesParams.get(0).get("NumOfOccurrences");

		RequestSpecification request = setBaseURI();
		request.header("Content-Type", "application/json");
		CalendarSchedulesRecurrencePayload monthlyRecurrencePayloadObj= AddScheduleReccurrenceKeywords.AddMonthlyReccurrenceRule(ruleName, startDate, repeatEvery, repeatBy, endDate, numOfOccurrences);
		response= request.given().when().body(monthlyRecurrencePayloadObj).post(ADD_SCHEDULE_URL_STRING);
		
	}
	
	//step def to verify the yearly recurrence
	@When("^Set Yearly Recurrence with User Provided Start Date , Ends on Never$")
	public void setYearlyRecurrence(List<Map<String, String>> calendarSchedulesParams) {

		log.info("Adding a new Yearly reccurrence schedule event in Calendar");

		String ruleName = calendarSchedulesParams.get(0).get("RuleName");
		String startDate = calendarSchedulesParams.get(0).get("StartDate");
		String repeatEvery = calendarSchedulesParams.get(0).get("RepeatEvery");
		String repeatBy = calendarSchedulesParams.get(0).get("RepeatBy");
		String endDate = calendarSchedulesParams.get(0).get("EndDate");
		String numOfOccurrences = calendarSchedulesParams.get(0).get("NumOfOccurrences");

		RequestSpecification request = setBaseURI();
		request.header("Content-Type", "application/json");
		CalendarSchedulesRecurrencePayload yearlyRecurrencePayloadObj= AddScheduleReccurrenceKeywords.AddYearlyReccurrenceRule(ruleName, startDate, repeatEvery, repeatBy, endDate, numOfOccurrences);
		response= request.given().when().body(yearlyRecurrencePayloadObj).post(ADD_SCHEDULE_URL_STRING);
		
	}
	
	// verifyScheduleIsSet to verify status code 200:OK for rules/add API call
	@Then("^Schedule must set in calendar for \"(.*)\" with Start Date , Ends on Never$")
	public void verifyScheduleIsSet(String recurrenceType) {	
		System.out.println(response.getStatusLine());
		response.then().statusCode(200);
		log.info("Calendar for :"+recurrenceType+" is Set successfully..");
	}


	private RequestSpecification setBaseURI() {
		log.info("Setting base URI..");
		RestAssured.baseURI = BASE_URL;
		RequestSpecification request = RestAssured.given();
		return request;
	}


}
