public class most_frequent_element{
    static void main(String[] args) {
        int []arr={7,0,7,1,7};
        int count=0;
        int maxcount=0;
        int ele=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    count++;
                }
                if(count>maxcount){
                    ele=arr[i];
                    maxcount=count;
                }
            }
            count=0;

        }

        System.out.println(ele);
    }
}
