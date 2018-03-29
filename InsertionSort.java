import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void insertionSort2(int n, int[] arr) {
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }                
            }
            printArray(arr);
                System.out.println("");
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
        insertionSort2(n, arr);
        in.close();
    }
}
