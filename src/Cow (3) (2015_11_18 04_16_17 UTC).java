/*
   Name: Jasmine Ou
   Teacher: Ms.Dyke
   Date: October 20,2014
   This class draws and animates the cow running and trying to catch up to the gingerbread man but failing to do so.

*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Cow extends Thread
{
    private Console c;

    public void cow ()
    {
	//local color variables for the cow
	Color offWhite = new Color (252, 254, 226);
	Color creamWhite = new Color (253, 255, 202);
	Color darkBrown = new Color (72, 36, 0);
	Color pink = new Color (250, 128, 114);
	Color darkGreen = new Color (119, 119, 0);
	Color grey = new Color (195, 195, 195);
	Color darkGrey = new Color (58, 58, 58);

	//array of local int variables for x coordinates of cow body
	int[] x = { - 240, -40, -40, -60, -80, -110, -90, -210, -230, -260, -240, -240, -250, -260};
	//array of local int variables for y coordinates of cow body
	int[] y = {320, 320, 415, 415, 460, 460, 415, 415, 460, 460, 415, 340, 380, 380};
	//array of local int variables for x coordinates of cow right back leg
	int[] x1 = { - 90, -60, -40, -70};
	//array of local int variables for y coordinates of cow right back leg
	int[] y1 = {415, 415, 460, 460};
	//array of local int variables for x coordinates of cow left back leg
	int[] x2 = { - 240, -210, -190, -220};
	//array of local int variables for y coordinates of cow left back leg
	int[] y2 = {415, 415, 460, 460};
	//array of local int variables for x coordinates of tail
	int[] x3 = { - 260, -250, -257};
	//array of local int variables for y coordinates of tail
	int[] y3 = {380, 380, 395};
	//local counter variable to stop the while loop
	int counter = 0;
	//while loop to repeat the same motion and make the cow run back and forth
	while (counter < 3)
	{
	    //counter increases by one
	    counter += 1;
	    //for loop to animate the cow running forwards
	    for (int z = 0 ; z < 400 ; z++)
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
		//erase
		c.setColor (darkGreen);
		c.fillRect (-260 + z, 280, 261, 180);
		//back legs
		c.setColor (grey);
		c.fillPolygon (x1, y1, 4);
		c.fillPolygon (x2, y2, 4);
		//body, tail and front legs
		c.setColor (offWhite);
		c.fillPolygon (x, y, 14);
		c.setColor (darkBrown);
		c.fillPolygon (x3, y3, 3);
		c.setColor (pink);
		c.fillArc (-180 + z, 395, 40, 40, 180, 180);
		c.fillOval (-175 + z, 427, 7, 10);
		c.fillOval (-165 + z, 430, 7, 10);
		c.fillOval (-155 + z, 427, 7, 10);
		//spots
		c.setColor (Color.black);
		c.fillOval (-100 + z, 335, 30, 30);
		c.fillOval (-80 + z, 350, 40, 30);
		c.fillOval (-210 + z, 320, 40, 40);
		c.fillOval (-190 + z, 350, 20, 20);
		c.fillOval (-180 + z, 330, 20, 30);
		c.fillOval (-240 + z, 360, 20, 35);
		c.fillOval (-230 + z, 370, 20, 30);
		c.fillOval (-140 + z, 390, 20, 20);
		c.fillOval (-135 + z, 390, 20, 10);
		//head
		c.setColor (Color.black);
		c.fillRoundRect (-100 + z, 300, 100, 20, 20, 10);
		c.setColor (creamWhite);
		c.fillOval (-80 + z, 290, 60, 60);
		c.setColor (darkGrey);
		c.fillOval (-80 + z, 310, 30, 30);
		c.setColor (pink);
		c.fillOval (-83 + z, 325, 65, 40);
		//facial features
		c.setColor (Color.black);
		c.fillOval (-60 + z, 320, 5, 7);
		c.fillOval (-45 + z, 320, 5, 7);
		c.fillOval (-65 + z, 340, 7, 7);
		c.fillOval (-40 + z, 340, 7, 7);
		//to delay the animation
		try
		{
		    sleep (2);
		}
		catch (Exception e)
		{
		}
	    }
	    //for loop to animate the cow running backwards
	    for (int z = 400 ; z > 0 ; z--)
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
		//erase
		c.setColor (darkGreen);
		c.fillRect (-260 + z, 280, 261, 180);
		//back legs
		c.setColor (grey);
		c.fillPolygon (x1, y1, 4);
		c.fillPolygon (x2, y2, 4);
		//body, tail and front legs
		c.setColor (offWhite);
		c.fillPolygon (x, y, 14);
		c.setColor (darkBrown);
		c.fillPolygon (x3, y3, 3);
		c.setColor (pink);
		c.fillArc (-180 + z, 395, 40, 40, 180, 180);
		c.fillOval (-175 + z, 427, 7, 10);
		c.fillOval (-165 + z, 430, 7, 10);
		c.fillOval (-155 + z, 427, 7, 10);
		//spots
		c.setColor (Color.black);
		c.fillOval (-100 + z, 335, 30, 30);
		c.fillOval (-80 + z, 350, 40, 30);
		c.fillOval (-210 + z, 320, 40, 40);
		c.fillOval (-190 + z, 350, 20, 20);
		c.fillOval (-180 + z, 330, 20, 30);
		c.fillOval (-240 + z, 360, 20, 35);
		c.fillOval (-230 + z, 370, 20, 30);
		c.fillOval (-140 + z, 390, 20, 20);
		c.fillOval (-135 + z, 390, 20, 10);
		//head
		c.setColor (Color.black);
		c.fillRoundRect (-100 + z, 300, 100, 20, 20, 10);
		c.setColor (creamWhite);
		c.fillOval (-80 + z, 290, 60, 60);
		c.setColor (darkGrey);
		c.fillOval (-80 + z, 310, 30, 30);
		c.setColor (pink);
		c.fillOval (-83 + z, 325, 65, 40);
		//facial features
		c.setColor (Color.black);
		c.fillOval (-60 + z, 320, 5, 7);
		c.fillOval (-45 + z, 320, 5, 7);
		c.fillOval (-65 + z, 340, 7, 7);
		c.fillOval (-40 + z, 340, 7, 7);
		//to delay the animation
		try
		{
		    sleep (2);
		}
		catch (Exception e)
		{
		}
	    }
	}
    }



    public Cow (Console con)
    {
	c = con;
    }


    public void run ()
    {
	cow ();
    }
}



