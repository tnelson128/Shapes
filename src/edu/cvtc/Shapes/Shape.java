package edu.cvtc.Shapes;

import javax.swing.JOptionPane;

public abstract class Shape{
	//creates an abstract method called surfaceArea
	abstract float getSurfaceArea();
	//creates an abstract method called volume
	abstract float getVolume();
	////creates an abstract method called render
	public void render(){JOptionPane.showMessageDialog(null, "surface area = " + getSurfaceArea() + "\nvolume = " + getVolume());}
}