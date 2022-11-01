public class SecondGreat {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,2,2};
        System.out.println(search(arr));
    }
    
    static int search(int[] arr){
//        int max = 0, temp = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if(arr[i]>max){
//                max = arr[i];
//            }
//        }
//
//        for (int j = 0; j < arr.length; j++) {
//            if(arr[j]>temp && arr[j]<max){
//                temp = arr[j];
//            }
//        }
//
//        return temp;
int n = arr.length;
        int max=0,temp=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];

            }

        }
        int count = 0;
        for(int j=0;j<n;j++)
        {

            if(arr[j]>temp&&arr[j]<max)
            {
                temp=arr[j];
                count++;
            }
//            else {
//                return -1;
//            }
        }
        if(count == 0 ){
            return -1;
        }
        return temp;

    }
}
