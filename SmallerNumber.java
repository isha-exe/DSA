import java.util.Arrays;

public class SmallerNumber {
    public static void main(String[] args) {

        int[] arr =  {7,7,7,7};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count =0;
            for (int j = 0; j < nums.length; j++) {
                if(j!=i && nums[i]>nums[j]){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
