import java.util.Scanner;

public class TestTriangle {

    public static void main(String[] args) {

        try (Scanner sc1 = new Scanner(System.in)) {
            try (Scanner sc2 = new Scanner(System.in)) {
                System.out.print("Enter the side1 of the triangle: ");

                double s1 = sc1.nextDouble();

                System.out.print("Enter the side2 of the triangle: ");

                double s2 = sc1.nextDouble();

                System.out.print("Enter the side3 of the triangle: ");

                double s3 = sc1.nextDouble();

                System.out.print("Enter the color of the triangle: ");

                String c = sc2.nextLine();

                System.out.print("Is the triangle filled? Enter (True/False) : ");

                String f = sc2.nextLine();

                boolean filled;

                if (f.equalsIgnoreCase("True"))

                    filled = true;

                else

                    filled = false;

                // Creating triangle object;

                Triangle t = new Triangle(s1, s2, s3);

                t.setColor(c);

                t.setFilled(filled);

                // display

                System.out.println("\n" + t);

                System.out.print("Area : " + t.getArea() + "\t\tPerimeter : " + t.getPerimeter() + "\n");

                System.out.print("Color : " + t.getColor() + "\t\tFilled : " + t.isFilled() + "\n");
            }
        }

    }

}