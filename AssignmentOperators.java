public class AssignmentOperators {
    public static void main(String[] args) {
        int p=10;
        int q;

        // =
        q=p;
        System.out.println(q); //1o

        //  +=
        p += q;
        System.out.println(p); //20

        // -=
        p -= q;
        System.out.println(p); //10

        // *=
        p *= q;
        System.out.println(p); //100

        // /=
        p /= q;
        System.out.println(p); //10
        
        // %=
        p %= q;
        System.out.println(p); //0
    }
}
