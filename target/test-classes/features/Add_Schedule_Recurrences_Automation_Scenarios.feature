Feature: Add Calendar Schedule with all custom recurrences type like Daily , Weekly , Monthly , Yearly 
Description: The purpose of these Tests is to verify Schedules added with all recurrences type.

Background: CalendarAPI is available to set custom schedule with recurrences

#for Daily Recurrence
Scenario: User should able to add Custom Schedule with Daily Recurrences 
	When Set Daily Recurrence with User Provided Start Date , Ends on Never
	| RuleName | StartDate | RepeatEvery | EndDate | NumOfOccurrences |
	| TestAutomation_DAILY | 11/30/2020 | 1 | Null | Null |	
	Then Schedule must set in calendar for "Daily" with Start Date , Ends on Never

#for weekly Recurrence	
Scenario: User should able to add Custom Schedule with Weekly Recurrences
	When Set Weekly Recurrence with User Provided Start Date , Ends on Never
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_WEEKLY | 11/30/2020 | 1 | 1,2 | Null | Null |	
	Then Schedule must set in calendar for "Weekly" with Start Date , Ends on Never

#for Monthly Recurrence	
Scenario: User should able to add Custom Schedule with Monthly Recurrences
	When Set Monthly Recurrence with User Provided Start Date , Ends on Never
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_MONTHLY | 11/30/2020 | 1 | 20,21 | Null | Null |	
	Then Schedule must set in calendar for "Monthly" with Start Date , Ends on Never

#for Yearly Recurrence			
Scenario: User should able to add Custom Schedule with Yearly Recurrences
	When Set Yearly Recurrence with User Provided Start Date , Ends on Never
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_YEARLY | 11/30/2020 | 1 | 2 | Null | Null |	
	Then Schedule must set in calendar for "Yearly" with Start Date , Ends on Never
