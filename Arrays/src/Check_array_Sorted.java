public class Check_array_Sorted {
    static void main(String[] args) {
        int[] arr = {10, 200, 300, 350, 400, 600};
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]<=arr[i+1]){
            }
            else {
                System.out.println("not sorted");
                return;
            }
        }System.out.println("sorted");
    }
}
