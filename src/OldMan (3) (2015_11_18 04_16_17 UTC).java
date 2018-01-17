// The "OldMan" class.
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class OldMan extends Thread
{
    private Console c;
    private int delay;

    public void oldMan ()
    {
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

	//grass and dirt
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (green);
	    c.drawRect (0, 460, x, 10);
	    c.setColor (brown);
	    c.drawRect (0, 470, x, 30);
	}
	int counter = 0;
	//overall polygon variables
	int[] x = new int [15];
	int[] y = new int [15];
	x [0] = -80;
	x [1] = -70;
	x [2] = -75;
	x [3] = -60;
	x [4] = -58;
	x [5] = -50;
	x [6] = -50;
	x [7] = -40;
	x [8] = -70;
	x [9] = -70;
	x [10] = -90;
	x [11] = -120;
	x [12] = -160;
	x [13] = -150;
	x [14] = -130;
	y [0] = 290;
	y [1] = 298;
	y [2] = 315;
	y [3] = 320;
	y [4] = 300;
	y [5] = 295;
	y [6] = 370;
	y [7] = 440;
	y [8] = 440;
	y [9] = 390;
	y [10] = 385;
	y [11] = 425;
	y [12] = 410;
	y [13] = 380;
	y [14] = 390;

	//sleeve variables
	int[] x1 = new int [8];
	int[] y1 = new int [8];
	x1 [0] = -90;
	x1 [1] = -130;
	x1 [2] = -130;
	x1 [3] = -80;
	x1 [4] = -50;
	x1 [5] = -15;
	x1 [6] = -10;
	x1 [7] = -50;
	y1 [0] = 320;
	y1 [1] = 325;
	y1 [2] = 305;
	y1 [3] = 295;
	y1 [4] = 295;
	y1 [5] = 270;
	y1 [6] = 290;
	y1 [7] = 320;
	int handy = 270;
	while (counter < 2)
	{
	    counter += 1;

	    // //variables change for angry hand waving
	    y1 [5] += 40;
	    y1 [6] += 40;
	    handy += 40;
	    for (int z = 0 ; z < 300 ; z++)
	    {
		//animation of overall polygon variables
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
		//animation for sleeves variable
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
		//hair (what's left of it)
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

		try
		{
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

	    // //variables change for angry hand waving
	    y1 [5] -= 40;
	    y1 [6] -= 40;
	    handy -= 40;
	    for (int z = 300 ; z > 0 ; z--)
	    {

		//animation of overall polygon variables
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
		//animation for sleeves variable
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

		//hair (what's left of it)
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

		try
		{
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

