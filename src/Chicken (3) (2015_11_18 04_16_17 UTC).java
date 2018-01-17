// The "Chicken" class.
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Chicken extends Thread
{
    private Console c;
    private Color chick;
    private int location;

    public void chickenDraw ()
    {
	Color darkYellow = new Color (244, 197, 4);
	Color orange = new Color (255, 108, 0);
	Color darkGreen = new Color (119, 119, 0);
	int[] x = new int [3];
	int[] y = new int [3];
	int counter = 0;
	x [0] = -8 - location;
	x [1] = -1 - location;
	x [2] = -8 - location;
	y [0] = 410;
	y [1] = 414;
	y [2] = 419;
	while (counter < 3)
	{
	    counter += 1;
	    for (int z = 0 ; z < 200 ; z++)
	    {
		x [0] += 1;
		x [1] += 1;
		x [2] += 1;
		//erase
		c.setColor (darkGreen);
		c.fillRect (-56 + z - location, 405, 56, 55);
		//feet
		c.setColor (orange);
		c.drawLine (-31 + z - location, 440, -36 + z - location, 459);
		c.drawLine (-36 + z - location, 459, -31 + z - location, 459);
		c.drawLine (-21 + z - location, 440, -26 + z - location, 459);
		c.drawLine (-26 + z - location, 459, -21 + z - location, 459);
		//beak
		c.fillPolygon (x, y, 3);
		// //body
		c.setColor (chick);
		c.fillOval (-45 + z - location, 420, 40, 30);
		c.fillOval (-26 + z - location, 405, 20, 20);
		c.setColor (darkYellow);
		c.fillOval (-41 + z - location, 430, 30, 15);
		// //eye
		c.setColor (Color.black);
		c.fillOval (-16 + z - location, 410, 4, 7);
		try
		{
		    if (counter == 0)
		    {
			sleep (1);
		    }
		    else if (counter == 1)
		    {
			sleep (3);
		    }
		    else
		    {
			sleep (5);
		    }
		}
		catch (Exception e)
		{
		}
	    }

	    for (int z = 200 ; z > 0 ; z--)
	    {
		x [0] -= 1;
		x [1] -= 1;
		x [2] -= 1;
		//erase
		c.setColor (darkGreen);
		c.fillRect (-56 + z - location, 405, 55, 55);
		//feet
		c.setColor (orange);
		c.drawLine (-31 + z - location, 440, -36 + z - location, 459);
		c.drawLine (-36 + z - location, 459, -31 + z - location, 459);
		c.drawLine (-21 + z - location, 440, -26 + z - location, 459);
		c.drawLine (-26 + z - location, 459, -21 + z - location, 459);
		//beak
		c.fillPolygon (x, y, 3);
		// //body
		c.setColor (chick);
		c.fillOval (-45 + z - location, 420, 40, 30);
		c.fillOval (-26 + z - location, 405, 20, 20);
		c.setColor (darkYellow);
		c.fillOval (-41 + z - location, 430, 30, 15);
		// //eye
		c.setColor (Color.black);
		c.fillOval (-16 + z - location, 410, 4, 7);
		try
		{
		    if (counter == 0)
		    {
			sleep (1);
		    }
		    else if (counter == 1)
		    {
			sleep (3);
		    }
		    else
		    {
			sleep (5);
		    }
		}
		catch (Exception e)
		{
		}
	    }
	}
    }


    //basic chicken
    public Chicken (Console con)
    {
	c = con;
	chick = new Color (255, 242, 0);
    }


    // chicken with a Color parameter
    public Chicken (Console con, Color n)
    {
	c = con;
	chick = n;

    }


    //chicken with a location parameter and a color parameter
    public Chicken (Console con, int l, Color n)
    {
	c = con;
	location = l;
	chick = n;
    }





    public void run ()
    {
	chickenDraw ();
    }
}


