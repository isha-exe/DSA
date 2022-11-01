public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2,34,5,65,75, 2342, 352,2345};
        System.out.println(search(arr, 75) + "");


        String[] arr2 = {"Ishan","Narang","Ishan", "Vanshika", "Viraj"};
        System.out.println(searchInString(arr2, "Viraj"));
    }
    static int search(int[] arr, int val){
        int res = -1;
        for (int element = 0; element < arr.length; element++) {
            if(arr[element] == val){
                return element;
            }
        }
        return res;
    }
    static int searchInString(String[] arr, String target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index].equals(target)){
                return index;
            }

        }
        return -1;
    }
}
