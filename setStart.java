import javax.swing.JFrame;

public class setStart 
{

	public static Screen screen;
	
	private int x = 1150, y=550;
	
	public void start()
	{
		startNew();
		getStart();
	}
	
	


	private void startNew()
	{
		screen = new Screen();
		setScreen();
	}
	
	private void setScreen()
	{
		JFrame frame = new JFrame("JAVA keyboard");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(x, y);
        frame.setVisible(true);
        frame.setResizable(false);
      
        frame.add(screen);
   
	}
	
	private void getStart()
	{
		
		while(true)
		{
			
		}
		
		
	}
}
