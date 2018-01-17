/*
   Name: Jasmine
   Teacher: Ms.Dyke
   Date: October 20, 2014
   This class draws and animates the old woman roling out the dough with the rolling pin.
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class RollingPin extends Thread
{
    private Console c;

    public void rollingPin ()
    {
	//local color variables for the rolling pin animation
	Color woodBrown = new Color (205, 133, 63);
	Color peach = new Color (255, 197, 139);
	Color pink = new Color (250, 128, 114);
	Color brown = new Color (145, 84, 23);
	//counter local variable to exit the while loop
	int counter = 0;
	//while loop to repeat the rolling motion
	while (counter < 3)
	{
	    //counter increases by one
	    counter += 1;
	    //for loop to animate the rolling pin and arms moving down
	    for (int x = 0 ; x < 20 ; x++)
	    {
		//erase
		c.setColor (brown);
		c.fillRect (250, 290 + x, 150, 30);

		//dough
		for (int y = 50 ; y > 0 ; y--)
		{
		    c.setColor (peach);
		    c.drawOval (300 + y, 320 + y, 50 - 2 * y, 50 - 2 * y);
		}
		for (int y = 40 ; y > 0 ; y--)
		{
		    c.drawOval (320 + y, 330 + y, 40 - 2 * y, 20 - 2 * y);
		}
		for (int y = 30 ; y > 0 ; y--)
		{
		    c.drawOval (285 + y, 330 + y, 30 - 2 * y, 30 - 2 * y);
		}

		//rolling pin
		c.setColor (woodBrown);
		c.fillRect (260, 300 + x, 130, 15);
		c.fillRect (250, 305 + x, 150, 5);

		//hands
		c.setColor (peach);
		c.fillOval (299, 288 + x, 16, 16);
		c.fillOval (329, 288 + x, 16, 16);

		//sleeves
		c.setColor (pink);
		c.fillRect (300, 280 + x, 15, 10);
		c.fillRect (330, 280 + x, 15, 10);

		//to delay the animation
		try
		{
		    sleep (20);
		}
		catch (Exception e)
		{
		}
	    }

	    //for loop to animate the rolling pin and arms moving up
	    for (int x = 0 ; x < 20 ; x++)
	    {
		//erase
		c.setColor (brown);
		c.fillRect (250, 310 - x, 150, 30);
		//dough
		for (int y = 50 ; y > 0 ; y--)
		{
		    c.setColor (peach);
		    c.drawOval (300 + y, 320 + y, 50 - 2 * y, 50 - 2 * y);
		}
		for (int y = 40 ; y > 0 ; y--)
		{
		    c.drawOval (320 + y, 330 + y, 40 - 2 * y, 20 - 2 * y);
		}
		for (int y = 30 ; y > 0 ; y--)
		{
		    c.drawOval (285 + y, 330 + y, 30 - 2 * y, 30 - 2 * y);
		}
		//rolling pin
		c.setColor (woodBrown);
		c.fillRect (260, 320 - x, 130, 15);
		c.fillRect (250, 325 - x, 150, 5);
		//hands
		c.setColor (peach);
		c.fillOval (299, 308 - x, 16, 16);
		c.fillOval (329, 308 - x, 16, 16);
		//to delay the animation
		try
		{
		    sleep (20);
		}
		catch (Exception e)
		{
		}
	    }
	}
    }



    public RollingPin (Console con)
    {
	c = con;
    }


    public void run ()
    {
	rollingPin ();
    }
}
