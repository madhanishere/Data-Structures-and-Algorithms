public class Rotate_D_places {
    static void main(String[] args) {
        int d=3;
        int[] arr={10,20,30,40,50};
        d= d% arr.length;
        int[] temp=new int[d];
        for (int i = 0; i < d; i++) {
            temp[i]=arr[i];
        }

        for (int i = d; i < arr.length ; i++) {
            arr[i-d]=arr[i];
        }

        for (int i = 0; i < d; i++) {
            arr[arr.length-d+i]=temp[i];

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
      }
    }
}
