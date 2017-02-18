/**
 * Hi,
 * 
 * The goal of this class is to better illustrate what I am looking for
 * in this week's assignments in terms of commenting, spacing, naming, etc.
 * 
 * Again, you can copy me.  Alternatively, you don't have to use the same
 * bracketing style, naming convention,
 * spacing, tabbing etc.  I like consistency.  These things do matter -
 * a higher level of detail saves time, money, and effort so we can get back
 * to playing video games.
 * 
 * Ultimately, you're the designer.
 * 
 * (Again, I am not claiming even this code is or ever will be perfect.  Perfection
 * doesn't exist.  I am looking for best effort to make clean code.)
 * 
 * Sincerely,
 * S
 */
package edu.cvtc.Shapes;

import javax.swing.JOptionPane;

/**
 * Represents a 3D cuboid shape.
 */
public class Cuboid extends Shape {

	/**
	 * The width of this Cuboid instance.
	 */
	private float width = 0.0f;
	
	/**
	 * The height of this Cuboid instance.
	 */
	private float height = 0.0f;
	
	/**
	 * The depth of this Cuboid instance.
	 */
	private float depth = 0.0f;
	
	
	
	/**
	 * Gets the width of this Cuboid instance.
	 */
	public float getWidth() {
		return width;
	}
	
	/**
	 * Sets the width of this Cuboid instance.
	 */
	public void setWidth(float width) {
		this.width = width;
	}
	
	/**
	 * Gets the height of this Cuboid instance.
	 */
	public float getHeight() {
		return height;
	}
	
	/**
	 * Sets the height of this Cuboid instance.
	 */
	public void setHeight(float height) {
		this.height = height;
	}
	
	/**
	 * Gets the depth of this Cuboid instance.
	 */
	public float getDepth() {
		return depth;
	}
	
	/**
	 * Sets the depth of this Cuboid instance.
	 */
	public void setDepth(float depth) {
		this.depth = depth;
	}
	
	
	
	/**
	 * Initializes a new instance of a Cuboid.
	 */
	public Cuboid(float width, float height, float depth) {
		if(width <= 0 || height <= 0 || depth <= 0) {
			// for now if any of the values are negative the contructor makes a 1 by 1 by 1 cuboid
			setWidth(1);
			setHeight(1);
			setDepth(1);
		}else {
			// Notice we use accessors instead of fields
			// Set the dimensions of this Cuboid instance
			setWidth(width);
			setHeight(height);
			setDepth(depth);
		}
		
		
	}
	
	
	
	/**
	 * Calculates and returns the surface area for this Cuboid instance.
	 */
	public float getSurfaceArea() {
		// SA = 2(width+height+depth)
		return 2 * (getWidth() * getDepth() + getDepth() * getHeight() + getHeight() * getWidth());
	}

	/**
	 * Calculates and returns the volume for this Cuboid instance.
	 */
	public float getVolume() {
		// v = width X depth X height
		return getWidth() * getDepth() * getHeight();
	}
	
	// shows a messagebox with dimensions, surfaceArea and volume of a the Cuboid
		 public void render(){JOptionPane.showMessageDialog(null, "Cuboid:\nwidth = " + getWidth()+ "\nheight = " + getHeight() + "\ndepth = " + getDepth() +"\nsurface area = " + getSurfaceArea() + "\nvolume = " + getVolume());}


}
