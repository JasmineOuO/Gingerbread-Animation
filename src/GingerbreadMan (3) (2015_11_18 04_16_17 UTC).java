// The "GingerbreadMan" class.
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class GingerbreadMan extends Thread
{
    private Console c;           // The output console
    private int delay;

    public void gingerbreadMan ()
    {
	Color cookieBrown = new Color (204, 102, 0);
	Color cookieDarkBrown = new Color (170, 85, 0);
	Color offWhite = new Color (255, 250, 205);
	Color darkBrown = new Color (255, 250, 205);
	Color pink = new Color (250, 128, 114);
	Color blue = new Color (74, 206, 244);
	Color darkGreen = new Color (119, 119, 0);


	//animation loop
	for (int y = 0 ; y < 530 ; y++)
	{
	    //erase
	    c.setColor (darkGreen);
	    c.fillRect (-106 + y, 340, 106, 120);
	    //left arm
	    c.setColor (cookieBrown);
	    for (int x = 0 ; x < 20 ; x++)

		{
		    c.drawLine (-95 + y, 390 - x, -60 + y, 395 - x);
		}
	    c.fillOval (-105 + y, 371, 20, 20);
	    //right arm
	    c.setColor (cookieDarkBrown);

	    for (int x = 0 ; x < 20 ; x++)

		{
		    c.drawLine (-50 + y, 400 - x, -10 + y, 390 - x);
		}
	    c.fillOval (-20 + y, 371, 20, 20);

	    //left leg
	    for (int x = 0 ; x < 20 ; x++)
	    {
		c.drawLine (-45 + y, 430 - x, -90 + y, 445 - x);
	    }
	    c.fillOval (-100 + y, 425, 20, 20);

	    c.setColor (cookieBrown);
	    //right leg
	    for (int x = 0 ; x < 20 ; x++)
	    {
		c.drawLine (-65 + x + y, 430, -50 + x + y, 450);
	    }
	    c.fillOval (-50 + y, 440, 20, 20);
	    //head
	    c.fillOval (-70 + y, 340, 40, 40);
	    //body
	    c.setColor (cookieBrown);
	    c.fillOval (-75 + y, 375, 40, 60);
	    //facial features
	    c.setColor (Color.black);
	    c.fillOval (-50 + y, 353, 3, 5);
	    c.fillOval (-40 + y, 355, 3, 5);
	    c.drawArc (-55 + y, 355, 20, 15, 190, 120);
	    c.setColor (pink);
	    c.fillOval (-58 + y, 358, 7, 7);
	    c.fillOval (-38 + y, 362, 7, 7);
	    c.setColor (offWhite);
	    //left eyebrow
	    for (int x = 0 ; x < 5 ; x++)
	    {
		c.drawArc (-60 + x + y, 346, 20, 20, 110, 40);
	    }
	    //limb features of white icing
	    for (int x = 0 ; x < 5 ; x++)
	    {
		//right hand
		c.drawArc (-15 - x + y, 370, 20, 20, 150, 90);
		//left hand
		c.drawArc (-115 + x + y, 371, 20, 20, 320, 90);
		//right leg
		c.drawArc (-45 + y, 445 - x, 20, 20, 100, 80);
		//left leg
		c.drawArc (-110 + x + y, 425, 20, 20, 320, 80);
	    }
	    //candy buttons
	    c.setColor (blue);
	    c.fillOval (-50 + y, 390, 7, 7);
	    c.fillOval (-50 + y, 400, 7, 7);
	    try
	    {
		sleep (1);
	    }
	    catch (Exception e)
	    {
	    }


	}

    }


    public GingerbreadMan (Console con)
    {
	c = con;
    }


    public void run ()
    {
	gingerbreadMan ();
    }
} // GingerbreadMan class


