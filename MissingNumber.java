import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,0,3,2};
        cycleSort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(find(nums) );
    }

    //sorting an array first
    static void cycleSort(int[] nums){
        int i = 0;
        while(i< nums.length){
            if (nums[i]== nums.length){
                i++;
            }
            else if(nums[i] != i){
                swap(nums, i, nums[i]);
            }
            else{
                 i++;
            }
        }
    }


    //swapping function
    static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    //function for checking the missing number

    static int find(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i)
            return i;
        }
        return nums.length;
    }
}
