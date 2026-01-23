public class Max_consev_ones {
    static void main(String[] args) {
        int [] arr={1,1,0,1,1,1};
        int count=0;
        int fin_count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==1){
                count++;
            }
            else{
                if (count>fin_count) {
                    fin_count=count;
                    count=0;
                }
            }
        }
        fin_count = Math.max(fin_count, count);
        System.out.println();
        System.out.println(fin_count);
    }
}
