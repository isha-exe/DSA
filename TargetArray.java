import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] target = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums, target)));
    }

    static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];


        for (int i = 0; i < nums.length; i++) {
                target[index[i]] = nums[i];
        }
        for (int j = 0; j < index.length; j++) {
            target[index[j]] = nums[j];
        }

        return target;
    }
}
