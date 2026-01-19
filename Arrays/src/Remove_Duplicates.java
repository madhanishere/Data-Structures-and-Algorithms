public class Remove_Duplicates {
    static void main(String[] args) {
        int[] arr={10,10,20,30,30};
        int k=1;
        for (int i = 1; i < arr.length; i++) {
            if(arr.length==0){
                return;
            }
            if (arr[i]!=arr[i-1]){
                arr[k]=arr[i];
                k++;
            }
        }
        System.out.println(k);
    }
}
