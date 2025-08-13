// Program 12: Area of triangle in inches² and cm²
import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter base in inches: ");
        double base = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        double areaInches2 = 0.5 * base * height;
        double areaCm2 = areaInches2 * 6.4516; // 1 inch² = 6.4516 cm²

        System.out.println("The area of the triangle is " + areaInches2 +
                " square inches and " + areaCm2 + " square centimeters");
    }
}
