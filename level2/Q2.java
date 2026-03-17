import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, height;

        System.out.print("Enter base (in cm): ");
        base = sc.nextDouble();

        System.out.print("Enter height (in cm): ");
        height = sc.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

        System.out.println("The Area of the triangle in sq cm is " + areaCm +
                " and in sq inches is " + areaInch);

        sc.close();
    }
}