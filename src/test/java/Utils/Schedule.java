package Utils;

public class Schedule
{
	private String recurrence;
	private ApptTypes apptTypes;
	private String bookingTypes;
	private RepeatBy repeatBy;
	private int apptLimitationValue;
	private Ends ends;
	private String repeatEvery;
	private String startDate;
	private Resources  resources ;
	public Resources  getResources  ()
	{
		return resources ;
	}

	public void setResources  (Resources  resources )
	{
		this.resources  = resources ;
	}
	public ApptTypes getApptTypes ()
	{
		return apptTypes;
	}

	public void setApptTypes (ApptTypes apptTypes)
	{
		this.apptTypes = apptTypes;
	}
	public String getBookingTypes ()
	{
		return bookingTypes;
	}

	public void setBookingTypes (String bookingTypes)
	{
		this.bookingTypes = bookingTypes;
	}

	public String getRecurrence ()
	{
		return recurrence;
	}

	public int getApptLimitationValue ()
	{
		return apptLimitationValue;
	}

	public void setApptLimitationValue (int apptLimitationValue)
	{
		this.apptLimitationValue = apptLimitationValue;
	}
	public void setRecurrence (String recurrence)
	{
		this.recurrence = recurrence;
	}

	public RepeatBy getRepeatBy ()
	{
		return repeatBy;
	}

	public void setRepeatBy (RepeatBy repeatBy)
	{
		this.repeatBy = repeatBy;
	}

	public Ends getEnds ()
	{
		return ends;
	}

	public void setEnds (Ends ends)
	{
		this.ends = ends;
	}

	public String getRepeatEvery ()
	{
		return repeatEvery;
	}

	public void setRepeatEvery (String repeatEvery)
	{
		this.repeatEvery = repeatEvery;
	}

	public String getStartDate ()
	{
		return startDate;
	}

	public void setStartDate (String startDate)
	{
		this.startDate = startDate;
	}

	@Override
	public String toString()
	{
		return "recurrence = "+recurrence+", repeatBy = "+repeatBy+", ends = "+ends+", repeatEvery = "+repeatEvery+", startDate = "+startDate+"]";
	}
}
