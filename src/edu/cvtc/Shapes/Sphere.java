package edu.cvtc.Shapes;
import javax.swing.JOptionPane;


public class Sphere extends Shape {
	
	// this field will hold the radius value
	private float radius = 0.0f;
	
	// this constructor creates a new cylinder object
	public Sphere(float radius){
		if(radius < 0){
			// if either is less than zero we make a 1 radius sphere
			setRadius(1);
		}else{
			// they are above 0 and can be used to create the desired sphere
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
	
	// returns the surfaceArea of the Cylinder
	public float getSurfaceArea() {
		// stores the radius in r
		float r = getRadius();
		// SA = Pi X radius X radius X 4
		return (float)Math.PI * r * r * 4;
	}
	
	// returns the Volume of the Cylinder
	public float getVolume() {
		// stores the radius in r
		float r = getRadius();
		// v  = Pi X radius X radius X radius X 4/3
		return (float)Math.PI * r * r * r * 4 / 3; 
	}
	
	// shows a messagebox with demensions, surfaceArea and volume of a the Cylinder
	 public void render(){JOptionPane.showMessageDialog(null, "Sphere:\nradius = " + getRadius()+ "\nsurface area = " + getSurfaceArea() + "\nvolume = " + getVolume());}
}
