public class Longest_Subarray_with_given_Sum_K {
    static void main(String[] args) {
        int [] arr={1,2,3,1,1,1,2,3};
        int l=0;

        int sum=0;
        int k=3;
        int maxlen=0;
        for (int r = 0; r < arr.length; r++){
            sum +=arr[r];
            while (sum>k) {
                sum -= arr[l];
                l++;
            }
                if(sum==k){
                    maxlen=Math.max(maxlen,r-l+1);
                }

            }

        System.out.println(maxlen);
    }
}
