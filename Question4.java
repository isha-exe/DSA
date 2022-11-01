public class Question4 {
    public static void main(String[] args) {
        int num = 12354;
//        System.out.println(check(num));

        for (int i = 100; i < 201; i++) {
            if(check(i))
                System.out.println(i);
        }
    }
    static boolean check(int n){
        if(sum(n)%2==0)
            return true;

        return false;
    }

    static int sum(int n ){
        int sum = 0;

        while(n>0){
            sum+= n%10;
            n=n/10;
        }


        return sum;
    }
}
