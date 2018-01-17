/*
   Name: Jasmine Ou
   Teacher: Ms.Dyke
   Date: October 20,2014
   This class runs the other classes, backgrounds and animations, to tell the story of the gingerbread man.
*/

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c;

    //adds the Background thread to MyCreation
    public void background ()
    {
	Background b = new Background (c);
    }


    //adds the RollingPin thread to MyCreation
    public void rollingPin ()
    {
	//creates the thread and passes the Console window in
	RollingPin r = new RollingPin (c);
	//starts the thread
	r.run ();
    }


    // //adds the Background2 thread to MyCreation
    public void background2 ()
    {

	Background2 b2 = new Background2 (c);
    }


    //adds the GingerbreadMan thread to MyCreation
    public void gingerbreadMan ()
    {
	//creates the thread and passes the Console window in
	GingerbreadMan g = new GingerbreadMan (c);
	//starts the thread
	g.run ();
    }


    //adds the OldWoman thread to MyCreation
    public void oldWoman ()
    {
	//creates the thread and passes the Console window in
	OldWoman w = new OldWoman (c);
	//starts the thread
	w.start ();

	//joins with OldMan thread so that it only executes when the OldWoman thread is done
	try
	{
	    w.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the OldMan thread to MyCreation
    public void oldMan ()
    {

	OldMan o = new OldMan (c);
	o.run ();
    }


    //adds the chicken thread to MyCreation
    public void chicken ()
    {
	//creates the thread, passes the Console window in and the color yellow
	Chicken h = new Chicken (c, Color.yellow);
	//starts the thread
	h.start ();

	//creates the thread, passes the Console window and the color white and the location of 120 to the left
	Chicken i = new Chicken (c, 120, Color.white);
	//starts the thread
	i.start ();
	//creates the thread, passes the Console window, the color orange, and the location of 60 to the left
	//
	Chicken j = new Chicken (c, 60, Color.orange);
	// //starts the thread
	j.start ();
	//joins with Cow thread so that it only executes when the chicken thread is done
	try
	{
	    k.join ();
	}
	catch (InterruptedException e)
	{
	}
    }


    //adds the Cow thread to MyCreation
    public void cow ()
    {
	//creates the thread and passes the Console window in
	Cow k = new Cow (c);
	//starts the thread
	k.run ();
    }


    //adds the Fox thread to MyCreation
    public void fox ()
    {
	//creates the thread and passes the Console window in
	Fox f = new Fox (c);
	//starts the thread
	f.run ();
    }


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("The Gingerbread Man");
    }


    //main method executes the other methods in MyCreation in the order given
    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	z.background ();
	z.rollingPin ();
	z.background2 ();
	z.gingerbreadMan ();
	z.oldWoman ();
	z.oldMan ();
	z.chicken ();
	z.cow ();
	z.fox ();

    }
} // MyCreation class


