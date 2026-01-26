public class Two_sum {
    static void main(String[] args) {
        int [] arr={0,1,3,4,5,6,7};
        int tar=7;
        int left=0;
        int right=arr.length-1;
        while (left<right){
            int sum=arr[left]+arr[right];
            if(sum>tar){
                right--;
            }
            else if(sum<tar){
                left++;
            } else if (sum==tar) {
                System.out.println("true");
                return;
            }


        }
        System.out.println("false");
    }
}
