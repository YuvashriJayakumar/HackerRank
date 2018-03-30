import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] countingSort(int[] arr) {
        int[] count=new int[100];
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<100;i++){
            map.put(i,0);
        }
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.get(arr[i])+1);
        }
        for(int i=0;i<100;i++){
            count[i]=map.get(i);
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
        int[] result = countingSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
