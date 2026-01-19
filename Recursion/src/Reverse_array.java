public class Reverse_array {
    static void main() {
        int[] arr= {10,20,30,40,50,60};
        int[] arr2= new int[10];
        int j= arr.length-1;
        int i=0;
        arr2=rev_arr(arr,i,j);
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr2[k]);

        }

        }
        static int[] rev_arr(int[] arr, int i, int j){
        if(i>j){
            return arr;}
            int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
            rev_arr(arr,i+1,j-1);
            return arr;
        }
    }

