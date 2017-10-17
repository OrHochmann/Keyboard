import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



import javax.swing.JButton;
import javax.swing.JPanel;



public class Buttons extends JPanel
{
	public static int x, y;
	
	private char nextChar;
	private StringMGR stringmgr;
	private static final long serialVersionUID = 1L;

	public Buttons(String str)
	{
		x = y = 10;
		JButton butt = new JButton(str);
		butt.setPreferredSize(new Dimension(60,30));
		add(butt);
		
		stringmgr = new StringMGR();
		
		butt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
				{
				actionPer();
				}

				private void actionPer() 
				{
					regButt(str);
					stringmgr.addVal(Character.toString(nextChar));
					Screen.p2.goe(x, y);
				}
			});
	}
	
	private void regButt(String str)
	{
		char ch = str.charAt(0);
		
		if ((ch>='A')&&(ch<='Z'))
				{
				if (Screen.capsShift) 
				{
					nextChar = ch;
				}
				else
				{
					nextChar = Character.toLowerCase(ch);
				}
				}
		else
		{
			
			if (Screen.capsShift) 
			{	
				nextChar = str.charAt(2);
			}
			else
			{
				nextChar = ch;
			}
		}
	}
}
