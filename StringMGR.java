import javax.swing.JOptionPane;

public class StringMGR 
{
	 private static String[] str;
	 private static int index = 0;
	 private String tempstr = new String();
	 private static int max;
	 
	StringMGR()
	{
	}
	
	StringMGR(int n)
	{
		this.max=n;
		str = new String[max];
	}
	
	public String getStr(int i)
	{
		return str[i];
	}
	
	public void addVal(String c)
	{
		add(c);
	}
	
	private void add(String c)
	{
		str[index]=str[index]+c;
	}
	
	public void setVal(String c, int i)
	{
		set(c,i);
	}
	
	
	private void set(String c, int i)
	{
		str[i] = c;
	}
	
	public int getIndex()
	{
		return index;
	}
	
	public int getLan()
	{
		return str[index].length();
	}
	
	public void setEnter()
	{
		enter();
	}
	
	private void enter()
	{
		if(index<max-1)
		{
			index++;
		}
		else 
		{
			JOptionPane.showMessageDialog( null, "Out of data");
		}
	}
	
	public void setBackSpace()
	{
		back();
	}
	
	private void back()
	{
		if (str[index].length()>1)
		{
			if(str[index].substring(getLan()-2).equals("  "))
			{
				str[index] = str[index].substring(0, str[index].length()-2);
			}
			else
			{
				str[index] = str[index].substring(0, str[index].length()-1);
			}
		}
		else if (str[index].length()>0)
		{
			index --;
		}
	}
}
