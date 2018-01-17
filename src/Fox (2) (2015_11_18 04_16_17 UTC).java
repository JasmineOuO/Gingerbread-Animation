// The "Fox" class.
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Fox extends Thread
{
    private Console c;

    public void fox ()
    {
	Color orange = new Color (252, 78, 3);
	Color darkOrange = new Color (254, 71, 18);
	Color offWhite = new Color (235, 230, 165);
	Color darkBrown = new Color (88, 28, 1);
	Color darkGreen = new Color (119, 119, 0);
	//right front leg
	int[] x = new int [4];
	int[] y = new int [4];
	//left front leg
	int[] x1 = new int [4];
	int[] y1 = new int [4];
	//right back leg
	int[] x2 = new int [4];
	int[] y2 = new int [4];
	//left back leg
	int[] x3 = new int [4];
	int[] y3 = new int [4];
	//tail
	int[] x4 = new int [4];
	int[] y4 = new int [4];
	//right ear
	int[] x5 = new int [3];
	int[] y5 = new int [3];
	//left ear
	int[] x6 = new int [3];
	int[] y6 = new int [3];
	//snout
	int[] x7 = new int [3];
	int[] y7 = new int [3];
	//face fur
	int[] x8 = new int [3];
	int[] y8 = new int [3];
	//white snout
	int[] x9 = new int [4];
	int[] y9 = new int [4];
	//jaws open
	int[] x10 = new int [3];
	int[] y10 = new int [3];
	x [0] = -76;
	x [1] = -61;
	x [2] = -51;
	x [3] = -66;
	x1 [0] = -91;
	x1 [1] = -76;
	x1 [2] = -86;
	x1 [3] = -101;
	x2 [0] = -156;
	x2 [1] = -141;
	x2 [2] = -131;
	x2 [3] = -146;
	x3 [0] = -171;
	x3 [1] = -156;
	x3 [2] = -166;
	x3 [3] = -181;
	x4 [0] = -176;
	x4 [1] = -226;
	x4 [2] = -201;
	x4 [3] = -176;
	x5 [0] = -26;
	x5 [1] = -36;
	x5 [2] = -51;
	x6 [0] = -66;
	x6 [1] = -86;
	x6 [2] = -71;
	x7 [0] = -26;
	x7 [1] = -6;
	x7 [2] = -26;
	x8 [0] = -38;
	x8 [1] = -76;
	x8 [2] = -72;
	x9 [0] = -76;
	x9 [1] = -56;
	x9 [2] = -6;
	x9 [3] = -33;
	x10 [0] = -36;
	x10 [1] = -6;
	x10 [2] = -46;

	y [0] = 420;
	y [1] = 420;
	y [2] = 460;
	y [3] = 460;
	y1 [0] = 420;
	y1 [1] = 420;
	y1 [2] = 460;
	y1 [3] = 460;
	y2 [0] = 420;
	y2 [1] = 420;
	y2 [2] = 460;
	y2 [3] = 460;
	y3 [0] = 420;
	y3 [1] = 420;
	y3 [2] = 460;
	y3 [3] = 460;
	y4 [0] = 360;
	y4 [1] = 420;
	y4 [2] = 440;
	y4 [3] = 390;
	y5 [0] = 328;
	y5 [1] = 305;
	y5 [2] = 330;
	y6 [0] = 330;
	y6 [1] = 330;
	y6 [2] = 350;
	y7 [0] = 335;
	y7 [1] = 345;
	y7 [2] = 370;
	y8 [0] = 380;
	y8 [1] = 387;
	y8 [2] = 360;
	y9 [0] = 387;
	y9 [1] = 370;
	y9 [2] = 345;
	y9 [3] = 379;
	y10 [0] = 360;
	y10 [1] = 385;
	y10 [2] = 380;
	int counter = 0;

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
	    if (z > 300)
	    {
		//jaws open
		c.setColor (offWhite);
		c.fillPolygon (x10, y10, 3);
	    }
	    try
	    {
		sleep (3);
	    }

	    catch (Exception e)
	    {
	    }
	}
	while (counter < 3)
	{
	    counter += 1;
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

		try
		{
		    sleep (3);
		}

		catch (Exception e)
		{
		}
	    }
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
		if (z > 100)
		{
		    //jaws open
		    c.setColor (offWhite);
		    c.fillPolygon (x10, y10, 3);
		}
		try
		{
		    sleep (3);
		}

		catch (Exception e)
		{
		}
	    }
	}
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


