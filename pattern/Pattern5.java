package pattern;

public class Pattern5 {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 0; i <=n; i++) {
            if(i<= (n+1)/2){
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
            else {
                for (int j = n-i+1; j >0 ; j--) {
                    System.out.print("*");
                }
                System.out.println();
                }
            }
        }
    }

