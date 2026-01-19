import java.util.Scanner;

import static java.lang.System.in;

public class Left_rotate_array {
    static void main(String[] args) {
        int[] arr=new int[5];
        Scanner in=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            in.next();
        }
        int temp =arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
