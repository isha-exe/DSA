public class SumOfDigits {
    public static void main(String[] args) {
        int num = 12334;
        System.out.println(sum(num) + "");
    }



    static int sum(int n){
        int ans = 0;
        int rem ;

        while(n > 0) {
            rem = n%10;
            ans+= rem;
            n/=10;
        }


        return ans;
    }
}
