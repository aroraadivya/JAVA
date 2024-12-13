import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the principal amount: ");
        float p = sc.nextFloat();

        System.out.println("enter the rate of interest: ");
        float r = sc.nextFloat();

        System.out.println("enter the time period: ");
        float t = sc.nextFloat();

        float si = (p * r * t) / 100;

        System.out.println("The simple interest is: " + si);
        sc.close();
    }
}
