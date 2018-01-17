// The "Cow" class.
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Cow extends Thread
{
    private Console c;

    public void cow ()
    {
	Color offWhite = new Color (252, 254, 226);
	Color creamWhite = new Color (253, 255, 202);
	Color darkBrown = new Color (72, 36, 0);
	Color pink = new Color (250, 128, 114);
	Color darkGreen = new Color (119, 119, 0);
	Color grey = new Color (195, 195, 195);
	Color darkGrey = new Color (58, 58, 58);

	//cow body variables
	int[] x = new int [14];
	int[] y = new int [14];
	//cow right back leg
	int[] x1 = new int [4];
	int[] y1 = new int [4];
	//cow left back leg
	int[] x2 = new int [4];
	int[] y2 = new int [4];
	//tail
	int[] x3 = new int [3];
	int[] y3 = new int [3];
	x [0] = -240;
	x [1] = -40;
	x [2] = -40;
	x [3] = -60;
	x [4] = -80;
	x [5] = -110;
	x [6] = -90;
	x [7] = -210;
	x [8] = -230;
	x [9] = -260;
	x [10] = -240;
	x [11] = -240;
	x [12] = -250;
	x [13] = -260;
	y [0] = 320;
	y [1] = 320;
	y [2] = 415;
	y [3] = 415;
	y [4] = 460;
	y [5] = 460;
	y [6] = 415;
	y [7] = 415;
	y [8] = 460;
	y [9] = 460;
	y [10] = 415;
	y [11] = 340;
	y [12] = 380;
	y [13] = 380;
	x1 [0] = -90;
	x1 [1] = -60;
	x1 [2] = -40;
	x1 [3] = -70;
	y1 [0] = 415;
	y1 [1] = 415;
	y1 [2] = 460;
	y1 [3] = 460;

	x2 [0] = -240;
	x2 [1] = -210;
	x2 [2] = -190;
	x2 [3] = -220;
	y2 [0] = 415;
	y2 [1] = 415;
	y2 [2] = 460;
	y2 [3] = 460;

	x3 [0] = -260;
	x3 [1] = -250;
	x3 [2] = -257;
	y3 [0] = 380;
	y3 [1] = 380;
	y3 [2] = 395;
	int counter = 0;
	while (counter < 3)
	{
	    counter += 1;
	    for (int z = 0 ; z < 400 ; z++)
	    {
		//to animate the cow body
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
		try
		{
		    sleep (2);
		}
		catch (Exception e)
		{
		}
	    }
	    for (int z = 400 ; z > 0 ; z--)
	    {
		//to animate the cow body
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



