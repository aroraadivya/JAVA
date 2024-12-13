import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int numOfDigits=0;

        while(n>0){
            n=n/10;
            numOfDigits++;
        }
        System.out.println("Number of digits: " + numOfDigits);
    }
}
