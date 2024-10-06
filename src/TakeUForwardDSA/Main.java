package TakeUForwardDSA;


import java.util.Scanner;

public class Main {
    static void pattern1(int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int i =0;i<n;i++){
            //spaces
            for(int k =0;k<n-i-1;k++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i =0 ;i<n;i++){
            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j< 2*n - (2*i +1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of Rows");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       pattern8(n);
    }
}