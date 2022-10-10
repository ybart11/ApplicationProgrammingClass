package cis3270.assignments;

public class Chapter4_03 {

	public static void main(String[] args) {
		
	// Coordinates
		// Atlanta, GA
		double xATL = Math.toRadians(33.7524500);
		double yATL = Math.toRadians(-84.3920200);
		
		// Orlando, FL
		double xORL = Math.toRadians(28.5383355);
		double yORL = Math.toRadians(-81.37923649999999);
		
		// Savannah, GA
		double xSAV = Math.toRadians(32.0835407);
		double ySAV = Math.toRadians(-81.09983419999998);
		// Charlotte, NC
		double xCHAR = Math.toRadians(35.2270869);
		double yCHAR = Math.toRadians(-80.84312669999997);
		
		
		// Compute distance between cities
		// formula: d = radius X arccos(sin(x1) X sin(x2) + cos(x1) X cos(x2) X cos(y1 - y2))
        double radius = 6371.01;
        double ATL_ORL = radius * Math.acos(Math.sin(xATL) * Math.sin(xORL) + Math.cos(xATL) * Math.cos(xORL) * Math.cos(yATL - yORL));
        double SAV_ORL = radius * Math.acos(Math.sin(xSAV) * Math.sin(xORL) + Math.cos(xSAV) * Math.cos(xORL) * Math.cos(ySAV - yORL));
        double SAV_CHAR = radius * Math.acos(Math.sin(xSAV) * Math.sin(xCHAR) + Math.cos(xSAV) * Math.cos(xCHAR) * Math.cos(ySAV - yCHAR));
        double ATL_CHAR = radius * Math.acos(Math.sin(xATL) * Math.sin(xCHAR) + Math.cos(xATL) * Math.cos(xCHAR) * Math.cos(yATL - yCHAR));
        double CHAR_ORL = radius * Math.acos(Math.sin(xCHAR) * Math.sin(xORL) + Math.cos(xCHAR) * Math.cos(xORL) * Math.cos(yCHAR - yORL));
        
        // Display distance between cities 
        System.out.printf("AG_OF  = %.2f km\n", ATL_ORL);
        System.out.printf("SAV_ORL  = %.2f km\n", SAV_ORL);
        System.out.printf("SAV_CHAR = %.2f km\n", SAV_CHAR);
        System.out.printf("AG_CNC = %.2f km\n", ATL_CHAR);
        System.out.printf("CHAR_ORL = %.2f km\n", CHAR_ORL);
        
        // Compute area of triangle 
        double s = (ATL_CHAR + CHAR_ORL + ATL_ORL) / 2;
        double area = Math.sqrt(s * (s - ATL_CHAR) * (s - CHAR_ORL) * (s - ATL_ORL));
        
        System.out.printf("\nArea1 is %.2f km²", area);
        s = (SAV_CHAR + CHAR_ORL + SAV_ORL) / 2;
        
        System.out.printf("\nArea2 is %.2f km²", Math.sqrt(s * (s - SAV_CHAR) * (s - CHAR_ORL) * (s - SAV_ORL)));
        area += Math.sqrt(s * (s - SAV_CHAR) * (s - CHAR_ORL) * (s - SAV_ORL));

        System.out.printf("\nTotal is %.2f km²", area);
        
        
        
        
  
	}

}
