package Utils;

public class Rule
{
	private String ruleCode;
	private String ruleId;
	private String ruleGid;
	private String subRuleName;
	private String subRuleGid;

	public String getsubRuleGid ()
	{
		return subRuleGid;
	}

	public void setsubRuleGid (String subRuleGid)
	{
		this.subRuleGid = subRuleGid;
	}

	public String getRuleGid ()
	{
		return ruleGid;
	}

	public void setRuleGid (String ruleGid)
	{
		this.ruleGid = ruleGid;
	}

	public String getRuleCode ()
	{
		return ruleCode;
	}

	public void setRuleCode (String ruleCode)
	{
		this.ruleCode = ruleCode;
	}

	public String getRuleId ()
	{
		return ruleId;
	}

	public void setRuleId (String ruleId)
	{
		this.ruleId = ruleId;
	}

	public String getSubRuleName ()
	{
		return subRuleName;
	}

	public void setSubRuleName (String subRuleName)
	{
		this.subRuleName = subRuleName;
	}

	@Override
	public String toString()
	{
		return "ruleCode = "+ruleCode+", ruleId = "+ruleId+", subRuleName = "+subRuleName+"]";
	}
}
