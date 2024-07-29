import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  string input(reads only first name)
        
        // System.out.println("Enter your name");
        // String name = sc.next();
        // System.out.println("Your name is " + name);

        //whole line reads
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Your name is " + name);

        //intezer input
        System.out.println("Enter your lucky number");
        int num_1 = sc.nextInt();

        System.out.println("Lucky number is " + num_1);
    }
}
