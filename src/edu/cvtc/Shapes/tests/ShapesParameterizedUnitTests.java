package edu.cvtc.Shapes.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import edu.cvtc.Shapes.*;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class ShapesParameterizedUnitTests {
	
	/**
	 *  a set of values I would like to call to test against my Shape objects
	 * @return
	 */
	public Object[] generalParameters() {
		return new Object[] {
				"1, 1",
				".1, .01",
				"888, 5",
				".8, 888"
		};
		
	}
	
	public Object[] badParameters() {
		return new Object[] {
				"-1, 1",
				"1, 0",
				"-888, 5",
				"888, -.5"
		};
	}
		
		public Object[] generalParameters2() {
			return new Object[] {
					"1, 1, 1",
					".1, .01, 1",
					"888, 5, 799",
					".8, 888, .02"
			};
			
		}
		
		public Object[] badParameters2() {
			return new Object[] {
					"-1, 1, -1",
					"1, 0, 1",
					"-888, 5, 0",
					"888, -.5 ,900"
			};
		
	}
	
	/*
	 *  SPHERE TESTING STARTING
	 */
	
	/**
	 * Tests the value of getRadius.
	 */
	@Test
	@junitparams.Parameters({"1", ".5", ".001", "400"})
	public void sphereRadiusTest(float argRadius) {
		// 1. Arrange
		Sphere sphere = new Sphere(argRadius);
		float expected = argRadius;
		
		// 2. Act
		float actual = sphere.getRadius();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values of getRadius.
	 */
	@Test
	@junitparams.Parameters({"-1", "-.5", "0", "-400"})
	public void sphereBadRadiusTest(float argRadius) {
		// 1. Arrange
		Sphere sphere = new Sphere(argRadius);
		float expected = 1;
		
		// 2. Act
		float actual = sphere.getRadius();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests the value of getSurfaceArea.
	 */
	@Test
	@junitparams.Parameters({"1", ".5", ".001", "400"})
	public void sphereSurfaceAreaTest(float argRadius) {
		// 1. Arrange
		Sphere sphere = new Sphere(argRadius);
		float expected = (float)Math.PI * argRadius * argRadius * 4;
		
		// 2. Act
		float actual = sphere.getSurfaceArea();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getSurfaceArea.
	 */
	@Test
	@junitparams.Parameters({"-1", "-.5", "0", "-400"})
	public void sphereBadSurfaceAreaTest(float argRadius) {
		// 1. Arrange
		Sphere sphere = new Sphere(argRadius);
		float expected = (float)Math.PI * 4;
		
		// 2. Act
		float actual = sphere.getSurfaceArea();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests the value of getVolume.
	 */
	@Test
	@junitparams.Parameters({"1", ".5", ".001", "400"})
	public void sphereVolumeTest(float argRadius) {
		// 1. Arrange
		Sphere sphere = new Sphere(argRadius);
		float expected = (float)Math.PI * argRadius * argRadius * argRadius * 4 / 3;
		
		// 2. Act
		float actual = sphere.getVolume();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getVolume.
	 */
	@Test
	@junitparams.Parameters({"-1", "-.5", "0", "-400"})
	public void sphereBadVolumeTest(float argRadius) {
		// 1. Arrange
		Sphere sphere = new Sphere(argRadius);
		float expected = (float)Math.PI * 4 / 3;
		
		// 2. Act
		float actual = sphere.getVolume();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	

	/*
	 *  Cylinder TESTING STARTING
	 */
	
	/**
	 * Tests the values for getRadius.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "generalParameters")
	public void cylinderRadiusTest(float argRadius, float argHeight) {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(argRadius, argHeight);
		float expected = argRadius;
		
		// 2. Act
		float actual = cylinder.getRadius();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getRadius.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "badParameters")
	public void cylinderBadRadiusTest(float argRadius, float argHeight) {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(argRadius, argHeight);
		float expected = 1;
		
		// 2. Act
		float actual = cylinder.getRadius();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests the values for getHeight.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "generalParameters")
	public void cylinderHeightTest(float argRadius, float argHeight) {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(argRadius, argHeight);
		float expected = argHeight;
		
		// 2. Act
		float actual = cylinder.getHeight();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getHeight.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "badParameters")
	public void cylinderBadHeightTest(float argRadius, float argHeight) {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(argRadius, argHeight);
		float expected = 1;
		
		// 2. Act
		float actual = cylinder.getHeight();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests the values for getSurfaceArea.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "generalParameters")
	public void cylinderSurfaceAreaTest(float argRadius, float argHeight) {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(argRadius, argHeight);
		float expected = (float)Math.PI * (2 * argRadius * argHeight + 2 * argRadius * argRadius);
		
		// 2. Act
		float actual = cylinder.getSurfaceArea();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getSurfaceArea.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "badParameters")
	public void cylinderBadSurfaceAreaTest(float argRadius, float argHeight) {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(argRadius, argHeight);
		float expected = (float)Math.PI * (2 + 2);
		
		// 2. Act
		float actual = cylinder.getSurfaceArea();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests the value of getVolume.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "generalParameters")
	public void cylinderVolumeTest(float argRadius, float argHeight) {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(argRadius, argHeight);
		float expected = (float)Math.PI * argRadius * argRadius * argHeight;
		
		// 2. Act
		float actual = cylinder.getVolume();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getVolume.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "badParameters")
	public void cylinderBadVolumeTest(float argRadius, float argHeight) {
		// 1. Arrange
		Cylinder cylinder = new Cylinder(argRadius, argHeight);
		float expected = (float)Math.PI;
		
		// 2. Act
		float actual = cylinder.getVolume();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/*
	 *  Cuboid TESTING STARTING
	 */
	
	/**
	 * Tests the values for getWidth.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "generalParameters2")
	public void cuboidWidthTest(float argWidth, float argHeight, float argDepth) {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(argWidth, argHeight, argDepth);
		float expected = argWidth;
		
		// 2. Act
		float actual = cuboid.getWidth();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getWidth.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "badParameters2")
	public void cuboidBadWidthTest(float argWidth, float argHeight, float argDepth) {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(argWidth, argHeight, argDepth);
		float expected = 1;
		
		// 2. Act
		float actual = cuboid.getWidth();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests the values for getHeight.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "generalParameters2")
	public void cuboidHeightTest(float argWidth, float argHeight, float argDepth) {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(argWidth, argHeight, argDepth);
		float expected = argHeight;
		
		// 2. Act
		float actual = cuboid.getHeight();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getHeight.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "badParameters2")
	public void cuboidBadHeightTest(float argWidth, float argHeight, float argDepth) {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(argWidth, argHeight, argDepth);
		float expected = 1;
		
		// 2. Act
		float actual = cuboid.getHeight();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests the values for getDepth.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "generalParameters2")
	public void cuboidDepthTest(float argWidth, float argHeight, float argDepth) {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(argWidth, argHeight, argDepth);
		float expected = argDepth;
		
		// 2. Act
		float actual = cuboid.getDepth();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getDepth.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "badParameters2")
	public void cuboidBadDepthTest(float argWidth, float argHeight, float argDepth) {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(argWidth, argHeight, argDepth);
		float expected = 1;
		
		// 2. Act
		float actual = cuboid.getDepth();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests the values for getSurfaceArea.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "generalParameters2")
	public void CuboidSurfaceAreaTest(float argWidth, float argHeight, float argDepth) {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(argWidth, argHeight, argDepth);
		float expected = 2 * (argWidth * argDepth + argDepth * argHeight + argHeight * argWidth);
		
		// 2. Act
		float actual = cuboid.getSurfaceArea();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getSurfaceArea.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "badParameters2")
	public void cuboidBadSurfaceAreaTest(float argWidth, float argHeight, float argDepth) {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(argWidth, argHeight, argDepth);
		float expected = 2 * (1 + 1 + 1);
		
		// 2. Act
		float actual = cuboid.getSurfaceArea();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests the value of getVolume.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "generalParameters2")
	public void cuboidVolumeTest(float argWidth, float argHeight, float argDepth) {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(argWidth, argHeight, argDepth);
		float expected = argWidth * argDepth * argHeight;
		
		// 2. Act
		float actual = cuboid.getVolume();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	/**
	 * Tests bad values for getVolume.
	 */
	@Test
	@junitparams.Parameters(source = ShapesParameterizedUnitTests.class, method = "badParameters2")
	public void cuboidBadVolumeTest(float argWidth, float argHeight, float argDepth) {
		// 1. Arrange
		Cuboid cuboid = new Cuboid(argWidth, argHeight, argDepth);
		float expected = 1;
		
		// 2. Act
		float actual = cuboid.getVolume();
		
		// 3. Assert
		assertEquals(expected, actual, .001);
	}
	
	

}
