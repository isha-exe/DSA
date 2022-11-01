public class Findumbers {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            String num = arr[i]+"";
            if(num.length()%2==0)
                count++;
        }
        System.out.println(count);
    }
}
