public class EvalueServe {
    public static void main(String args[]){
        int rem=0, num, sum=0;
        for(int i = 100; i <=200; i++){
            num = i;
            while(num>0) {
                rem = (int)num % 10;
                sum = (int)sum+rem;
                num = num / 10;
            }
//
//            if(sum %2 == 0){
//                System.out.println(i);
//
//            }
            System.out.println(sum+"");
        }

    }
}
