package edu.cvtc.Shapes;

public class ShapesTest {

	public static void main(String[] args) {
		// Creates a cubiod with correct parameters 
		Cuboid cuboid = new Cuboid(4, 4, 5);
		// shows the cuboid's details in a message box
		cuboid.render();
		
		// Creates a cubiod with incorrect parameters 
		Cuboid cuboid1 = new Cuboid(4, -4, 5);
		// shows the cuboid1's details in a messagebox(should be a 1 by 1 by 1 instead)
		cuboid1.render();
		
		// Creates a cylinder with correct parameters
		Cylinder cylinder = new Cylinder(1, 2);
		// show the cylinder's details in the messagebox
		cylinder.render();
		
		// Creates a cylinder with incorrect parameters
		Cylinder cylinder1 = new Cylinder(-5, -6);
		// show the cylinder1's details in the messagebox(should be a 1 by 1 instead)
		cylinder1.render();
		
		// Creates a sphere with correct parameters
		Sphere sphere = new Sphere(5);
		// show the cylinder's details in the messagebox
		cylinder.render();
		
		// Creates a cylinder with incorrect parameters
		Sphere sphere1 = new Sphere(0);
		// show the sphere1's details in the messagebox(should be a 1 by 1 by 1 instead)
		cylinder1.render();
		
		

	}

}
