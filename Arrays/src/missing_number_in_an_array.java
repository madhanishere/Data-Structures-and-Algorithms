public class missing_number_in_an_array {
    static void main(String[] args) {
        int ismissing=0;
        int [] arr={1,2,3,4,5,7};
        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            if(arr[i]-arr[j]==1){

            }
            else {
                ismissing= arr[i]-1;
            }
        }
        System.out.println(ismissing);
    }
}
