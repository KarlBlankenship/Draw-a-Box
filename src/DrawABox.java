//////////////////////////////////////////////////////////////////////////////////
//																				//
//	This program will ask for length, width and height from the user			//
//	and draw a box fitting those dimensions in a pop-up window.					//
//																				//
//	Development notes... I will probably start out testing with drawing a		//
//	2-D (length and width) rectangle before trying to draw a 3D 				//
//	representation of the box. Also, this exercise can be expanded on to		//
//	include shading, features, rotation, etc.									//
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
	a visual representation of the box in an output window.
*/

public class DrawABox extends Canvas
{

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		
		// Rough plan...
		// Create a box object (need a box class)
		// Display a message box asking for length
		// Display a message box asking for width
		// Display a message box asking for height
		// Calculate the 3-D perspective coordinates
		// Open a display window
		// Generate lines connecting the coordinates
		
		
		/*
			// Test the Box class.
			// Create a new instance using default constructor.
			Box shippingBox = new Box();
			// Create a new instance using the overload constructor.
			Box bigBox = new Box(12.0, 200.0, 4.0);
			// Get the length of the shippingBox instance.
			System.out.println("length of shippingBox = " + shippingBox.getLength());
			// Get the width of the shippingBox instance.
			System.out.println("width of shippingBox = " + shippingBox.getWidth());
			// Get the height of the shippingBox instance.
			System.out.println("height of shippingBox = " + shippingBox.getHeight());
			// Use toString to verify values of bigBox.
			System.out.print("toString bigBox:" + bigBox.toString());
			// Box Class is working.
		*/
			
			
		/*
			// Creation of dialog box code to ask for inputs.
			// Test display a message.
			JOptionPane.showMessageDialog(null, "Hello Box");
			// Test entering a dimension.
			String dimension;
			dimension = JOptionPane.showInputDialog("Enter a dimension.");
			// Test displaying entered dimension.
			JOptionPane.showMessageDialog(null,  dimension);
			// Convert dimension to a double.
			double doubleDimension = 0.0;			// Initialize input as a double.
			doubleDimension = Double.parseDouble(dimension);
			System.out.println("Dimension as a double = " + doubleDimension);
			// Test that it is a double.
			System.out.println("Dimension x 3.5 = " + doubleDimension * 3.5);
			// JOPtionPane requires a system exit.
			System.exit(0);
			// Dialog boxes are working.
		*/
		
		 // Create a simple rectangle
			JFrame frame = new JFrame("Rectangle"); 	// Create a new window frame.
			Canvas canvas = new DrawABox(); 			// Create a new canvas object
			canvas.setSize(500, 500); 					// Set canvas size.
			frame.add(canvas); 							// Add the canvas to the frame.
			frame.pack(); 								// Fit the canvas to the frame.
			frame.setVisible(true);						// Make frame visible.
		}

	
	/* 
		The paint method will run when the canvas updates.(non-Javadoc)
	 	@see java.awt.Canvas#paint(java.awt.Graphics)
	 	
	*/
	
	// How do I get my user entered dimensions into this?!?!
	// Just a few chapters away in text.
	public void paint(Graphics g)
	{ 
		String dimHeight;
		int width = Integer.parseInt(JOptionPane.showInputDialog("Enter the box width less than 300."));
		dimHeight = JOptionPane.showInputDialog("Enter the box height less than 300.");
		int height = Integer.parseInt(dimHeight);
		g.drawRect(100, 100, width, height); 
	} 

}
