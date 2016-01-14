package de.demo;
/*
 * JUnit test for the Triangle class
 */
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * TriangleTest
 */
public class TriangleTest {
    // Create a new Triangle
    public TriangleTest() {
    }

    @Test
    public void testScalene() {  
        Triangle instance = new Triangle("30", "40", "50");
        String expResult = "Scalene";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void testEquilateral() {       
        Triangle instance = new Triangle("1", "1", "1");
        String expResult = "Equilateral";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsoceles() {       
        Triangle instance = new Triangle("30", "40", "30");
        String expResult = "Isosceles";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }

    @Test
    public void testGiantTriangle() {        
        Triangle instance = new Triangle("3000000", "4000000", "3000000");
        String expResult = "I feel your triangle is too big\n";
        String result = instance.determineTriangleType();
        assertEquals(expResult, result);
    }
}