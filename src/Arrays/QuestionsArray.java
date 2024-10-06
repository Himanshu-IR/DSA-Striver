package Arrays;

public class QuestionsArray {
    public static void largestInTheArray(int[]arr){
        int largest = arr[0];
        for (int j : arr) {
            if (j > largest) {
                largest = j;
            }
        }
        System.out.println(largest);
    }
    public static void secondLargestWithoutSorting(int[] arr){
        int largest = arr[0];
        int sLargest=Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > largest) {
                sLargest = largest;
                largest = j;
            }
            else if(j<largest && j>sLargest){
                sLargest = j;
            }
        }
        System.out.println("Largest is : "+ largest);
        System.out.println("Second Largest is : "+ sLargest);

    }
    public static void arrayIsSortedOrNot(int[] arr){
        boolean isSorted = true;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<=arr[i+1]){
                break;
            }
            else{
                isSorted = false;
            }
        }
        System.out.println(isSorted);
    }
    public static void removeDuplicates(int[] arr){
        int i =0;
        for(int j =1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        for (int k = i + 1; k < arr.length; k++) {
            arr[k] = 0;
        }
        System.out.println(i+1);
        }

    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7};
        removeDuplicates(arr);
        for(int i:arr){
            System.out.print(i+ " ");
        }
    }
}
