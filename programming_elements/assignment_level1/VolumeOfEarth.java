// Program 7: Volume of Earth
class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double kmPerMile = 1.6;
        double pi = 3.14159;

        double volumeKm3 = (4.0 / 3) * pi * Math.pow(radiusKm, 3);
        double radiusMiles = radiusKm / kmPerMile;
        double volumeMiles3 = (4.0 / 3) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                " and cubic miles is " + volumeMiles3);
    }
}
