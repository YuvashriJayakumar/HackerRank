import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int runningTime(int[] A){
        int count=0;
        for(int i = 1; i < A.length; i++){
            int value = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > value){
                int temp=A[j+1];
                A[j + 1] = A[j];
                A[j]=temp;
                j = j - 1;
                count++;
            }
            A[j + 1] = value;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = runningTime(arr);
        System.out.println(result);
        in.close();
    }
}
