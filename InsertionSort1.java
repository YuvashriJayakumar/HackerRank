import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void insertionSort1(int n, int[] arr) {
        int number=arr[arr.length-1];
        boolean flag=false;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>number){
                arr[i+1]=arr[i];
            }else if(arr[i]<number){
                arr[i+1]=number;
                printArray(arr);
                flag=true;
                break;
            }
            printArray(arr);            
            System.out.println();
        }
        if(!flag){
            arr[0]=number;
            printArray(arr);          
        }
    }

    static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort1(n, arr);
        in.close();
    }
}
