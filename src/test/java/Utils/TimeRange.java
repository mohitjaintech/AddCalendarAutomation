package Utils;

public class TimeRange
{
	private String date;

	private String period;

	private String from;

	private String to;

	private String type;

	public String getDate ()
	{
		return date;
	}

	public void setDate (String date)
	{
		this.date = date;
	}

	public String getPeriod ()
	{
		return period;
	}

	public void setPeriod (String period)
	{
		this.period = period;
	}

	public String getFrom ()
	{
		return from;
	}

	public void setFrom (String from)
	{
		this.from = from;
	}

	public String getTo ()
	{
		return to;
	}

	public void setTo (String to)
	{
		this.to = to;
	}

	public String getType ()
	{
		return type;
	}

	public void setType (String type)
	{
		this.type = type;
	}

	@Override
	public String toString()
	{
		return "date = "+date+", period = "+period+", from = "+from+", to = "+to+", type = "+type;
	}
}
