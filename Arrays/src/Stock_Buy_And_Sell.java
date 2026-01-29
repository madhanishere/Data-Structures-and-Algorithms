public class Stock_Buy_And_Sell {
    static void main(String[] args) {
        int[] arr={7, 1, 3, 6, 4};
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
            else {
                max = Math.max(max, arr[i] - min);
            }

        }
        System.out.println(max);
    }
}
