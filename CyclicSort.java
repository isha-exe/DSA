import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1 };
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void solution(int[] arr){
        int i = 0;
        while(i<arr.length){
            if(arr[i] != i+1  )
                swap(arr, i , arr[i]-1);
            else if(arr[i] == i+1)
                i++;
        }
    }


    static void swap(int[] arr, int i, int j ){
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
