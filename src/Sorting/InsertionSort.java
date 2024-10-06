package Sorting;

public class InsertionSort {
    public static void insertionSort(int[]arr,int n){
         for(int i=0;i<=n-1;i++){
             int j =i;
             while(j>0&&arr[j-1]>arr[j]){
                 int temp = arr[j-1];
                 arr[j-1]=arr[j];
                 arr[j] = temp;
                 j--;
                 System.out.println("runs");
             }
         }
         for(int elem: arr){
             System.out.print(elem+" ");
         }
    }
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        int[]arr1={1,2,3,4,5,6};
        insertionSort(arr1,arr1.length);
    }
}
