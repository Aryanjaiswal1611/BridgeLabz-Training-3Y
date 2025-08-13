// Program 10: Height conversion cm to feet & inches
import java.util.Scanner;

class HeightConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        double inchesTotal = heightCm / 2.54;
        int feet = (int) (inchesTotal / 12);
        double inches = inchesTotal % 12;

        System.out.println("Your Height in cm is " + heightCm +
                " while in feet is " + feet + " and inches is " + inches);
    }
}
