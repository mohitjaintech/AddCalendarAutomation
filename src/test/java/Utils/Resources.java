package Utils;

public class Resources 
{
	private int[] ids;

	private String type;

	public int[] getIds ()
	{
		return ids;
	}

	public void setIds (int[] ids)
	{
		this.ids = ids;
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
		return "ids = "+ids+", type = "+type;
	}
}
