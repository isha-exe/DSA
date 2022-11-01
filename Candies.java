import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Candies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int extra = 3;
        System.out.println(Arrays.toString(kidsWithCandies(arr, extra).toArray()));
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        List<Boolean> list = new ArrayList<Boolean>();

        for(int i = 0; i <candies.length; i++){
            if(candies[i]>max)
                max = candies[i];
        }

        for (int j = 0; j < candies.length; j++) {
            if(candies[j]+extraCandies >= max)
                list.add(true);
            else
                list.add(false);
        }

        return list;
    }
}
