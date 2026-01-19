public class Move_zeros_to_end {
    static void main(String[] args) {
        int[] arr={0,1,2,3,0,4};
        int i=0;
        while ( i<arr.length-1){
            int j=i+1;
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        for ( i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
