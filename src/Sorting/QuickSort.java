package Sorting;

public class QuickSort {
    public static void quickSort(int[] arr, int low ,int high ){
    if(low<high){
        int pi = partition(arr,low,high);
        quickSort(arr,low,pi-1);
        quickSort(arr, pi+1,high);
    }
    }
    public static int partition(int[] arr, int low ,int high){
        int pivot = arr[low];
        int i =low, j=high;
        while(i<j) {
            while (arr[i] <= pivot && i <= high-1) i++;
            while (arr[j] > pivot && j >= low+1) j--;

            if (i < j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }

    public static void main(String[] java){
        int[] arr = {13,46,24,52,20,9};
        int[]arr1={1,2,3,4,5,6};
        quickSort(arr,0,arr.length-1);
        for(int elem : arr){
            System.out.print(elem+" ");
        }
    }
}
