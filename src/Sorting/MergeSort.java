package Sorting;

public class MergeSort {
    public static void mergeSort(int[] arr, int low , int high){
        if(low==high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low , mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void merge(int[]arr, int low, int mid , int high){
        int[] temp = new int[high-low+1];
        int x =0;
        int left = low;
        int right = mid+1;
        while(left<=mid&&right<=high){
            if(arr[left]<=arr[right]){
            temp[x++] = arr[left++];
            }else{
                temp[x++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[x++]=arr[left++];
        }
        while(right<=high){
            temp[x++]= arr[right++];
        }
        for(int i=0,j=low; i<temp.length; i++, j++){
            arr[j] = temp[i];
        }
    }
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        int[]arr1={1,2,3,4,5,6};
        mergeSort(arr,0,arr.length-1);
        for(int elem:arr){
            System.out.print(elem+" ");
        }
    }
}
