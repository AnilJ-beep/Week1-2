import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, fromCity, viaCity, toCity;
        double fromToVia, viaToFinalCity;
        int timeFromToVia, timeViaToFinalCity;

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("From City: ");
        fromCity = sc.nextLine();

        System.out.print("Via City: ");
        viaCity = sc.nextLine();

        System.out.print("To City: ");
        toCity = sc.nextLine();

        System.out.print("Distance from " + fromCity + " to " + viaCity + ": ");
        fromToVia = sc.nextDouble();

        System.out.print("Distance from " + viaCity + " to " + toCity + ": ");
        viaToFinalCity = sc.nextDouble();

        System.out.print("Time from " + fromCity + " to " + viaCity + " (minutes): ");
        timeFromToVia = sc.nextInt();

        System.out.print("Time from " + viaCity + " to " + toCity + " (minutes): ");
        timeViaToFinalCity = sc.nextInt();

        double totalDistance = fromToVia + viaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");

        sc.close();
    }
}