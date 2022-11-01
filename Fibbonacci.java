public class Fibbonacci {


    public static void main(String[] args) {

    }

    static int fibo(int n) {
        if (n < 2)
            return n;
        return fibo(n - 1) + fibo(n - 2);

    }


    //of we had to print the entire series we will have to use array list

//
//    static int[] series(int n){
//        int[] res = new int[n];
//
//        fibo()
//
//    }
}