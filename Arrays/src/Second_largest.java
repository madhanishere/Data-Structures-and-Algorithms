public class Second_largest {
    static void main(String[] args) {
        int[] arr = {10, 200, 300, 50, 4000, 600};
        int max = arr[0];
        int max2=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            } else if (arr[i]<max && arr[i]>max2) {
                max2=arr[i];

            }

        }
        System.out.println(max2);
    }
}
