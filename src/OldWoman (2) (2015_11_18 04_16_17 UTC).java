// The "OldWoman" class.
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class OldWoman extends Thread
{
    private Console c;

    public void oldWoman ()
    {
	Color green = new Color (154, 205, 50);
	Color brown = new Color (51, 25, 0);
	Color maroon = new Color (128, 0, 0);
	Color darkGreen = new Color (119, 119, 0);
	Color offWhite = new Color (255, 250, 205);
	Color peach = new Color (255, 197, 139);
	Color grey = new Color (128, 128, 128);
	Color pink = new Color (250, 128, 114);
	Color red = new Color (237, 28, 26);

	//dress polygon variables
	int[] x = new int [7];
	int[] y = new int [7];
	//apron polygon variables
	int[] x1 = new int [3];
	int[] y1 = new int [3];
	//pocket polygon variables
	int[] x2 = new int [4];
	int[] y2 = new int [4];
	//right sleeve polygon variables
	int[] x3 = new int [4];
	int[] y3 = new int [4];
	//left sleeve polygon variables
	int[] x4 = new int [4];
	int[] y4 = new int [4];
	//pair of legs polygon variable
	int[] x5 = new int [6];
	int[] y5 = new int [6];
	x [0] = -70;
	x [1] = -1;
	x [2] = -20;
	x [3] = -80;
	x [4] = -110;
	x [5] = -139;
	x [6] = -115;
	y [0] = 310;
	y [1] = 400;
	y [2] = 425;
	y [3] = 430;
	y [4] = 420;
	y [5] = 390;
	y [6] = 375;
	x1 [0] = -60;
	x1 [1] = -10;
	x1 [2] = -100;
	y1 [0] = 290;
	y1 [1] = 400;
	y1 [2] = 400;
	x2 [0] = -65;
	x2 [1] = -40;
	x2 [2] = -25;
	x2 [3] = -80;
	y2 [0] = 360;
	y2 [1] = 360;
	y2 [2] = 390;
	y2 [3] = 390;
	x3 [0] = -50;
	x3 [1] = -10;
	x3 [2] = -15;
	x3 [3] = -55;
	y3 [0] = 305;
	y3 [1] = 350;
	y3 [2] = 355;
	y3 [3] = 315;
	x4 [0] = -70;
	x4 [1] = -120;
	x4 [2] = -115;
	x4 [3] = -70;
	y4 [0] = 310;
	y4 [1] = 335;
	y4 [2] = 345;
	y4 [3] = 320;
	x5 [0] = -120;
	x5 [1] = -75;
	x5 [2] = -40;
	x5 [3] = -50;
	x5 [4] = -75;
	x5 [5] = -110;
	y5 [0] = 455;
	y5 [1] = 390;
	y5 [2] = 455;
	y5 [3] = 455;
	y5 [4] = 410;
	y5 [5] = 455;
	//animating the legs
	// x5[0]+=1
	// x5[5]+=1
	// x5[2]-=1
	// x5[3]-=1
	// x5[0]-=1
	// x5[5]-=1
	// x5[2]+=1
	// x5[3]+=1
	int counter = 1;
	while (counter < 3)
	{
	    counter += 1;

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
		//facial
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
		try
		{
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
	    //backwards motion
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
		//facial
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
		try
		{
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


