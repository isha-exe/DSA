public class Max {
    public static void main(String[] args) {
        int[] arr = {12,45,65,2,31,547,865,4,342,323,1,34};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maximum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maximum){
                maximum= arr[i];
            }
        }
        return maximum;
    }
}
