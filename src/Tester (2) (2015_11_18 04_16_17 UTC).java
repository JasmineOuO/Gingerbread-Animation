// The "Tester" class.
import java.awt.*;
import hsa.Console;
import java.lang.*;
public class Tester extends Thread
{
    static Console c;           
    
    public static void main (String[] args)
    {
	c = new Console ();
	 Color offWhite = new Color (255, 250, 205);
	Color darkBrown = new Color (255, 250, 205);
	Color pink = new Color (250, 128, 114);
	Color darkGreen = new Color (119, 119, 0);
	Color grey = new Color (195, 195, 195);

	//cow body variables
	int[] x = new int [14];
	int[] y = new int [14];
	//cow right back leg
	int[] x1 = new int [4];
	int[] y1 = new int [4];
	//cow left back leg
	int[] x2 = new int [4];
	int[] y2 = new int [4];
	x [0] = 80;
	x [1] = 280;
	x [2] = 280;
	x [3] = 260;
	x [4] = 240;
	x [5] = 210;
	x [6] = 230;
	x [7] = 110;
	x [8] = 90;
	x [9] = 60;
	x [10] = 80;
	x [11] = 80;
	x [12] = 70;
	x [13] = 60;
	y [0] = 320;
	y [1] = 320;
	y [2] = 400;
	y [3] = 400;
	y [4] = 460;
	y [5] = 460;
	y [6] = 400;
	y [7] = 400;
	y [8] = 460;
	y [9] = 460;
	y [10] = 400;
	y [11] = 340;
	y [12] = 380;
	y [13] = 380;
	x1 [0] = 230;
	x1 [1] = 260;
	x1 [2] = 280;
	x1 [3] = 250;
	y1 [0] = 400;
	y1 [1] = 400;
	y1 [2] = 460;
	y1 [3] = 460;

	x2 [0] = 80;
	x2 [1] = 110;
	x2 [2] = 130;
	x2 [3] = 100;
	y2 [0] = 400;
	y2 [1] = 400;
	y2 [2] = 460;
	y2 [3] = 460;

	for (int z = 0 ; z < 200 ; z++)
	{
	    //erase
	    c.setColor (Color.black);
	    c.fillRect (60 + z, 280, 280, 180);
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
	    //back legs
	    c.setColor (grey);
	    c.fillPolygon (x1, y1, 4);
	    c.fillPolygon (x2, y2, 4);
	    //body, tail and front legs
	    c.setColor (offWhite);
	    c.fillPolygon (x, y, 14);
	    
	    
	    try
	    {
		sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	
	}
	
    } 
} 
