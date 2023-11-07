/**
* @author Aigerim Alykulova
*/
public class TwoMethodsA02
 {

  
    /**
     * Method checks if a triangle with given lengths of sides is a right triangle
     * @param a triangle side
     * @param b triangle side
     * @param c triangle side
     * @return true if the triangle is right, false if it is not
     */
    public static boolean isRightTri(int a, int b, int c)
    
    /**
     * if/then statement below uses Pythagorean Theorem to calculate if integers input are for a right triangle
     * Checks if the sum of 2 squared values equal the squared value of a 3rd integer
     * Checks all possibilities and orientations of values
     * If the calculation confirms a right triangle, system prints that the test passed
     * If the calculation confirms there is no right triangle, system prints that the test failed
     */
    {
        if((a*a) + (b*b) == (c*c))
        	return true;
       
        else if((a*a) + (c*c) == (b*b))
        	return true;
        
        else if((b*b) + (c*c) == (a*a))
        	return true;
       
        else
        	return false;
    }
    public static void testIsRightTri()
    {
    	System.out.println("\r\n----Tests for isRightTri()------------------------------------------------------------\r\n");
    	
         // Test 1 //
        if(isRightTri(3, 4, 5)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 01 -- isRightTri(3, 4, 5) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 01 -- isRightTri(3, 4, 5) - right triangle",  "FAILED");
        }
   
        // Test 2 //     
        if(isRightTri(4, 5, 3)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 02 -- isRightTri(4, 5, 3) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 02 -- isRightTri(4, 5, 3) - right triangle",  "FAILED");
        }
        
        // Test 3 //     
        if(isRightTri(5, 4, 3)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 03 -- isRightTri(5, 4, 3) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 03 -- isRightTri(5, 4, 3) - right triangle",  "FAILED");
        }
        
        // Test 4 //     
        if(isRightTri(3, 5, 4)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 04 -- isRightTri(3, 4, 5) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 04 -- isRightTri(3, 4, 5) - right triangle",  "FAILED");
        }
        
        // Test 5 //     
        if(isRightTri(5, 3, 4)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 05 -- isRightTri(5, 3, 4) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 05 -- isRightTri(5, 3, 4) - right triangle",  "FAILED");
        }
        
        // Test 6 //     
        if(isRightTri(4, 3, 5)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 06 -- isRightTri(4, 3, 5) - right triangle",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 06 -- isRightTri(4, 3, 5) - right triangle",  "FAILED");
        }
        
        // Test 7 //     
        if(!isRightTri(4, 4, 5)) {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 07 -- isRightTri(4, 4, 5) - NOT rigth trianlge",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "isRightTri() TEST 07 -- isRightTri(4, 4, 5)  - NOT rigth trianlge",  "FAILED");
        }
    }

    /**
     * The method takes hour, minute, and "am", "pm" components of the time stamp of the moment when car crosses the bridge and calculates the toll rate.
     * If any of the time stamp components are invalid, -1 is being returned as an error code.
     * @param hour hour component of the time stamp 
     * @param min minute component of the time stamp
     * @param amPm either string "am" or "pm", component of the time stamp
     * @return the toll rate  
     */
    public static double toll520Bridge(int hour, int min, String amPm)
    {
        // Converts hours and minutes into total amount of minutes
    	int total = hour*60 + min;
    	
    	// If an hour value is out of the 0-12 range, or if a minute value is out of the 0-59 range, or if the string doesn't include am or pm, return test failed
    	// This will help if values are input incorrectly by the user
    	if(hour > 12 || hour < 0 || min > 59 || min < 0)
    		return -1;
    		
    	
    	// If the String value is am, run a if-then statement returning values corresponding to the amount of total
    		if(amPm == "am") {
    			
    			if(total <= 299)
    				return 1.25;
    			
    			else if(total <= 479)
    				return 1.40;
    			
    			else if(total <= 659)
    				return 2.05;
    			
    			else if(total <= 719)
    				return 2.65;
    			
    			else
    				return 1.25;
    		}
    		
    		// If the String value is pm, run a if-then statement returning values corresponding to the amount of total
    		else if(amPm == "pm") {
    			
    			if(total <= 359)
    				return 2.65;
    			
    			else if(total <= 539)
    				return 2.05;
    			
    			else if(total <= 659)
    				return 1.40;
    			
    			else
    				return 1.25;
    		}
    		return -1;
    }
    
    public static void testToll520Bridge()
    {
    	System.out.println("\r\n----Tests for toll520Bridge()---------------------------------------------------------\r\n");
    	
        // Test 1 //  
        if(toll520Bridge(5, 20, "aa") == -1) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 01 -- incorrect range of amPm argument must return -1",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 01 -- incorrect range of amPm argument must return -1",  "FAILED");
        }
        
        // Test 2 //  
        if(toll520Bridge(5, 65, "am") == -1) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 02 -- incorrect range of minutes argument must return -1",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 02 -- incorrect range of minutes argument must return -1",  "FAILED");
        }
        
        // Test 3 //  
        if(toll520Bridge(15, 15, "am") == -1) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 03 -- incorrect range of hours argument must return -1",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 03 -- incorrect range of hours argument must return -1",  "FAILED");
        }
        
        // Test 4 //  
        if(toll520Bridge(12, 0, "am")==1.25
        		&& toll520Bridge(12, 1, "am")==1.25
        		&& toll520Bridge(4, 59, "am")==1.25
        		&& toll520Bridge(3, 35, "am")==1.25) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 04 -- calls that must return 1.25",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 04 -- calls that must return 1.25",  "FAILED");
        }
        
        // Test 5 //  
        if(toll520Bridge(5, 0, "am")==1.4 
        		&& toll520Bridge(5, 1, "am")==1.4
        		&& toll520Bridge(7, 59, "am")==1.4 
        		&& toll520Bridge(6, 03, "am")==1.4) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 05 -- calls that must return 1.40 in am",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 05 -- calls that must return 1.40 in am",  "FAILED");
        }
        
        // Test 6 //  
        if(toll520Bridge(8, 0, "am")==2.05 
        		&& toll520Bridge(10, 59, "am")==2.05 
        		&& toll520Bridge(9, 15, "am")==2.05) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 06 -- calls that must return 2.05 in am",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 06 -- calls that must return 2.05 in am",  "FAILED");
        }
        
        // Test 7 //  
        if(toll520Bridge(11, 0, "am")==2.65 
        		&& toll520Bridge(4, 59, "pm")==2.65 
        		&& toll520Bridge(3, 55, "pm")==2.65) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 07 -- calls that must return 2.65",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 07 -- calls that must return 2.65",  "FAILED");
        }
        
        // Test 8 //  
        if(toll520Bridge(6, 0, "pm")==2.05 
        		&& toll520Bridge(8, 59, "pm")==2.05 
        		&& toll520Bridge(6, 15, "pm")==2.05) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 08 -- calls that must return 2.05 in pm",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 08 -- calls that must return 2.05 in pm",  "FAILED");
        }
        
        // Test 9 //  
        if(toll520Bridge(9, 0, "pm")==1.4 
        		&& toll520Bridge(10, 59, "pm")==1.4 
        		&& toll520Bridge(9, 3, "pm")==1.4) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 09 -- calls that must return 1.40 in pm",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 09 -- calls that must return 1.40 in pm",  "FAILED");
        }
        
        // Test 10 //  
        if(toll520Bridge(11, 0, "pm")==1.25 
        		&& toll520Bridge(11, 59, "pm")==1.25 
        		&& toll520Bridge(11, 40, "pm")==1.25) {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 10 -- calls that must return 1.25 in pm",  "PASSED");
        }
        else {
        	System.out.printf("%-80s%-10s\n", "toll520Bridge() TEST 10 -- calls that must return 1.25 in pm",  "FAILED");
        }
    }
        
 
     /** Method main()contains all the tests 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        testIsRightTri();
        System.out.println("\n--------------------------------------------------------\n");
        testToll520Bridge();
        
    }    
}
