import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Sunset implements Runnable
{
    private Console c;
    private int delay;

    public void sunset ()
    {
	Color orange = new Color (250, 152, 5);
	Color yellow = new Color (255, 255, 82);
	for (int x = 0 ; x < 140 ; x++)

	    {
		//sun
		c.setColor (orange);
		c.fillOval (340, 50 + x, 200, 190);
		c.setColor (yellow);
		c.fillOval (360, 100 + x, 140, 140);
		c.drawLine (360, 130 + x, 345, 120 + x);
		c.drawLine (370, 115 + x, 355, 105 + x);
		c.drawLine (390, 105 + x, 375, 90 + x);
		c.drawLine (410, 95 + x, 405, 80 + x);
		c.drawLine (430, 95 + x, 430, 75 + x);
		c.drawLine (450, 95 + x, 455, 80 + x);
		c.drawLine (470, 105 + x, 485, 90 + x);
		c.drawLine (490, 115 + x, 505, 105 + x);
		c.drawLine (500, 135 + x, 520, 130 + x);
		c.drawLine (505, 155 + x, 525, 150 + x);
		try
		{
		    Thread.sleep (delay);
		}
		catch (Exception e)
		{
		}

	    }
    }


    public Sunset (Console con)
    {
	c = con;
    }


    public void run ()
    {
	sunset ();
    }
}


