public class Factorial {
    public static void main() {
        int n=5;
        System.out.println(Fact(n));
    }
    static int Fact(int n){
        int prod=1;
        if (n == 1) {
            return prod;
        }

        return n*Fact(n-1);
    }
}
