package Utils;

public class RepeatBy
{
	public String[] periods;
	private String dateRangeEndDate;
	private String weekNumber;
	private String type;
	private TimeRange[] timeRange;

	public String[] getPeriods ()
	{
		return periods;
	}

	public String getweekNumber ()
	{
		return weekNumber;
	}

	public void setweekNumber (String weekNumber)
	{
		this.weekNumber = weekNumber;
	}
	public void setPeriods (String[] periods)
	{
		this.periods = periods;
	}

	public String getDateRangeEndDate ()
	{
		return dateRangeEndDate;
	}

	public void setDateRangeEndDate (String dateRangeEndDate)
	{
		this.dateRangeEndDate = dateRangeEndDate;
	}

	public String getType ()
	{
		return type;
	}

	public void setType (String type)
	{
		this.type = type;
	}

	public TimeRange[] getTimeRange ()
	{
		return timeRange;
	}

	public void setTimeRange (TimeRange[] timeRange)
	{
		this.timeRange = timeRange;
	}

	@Override
	public String toString()
	{
		return "periods = "+ periods+", dateRangeEndDate = "+dateRangeEndDate+", type = "+type+", timeRange = "+timeRange;
	}
}
