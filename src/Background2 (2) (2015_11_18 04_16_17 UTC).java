/*
   Name: Jasmine
   Teacher: Ms.Dyke
   Date: October 7, 2014

*/
// The "Background2" class.
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Background2
{
    private Console c;           // The output console




    public void draw ()
    {
	Color green = new Color (154, 205, 50);
	Color brown = new Color (51, 25, 0);
	Color woodBrown = new Color (205, 133, 63);
	Color darkGreen = new Color (119, 119, 0);
	Color grey = new Color (128, 128, 128);
	Color darkGrey = new Color (100, 100, 100);
	Color offWhite = new Color (255, 250, 205);
	Color red = new Color (254, 84, 12);
	Color orange = new Color (250, 152, 5);
	Color yellow = new Color (255, 255, 82);
	Color leafGreen = new Color (36, 137, 7);
	Color darkBlue = new Color (66, 17, 166);
	Color purpleBlue = new Color (121, 3, 228);
	//sunset sky
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.setColor (darkBlue);
	    c.drawLine (0, 0 + x, 639, 0 + x);
	}
	for (int x = 0 ; x < 100 ; x++)
	{
	    c.setColor (purpleBlue);
	    c.drawArc (-50 + x, -20 + x, 900 - 2 * x, 400 - 2 * x, 360, 270);
	}
	for (int x = 0 ; x < 340 ; x++)
	{
	    c.setColor (red);
	    c.drawArc (40 + x, 20 + x, 680 - 2 * x, 350 - 2 * x, 0, 180);
	}
	for (int x = 0 ; x < 340 ; x++)
	{
	    c.setColor (orange);
	    c.drawArc (260 + x, 60 + x, 330 - 2 * x, 220 - 2 * x, 360, 200);
	}
	//sun
	for (int x = 0 ; x < 140 ; x++)
	{
	    c.setColor (yellow);
	    c.drawOval (360 + x, 100 + x, 140 - 2 * x, 140 - 2 * x);
	}
	c.drawLine (360, 130, 345, 120);
	c.drawLine (370, 115, 355, 105);
	c.drawLine (390, 105, 375, 90);
	c.drawLine (410, 95, 405, 80);
	c.drawLine (430, 95, 430, 75);
	c.drawLine (450, 95, 455, 80);
	c.drawLine (470, 105, 485, 90);
	c.drawLine (490, 115, 505, 105);
	c.drawLine (500, 135, 520, 130);
	c.drawLine (505, 155, 525, 150);

	//fat mountain
	for (int x = 0 ; x < 400 ; x++)
	{
	    c.setColor (darkGrey);
	    c.drawLine (250, 60, 110 + x, 240);
	}
	for (int x = 0 ; x < 90 ; x++)
	{
	    c.setColor (offWhite);
	    c.drawLine (250, 60, 219 + x, 100);
	}
	//cave
	for (int x = 0 ; x < 80 ; x++)
	{
	    c.setColor (Color.black);
	    c.drawArc (300 + x, 150 + x, 80 - 2 * x, 80 - 2 * x, 0, 200);
	}
	//fox eyes
	for (int x = 0 ; x < 5 ; x++)
	{
	    c.setColor (yellow);
	    c.drawLine (330, 175 - x, 340, 175);
	    c.drawLine (350, 175, 360, 175 - x);
	}
	//skinny mountain
	for (int x = 0 ; x < 250 ; x++)
	{
	    c.setColor (grey);
	    c.drawLine (100, 70, -20 + x, 240);
	}
	for (int x = 0 ; x < 80 ; x++)
	{
	    c.setColor (offWhite);
	    c.drawLine (100, 70, 60 + x, 120);
	}
	//lone tree
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (woodBrown);
	    c.drawLine (600, 80, 600 + x, 190);
	    c.setColor (leafGreen);
	    c.drawOval (590 + x, 60 + x, 40 - 2 * x, 40 - 2 * x);
	    c.drawOval (600 + x, 80 + x, 40 - 2 * x, 40 - 2 * x);
	    c.drawOval (570 + x, 70 + x, 40 - 2 * x, 40 - 2 * x);
	}

	//hill
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (darkGreen);
	    c.drawRect (0, 220, x, 280);
	}

	for (int x = 0 ; x < 90 ; x++)
	{
	    c.drawLine (160, 220, 560, 150 + x);
	}
	for (int x = 0 ; x < 90 ; x++)
	{
	    c.drawArc (470 + x, 150 + x, 180 - 2 * x, 140 - 2 * x, 360, 100);
	}
	
	//house
	for (int x = 0 ; x < 40 ; x++)
	{
	    c.setColor (orange);
	    c.drawRect (20, 200, x, 40);
	}
	for (int x = 0 ; x < 15 ; x++)
	{
	    c.setColor (brown);
	    c.drawRect (30, 220, x, 20);
	}
	c.drawRect (50, 220, 7, 10);
	c.drawLine (53, 220, 53, 230);
	c.drawLine (50, 225, 57, 225);
	for (int x = 0 ; x < 50 ; x++)
	{
	    c.setColor (red);
	    c.drawLine (40, 170, 15 + x, 200);
	}
	//forest
	for (int x = 0 ; x < 80 ; x = x + 4)
	{
	    c.setColor (woodBrown);
	    c.drawLine (80 + x, 230, 80 + x, 170);
	    c.setColor (brown);
	    c.drawLine (82 + x, 230, 82 + x, 170);
	}
	for (int y = 0 ; y < 80 ; y = y + 10)
	{
	    for (int x = 0 ; x < 30 ; x++)
	    {
		c.setColor (leafGreen);
		c.drawOval (70 + x + y, 165 + x, 30 - 2 * x, 30 - 2 * x);
	    }
	}
	//river
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (darkBlue);
	    c.drawArc (520 + x, 122 + x, 100 - 2 * x, 70 - 2 * x, 180, 90);
	    c.drawArc (519 + x, 173 + x, 100 - 2 * x, 70 - 2 * x, 0, 90);
	    c.drawArc (601 + x, 170 + x, 100 - 2 * x, 70 - 2 * x, 180, 90);
	}

	//grass and dirt
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (green);
	    c.drawRect (0, 460, x, 10);
	    c.setColor (brown);
	    c.drawRect (0, 470, x, 30);
	}
	
    }


    public Background2 (Console con)
    {
	c = con;
	draw ();
    }
}


