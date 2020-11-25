Feature: Acceptance criteria for Add Calendar Schedule with all custom recurrences type like Daily , Weekly , Monthly , Yearly 
Description: The purpose of these Tests is to verify Schedules added with all recurrences type.

Background: CalendarAPI is available to set custom schedule with recurrences

#Acceptance Criteria For Daily recurrence

Scenario: User should able to add Custom Schedule with Daily Recurrences with Start Date,never End Date and Repeat Every Day
	When Set Daily Recurrence with User Provided Start Date , Ends on Never
	| RuleName | StartDate | RepeatEvery | EndDate | NumOfOccurrences |
	| TestAutomation_DAILY_01 | 11/24/2020 | 1 | Null | Null |	
	Then Schedule must set in calendar for "Daily" with Start Date , Every Day till no End Date.
	
Scenario: User should able to add Custom Schedule with Daily Recurrences with Start Date,End date and Repeat Every Day
	When Set Daily Recurrence with User Provided Start Date , End Date , Repeat Every Day
	| RuleName | StartDate | RepeatEvery | EndDate | NumOfOccurrences |
	| TestAutomation_DAILY_02 | 11/24/2020 | 1 | 11/30/2020 | Null |	
	Then Schedule must set in calendar for "Daily" with Start Date , Repeat Every Day till End Date.	
	
Scenario: User should able to add Custom Schedule with Daily Recurrences with Start Date, numOfOccurences and Repeat Every Day
	When Set Daily Recurrence with User Provided Start Date , NumOfOccurences , Repeat Every Day
	| RuleName | StartDate | RepeatEvery | EndDate | NumOfOccurrences |
	| TestAutomation_DAILY_03 | 11/24/2020 | 1 | Null | 5 |	
	Then Schedule must set in calendar for "Daily" with Start Date , Repeat Every Day till NumOfOccurences	
	
Scenario: User should not be able to add Custom Schedule with Daily Recurrences with Start Date, EndDate before StartDate
	When Set Daily Recurrence with User Provided Start Date , EndDate<StartDate
	| RuleName | StartDate | RepeatEvery | EndDate | NumOfOccurrences |
	| TestAutomation_DAILY_04 | 11/24/2020 | 1 | 11/20/2020 | Null |	
	Then Schedule must not set in calendar for "Daily" with EndDate < StartDate 
	
Scenario: User should be able to add Custom Schedule with Daily Recurrences with Start Date, EndDate and Repeat Every set to greater then 1 
	When Set Daily Recurrence with User Provided Start Date , EndDate and RepeatEveryDays greater then 1
	| RuleName | StartDate | RepeatEvery | EndDate | NumOfOccurrences |
	| TestAutomation_DAILY_05 | 11/24/2020 | 3 | 12/23/2020 | Null |	
	Then Schedule must set in calendar for "Daily" with Every 3 days from Start date till End Date.

Scenario: User should not be able to add Custom Schedule with Daily Recurrences with existing Rule Name  
	When Set Daily Recurrence with User Provided Start Date , EndDate and Existing Rule Name
	| RuleName | StartDate | RepeatEvery | EndDate | NumOfOccurrences |
	| TestAutomation_DAILY_05 | 11/24/2020 | 1 | 12/23/2020 | Null |	
	Then Schedule must not set in calendar for "Daily" with Error thrown as Rule name already exist.			

#Acceptance Criteria For Weekly recurrence
	
Scenario: User should able to add Custom Schedule with Weekly Recurrences with Start Date,never End Date and Repeat Every Week on same day
	When Set Weekly Recurrence with User Provided Start Date , Ends on Never , Repeat every Week
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_WEEKLY_01 | 11/24/2020 | 1 | 1 | Null | Null |	
	Then Schedule must set in calendar for "Weekly" with Start Date , Ends on Never for Every week on same day.
	
Scenario: User should able to add Custom Schedule with Weekly Recurrences with Start Date , End Date and repeat Every Week on same day
	When Set Weekly Recurrence with User Provided Start Date , End Date , Repeat every week
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_WEEKLY_02 | 11/24/2020 | 1 | 1 | 12/24/2020 | Null |	
	Then Schedule must set in calendar for "Weekly" with Start Date , till End date for every week on same day

Scenario: User should able to add Custom Schedule with Weekly Recurrences with Start Date , NumOfOccurrences and repeat Every Week on same day
	When Set Weekly Recurrence with User Provided Start Date , NumOfOccurrences , Repeat every week on same day
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_WEEKLY_03 | 11/24/2020 | 1 | 1 | Null | 5 |	
	Then Schedule must set in calendar for "Weekly" with Start Date , till numOfOccurrences for every week on same day	

Scenario: User should able to add Custom Schedule with Weekly Recurrences with Start Date , EndDate and repeat Every Week on more then 1 day in a week
	When Set Weekly Recurrence with User Provided Start Date , EndDate , Repeat every week on more then one day in a week
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_WEEKLY_04 | 11/24/2020 | 1 | 1,2 | 12/24/2020 | Null |	
	Then Schedule must set in calendar for "Weekly" with Start Date , till EndDate for every week on more then one day in a week

Scenario: User should able to add Custom Schedule with Weekly Recurrences with Start Date , EndDate and repeat after Every N number of weeks on more then 1 day in that week
	When Set Weekly Recurrence with User Provided Start Date , EndDate , Repeat every > 1 week on more then one day in a week
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_WEEKLY_05 | 11/24/2020 | 3 | 1,2 | 01/24/2021 | Null |	
	Then Schedule must set in calendar for "Weekly" with Start Date , till EndDate for every N number of weeks on more then one day in that week

Scenario: User should not be able to add Custom Schedule with Weekly Recurrences with End Date < Start Date
	When Set Weekly Recurrence with User Provided Start Date and EndDate before StartDate
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_WEEKLY_06 | 11/24/2020 | 3 | 1,2 | 11/14/2020 | Null |	
	Then Schedule must not set in calendar for "Weekly" with End Date before Start Date.
	
Scenario: User should not be able to add Custom Schedule with Weekly Recurrences with Existing Rule Name
	When Set Weekly Recurrence with User Provided Rule Name already exist
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_WEEKLY_06 | 11/24/2020 | 3 | 1,2 | 12/14/2020 | Null |	
	Then Schedule must not set in calendar for "Weekly" with Error Rule already exist.

#Acceptance Criteria For Monthly recurrence

Scenario: User should able to add Custom Schedule with Monthly Recurrences with Start Date, Never End Date and repeat on same day each month
	When Set Monthly Recurrence with User Provided Start Date , Ends on Never and repeat on same day each month
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_MONTHLY_01 | 11/24/2020 | 1 | 24 | Null | Null |	
	Then Schedule must set in calendar for "Monthly" with Start Date , Ends on Never for Each Month for same day

Scenario: User should able to add Custom Schedule with Monthly Recurrences with Start Date, End Date and repeat on same day each month
	When Set Monthly Recurrence with User Provided Start Date , Ends Date and repeat on same day each month
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_MONTHLY_02 | 11/24/2020 | 1 | 24 | 03/24/2021 | Null |	
	Then Schedule must set in calendar for "Monthly" with Start Date , till End Date for Each Month for same day

Scenario: User should able to add Custom Schedule with Monthly Recurrences with Start Date, NumOfOccurences and repeat on same day each month
	When Set Monthly Recurrence with User Provided Start Date , NumOfOccurences and repeat on same day each month
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_MONTHLY_03 | 11/24/2020 | 1 | 24 | Null | 4 |	
	Then Schedule must set in calendar for "Monthly" with Start Date , till Number of occurrence for Each Month for same day
	
Scenario: User should able to add Custom Schedule with Monthly Recurrences with Start Date, EndDate and repeat on more then 1 consecutive days in each month
	When Set Monthly Recurrence with User Provided Start Date , EndDate and repeat on more then 1 consecutive days in each month
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_MONTHLY_04 | 11/24/2020 | 1 | 24,25 |04/24/2021 | Null |	
	Then Schedule must set in calendar for "Monthly" with Start Date , till EndDate for Each Month for selected more then 1 consecutive days

Scenario: User should not be able to add Custom Schedule with Monthly Recurrences with more then 1 day in each month but not consecutive
	When Set Monthly Recurrence with User Provided with more then 1 day in each month but not consecutive
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_MONTHLY_05 | 11/24/2020 | 1 | 24,28 |04/24/2021 | Null |	
	Then Schedule must not set in calendar for "Monthly" with with more then 1 day in each month but not consecutive , Throw Error	

Scenario: User should able to add Custom Schedule with Monthly Recurrences with Start Date, EndDate and repeatEvery 2 months on more then 1 day in each month
	When Set Monthly Recurrence with User Provided Start Date , EndDate and repeatEvery 2 months on more then 1 day in each month
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_MONTHLY_06 | 11/24/2020 | 2 | 24,28 |04/24/2021 | Null |	
	Then Schedule must not set in calendar for "Monthly" with Start Date , till EndDate for Every 2 Months for selected more then 1 day
	
Scenario: User should not be able to add Custom Schedule with Monthly Recurrences with EndDate before Start Date
	When Set Monthly Recurrence with User Provided  EndDate before Start Date 
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_MONTHLY_07 | 11/24/2020 | 2 | 24,28 |10/24/2020 | Null |	
	Then Schedule must not set in calendar for "Monthly" with EndDate before Start Date
	
Scenario: User should not be able to add Custom Schedule with Monthly Recurrences with ExistingRule Name
	When Set Monthly Recurrence with User Provided  Rule Name already exists 
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_MONTHLY_07 | 11/24/2020 | 2 | 24,28 |10/24/2020 | Null |	
	Then Schedule must not set in calendar for "Monthly" with Error RuleName already exists

#Acceptance Criteria For Yearly recurrence

Scenario: User should able to add Custom Schedule with Yearly Recurrences with Start Date, Never End Date and repeat on same month each Year
	When Set Yearly Recurrence with User Provided Start Date , Ends on Never and repeat on same month each Year
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_YEARLY_01 | 11/24/2020 | 1 | 2 | Null | Null |	
	Then Schedule must set in calendar for "Yearly" with Start Date , Ends on Never	and repeat on same month each Year

Scenario: User should able to add Custom Schedule with Yearly Recurrences with Start Date, End Date and repeat on same month each Year
	When Set Yearly Recurrence with User Provided Start Date , Ends Date and repeat on same month each Year
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_YEARLY_02 | 11/24/2020 | 1 | 2 | 11/24/2022 | Null |	
	Then Schedule must set in calendar for "Yearly" with Start Date , till EndDate for each year on same month

Scenario: User should able to add Custom Schedule with Yearly Recurrences with Start Date, numOfOccurrences and repeat on same month each Year
	When Set Yearly Recurrence with User Provided Start Date , NumOfOccurrences and repeat on same month each Year
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_YEARLY_03 | 11/24/2020 | 1 | 2 | Null | 5 |	
	Then Schedule must set in calendar for "Yearly" with Start Date , till Number of occurrences set for each year on same month

Scenario: User should able to add Custom Schedule with Yearly Recurrences with Start Date, EndDate and repeat on more then a month for each Year
	When Set Yearly Recurrence with User Provided Start Date , EndDate and repeat on different month each Year
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_YEARLY_04 | 11/24/2020 | 1 | 2,9 | 11/24/2022 | Null |	
	Then Schedule must set in calendar for "Yearly" with Start Date , till EndDate for number of months in a year.

Scenario: User should able to add Custom Schedule with Yearly Recurrences with Start Date, EndDate and repeatEvery more then 1 year for more then one month 
	When Set Yearly Recurrence with User Provided Start Date , EndDate and repeatEvery more then 1 year for more then one month 
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_YEARLY_05 | 11/24/2020 | 2 | 2,9 | 11/24/2023 | Null |	
	Then Schedule must set in calendar for "Yearly" with Start Date , till EndDate for repeatEvery num of years for each month set.

Scenario: User should not be able to add Custom Schedule with Yearly Recurrences with End Date before Start Date 
	When Set Yearly Recurrence with User Provided with End Date before Start Date  
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_YEARLY_06 | 11/24/2020 | 2 | 2,9 | 11/24/2019 | Null |	
	Then Schedule must not set in calendar for "Yearly" with with End Date before Start Date 

Scenario: User should not be able to add Custom Schedule with Yearly Recurrences with Existing Rule Name
	When Set Yearly Recurrence with User Provided with Rule Name already Exists 
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_YEARLY_06 | 11/24/2020 | 2 | 2,9 | 11/24/2023 | Null |	
	Then Schedule must not set in calendar for "Yearly" with Error Rule already exists in DB

Scenario: User should be able to add Custom Schedule with Yearly Recurrences when StartDate=29th Feb(leap year) and repeat on same month each Year
	When Set Yearly Recurrence with User Provided with StartDate=29th Feb(leap year) and repeat on same month each Year 
	| RuleName | StartDate | RepeatEvery | RepeatBy | EndDate | NumOfOccurrences | 
	| TestAutomation_YEARLY_07 | 02/29/2020 | 1 | 2 | 11/24/2030 | Null |	
	Then Schedule must set in calendar for "Yearly" recurrence for 29th feb of next leap years only.
		
	
	
	

		
	
		
				
			
	
	

					
	

