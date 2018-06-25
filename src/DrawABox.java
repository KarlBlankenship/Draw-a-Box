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

public class DrawABox {

	public static void main(String[] args) {
		
		// Rough plan...
		// Create a box object (need a box class)
		// Display a message box asking for length
		// Display a message box asking for width
		// Display a message box asking for height
		// Calculate the 3-D perspective coordinates
		// Open a display window
		// Generate lines connecting the coordinates
		
		// Test the Box class.
		// Create a new instance using default constructor.
		Box shippingBox = new Box();
		// Create a new instance using the overload constructor.
		Box bigBox = new Box(12.0, 8.0, 4.0);
		// Get the length of the shippingBox instance.
		System.out.println("length of shippingBox = " + shippingBox.getLength());
		// Get the width of the shippingBox instance.
		System.out.println("width of shippingBox = " + shippingBox.getWidth());
		// Get the height of the shippingBox instance.
		System.out.println("height of shippingBox = " + shippingBox.getHeight());
		// Use toString to verify values of bigBox.
		System.out.print("toString bigBox:" + bigBox.toString());
		// Box Class is working.
		

	}

}
