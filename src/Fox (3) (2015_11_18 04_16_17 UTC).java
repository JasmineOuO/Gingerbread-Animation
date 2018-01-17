/*
   Name: Jasmine Ou
   Teacher: Ms.Dyke
   Date: October 20,2014
   This class draws and animates the fox running and eating the gingerbread man.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Fox extends Thread
{
    private Console c;

    public void fox ()
    {
	//local color variables for the fox
	Color orange = new Color (252, 78, 3);
	Color darkOrange = new Color (254, 71, 18);
	Color offWhite = new Color (235, 230, 165);
	Color darkBrown = new Color (88, 28, 1);
	Color darkGreen = new Color (119, 119, 0);

	//array of local int variables for x coordinates of right front leg
	int[] x = { - 76, -61, -51, -66};
	//array of local int variables for y coordinates of right front leg
	int[] y = {420, 420, 460, 460};
	//array of local int variables for x coordinates of left front leg
	int[] x1 = { - 91, -76, -86, -101};
	//array of local int variables for y coordinates of left front leg
	int[] y1 = {420, 420, 460, 460};
	//array of local int variables for x coordinates of right back leg
	int[] x2 = { - 156, -141, -131, -146};
	//array of local int variables for y coordinates of right back leg
	int[] y2 = {420, 420, 460, 460};
	//array of local int variables for x coordinates of left back leg
	int[] x3 = { - 171, -156, -166, -181};
	//array of local int variables for y coordinates of left back leg
	int[] y3 = {420, 420, 460, 460};
	//array of local int variables for x coordinates of tail
	int[] x4 = { - 176, -226, -201, -176};
	//array of local int variables for y coordinates of tail
	int[] y4 = {360, 420, 440, 390};
	//array of local int variables for x coordinates of right ear
	int[] x5 = { - 26, -36, -51};
	//array of local int variables for y coordinates of right ear
	int[] y5 = {328, 305, 330};
	//array of local int variables for x coordinates of left ear
	int[] x6 = { - 66, -86, -71};
	//array of local int variables for y coordinates of left ear
	int[] y6 = {330, 330, 350};
	//array of local int variables for x coordinates of snout
	int[] x7 = { - 26, -6, -26};
	//array of local int variables for y coordinates of snout
	int[] y7 = {335, 345, 370};
	//array of local int variables for x coordinates of face fur
	int[] x8 = { - 38, -76, -72};
	//array of local int variables for y coordinates of face fur
	int[] y8 = {380, 387, 360};
	//array of local int variables for x coordinates of white snout
	int[] x9 = { - 76, -56, -6, -33};
	//array of local int variables for y coordinates of white snout
	int[] y9 = {387, 370, 345, 379};
	//array of local int variables for x coordinates of jaws open
	int[] x10 = { - 36, 6, -46};
	//array of local int variables for y coordinates of jaws open
	int[] y10 = {360, 385, 380};

	//local variable to exit the while loop and count
	int counter = 0;

	//for loop to animate the fox running forward
	for (int z = 0 ; z < 420 ; z++)
	{
	    x [0] += 1;
	    x [1] += 1;
	    x [2] += 1;
	    x [3] += 1;
	    x1 [0] += 1;
	    x1 [1] += 1;
	    x1 [2] += 1;
	    x1 [3] += 1;
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
	    x6 [0] += 1;
	    x6 [1] += 1;
	    x6 [2] += 1;
	    x7 [0] += 1;
	    x7 [1] += 1;
	    x7 [2] += 1;
	    x8 [0] += 1;
	    x8 [1] += 1;
	    x8 [2] += 1;
	    x9 [0] += 1;
	    x9 [1] += 1;
	    x9 [2] += 1;
	    x9 [3] += 1;
	    x10 [0] += 1;
	    x10 [1] += 1;
	    x10 [2] += 1;
	    //erase
	    c.setColor (darkGreen);
	    c.fillRect (-236 + z, 305, 238, 155);
	    //body
	    c.setColor (orange);
	    c.fillRoundRect (-181 + z, 360, 130, 60, 20, 10);
	    //tail
	    c.fillPolygon (x4, y4, 4);
	    //white fur
	    c.setColor (Color.white);
	    c.fillOval (-96 + z, 360, 60, 60);
	    c.fillOval (-234 + z, 418, 35, 35);
	    //legs
	    c.setColor (darkBrown);
	    c.fillPolygon (x, y, 4);
	    c.fillPolygon (x1, y1, 4);
	    c.fillPolygon (x2, y2, 4);
	    c.fillPolygon (x3, y3, 4);
	    //head
	    c.setColor (darkOrange);
	    c.fillOval (-76 + z, 320, 60, 60);
	    //ears
	    c.setColor (darkOrange);
	    c.fillPolygon (x5, y5, 3);
	    c.fillPolygon (x6, y6, 3);
	    c.fillPolygon (x7, y7, 3);
	    //snout
	    c.fillPolygon (x8, y8, 3);
	    c.setColor (offWhite);
	    c.fillPolygon (x9, y9, 4);
	    //facial features
	    c.setColor (Color.black);
	    c.fillOval (-41 + z, 347, 7, 7);
	    c.fillOval (-26 + z, 343, 7, 7);
	    c.drawLine (-56 + z, 340, -41 + z, 342);
	    c.drawLine (-31 + z, 340, -23 + z, 330);
	    c.fillOval (-10 + z, 341, 10, 10);
	    //if statement to open the jaws at a certain distance
	    if (z > 300)
	    {
		//jaws open
		c.setColor (offWhite);
		c.fillPolygon (x10, y10, 3);
	    }
	    //to delay the animation
	    try
	    {
		sleep (3);
	    }

	    catch (Exception e)
	    {
	    }
	}

	//while loop to repeat the running back and forth motion
	while (counter < 3)
	{
	    //counter increases by one
	    counter += 1;

	    //for loop to animate the fox running backwards a little bit
	    for (int z = 150 ; z > 0 ; z--)
	    {
		x [0] -= 1;
		x [1] -= 1;
		x [2] -= 1;
		x [3] -= 1;
		x1 [0] -= 1;
		x1 [1] -= 1;
		x1 [2] -= 1;
		x1 [3] -= 1;
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
		x6 [0] -= 1;
		x6 [1] -= 1;
		x6 [2] -= 1;
		x7 [0] -= 1;
		x7 [1] -= 1;
		x7 [2] -= 1;
		x8 [0] -= 1;
		x8 [1] -= 1;
		x8 [2] -= 1;
		x9 [0] -= 1;
		x9 [1] -= 1;
		x9 [2] -= 1;
		x9 [3] -= 1;
		x10 [0] -= 1;
		x10 [1] -= 1;
		x10 [2] -= 1;
		//erase
		c.setColor (darkGreen);
		c.fillRect (34 + z, 305, 238, 155);
		//body
		c.setColor (orange);
		c.fillRoundRect (89 + z, 360, 130, 60, 20, 10);
		//tail
		c.fillPolygon (x4, y4, 4);
		//white fur
		c.setColor (Color.white);
		c.fillOval (174 + z, 360, 60, 60);
		c.fillOval (36 + z, 418, 35, 35);
		//legs
		c.setColor (darkBrown);
		c.fillPolygon (x, y, 4);
		c.fillPolygon (x1, y1, 4);
		c.fillPolygon (x2, y2, 4);
		c.fillPolygon (x3, y3, 4);
		//head
		c.setColor (darkOrange);
		c.fillOval (194 + z, 320, 60, 60);
		//ears
		c.setColor (darkOrange);
		c.fillPolygon (x5, y5, 3);
		c.fillPolygon (x6, y6, 3);
		c.fillPolygon (x7, y7, 3);
		//snout
		c.fillPolygon (x8, y8, 3);
		c.setColor (offWhite);
		c.fillPolygon (x9, y9, 4);
		//facial features
		c.setColor (Color.black);
		c.fillOval (229 + z, 347, 7, 7);
		c.fillOval (244 + z, 343, 7, 7);
		c.drawLine (214 + z, 340, 229 + z, 342);
		c.drawLine (239 + z, 340, 247 + z, 330);
		c.fillOval (260 + z, 341, 10, 10);
		//to delay the animation
		try
		{
		    sleep (3);
		}

		catch (Exception e)
		{
		}
	    }

	    //for loop to animate the fox running forwards a little bit
	    for (int z = 0 ; z < 150 ; z++)
	    {
		x [0] += 1;
		x [1] += 1;
		x [2] += 1;
		x [3] += 1;
		x1 [0] += 1;
		x1 [1] += 1;
		x1 [2] += 1;
		x1 [3] += 1;
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
		x6 [0] += 1;
		x6 [1] += 1;
		x6 [2] += 1;
		x7 [0] += 1;
		x7 [1] += 1;
		x7 [2] += 1;
		x8 [0] += 1;
		x8 [1] += 1;
		x8 [2] += 1;
		x9 [0] += 1;
		x9 [1] += 1;
		x9 [2] += 1;
		x9 [3] += 1;
		x10 [0] += 1;
		x10 [1] += 1;
		x10 [2] += 1;

		c.setColor (darkGreen);
		//if statment to make bite marks on the gingerbread man each time the fox bites then retreats
		if (counter == 1)
		{
		    c.fillOval (485, 430, 15, 15);
		    c.fillOval (459, 340, 40, 40);
		    c.fillOval (415, 360, 60, 100);

		}
		else if (counter == 2)
		{
		    c.fillOval (455, 375, 30, 60);
		}
		else
		{

		    c.fillOval (465, 368, 80, 60);
		    c.fillOval (460, 415, 50, 45);
		}

		//erase
		c.fillRect (34 + z, 305, 238, 155);
		//body
		c.setColor (orange);
		c.fillRoundRect (89 + z, 360, 130, 60, 20, 10);
		//tail
		c.fillPolygon (x4, y4, 4);
		//white fur
		c.setColor (Color.white);
		c.fillOval (174 + z, 360, 60, 60);
		c.fillOval (36 + z, 418, 35, 35);
		//legs
		c.setColor (darkBrown);
		c.fillPolygon (x, y, 4);
		c.fillPolygon (x1, y1, 4);
		c.fillPolygon (x2, y2, 4);
		c.fillPolygon (x3, y3, 4);
		//head
		c.setColor (darkOrange);
		c.fillOval (194 + z, 320, 60, 60);
		//ears
		c.setColor (darkOrange);
		c.fillPolygon (x5, y5, 3);
		c.fillPolygon (x6, y6, 3);
		c.fillPolygon (x7, y7, 3);
		//snout
		c.fillPolygon (x8, y8, 3);
		c.setColor (offWhite);
		c.fillPolygon (x9, y9, 4);
		//facial features
		c.setColor (Color.black);
		c.fillOval (229 + z, 347, 7, 7);
		c.fillOval (244 + z, 343, 7, 7);
		c.drawLine (214 + z, 340, 229 + z, 342);
		c.drawLine (239 + z, 340, 247 + z, 330);
		c.fillOval (260 + z, 341, 10, 10);
		//if statment to open the jaw at a certain distance
		if (z > 100)
		{
		    //jaws open
		    c.setColor (offWhite);
		    c.fillPolygon (x10, y10, 3);
		}
		//to delay the animation
		try
		{
		    sleep (3);
		}

		catch (Exception e)
		{
		}
	    }
	}
	//for loop to animate the fox running backwards
	for (int z = 420 ; z > 0 ; z--)
	{
	    x [0] -= 1;
	    x [1] -= 1;
	    x [2] -= 1;
	    x [3] -= 1;
	    x1 [0] -= 1;
	    x1 [1] -= 1;
	    x1 [2] -= 1;
	    x1 [3] -= 1;
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
	    x6 [0] -= 1;
	    x6 [1] -= 1;
	    x6 [2] -= 1;
	    x7 [0] -= 1;
	    x7 [1] -= 1;
	    x7 [2] -= 1;
	    x8 [0] -= 1;
	    x8 [1] -= 1;
	    x8 [2] -= 1;
	    x9 [0] -= 1;
	    x9 [1] -= 1;
	    x9 [2] -= 1;
	    x9 [3] -= 1;
	    x10 [0] -= 1;
	    x10 [1] -= 1;
	    x10 [2] -= 1;
	    //erase
	    c.setColor (darkGreen);
	    c.fillRect (-236 + z, 305, 238, 155);
	    //body
	    c.setColor (orange);
	    c.fillRoundRect (-181 + z, 360, 130, 60, 20, 10);
	    //tail
	    c.fillPolygon (x4, y4, 4);
	    //white fur
	    c.setColor (Color.white);
	    c.fillOval (-96 + z, 360, 60, 60);
	    c.fillOval (-234 + z, 418, 35, 35);
	    //legs
	    c.setColor (darkBrown);
	    c.fillPolygon (x, y, 4);
	    c.fillPolygon (x1, y1, 4);
	    c.fillPolygon (x2, y2, 4);
	    c.fillPolygon (x3, y3, 4);
	    //head
	    c.setColor (darkOrange);
	    c.fillOval (-76 + z, 320, 60, 60);
	    //ears
	    c.setColor (darkOrange);
	    c.fillPolygon (x5, y5, 3);
	    c.fillPolygon (x6, y6, 3);
	    c.fillPolygon (x7, y7, 3);
	    //snout
	    c.fillPolygon (x8, y8, 3);
	    c.setColor (offWhite);
	    c.fillPolygon (x9, y9, 4);
	    //facial features
	    c.setColor (Color.black);
	    c.fillOval (-41 + z, 347, 7, 7);
	    c.fillOval (-26 + z, 343, 7, 7);
	    c.drawLine (-56 + z, 340, -41 + z, 342);
	    c.drawLine (-31 + z, 340, -23 + z, 330);
	    c.fillOval (-10 + z, 341, 10, 10);
	    //to delay the animation
	    try
	    {
		sleep (3);
	    }

	    catch (Exception e)
	    {
	    }
	}
	c.setColor (Color.white);
	c.setFont (new Font ("TimesRoman", Font.PLAIN, 72));
	c.drawString ("The End", 100, 450);
    }


    public Fox (Console con)
    {
	c = con;
    }


    public void run ()
    {
	fox ();
    }
}


