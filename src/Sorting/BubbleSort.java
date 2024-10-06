package Sorting;

public class BubbleSort {
    public static void bubbleSort(int[] arr,int n){
        for(int i =n-1;i>=0;i--){
            boolean didSwap = false;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1]= arr[j];
                    arr[j]=temp;
                    didSwap =true;
                }
            }
            if(!didSwap){
                break;
            }
            System.out.println("Runs");
        }
        for(int elem: arr){
            System.out.print(elem+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {13,46,24,52,20,9};
        int[]arr1={1,2,3,4,5,6};
        bubbleSort(arr1,arr1.length);
    }
}
