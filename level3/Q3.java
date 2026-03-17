import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary, bonus;

        System.out.print("Enter salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter bonus: ");
        bonus = sc.nextDouble();

        double totalIncome = salary + bonus;

        System.out.println("The salary is INR " + salary +
                " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + totalIncome);

        sc.close();
    }
}