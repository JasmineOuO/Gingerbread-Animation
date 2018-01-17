/*
   Name: Jasmine Ou
   Teacher: Ms.Dyke
   Date: October 20,2014
   This class draws and animates the old woman running and trying to catch up to the gingerbread man but failing to do so.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class OldWoman extends Thread
{
    private Console c;

    public void oldWoman ()
    {
	//local color variables for the old woman
	Color green = new Color (154, 205, 50);
	Color brown = new Color (51, 25, 0);
	Color maroon = new Color (128, 0, 0);
	Color darkGreen = new Color (119, 119, 0);
	Color offWhite = new Color (255, 250, 205);
	Color peach = new Color (255, 197, 139);
	Color grey = new Color (128, 128, 128);
	Color pink = new Color (250, 128, 114);
	Color red = new Color (237, 28, 26);

	//array of local int variables for x coordinates of dress
	int[] x = { - 70, -1, -20, -80, -110, -139, -115};
	//array of local int variables for y coordinates of dress
	int[] y = {310, 400, 425, 430, 420, 390, 375};
	//array of local int variables for x coordinates of apron
	int[] x1 = { - 60, -10, -100};
	//array of local int variables for y coordinates of apron
	int[] y1 = {290, 400, 400};
	//array of local int variables for x coordinates of pocket
	int[] x2 = { - 65, -40, -25, -80};
	//array of local int variables for y coordinates of pocket
	int[] y2 = {360, 360, 390, 390};
	//array of local int variables for x coordinates of right sleeve
	int[] x3 = { - 50, -10, -15, -55};
	//array of local int variables for y coordinates of right sleeve
	int[] y3 = {305, 350, 355, 315};
	//array of local int variables for x coordinates of left sleeve
	int[] x4 = { - 70, -120, -115, -70};
	//array of local int variables for y coordinates of left sleeve
	int[] y4 = {310, 335, 345, 320};
	//array of local int variables for x coordinates of pair of legs
	int[] x5 = { - 120, -75, -40, -50, -75, -110};
	//array of local int variables for y coordinates of pair of legs
	int[] y5 = {455, 390, 455, 455, 410, 455};
	//variable to count how many times the while loop will run
	int counter = 1;
	//while loop to repeat the same running motion
	while (counter < 3)
	{
	    //counter increases by one
	    counter += 1;

	    //loop to animate running forward
	    for (int z = 0 ; z < 300 ; z++)
	    {
		x [0] += 1;
		x [1] += 1;
		x [2] += 1;
		x [3] += 1;
		x [4] += 1;
		x [5] += 1;
		x [6] += 1;
		x1 [0] += 1;
		x1 [1] += 1;
		x1 [2] += 1;
		x2 [0] += 1;
		x2 [1] += 1;
		x2 [2] += 1;
		x2 [3] += 1;
		x3 [0] += 1;
		x3 [1] += 1;
		x3 [2] += 1;
		x3 [3] += 1;
		x4 [0] += 1;
		x4 [1] += 1;
		x4 [2] += 1;
		x4 [3] += 1;
		x5 [0] += 1;
		x5 [1] += 1;
		x5 [2] += 1;
		x5 [3] += 1;
		x5 [4] += 1;
		x5 [5] += 1;

		//erase
		c.setColor (darkGreen);
		c.fillRect (-140 + z, 255, 141, 205);
		c.setColor (peach);
		//hands
		c.fillOval (-130 + z, 335, 15, 15);
		c.fillOval (-14 + z, 349, 14, 14);
		//legs
		c.fillPolygon (x5, y5, 6);
		//dress and sleeves
		c.setColor (pink);
		c.fillPolygon (x, y, 7);
		c.fillPolygon (x3, y3, 4);
		c.fillPolygon (x4, y4, 4);
		//apron
		c.setColor (Color.red);
		c.fillPolygon (x1, y1, 3);
		c.setColor (peach);
		//head
		c.fillOval (-78 + z, 267, 47, 50);
		//pocket
		c.setColor (maroon);
		c.fillPolygon (x2, y2, 4);
		//collar
		c.setColor (offWhite);
		c.fillOval (-75 + z, 310, 10, 10);
		c.fillOval (-65 + z, 315, 10, 10);
		c.fillOval (-55 + z, 315, 10, 10);
		c.fillOval (-45 + z, 312, 10, 10);
		c.setColor (grey);
		//hair
		c.fillArc (-96 + z, 244, 50, 50, 248, 120);
		c.fillArc (-56 + z, 250, 40, 40, 170, 110);
		c.fillOval (-80 + z, 255, 20, 20);
		c.fillArc (-70 + z, 265, 40, 40, 320, 120);
		//facial features
		c.setColor (Color.black);
		c.fillOval (-57 + z, 293, 4, 7);
		c.fillOval (-45 + z, 293, 4, 7);
		c.setColor (brown);
		c.drawOval (-50 + z, 300, 3, 3);
		c.setColor (pink);
		c.fillArc (-55 + z, 300, 13, 12, 180, 180);
		//shoes
		c.fillOval (-50 + z, 450, 15, 10);
		c.fillOval (-120 + z, 450, 15, 10);

		//to delay the animation
		try
		{
		    //if statement to change the speed of running
		    if (z < 200)
		    {
			sleep (4);
		    }
		    else
		    {
			sleep (7);
		    }
		}
		catch (Exception e)
		{
		}
	    }
	    //loop to animate the old woman running backwards
	    for (int z = 300 ; z > 0 ; z--)
	    {
		x [0] -= 1;
		x [1] -= 1;
		x [2] -= 1;
		x [3] -= 1;
		x [4] -= 1;
		x [5] -= 1;
		x [6] -= 1;
		x1 [0] -= 1;
		x1 [1] -= 1;
		x1 [2] -= 1;
		x2 [0] -= 1;
		x2 [1] -= 1;
		x2 [2] -= 1;
		x2 [3] -= 1;
		x3 [0] -= 1;
		x3 [1] -= 1;
		x3 [2] -= 1;
		x3 [3] -= 1;
		x4 [0] -= 1;
		x4 [1] -= 1;
		x4 [2] -= 1;
		x4 [3] -= 1;
		x5 [0] -= 1;
		x5 [1] -= 1;
		x5 [2] -= 1;
		x5 [3] -= 1;
		x5 [4] -= 1;
		x5 [5] -= 1;

		//erase
		c.setColor (darkGreen);
		c.fillRect (-140 + z, 255, 141, 205);
		c.setColor (peach);
		//hands
		c.fillOval (-130 + z, 335, 15, 15);
		c.fillOval (-14 + z, 349, 14, 14);
		//legs
		c.fillPolygon (x5, y5, 6);
		//dress and sleeves
		c.setColor (pink);
		c.fillPolygon (x, y, 7);
		c.fillPolygon (x3, y3, 4);
		c.fillPolygon (x4, y4, 4);
		//apron
		c.setColor (Color.red);
		c.fillPolygon (x1, y1, 3);
		c.setColor (peach);
		//head
		c.fillOval (-78 + z, 267, 47, 50);
		//pocket
		c.setColor (maroon);
		c.fillPolygon (x2, y2, 4);
		//collar
		c.setColor (offWhite);
		c.fillOval (-75 + z, 310, 10, 10);
		c.fillOval (-65 + z, 315, 10, 10);
		c.fillOval (-55 + z, 315, 10, 10);
		c.fillOval (-45 + z, 312, 10, 10);
		c.setColor (grey);
		//hair
		c.fillArc (-96 + z, 244, 50, 50, 248, 120);
		c.fillArc (-56 + z, 250, 40, 40, 170, 110);
		c.fillOval (-80 + z, 255, 20, 20);
		c.fillArc (-70 + z, 265, 40, 40, 320, 120);
		//facial features
		c.setColor (Color.black);
		c.fillOval (-57 + z, 293, 4, 7);
		c.fillOval (-45 + z, 293, 4, 7);
		c.setColor (brown);
		c.drawOval (-50 + z, 300, 3, 3);
		c.setColor (pink);
		c.fillArc (-55 + z, 300, 13, 12, 180, 180);
		//shoes
		c.fillOval (-50 + z, 450, 15, 10);
		c.fillOval (-120 + z, 450, 15, 10);
		//to delay the animation
		try
		{
		    //if statement to change the speed of running
		    if (z < 200)
		    {
			sleep (4);
		    }
		    else
		    {
			sleep (7);
		    }
		}
		catch (Exception e)
		{
		}
	    }
	}
    }


    public OldWoman (Console con)
    {
	c = con;
    }


    public void run ()
    {
	oldWoman ();
    }
}


