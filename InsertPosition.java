public class InsertPosition {
    public static void main(String[] args) {



        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(search(arr, target));
    }
     static int search(int[] arr , int target){


        int start = 0;
        int end  = arr.length-1;

         if(target > arr[arr.length-1]){
             return arr.length;
         }


         for (int i = start; i <= end; i++) {
            int mid = start + (end-start)/2 ;


            if(arr[mid] == target ){
                return mid;
            }

            else if(arr[mid]>target){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }

        if(start == end ){
            return start+1;
        }


        return start;
    }
}
