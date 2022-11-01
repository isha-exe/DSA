import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisapperedNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(Arrays.toString(new List[]{findDisappearedNumbers(arr)}));
    }

        static void swap(int[] arr, int a, int b){
            int temp = arr[b];
            arr[b] = arr[a];
            arr[a] = temp;
        }



        static void cycleSort(int[] nums){
            int i = 0;

            while(i< nums.length) {
                int correct = nums[i] - 1;

                if(nums[i] != nums[correct]){
                        swap(nums, nums[i], nums[i]-1);
                }
                else {
                    i++;
                }
            }
        }

        static List<Integer> findDisappearedNumbers(int[] nums) {
            cycleSort(nums);
            List<Integer> list = new ArrayList<>();

            for(int i = 0 ; i < nums.length ; i++){
                if(nums[i] != i+1){
                    list.add(i+1);
                }
            }
            return list;
        }
}
