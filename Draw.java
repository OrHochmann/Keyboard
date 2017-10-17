import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Draw extends JPanel
{
	StringMGR str = new StringMGR();
	
	public void cleanSlate()
    {
    	Graphics g = getGraphics();
    	g.setColor(Color.WHITE);
    	g.fillRect(0, 0, getWidth(), getHeight());
    	g.dispose();
    }
	
	public void goe(int x, int y)
	{
		
		Graphics g = getGraphics();
		g.setColor(Color.BLACK);
		cleanSlate();

		for (int i=0; i<=str.getIndex(); i++)
		{	
			g.drawString(str.getStr(i) ,x+20 , y+6);
			y=y+10;
			
		}
		g.dispose();
	}
}
