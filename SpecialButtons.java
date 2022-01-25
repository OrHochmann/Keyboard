import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class SpecialButtons extends JPanel
{
	private String specialStr;
	private Color initialBackground;
	private StringMGR st= new StringMGR();
	private int lan;
	
	public SpecialButtons(String str)
	{
		JButton butt = new JButton(str);
		
		if (!str.equals("Space"))
		{
			
			butt.setPreferredSize(new Dimension(120,30));
			 initialBackground = butt.getBackground();
			
			add(butt);
			
			specialStr=str;
		}
		
		else if (str.equals("Backspace"))
		{
			
			butt.setPreferredSize(new Dimension(600,30));
			add(butt);
			specialStr=str;
		}
		else
		{
			butt.setPreferredSize(new Dimension(300,30));
			add(butt);
			specialStr=str;
		}
		
		
		
		
		butt.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
				{
				actionPer();
				}

				private void actionPer() 
				{
					special();
					
					if(specialStr.equals("Caps")||specialStr.equals("Shift"))
						{
						Color backgroundStatus = butt.getBackground();
						
						if (!(backgroundStatus.equals(initialBackground)))
						{
							butt.setBackground(initialBackground);
						}
						else
						{
							Color rgb = new Color(20,127,174);
							butt.setBackground(rgb);
						}
						Screen.p2.cleanSlate();
						Screen.p2.goe(Buttons.x,Buttons.y);
						}
				}

				private void special() 
				{
					switch (specialStr)
					{
					case "Caps": boolSwitch();
						     break;
								 
					case "Shift": chaneColor(getBackground());
						      boolSwitch();
					 	      break;
					 				
					case "Backspace": st.setBackSpace();
							  Screen.p2.goe(Buttons.x, Buttons.y);
							  break;
										
					case "Tab": st.addVal("  ");
					 	    break;
					 				
					case "Space" : st.addVal(" ");
						       break;
									
					case "Enter": 	st.setEnter();
					}
					
				}

				
			});
	}
	
	
	private void chaneColor(Color background) {
	}
	private void boolSwitch()
	{
		if (Screen.capsShift )
		{
			Screen.capsShift = false;
		}
		else
		{
			Screen.capsShift = true;
		}
	}
}
