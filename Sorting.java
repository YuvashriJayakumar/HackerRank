import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int introTutorial(int V, int[] arr) {
        int mid=arr.length/2-1;
        if(V>arr[mid]){
            for(int i=mid+1;i<arr.length;i++){
                if(V==arr[i])
                    return i;
            }
        }else if(V<arr[mid]){
            for(int i=0;i<mid;i++){
                if(V==arr[i])
                    return i;
            }
        }
            return mid;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = introTutorial(V, arr);
        System.out.println(result);
        in.close();
    }
}
