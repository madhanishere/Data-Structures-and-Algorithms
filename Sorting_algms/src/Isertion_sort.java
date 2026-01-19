public class Isertion_sort {
    static void main() {
        int[] arr ={20,30,10,40,50,60};
        for (int i = 1; i < arr.length; i++) {
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
