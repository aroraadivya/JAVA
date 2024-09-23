import java.util.Scanner;

public class printnaturalnoinreverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int num=n; num>=1; num--){
            System.out.println(num);
        }
    }
}
