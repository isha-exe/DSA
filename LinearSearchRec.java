import java.util.ArrayList;

public class LinearSearchRec {
    public static void main(String[] args) {
        int[] arr =  {3,2,1,1,18,9};
        System.out.println(search3(arr, 1, 0, new ArrayList<>()) + "");
    }

    static boolean search(int[] arr , int target, int index){
        if(index == arr.length)
            return false;
        if(arr[index] == target)
            return true;
        return search(arr, target, index+1);
    }
    static int search2(int[] arr , int target, int index){
        if(index == arr.length)
            return -1;
        if(arr[index] == target)
            return index;
        return search2(arr,target, index+1);
    }

    static ArrayList<Integer> search3(int[] arr, int target, int index, ArrayList<Integer> listAns){


        if(index == arr.length){
            return listAns;
        }
        if(arr[index] == target){
            listAns.add(index);

        }
        return search3(arr, target, index+1, listAns);
    }
}
