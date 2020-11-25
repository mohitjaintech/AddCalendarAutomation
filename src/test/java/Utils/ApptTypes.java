package Utils;

public class ApptTypes
{
	private int[] internalReasonIds;

	private String[] externalReasonIds;

	private String type;

	public int[] getInternalReasonIds ()
	{
		return internalReasonIds;
	}

	public void setInternalReasonIds (int[] internalReasonIds)
	{
		this.internalReasonIds = internalReasonIds;
	}

	public String[] getExternalReasonIds ()
	{
		return externalReasonIds;
	}

	public void setExternalReasonIds (String[] externalReasonIds)
	{
		this.externalReasonIds = externalReasonIds;
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
		return "internalReasonIds = "+internalReasonIds+", externalReasonIds = "+externalReasonIds+", type = "+type+"";
	}
}
