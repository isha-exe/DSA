public class Tcs {
    public static void main(String[] args) {
        int n = 17;
        int product = product(n);
        System.out.println(product);
    }

    static int product(int n) {
        int sum, prod = 1, res, rem;

        if (n < 6) {
            if(n%2 == 0){
                n=n/2;
                res = n*n;
            }
            else {
                n=(n+1)/2;
                res = n*(n-1);
            }
        }
        else {

            sum = n / 3;
            rem = n % 3;

            for (int i = 1; i <= sum; i++) {
                prod *= 3;
            }
            if (rem == 0) {
                res = prod;
            } else {
                res = prod * rem;
            }

        }
        return res;
    }

}
