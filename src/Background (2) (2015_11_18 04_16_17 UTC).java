/*
   Name: Jasmine
   Teacher: Ms.Dyke
   Date: October 7, 2014

*/
// The "Background" class.
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Background
{
    private Console c;           // The output console

    public void draw ()
    {
	Color woodBrown = new Color (205, 133, 63);
	Color darkBrown = new Color (51, 25, 0);
	Color brown = new Color (145, 84, 23);
	Color maroon = new Color (128, 0, 0);
	Color offWhite = new Color (255, 250, 205);
	Color red = new Color (255, 0, 0);
	Color blueViolet = new Color (138, 43, 226);
	Color peach = new Color (255, 197, 139);
	Color grey = new Color (128, 128, 128);
	Color pink = new Color (250, 128, 114);
	//floor
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (woodBrown);
	    c.drawRect (0, 0, x, 500);
	}
	//floor lines
	for (int x = 40 ; x < 640 ; x = x + 40)
	{
	    c.setColor (darkBrown);
	    c.drawLine (x, 0, x, 500);
	}
	//woman dress
	for (int x = 0 ; x < 90 ; x++)
	{
	    c.setColor (pink);
	    c.drawLine (323, 115, 279 + x, 260);
	}
	//woman apron
	for (int x = 0 ; x < 75 ; x++)
	{
	    c.setColor (Color.red);
	    c.drawLine (323, 115, 286 + x, 260);
	}
	//dress collar
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.setColor (offWhite);
	    c.drawOval (300 + x, 185 + x, 10 - 2 * x, 10 - 2 * x);
	    c.drawOval (310 + x, 189 + x, 10 - 2 * x, 10 - 2 * x);
	    c.drawOval (320 + x, 191 + x, 10 - 2 * x, 10 - 2 * x);
	    c.drawOval (330 + x, 189 + x, 10 - 2 * x, 10 - 2 * x);
	    c.drawOval (340 + x, 185 + x, 10 - 2 * x, 10 - 2 * x);
	}

	//woman face base
	for (int x = 0 ; x < 90 ; x++)
	{
	    c.setColor (peach);
	    c.drawOval (280 + x, 100 + x, 90 - 2 * x, 90 - 2 * x);
	}
	//woman hair
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (grey);
	    c.drawArc (275 + x, 100 + x, 70 - 2 * x, 70 - 2 * x, 70, 160);
	    c.drawArc (240 + x, 60 + x, 100 - 2 * x, 100 - 2 * x, 260, 120);
	    c.drawArc (330 + x, 65 + x, 60 - 2 * x, 90 - 2 * x, 180, 125);
	    c.drawArc (298 + x, 100 + x, 75 - 2 * x, 60 - 2 * x, 340, 185);
	    c.drawOval (300 + x, 80 + x, 40 - 2 * x, 40 - 2 * x);
	}
	//woman facial features
	c.setColor (darkBrown);
	c.drawLine (315, 160, 315, 163);
	c.drawLine (335, 160, 335, 163);
	c.setColor (woodBrown);
	c.drawOval (320, 165, 6, 6);
	c.setColor (maroon);
	c.drawArc (315, 160, 20, 20, 200, 150);

	//table
	for (int x = 0 ; x < 420 ; x++)
	{
	    c.setColor (brown);
	    c.drawRect (100, 260, x, 240);
	}
	//dough
	for (int x = 50 ; x > 0 ; x--)
	{
	    c.setColor (peach);
	    c.drawOval (300 + x, 300 + x, 50 - 2 * x, 50 - 2 * x);
	}
	for (int x = 40 ; x > 0 ; x--)
	{
	    c.setColor (peach);
	    c.drawOval (320 + x, 330 + x, 40 - 2 * x, 20 - 2 * x);
	}
	for (int x = 30 ; x > 0 ; x--)
	{
	    c.setColor (peach);
	    c.drawOval (295 + x, 330 + x, 30 - 2 * x, 30 - 2 * x);
	}
	//rolling pin
	for (int x = 0 ; x < 15 ; x++)
	{
	    c.setColor (woodBrown);
	    c.drawLine (260, 300 + x, 400, 300 + x);
	}
	for (int x = 0 ; x < 5 ; x++)
	{
	    c.setColor (woodBrown);
	    c.drawLine (250, 305 + x, 410, 305 + x);
	}
	//hands
	for (int x = 0 ; x < 16 ; x++)
	{
	    c.setColor (peach);
	    c.drawOval (299 + x, 288 + x, 16 - 2 * x, 16 - 2 * x);
	    c.drawOval (329 + x, 288 + x, 16 - 2 * x, 16 - 2 * x);
	}
	//sleeves
	for (int x = 0 ; x < 15 ; x++)
	{
	    c.setColor (pink);
	    c.drawRect (300, 210, x, 80);
	    c.drawRect (330, 210, x, 80);
	}
	//carpet strings
	for (int x = 5 ; x < 160 ; x = x + 10)
	{
	    c.setColor (offWhite);
	    c.drawLine (380, x, 400, x);
	}
	//more carpet strings
	for (int x = 400 ; x < 640 ; x = x + 10)
	{
	    c.setColor (offWhite);
	    c.drawLine (x, 160, x, 180);
	}
	//carpet
	for (int x = 0 ; x < 240 ; x++)
	{
	    c.setColor (maroon);
	    c.drawRect (400, 0, x, 160);
	}
	//round table
	for (int x = 160 ; x > 0 ; x--)
	{
	    c.setColor (offWhite);
	    c.drawOval (-25 + x, -5 + x, 180 - 2 * x, 180 - 2 * x);
	}
	//mug handle
	for (int x = 0 ; x < 15 ; x++)
	{
	    c.setColor (maroon);
	    c.drawRect (67, 125, x, 5);
	}
	for (int x = 40 ; x > 0 ; x--)
	{ //chairs
	    c.setColor (offWhite);
	    c.drawOval (50 + x, 190 + x, 40 - 2 * x, 40 - 2 * x);
	    c.drawOval (160 + x, 50 + x, 40 - 2 * x, 40 - 2 * x);
	    //coffee cup
	    c.setColor (maroon);
	    c.drawOval (30 + x, 110 + x, 40 - 2 * x, 40 - 2 * x);
	}

	//coffee
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.setColor (darkBrown);
	    c.drawOval (35 + x, 115 + x, 30 - 2 * x, 30 - 2 * x);
	}
	//flower
	c.setColor (blueViolet);
	c.drawStar (30, 30, 40, 40);


	//flour bag
	for (int x = 100 ; x > 0 ; x--)
	{
	    c.setColor (peach);
	    c.drawOval (120 + x, 390 + x, 100 - 2 * x, 100 - 2 * x);
	}
	//flour
	for (int x = 80 ; x > 0 ; x--)
	{
	    c.setColor (offWhite);
	    c.drawOval (130 + x, 400 + x, 80 - 2 * x, 80 - 2 * x);
	}
	//Cinnamon bowl
	for (int x = 60 ; x > 0 ; x--)
	{
	    c.setColor (woodBrown);
	    c.drawOval (155 + x, 325 + x, 60 - 2 * x, 60 - 2 * x);
	}
	//Cinnamon
	for (int x = 50 ; x > 0 ; x--)
	{
	    c.setColor (darkBrown);
	    c.drawOval (160 + x, 330 + x, 50 - 2 * x, 50 - 2 * x);
	}
	//salt and pepper shakers
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.setColor (grey);
	    c.drawOval (220 + x, 400 + x, 10 - 2 * x, 10 - 2 * x);
	    c.drawOval (230 + x, 415 + x, 10 - 2 * x, 10 - 2 * x);

	}
	//book
	for (int x = 0 ; x < 70 ; x++)
	{
	    c.setColor (Color.red);
	    c.drawLine (260, 420 + x, 380, 420 + x);
	}
	//book page
	for (int x = 0 ; x < 60 ; x++)
	{
	    c.setColor (offWhite);
	    c.drawLine (265, 425 + x, 375, 425 + x);
	}
	c.setColor (brown);
	c.drawLine (320, 425, 320, 485);
	//icing bag
	for (int x = 0 ; x < 30 ; x++)
	{
	    c.setColor (pink);
	    c.drawLine (460, 340, 450 + x, 360);
	    c.drawLine (440, 390, 450 + x, 360);
	}
	for (int x = 0 ; x < 9 ; x++)
	{
	    c.setColor (grey);
	    c.drawLine (440, 390, 441 + x, 385);
	}
	//eggs
	for (int x = 0 ; x < 15 ; x++)
	{
	    c.setColor (offWhite);
	    c.drawLine (470, 350, 490 - x, 325);
	    c.drawLine (470, 350, 495 + x, 340);
	}
	for (int x = 30 ; x > 0 ; x--)
	{
	    c.setColor (offWhite);
	    c.drawOval (420 + x, 400 + x, 20 - 2 * x, 30 - 2 * x);
	    c.drawOval (450 + x, 430 + x, 30 - 2 * x, 20 - 2 * x);
	}

	// //main caption
	c.setColor (offWhite);
	c.drawString ("Once upon a time,", 410, 10);
	c.drawString ("a little old woman decided to make...", 410, 20);
	c.drawString ("a gingerbread man", 410, 30);
	c.setColor (darkBrown);
	c.drawString ("The Gingerbread Man", 270, 450);
	c.drawString ("Jasmine  Ou", 280, 470);

    }


    public Background (Console con)
    {
	c = con;
	draw ();
    }
} // Background class


