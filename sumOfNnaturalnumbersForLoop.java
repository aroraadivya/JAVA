import java.util.Scanner;

public class sumOfNnaturalnumbersForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;

        for(int num=1; num<=n; num++){
            sum = num+sum;
        }
        System.out.println(sum);
    }
}
