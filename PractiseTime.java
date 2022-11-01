public class PractiseTime {
    public static void main(String[] args) {
        int num = 123432133;
        int[] arr = {1,2,4,9,2,7,5};
        int target = 9;
        //System.out.println(reverse(num));
        //System.out.println(palindromeCheck(num)+"");
        //System.out.println(binarySearch(arr,target));
    }
    static int reverse(int num){
        int rev=0, rem =0;
        while(num!=0){
            rem = num%10;
            rev = rev*10 + rem;
            num/=10;
        }
        return rev;
    }

    static boolean palindromeCheck(int num){
        if(reverse(num)==num)
            return true;
        return false;
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length;

        for (int i = start; i < end; i++) {
            int mid = start + (end-start)/2;

            if(arr[mid]==target)
                return mid;
            else if(arr[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }






}
