import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] quickSort(int[] arr) {
        int pivot=arr[0];
        int index=0;
        ArrayList<Integer> left=new ArrayList<Integer>();
        ArrayList<Integer> right=new ArrayList<Integer>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]>pivot)
                right.add(arr[i]);
            if(arr[i]<pivot)
                left.add(arr[i]);
        }
        int j=0;
        for(Integer i:left)
            arr[j++]=i;
        arr[j++]=pivot;
        for(Integer i:right)
            arr[j++]=i;
        return arr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = quickSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
