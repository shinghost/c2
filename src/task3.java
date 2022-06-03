import java.util.Scanner;

public class task3 {
    public static double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 = ");
        int x1 = sc.nextInt();
        System.out.print("Enter x2 = ");
        int x2 = sc.nextInt();
        System.out.print("Enter x3 = ");
        int x3 = sc.nextInt();
        System.out.print("Enter y1 = ");
        int y1 = sc.nextInt();
        System.out.print("Enter y2 = ");
        int y2 = sc.nextInt();
        System.out.print("Enter y3 = ");
        int y3 = sc.nextInt();

        double A = length(x1, y1, x2, y2);
        double B = length(x1, y1, x3, y3);
        double C = length(x2, y2, x3, y3);

        System.out.printf("Perimeter: %f", A + B + C);
    }
}
