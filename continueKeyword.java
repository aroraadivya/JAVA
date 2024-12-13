public class continueKeyword {
    public static void main(String[] args) {
        // int num =1;

        for(int num = 1; num<=50;num++){

            if(num%3==0){
                continue;
            }
            System.out.println(num);
        }
    }
}
