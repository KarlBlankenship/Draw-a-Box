//////////////////////////////////////////////////////////////////////////////////
//																				//
//	This class will be responsible for creating instances of box and will		//
//	contain the length, width and height of the box object.						//
//																				//
//	Development notes... This class may also contain the coordinates that 		//
//	will represent the 3D box in a 2D window.									//
//																				//
//	Karl Blankenship															//
//																				//
//	Box.java																	//
//																				//
//////////////////////////////////////////////////////////////////////////////////

/*
	The Box class simulates a box.
*/

public class Box 
{
	private double length;				// Length of box.
	private double width;				// Width of box.
	private double height;				// Height of box.
	
	/*
	  	This is the default constructor and sets length, width
	  	and height to 0.0.
	*/
	
	public Box()
	{
		length = 0.0;
		width = 0.0;
		height = 0.0;
	}
	
	/*
	 	This overloaded constructor accepts input values directly for
	 	length, width and height.
	 	@param length The initialized length.
	 	@param width The initialized width.
	 	@param height The initialized height.
	*/
	
	public Box(double length, double width, double height)
	{
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	/*
		This method will allow the object length to be returned.
		@return The value in the length field.
	*/
	
	public double getLength()
	{
		return this.length;
	}
	
	/*
		This method will allow the object width to be returned.
		@return The value in the width field.
	*/

	public double getWidth()
	{
		return this.width;
	}

	/*
		This method will allow the object height to be returned.
		@return The value in the height field.
	*/

	public double getHeight()
	{
		return this.height;
	}
	
	/*
		This is the toString method which will return the current field
		values as a string.
		@return The current field values as a string.
	*/
	
	public String toString()
	{
		// Create and return the String object containing the field values.
		return "\nLength = " + length +
				"\nWidth = " + width +
				"\nHeight = " + height;
	}
}
























