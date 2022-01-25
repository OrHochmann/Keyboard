import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class Screen extends JPanel 
{
	private static final long serialVersionUID = 1L;
	
	
	
	public static Draw p2;
	public static boolean capsShift = false;
	
	
	private StringMGR theScreenStr = new StringMGR(20);
	private Buttons[] firstRow;
	private Buttons[] secondRow;
	private Buttons[] tRow;
	private Buttons[] foRow;
	
	private SpecialButtons cmdBackspace, cmdTab, cmdCaps,cmdEnter, cmdShiftL, cmdShiftR, cmdSpace;
	
	
	
	
	public Screen()
	{
		setScreen();
		
	}
	
	
	
	private void setScreen()
	{
		for (int i=0; i<20; i++)
			{theScreenStr.setVal(" ", i);}
		
		
		JPanel p1 = new JPanel();
		p1.setOpaque(true);
		p1.setLayout(new GridLayout(2,1,2,2));
		
		p1.setPreferredSize(new Dimension(1200,500));
		
		p2 = new Draw();
		p2.setOpaque(true);
		p2.setBackground(Color.WHITE);
		p1.add(p2);
		

		JPanel p3 = new JPanel();
		p3.setOpaque(true);
		p3.setLayout(new GridLayout(5,0,2,2));//p3 split the bot screen to 5
	
		p1.add(p3);
		
		firstRow = new Buttons[13];
		secondRow = new Buttons[14];
		tRow = new Buttons[11];
		foRow = new Buttons[10];
		
		
		JPanel p4 = new JPanel();//p4 is the first row
		p4.setOpaque(true);
		
		
		
		JPanel p5 = new JPanel();//p5 is the second row
		p5.setOpaque(true);
		p5.setPreferredSize(new Dimension(600,100));
		
		JPanel p6 = new JPanel();//p6 is the 3row
		p6.setOpaque(true);
		
		
		JPanel p7 = new JPanel();//p5 is the 4 row
		p7.setOpaque(true);
		
		
		JPanel p8 = new JPanel();//p8 is the 5 row
		p8.setOpaque(true);
		
		
		makeButt();
		addButt(p4, p5, p6,p7,p8);
		
		p3.add(p4);
		p3.add(p5);
		p3.add(p6);
		p3.add(p7);
		p3.add(p8);
		
		add(p1);
		
	}
	
	
	
	private void addButt(JPanel p4, JPanel p5,JPanel p6,JPanel p7,JPanel p8) 
	{
		
		for (int i=0; i<13; i++)
		{
			p4.add(firstRow[i]);
		}
		p4.add(cmdBackspace);
		
		
		p5.add(cmdTab);
		for (int i=1; i<14; i++)
		{
			p5.add(secondRow[i]);
		}
		
		p6.add(cmdCaps);
		for (int i=0; i<11;i++)
		{
			p6.add(tRow[i]);
		}
		p6.add(cmdEnter);
		
		p7.add(cmdShiftL);
		for (int i=0; i<10; i++)
		{
			p7.add(foRow[i]);
		}
		p7.add(cmdShiftR);
		
		p8.add(cmdSpace);
	}


	private void makeButt()
	{
		
		firstRow[0]= new Buttons("' ~");
		firstRow[1]= new Buttons("1 !");
		firstRow[2]= new Buttons("2 @");
		firstRow[3]= new Buttons("3 #");
		firstRow[4]= new Buttons("4 $");
		firstRow[5]= new Buttons("5 %");
		firstRow[6]= new Buttons("6 ^");
		firstRow[7]= new Buttons("7 &");
		firstRow[8]= new Buttons("8 *");
		firstRow[9]= new Buttons("9 (");
		firstRow[10]= new Buttons("0 )");
		firstRow[11]= new Buttons("- _");
		firstRow[12]= new Buttons("= +");
		cmdBackspace= new SpecialButtons("Backspace");
		
		
		cmdTab= new SpecialButtons("Tab");
		secondRow[1]= new Buttons("Q");
		secondRow[2]= new Buttons("W");
		secondRow[3]= new Buttons("E");
		secondRow[4]= new Buttons("R");
		secondRow[5]= new Buttons("T");
		secondRow[6]= new Buttons("Y");
		secondRow[7]= new Buttons("U");
		secondRow[8]= new Buttons("I");
		secondRow[9]= new Buttons("O");
		secondRow[10]= new Buttons("P");
		secondRow[11]= new Buttons("[ {");
		secondRow[12]= new Buttons("] }");
		secondRow[13]= new Buttons("\\ |");
		
		
		cmdCaps = new SpecialButtons("Caps");
		tRow[0] = new Buttons("A");
		tRow[1] = new Buttons("S");
		tRow[2] = new Buttons("D");
		tRow[3] = new Buttons("F");
		tRow[4] = new Buttons("G");
		tRow[5] = new Buttons("H");
		tRow[6] = new Buttons("J");
		tRow[7] = new Buttons("K");
		tRow[8] = new Buttons("L");
		tRow[9] = new Buttons("; :");
		tRow[10] = new Buttons("' "+'"');
		cmdEnter = new SpecialButtons("Enter");
		
		cmdShiftL = new SpecialButtons("Shift");
		cmdShiftR = new SpecialButtons("Shift");
		foRow[0] = new Buttons("Z");
		foRow[1] = new Buttons("X");
		foRow[2] = new Buttons("C");
		foRow[3] = new Buttons("V");
		foRow[4] = new Buttons("B");
		foRow[5] = new Buttons("N");
		foRow[6] = new Buttons("M");
		foRow[7] = new Buttons(", <");
		foRow[8] = new Buttons(". >");
		foRow[9] = new Buttons("/ ?");
		
		cmdSpace = new SpecialButtons("Space");
	
	}
	
	
	
	
}
