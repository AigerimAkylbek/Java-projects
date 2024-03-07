
/**
 * 
 * @author Aigerim Alykulova 
 *
 */

import java.util.Arrays;

public class BasicShape extends HasState implements Relatable {

    protected int[] color = new int[3]; // this array will always only have 3 indexes

    // Non-argument constructor
    public BasicShape() {
        //Arrays.fill(color, 255); // Set color to white
        color[0] = color[1] = color[2] = 255;
    }

    public void DoAThing(String s)
    {
        // Declares two strings with the same content  
        String x1 = "Hello there!";
        String x2 = "Hello there!";
        // Checks if the content of x1 and x2 are equal 
        if (x1.equals(x2))
        // Executes if the content of x1 and x2 are equal 
        {

        }
        // Prints a message to the console
        System.out.println(s + "Hi there!");
    }

    // Constructor with parameters
    public BasicShape(int red, int green, int blue) {
        validateColor(red, green, blue); // Validate and throw exception if needed
        this.color = new int[]{red, green, blue};
    }

    public BasicShape(int[] color) {
        setColor(color);
    }



    // Accessor method for color field
    public int[] getColor() {
        return Arrays.copyOf(color, color.length); // Return a deep copy of the array
    }

    // Mutator method for color field
    public void setColor(int[] newColor) {
        validateColorArray(newColor); // Validate and throw exception if needed
        this.color = Arrays.copyOf(newColor, newColor.length); // Deep copy of the array
    }

    // Implementing Relatable interface methods

    @Override
    public boolean equals(Object obj) {
        // Checks if the object is null or not of the same class    
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        // Casts the object to BasicShape    
        BasicShape other = (BasicShape) obj;
        // Compares the areas of the two shapes for equality    
        return this.getArea() == other.getArea();
    }

    @Override
    public boolean isGreater(Object obj) {
        // Throws exception if the object is null    
        if (obj == null) {
            throw new IllegalArgumentException("Comparison between different types is not allowed");
        }
        // Casts the object to BasicShape   
        BasicShape other = (BasicShape) obj;
        // Compares the areas of the two shapes and determines if the area of the current shape is greater    
        return this.getArea() > other.getArea();
    }

    @Override
    public boolean isLess(Object obj) {
        // Throws exception if the object is null    
        if (obj == null) {
            throw new IllegalArgumentException("Comparison between different types is not allowed");
        }
        // Casts the object to BasicShape    
        BasicShape other = (BasicShape) obj;
        // Compares the areas of the two shapes and determines if the area of the current shape is less
        return this.getArea() < other.getArea();
    }

    // Abstract method to get the area
    public double getArea() {
        // Provide implementation specific to the shape
        return 0.0;
    }

    // Helper method to validate color values
    private void validateColor(int red, int green, int blue) {
        if (!isValidColor(red) || !isValidColor(green) || !isValidColor(blue)) {
            throw new IllegalArgumentException("Color values must be in the range [0, 255]");
        }
    }

    // Helper method to validate color array
    private void validateColorArray(int[] colorArray) {
        // Throws exception if the color array is null or not exactly 3 elements long   
        if (colorArray == null || colorArray.length != 3) {
            throw new IllegalArgumentException("Color array must be exactly 3 elements long");
        }
        for (int value : colorArray) {
            if (!isValidColor(value)) {
                throw new IllegalArgumentException("Color values must be in the range [0, 255]");
            }
        }
    }

    // Helper method to check if a color value is valid
    private boolean isValidColor(int value) {
        // Checks if the color value is within the valid rang
        return value >= 0 && value <= 255;
    }
}
