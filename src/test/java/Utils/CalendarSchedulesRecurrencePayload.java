package Utils;


/** Pojo class to generate Payload object for AddRule Rest API*/

public class CalendarSchedulesRecurrencePayload {
	private Schedule schedule;
	private Rule rule;
	private String userId;

	public Schedule getSchedule ()
	{
		return schedule;
	}

	public void setSchedule (Schedule schedule)
	{
		this.schedule = schedule;
	}


	public Rule getRule ()
	{
		return rule;
	}

	public void setRule (Rule rule)
	{
		this.rule = rule;
	}

	public String getUserId ()
	{
		return userId;
	}

	public void setUserId (String userId)
	{
		this.userId = userId;
	}

	@Override
	public String toString()
	{
		return "schedule = "+schedule+", rule = "+rule+", userId = "+userId+"";
	}
}














