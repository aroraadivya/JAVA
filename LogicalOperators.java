public class LogicalOperators {
    public static void main(String[] args) {
        int p=15, q=18, r=5;

        // && operator(Logical AND)
        System.out.println((p>q) && (p>r));
        System.out.println((p>q) && (p<r));

        // || oprrator(Logical OR)
        System.out.println((r<q) || (p<q));
        System.out.println((p>q) || (q>r));
        System.out.println((p<q) || (q<r));

        //! operator(Logical NOT)
        System.out.println(!(p == q));
        System.out.println(!(p>q));
    }
}
