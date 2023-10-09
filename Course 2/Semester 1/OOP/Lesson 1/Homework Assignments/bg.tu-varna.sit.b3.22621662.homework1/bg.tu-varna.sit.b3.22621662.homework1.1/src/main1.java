/*Задача 1   Напишете програма, която с помощта на подходящи методи да проверява
дали три реални числа са страни на триъгълник и ако да,  дали той е правоъгълен. */
import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input the lengths of the sides of the triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();

        if (isValidTriangle(side1, side2, side3)) {
            if (isRightAngledTriangle(side1, side2, side3)) {
                System.out.println("The triangle is valid and is right-angled.");
            } else {
                System.out.println("The triangle is valid, but is not right-angled.");
            }
        } else {
            System.out.println("The triangle is not valid");
        }

        scanner.close();
    }

    // Check if triangle is valid
    public static boolean isValidTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    // Check if triangle is right-angled
    public static boolean isRightAngledTriangle(double a, double b, double c) {
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);

        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }
}
