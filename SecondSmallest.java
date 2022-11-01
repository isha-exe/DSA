public class SecondSmallest {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,5};
        System.out.println(ans(arr));
    }

    static int ans(int[] arr){
        int smallest = 0;
        int secondSmalledt=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }

        return secondSmalledt;
    }
}
