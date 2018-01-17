/*
   Name: Jasmine Ou
   Teacher: Ms.Dyke
   Date: October 9,2014
   Assignment: Simple thread example.  MyCreation.java runs the other classes.
   DO NOT put any draw cmds etc in this file!!!
   NOTE:  each class should be organized into several methods
   which are then executed by the run() method

   The MovingCloud2 class demonstrates an OVERLOADED constructor which enables the
   programmer to create only 1 class but alter it in many ways.

   NOTE:  there is a double buffer problem with the Console class which causes a
   problem with the Colors.  Since the threads time share their execution, the
   output "flashes" as the colors bleed through between the background and each
   animation.

   There is a way to fix this issue in Console.java.  If a programmer wishes to
   fix this then they must do it on their own and they cannot share their solution
   with anyone else.

   Marks will not be deducted because of this error!


*/

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c;           // The output console

    //adds the Background thread to MyCreation
    public void background ()
    {
	Background b = new Background (c);
    }


    // //adds the Background2 thread to MyCreation
    public void background2 ()
    {

	Background2 b2 = new Background2 (c);
    }





    //adds the chicken thread to MyCreation
    public void chicken ()
    {
	//creates the thread,passes the Console window in and the color yellow
	Chicken h = new Chicken (c, Color.yellow);
	//starts the thread
	h.start ();

	//creates the thread,passes the Console window and the color white and the location of 120 to the left
	Chicken i = new Chicken (c, 120, Color.white);
	//starts the thread
	i.start ();
	//creates the thread,passes the Console window, the color orange, and the location of 60 to the left
	//
	Chicken j = new Chicken (c, 60, Color.orange);
	// //starts the thread
	j.start ();
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


    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("The Gingerbread Man");
    }


    //main method executes the other methods in MyCreation in the order given
    //the background must be drawn first so the animated objects can move on it
    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();
	//z.background ();
	z.background2 ();
	z.gingerbreadMan ();
	z.oldWoman ();
	z.oldMan ();
	z.chicken ();

    }
} // MyCreation class


