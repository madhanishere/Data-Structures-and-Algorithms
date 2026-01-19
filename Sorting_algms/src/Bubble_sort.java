public class Bubble_sort {
    static void main() {
        int[] arr={20,30,50,40,60,10};
        for (int i = arr.length-1; i>=0; i--) {
            for (int j = 0; j <=i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
