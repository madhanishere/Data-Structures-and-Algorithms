public class Sum_of_N_numbers {
    public static void main() {
        int n=4;
        int sum=0;
        System.out.println(recur_sum( n));
    }
    static int recur_sum(int n){

        if (n==0) {
            return 0;
        }
        return n+recur_sum(n-1);
    }
}
