public class Selection_sort {
    static void main() {
        int[] arr={20,30,50,40,60,10};
        int n= arr.length;
        for (int i = 0; i <= n-2; i++) {
            int min=i;
            for (int j = i; j <= n-1; j++) {
                if(arr[j]<arr[min]){
                    min=j;}

                }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
            }


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
