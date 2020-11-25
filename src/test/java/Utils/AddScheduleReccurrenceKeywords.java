package Utils;

import java.util.Random;

import org.json.JSONObject;

/** AddScheduleReccurrenceKeywords class to generate Payload object for add schedule with all custom recurrence*/

public class AddScheduleReccurrenceKeywords {

	/** To generate Payload object for add 
	 * schedule with daily custom recurrence*/
	public static CalendarSchedulesRecurrencePayload AddDailyReccurrenceRule(String ruleName, String startDate, String repeatEvery,
			String endDate, String numOfOccurrences) {
		CalendarSchedulesRecurrencePayload scheduleParams = new CalendarSchedulesRecurrencePayload();
		scheduleParams.setUserId("1");
		String createRuleName=ruleName+"_"+new Random().nextInt(1000);
		Rule ruleObj = new Rule();
		ruleObj.setRuleGid("null");
		ruleObj.setsubRuleGid("null");
		ruleObj.setRuleId("null");
		ruleObj.setRuleCode(createRuleName);
		ruleObj.setSubRuleName(createRuleName);
		
		
		Schedule scheduleObj = new Schedule();
		scheduleObj.setBookingTypes("ALL");
		scheduleObj.setRecurrence("DAILY");
		scheduleObj.setStartDate(startDate);
		scheduleObj.setRepeatEvery(repeatEvery);
		scheduleObj.setApptLimitationValue(2);

		Ends endsObj = new Ends();
		if(endDate.toUpperCase().equals("NULL"))
		{
			if(numOfOccurrences.toUpperCase().equals("NULL"))
			{
				endsObj.setType("NEVER");
				endsObj.setOccurrence("null");
				endsObj.setDate("NULL");
			}
			else
			{
				endsObj.setType("null");
				endsObj.setOccurrence("numOfOccurrences");
				endsObj.setDate("NULL");
			}
		}
		else
		{
			endsObj.setType("null");
			endsObj.setOccurrence("null");
			endsObj.setDate("endDate");
		}

		scheduleObj.setEnds(endsObj);
		
		
		RepeatBy repeatByObj = new RepeatBy();
		repeatByObj.setPeriods(new String[] {"null"});
		repeatByObj.setDateRangeEndDate("");
		repeatByObj.setweekNumber("null");
		repeatByObj.setType("DATE");


		TimeRange timerangeArrayObj[]=new TimeRange[1];
		TimeRange timerangeObj= new TimeRange();
		timerangeObj.setDate(startDate);
		timerangeObj.setPeriod("null");
		timerangeObj.setFrom("00:00:00");
		timerangeObj.setTo("00:00:00");
		timerangeObj.setType("FULLDAY");
		timerangeArrayObj[0]=timerangeObj;

		repeatByObj.setTimeRange(timerangeArrayObj);

		scheduleObj.setRepeatBy(repeatByObj);

		Resources resourceObj = new Resources();
		resourceObj.setType("ALL_RESOURCES");
		resourceObj.setIds(new int[] {  });

		ApptTypes apptTypesObj = new ApptTypes();		
		apptTypesObj.setInternalReasonIds(new int[] { 1});
		apptTypesObj.setExternalReasonIds(new String[] { "abc"});
		apptTypesObj.setType("SOME_INT_VR");

		scheduleObj.setResources(resourceObj);
		scheduleObj.setApptTypes(apptTypesObj);
		scheduleParams.setSchedule(scheduleObj);
		scheduleParams.setRule(ruleObj);
		JSONObject scheduleParamsObj = new JSONObject( scheduleParams );
		System.out.println("Payload :"+scheduleParamsObj);
		return scheduleParams;
	}

	/** To generate Payload object for add 
	 * schedule with weekly custom recurrence*/
	public static CalendarSchedulesRecurrencePayload AddWeeklyReccurrenceRule(String ruleName, String startDate,
			String repeatEvery, String repeatBy, String endDate, String numOfOccurrences) {
		CalendarSchedulesRecurrencePayload scheduleParams = new CalendarSchedulesRecurrencePayload();
		scheduleParams.setUserId("1");
		String createRuleName=ruleName+"_"+new Random().nextInt(1000);
		Rule ruleObj = new Rule();
		ruleObj.setRuleGid("null");
		ruleObj.setsubRuleGid("null");
		ruleObj.setRuleId("null");
		ruleObj.setRuleCode(createRuleName);
		ruleObj.setSubRuleName(createRuleName);

		Schedule scheduleObj = new Schedule();
		scheduleObj.setBookingTypes("ALL");
		scheduleObj.setRecurrence("WEEKLY");
		scheduleObj.setStartDate(startDate);
		scheduleObj.setRepeatEvery(repeatEvery);
		scheduleObj.setApptLimitationValue(2);

		Ends endsObj = new Ends();
		if(endDate.toUpperCase().equals("NULL"))
		{
			if(numOfOccurrences.toUpperCase().equals("NULL"))
			{
				endsObj.setType("NEVER");
				endsObj.setOccurrence("null");
				endsObj.setDate("NULL");
			}
			else
			{
				endsObj.setType("null");
				endsObj.setOccurrence("numOfOccurrences");
				endsObj.setDate("NULL");
			}
		}
		else
		{
			endsObj.setType("null");
			endsObj.setOccurrence("null");
			endsObj.setDate("endDate");
		}

		scheduleObj.setEnds(endsObj);

		RepeatBy repeatByObj = new RepeatBy();
		String[] periodsArray=repeatBy.split(",");
		repeatByObj.setPeriods(periodsArray);
		repeatByObj.setDateRangeEndDate("");
		repeatByObj.setweekNumber("null");
		repeatByObj.setType("DAYS");

		TimeRange timerangeArrayObj[]=new TimeRange[periodsArray.length];
		for(int index=0;index<periodsArray.length;index++) {
			String periodIndex=Integer.toString(index+1);
			TimeRange timerangeObj= new TimeRange();
			timerangeObj.setDate("null");
			timerangeObj.setPeriod(periodIndex);
			timerangeObj.setFrom("00:00:00");
			timerangeObj.setTo("00:00:00");
			timerangeObj.setType("FULLDAY");	
			timerangeArrayObj[index]=timerangeObj;
		}


		repeatByObj.setTimeRange(timerangeArrayObj);

		scheduleObj.setRepeatBy(repeatByObj);

		Resources resourceObj = new Resources();
		resourceObj.setType("ALL_RESOURCES");
		resourceObj.setIds(new int[] {  });

		ApptTypes apptTypesObj = new ApptTypes();		
		apptTypesObj.setInternalReasonIds(new int[] { 1});
		apptTypesObj.setExternalReasonIds(new String[] { "abc"});
		apptTypesObj.setType("SOME_INT_VR");

		scheduleParams.setSchedule(scheduleObj);
		scheduleParams.setRule(ruleObj);
		scheduleObj.setResources(resourceObj);
		scheduleObj.setApptTypes(apptTypesObj);
		JSONObject scheduleParamsObj = new JSONObject( scheduleParams );
		System.out.println("Payload :"+scheduleParamsObj);
		return scheduleParams;
	}

	/** To generate Payload object for add 
	 * schedule with Monthly custom recurrence*/
	public static CalendarSchedulesRecurrencePayload AddMonthlyReccurrenceRule(String ruleName, String startDate,
			String repeatEvery, String repeatBy, String endDate, String numOfOccurrences) {
		CalendarSchedulesRecurrencePayload scheduleParams = new CalendarSchedulesRecurrencePayload();
		scheduleParams.setUserId("1");
		String createRuleName=ruleName+"_"+new Random().nextInt(1000);
		Rule ruleObj = new Rule();
		ruleObj.setRuleGid("null");
		ruleObj.setsubRuleGid("null");
		ruleObj.setRuleId("null");
		ruleObj.setRuleCode(createRuleName);
		ruleObj.setSubRuleName(createRuleName);

		Schedule scheduleObj = new Schedule();
		scheduleObj.setBookingTypes("ALL");
		scheduleObj.setRecurrence("MONTHLY");
		scheduleObj.setStartDate(startDate);
		scheduleObj.setRepeatEvery(repeatEvery);
		scheduleObj.setApptLimitationValue(2);

		Ends endsObj = new Ends();
		if(endDate.toUpperCase().equals("NULL"))
		{
			if(numOfOccurrences.toUpperCase().equals("NULL"))
			{
				endsObj.setType("NEVER");
				endsObj.setOccurrence("null");
				endsObj.setDate("NULL");
			}
			else
			{
				endsObj.setType("null");
				endsObj.setOccurrence("numOfOccurrences");
				endsObj.setDate("NULL");
			}
		}
		else
		{
			endsObj.setType("null");
			endsObj.setOccurrence("null");
			endsObj.setDate("endDate");
		}

		scheduleObj.setEnds(endsObj);

		RepeatBy repeatByObj = new RepeatBy();
		String[] periodsArray=repeatBy.split(",");
		repeatByObj.setPeriods(periodsArray);
		repeatByObj.setDateRangeEndDate("");
		repeatByObj.setweekNumber("4");
		repeatByObj.setType("ABSOLUTE_DAYS");

		TimeRange timerangeArrayObj[]=new TimeRange[periodsArray.length];
		for(int index=0;index<periodsArray.length;index++) {
			TimeRange timerangeObj= new TimeRange();
			timerangeObj.setDate("null");
			timerangeObj.setPeriod(periodsArray[index]);
			timerangeObj.setFrom("null");
			timerangeObj.setTo("null");
			timerangeObj.setType("FULLDAY");	
			timerangeArrayObj[index]=timerangeObj;
		}


		repeatByObj.setTimeRange(timerangeArrayObj);

		scheduleObj.setRepeatBy(repeatByObj);

		Resources resourceObj = new Resources();
		resourceObj.setType("ALL_RESOURCES");
		resourceObj.setIds(new int[] {  });

		ApptTypes apptTypesObj = new ApptTypes();		
		apptTypesObj.setInternalReasonIds(new int[] { 1});
		apptTypesObj.setExternalReasonIds(new String[] { "abc"});
		apptTypesObj.setType("SOME_INT_VR");

		scheduleParams.setSchedule(scheduleObj);
		scheduleParams.setRule(ruleObj);
		scheduleObj.setResources(resourceObj);
		scheduleObj.setApptTypes(apptTypesObj);
		JSONObject scheduleParamsObj = new JSONObject( scheduleParams );
		System.out.println("Payload :"+scheduleParamsObj);
		return scheduleParams;
	}
	
	/** To generate Payload object for add 
	 * schedule with Yearly custom recurrence*/
	public static CalendarSchedulesRecurrencePayload AddYearlyReccurrenceRule(String ruleName, String startDate,
			String repeatEvery, String repeatBy, String endDate, String numOfOccurrences) {
		CalendarSchedulesRecurrencePayload scheduleParams = new CalendarSchedulesRecurrencePayload();
		scheduleParams.setUserId("1");
		String createRuleName=ruleName+"_"+new Random().nextInt(1000);
		Rule ruleObj = new Rule();
		ruleObj.setRuleGid("null");
		ruleObj.setsubRuleGid("null");
		ruleObj.setRuleId("null");
		ruleObj.setRuleCode(createRuleName);
		ruleObj.setSubRuleName(createRuleName);

		Schedule scheduleObj = new Schedule();
		scheduleObj.setBookingTypes("ALL");
		scheduleObj.setRecurrence("YEARLY");
		scheduleObj.setStartDate(startDate);
		scheduleObj.setRepeatEvery(repeatEvery);
		scheduleObj.setApptLimitationValue(2);

		Ends endsObj = new Ends();
		if(endDate.toUpperCase().equals("NULL"))
		{
			if(numOfOccurrences.toUpperCase().equals("NULL"))
			{
				endsObj.setType("NEVER");
				endsObj.setOccurrence("null");
				endsObj.setDate("NULL");
			}
			else
			{
				endsObj.setType("null");
				endsObj.setOccurrence("numOfOccurrences");
				endsObj.setDate("NULL");
			}
		}
		else
		{
			endsObj.setType("null");
			endsObj.setOccurrence("null");
			endsObj.setDate("endDate");
		}

		scheduleObj.setEnds(endsObj);

		RepeatBy repeatByObj = new RepeatBy();
		String[] periodsArray=repeatBy.split(",");
		repeatByObj.setPeriods(periodsArray);
		repeatByObj.setDateRangeEndDate("");
		repeatByObj.setweekNumber("null");
		repeatByObj.setType("MONTHS");

		TimeRange timerangeArrayObj[]=new TimeRange[periodsArray.length];
		for(int index=0;index<periodsArray.length;index++) {
			TimeRange timerangeObj= new TimeRange();
			timerangeObj.setDate("null");
			timerangeObj.setPeriod("30");
			timerangeObj.setFrom("null");
			timerangeObj.setTo("null");
			timerangeObj.setType("FULLDAY");	
			timerangeArrayObj[index]=timerangeObj;
		}


		repeatByObj.setTimeRange(timerangeArrayObj);

		scheduleObj.setRepeatBy(repeatByObj);

		Resources resourceObj = new Resources();
		resourceObj.setType("ALL_RESOURCES");
		resourceObj.setIds(new int[] {  });

		ApptTypes apptTypesObj = new ApptTypes();		
		apptTypesObj.setInternalReasonIds(new int[] { 1});
		apptTypesObj.setExternalReasonIds(new String[] { "abc"});
		apptTypesObj.setType("SOME_INT_VR");

		scheduleParams.setSchedule(scheduleObj);
		scheduleParams.setRule(ruleObj);
		scheduleObj.setResources(resourceObj);
		scheduleObj.setApptTypes(apptTypesObj);
		JSONObject scheduleParamsObj = new JSONObject( scheduleParams );
		System.out.println("Payload :"+scheduleParamsObj);
		return scheduleParams;
	}


}
