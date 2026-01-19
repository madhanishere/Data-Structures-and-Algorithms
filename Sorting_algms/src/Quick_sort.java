public class Quick_sort {
    static void main(String[] args) {
        int[] arr={10,20,50,40,30,60};
        int low=0;
        int high= arr.length-1;
        Qs(arr,low,high);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void Qs(int arr[],int low, int high){
if(low<high){
    int part=f(arr,low,high);
    Qs(arr,low,part-1);
    Qs(arr,part+1,high);
}
    }
    static int f(int arr[],int low,int high){
int pivot=arr[low];
int i=low;
int j=high;
while (i<j){
    while (arr[i]<=pivot && i<=high-1){
        i++;
    }
    while (arr[j]>pivot && j>=low-1){
        j--;
    }
    if(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;

    }
}
