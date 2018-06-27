//////////////////////////////////////////////////////////////////////////////////
//																				//
//	This program will ask for length, width and height from the user			//
//	and draw a box fitting those dimensions in a pop-up window.					//
//																				//
//	Development notes... I will probably start out testing with drawing a		//
//	2-D (width and height) rectangle before trying to draw a 3D 				//
//	representation of the box. Also, this exercise can continue to be 			//
//  expanded to	include shading, features, rotation, etc.						//
//																				//
//	Karl Blankenship															//
//																				//
//	DrawABox.java																//
//																				//
//////////////////////////////////////////////////////////////////////////////////

import javax.swing.JOptionPane;		// Import for creation of dialog boxes.

import java.awt.Canvas; 			//
import java.awt.Graphics; 			// Import for drawing graphics.
import javax.swing.JFrame;			//


/*
	The DrawABox class will create instances of the Box class and will display
	a visual representation of the box in an output window. Box class is currently
	not required to display a single rectangle on the screen. However, as my
	course progresses I plan to utilize the box class to create multiple box
	objects to display.
*/

public class DrawABox extends Canvas
{

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
				
		// Create the drawing space which calls the paint class
			JFrame frame = new JFrame("Rectangle"); 	// Create a new window frame.
			Canvas canvas = new DrawABox(); 			// Create a new canvas object
			canvas.setSize(500, 500); 					// Set canvas size.
			frame.add(canvas); 							// Add the canvas to the frame.
			frame.pack(); 								// Fit the canvas to the frame.
			frame.setVisible(true);						// Make frame visible.
	}

	
	/* 
		The paint method will run when the canvas updates.
	*/
		
	public void paint(Graphics g)
	{ 
		// Prompt user to enter a width (need to add dimension check)
		int width = Integer.parseInt(JOptionPane.showInputDialog("Enter the box " +
															"width less than 300."));
		// Prompt user to enter a height (need to add dimension check)
		int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the box " +
															"height less than 300."));
		g.drawRect(100, 100, width, height); 
		// This works but easily bypasses the Box class meaning only a single box can 
		// exist at a time.
	} 

}
