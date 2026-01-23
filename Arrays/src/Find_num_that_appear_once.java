public class Find_num_that_appear_once {
    static void main(String[] args) {
        int [] arr={1,2,2,1,3,3,4};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum^arr[i];
        }
        System.out.println(sum);
    }
}
