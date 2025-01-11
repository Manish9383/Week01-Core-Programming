public class SeventhProgram {

    public static void main(String[] args) {
        // Radius of Earth in kilometers
        double radiusKm = 6378.0; 

        // Radius of Earth in miles (1 km = 0.6 miles)
        double radiusMiles = radiusKm * 0.6; 

        // Calculate the volume of Earth in cubic kilometers
        double volumeKm3 = ((double)4/3) * Math.PI * Math.pow(radiusKm, 3);

        // Calculate the volume of Earth in cubic miles
        double volumeMiles3 = ((double)4/3) * Math.PI * Math.pow(radiusMiles, 3);

        // Print the results
 
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3+" and cubic miles is "+volumeMiles3);
        
}
}


