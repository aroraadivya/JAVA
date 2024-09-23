import java.util.Scanner;

public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        int num = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(num<=n){
            System.out.println(num);
            num++;
            // or num = num +1;
        }
    }
}
