package Programs.Prog01_01;

import java.util.Scanner;

public class Prog01_01 {
    public Prog01_01() {

        Scanner in = new Scanner(System.in);
        char answer;

        do {
            // (0,0) (1,0) (0,1) = 0.5 area
            System.out.print("Enter the three vertices [x1 y1 x2 y2 x3 y3] :: ");
            double x1 = in.nextDouble();
            double y1 = in.nextDouble();
            double x2 = in.nextDouble();
            double y2 = in.nextDouble();
            double x3 = in.nextDouble();
            double y3 = in.nextDouble();

            in.nextLine();

            double a = distance(x1, y1, x2, y2);
            double b = distance(x1, y1, x3, y3);
            double c = distance(x2, y2, x3, y3);

            double semiPerimter = (a + b + c) / 2;
            double area = Math.sqrt(semiPerimter * (semiPerimter - a) * (semiPerimter - b) * (semiPerimter - c));
            System.out.println("Area = " + area);

            System.out.print("Run again? [Y/N] :: ");
            answer = in.nextLine().toUpperCase().charAt(0);
        } while (answer == 'Y');

        in.close();
    }

    public double distance(double px, double py, double qx, double qy) {
        return Math.sqrt(Math.pow(px - qx, 2) + Math.pow(py - qy, 2));
    }

    public static void main(String[] args) {
        new Prog01_01();
    }
}
