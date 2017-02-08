package edu.cvtc.Shapes;
import javax.swing.JOptionPane;


public class Cylinder extends Shape {
	
	// this field will hold the radius value
	private float radius = 0.0f;
	
	// this field will hold the height value
	private float height = 0.0f;
	
	// this constructor creates a new cylinder object
	public Cylinder(float radius, float height){
		if(height < 0 || radius < 0){
			// if either is less than zero we make a 1 by 1 Cylinder
			setHeight(1);
			setRadius(1);
		}else{
			// they are above 0 and can be used to create the desired Cylinder
			setHeight(height);
			setRadius(radius);
		}
	}
	
	// These are getter and setter methods
	// gets the radius value
	public float getRadius() {
		return radius;
	}
	
	// sets the radius value
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	// gets the height value
	public float getHeight() {
		return height;
	}
	
	// sets the height value
	public void setHeight(float height) {
		this.height = height;
	}
	
	// returns the surfaceArea of the Cylinder
	public float getSurfaceArea() {
		// stores the radius in r
		float r = getRadius();
		// SA = Pi(2 X radius X height + 2 X radius X radius)
		return (float)Math.PI * (2 * r * getHeight() + 2 * r * r);
	}
	
	// returns the Volume of the Cylinder
	public float getVolume() {
		// stores the radius in r
		float r = getRadius();
		// v = Pi X radius X radius X height
		return (float)Math.PI * r * r * getHeight(); 
	}
	
	// shows a messagebox with demensions, surfaceArea and volume of a the Cylinder
	 public void render(){JOptionPane.showMessageDialog(null, "Cylinder:\nradius = " + getRadius()+ "\nheight = " + getHeight() +"\nsurface area = " + getSurfaceArea() + "\nvolume = " + getVolume());}
}
