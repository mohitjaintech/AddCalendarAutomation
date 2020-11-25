package Utils;

public class Ends
{
	private String date;

	private String occurrence;

	private String type;

	public String getDate ()
	{
		return date;
	}

	public void setDate (String date)
	{
		this.date = date;
	}

	public String getOccurrence ()
	{
		return occurrence;
	}

	public void setOccurrence (String occurrence)
	{
		this.occurrence = occurrence;
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
		return "date = "+date+", occurrence = "+occurrence+", type = "+type;
	}
}

