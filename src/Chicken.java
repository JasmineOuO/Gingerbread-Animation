/*
   Name: Jasmine Ou
   Teacher: Ms.Dyke
   Date: October 20,2014
   This class draws and animates the three running chickens

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Chicken extends Thread
{
    private Console c;
    //global variable for the overloaded method to change the color
    private Color chick;
    //global variable for the overloaded method to change the location
    private int location;

    public void chickenDraw ()
    {
	//local color variables for the chicken
	Color darkYellow = new Color (244, 197, 4);
	Color orange = new Color (255, 108, 0);
	Color darkGreen = new Color (119, 119, 0);
	//array of local int variables for x coordinates of beak
	int[] x = { - 8 - location, -1 - location, -8 - location};
	//array of local int variables for y coordinates of beak
	int[] y = {410, 414, 419};
	//local variable to count and exit the while loop
	int counter = 0;
	//while loop to reapeat the same movement of running back and forth
	while (counter < 3)
	{
	    //counter increases by one
	    counter += 1;
	    //for loop to animate the chicken running forward
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
		//body
		c.setColor (chick);
		c.fillOval (-45 + z - location, 420, 40, 30);
		c.fillOval (-26 + z - location, 405, 20, 20);
		c.setColor (darkYellow);
		c.fillOval (-41 + z - location, 430, 30, 15);
		//eye
		c.setColor (Color.black);
		c.fillOval (-16 + z - location, 410, 4, 7);
		//to delay the animation
		try
		{
		    //if statment to change speeds
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
	    //for loop to animate the chicken running backwards
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
		//to delay the animation
		try
		{
		    //if statement to change speeds
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


    // chicken with a color parameter
    public Chicken (Console con, Color n)
    {
	c = con;
	chick = n;

    }


    //chicken with a new location parameter and a color parameter
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


