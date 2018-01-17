/*
   Name: Jasmine Ou
   Teacher: Ms.Dyke
   Date: October 20,2014
   This class draws an old man running.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class OldMan extends Thread
{
    private Console c;

    public void oldMan ()
    {
	//color variables for the old man
	Color green = new Color (154, 205, 50);
	Color brown = new Color (51, 25, 0);
	Color woodBrown = new Color (205, 133, 63);
	Color darkGreen = new Color (119, 119, 0);
	Color grey = new Color (128, 128, 128);
	Color darkGrey = new Color (100, 100, 100);
	Color offWhite = new Color (255, 250, 205);
	Color red = new Color (255, 0, 0);
	Color orange = new Color (250, 152, 5);
	Color yellow = new Color (255, 255, 82);
	Color leafGreen = new Color (36, 137, 7);
	Color darkBlue = new Color (66, 17, 166);
	Color purpleBlue = new Color (121, 3, 228);
	Color peach = new Color (255, 197, 139);
	Color maroon = new Color (128, 0, 0);
	Color pink = new Color (250, 128, 114);

	//counter variable to exit the while loop
	int counter = 0;

	//array of local int variables for x coordinates of overalls
	int[] x = { - 80, -70, -75, -60, -58, -50, -50, -40, -70, -70, -90, -120, -160, -150, -130};
	//array of local int variables for y coordinates of overalls
	int[] y = {290, 298, 315, 320, 300, 295, 370, 440, 440, 390, 385, 425, 420, 380, 390};

	//array of local int variables for x coordinates of sleeves
	int[] x1 = { - 90, -130, -130, -80, -50, -15, -10, -50};
	//array of local int variables for y coordinates of sleeves
	int[] y1 = {320, 325, 305, 295, 295, 270, 290, 320};

	//variable for the y coordinate of his waving hand
	int handy = 270;
	//while loop to repeat his running for back and forth motion
	while (counter < 2)
	{
	    //counter increases by one
	    counter += 1;

	    //variables change for angry hand waving
	    y1 [5] += 40;
	    y1 [6] += 40;
	    handy += 40;
	    //loop to animate old man running forward
	    for (int z = 0 ; z < 300 ; z++)
	    {
		x [0] += 1;
		x [1] += 1;
		x [2] += 1;
		x [3] += 1;
		x [4] += 1;
		x [5] += 1;
		x [6] += 1;
		x [7] += 1;
		x [8] += 1;
		x [9] += 1;
		x [10] += 1;
		x [11] += 1;
		x [12] += 1;
		x [13] += 1;
		x [14] += 1;
		x1 [0] += 1;
		x1 [1] += 1;
		x1 [2] += 1;
		x1 [3] += 1;
		x1 [4] += 1;
		x1 [5] += 1;
		x1 [6] += 1;
		x1 [7] += 1;

		//erase
		c.setColor (darkGreen);
		c.fillRect (-180 + z, 240, 200, 220);
		//hands
		c.setColor (peach);
		c.fillOval (-20 + z, handy, 19, 20);
		c.fillOval (-145 + z, 305, 20, 20);
		//sleeves
		c.setColor (orange);
		c.fillPolygon (x1, y1, 8);
		//shoes
		c.setColor (Color.black);
		c.fillOval (-70 + z, 435, 35, 25);
		c.fillOval (-170 + z, 380, 30, 40);
		//overalls
		c.setColor (darkBlue);
		c.fillPolygon (x, y, 15);
		//hair
		c.setColor (grey);
		c.fillRoundRect (-90 + z, 260, 60, 20, 20, 20);
		//face
		c.setColor (peach);
		c.fillOval (-85 + z, 250, 50, 50);
		//facial features
		c.setColor (Color.black);
		c.fillOval (-65 + z, 260, 5, 7);
		c.fillOval (-50 + z, 260, 5, 7);
		c.setColor (brown);
		c.drawOval (-58 + z, 270, 5, 5);
		c.setColor (pink);
		c.fillOval (-60 + z, 280, 13, 15);
		//to delay the animation
		try
		{
		    //if statement to change the speed of running
		    if (z < 100)
		    {
			sleep (3);
		    }
		    else
		    {
			sleep (6);
		    }
		}
		catch (Exception e)
		{
		}
	    }

	    //variables change for angry hand waving
	    y1 [5] -= 40;
	    y1 [6] -= 40;
	    handy -= 40;
	    //for loop to animate the old man running backwards
	    for (int z = 300 ; z > 0 ; z--)
	    {

		x [0] -= 1;
		x [1] -= 1;
		x [2] -= 1;
		x [3] -= 1;
		x [4] -= 1;
		x [5] -= 1;
		x [6] -= 1;
		x [7] -= 1;
		x [8] -= 1;
		x [9] -= 1;
		x [10] -= 1;
		x [11] -= 1;
		x [12] -= 1;
		x [13] -= 1;
		x [14] -= 1;
		x1 [0] -= 1;
		x1 [1] -= 1;
		x1 [2] -= 1;
		x1 [3] -= 1;
		x1 [4] -= 1;
		x1 [5] -= 1;
		x1 [6] -= 1;
		x1 [7] -= 1;

		//erase
		c.setColor (darkGreen);
		c.fillRect (-180 + z, 240, 200, 220);
		//hands
		c.setColor (peach);
		c.fillOval (-20 + z, handy, 19, 20);
		c.fillOval (-145 + z, 305, 20, 20);
		//sleeves
		c.setColor (orange);
		c.fillPolygon (x1, y1, 8);
		//shoes
		c.setColor (Color.black);
		c.fillOval (-70 + z, 435, 35, 25);
		c.fillOval (-170 + z, 380, 30, 40);
		//overalls
		c.setColor (darkBlue);
		c.fillPolygon (x, y, 15);
		//hair
		c.setColor (grey);
		c.fillRoundRect (-90 + z, 260, 60, 20, 20, 20);
		//face
		c.setColor (peach);
		c.fillOval (-85 + z, 250, 50, 50);
		//facial features
		c.setColor (Color.black);
		c.fillOval (-65 + z, 260, 5, 7);
		c.fillOval (-50 + z, 260, 5, 7);
		c.setColor (brown);
		c.drawOval (-58 + z, 270, 5, 5);
		c.setColor (pink);
		c.fillOval (-60 + z, 280, 13, 15);
		//to delay the animation
		try
		{
		    //if statment ot change speeds
		    if (z < 100)
		    {
			sleep (3);
		    }
		    else
		    {
			sleep (6);
		    }
		}
		catch (Exception e)
		{
		}
	    }
	}
    }


    public OldMan (Console con)
    {
	c = con;
    }


    public void run ()
    {
	oldMan ();
    }
}

