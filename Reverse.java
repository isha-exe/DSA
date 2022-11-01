public class Reverse {
    public static void main(String[] args) {

        int n =  1234;
        System.out.println(reverse(n));


    }
    static int  reverse(int x){
        if(x%10 == x){
            return x;
        }
        int rev = 0;
        int rem = 0;
        while(x>0){
            rem = x%10;
            rev = (rev)*10 + rem;
            x/= 10;


        }
        return rev;
    }
}
