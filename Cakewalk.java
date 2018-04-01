import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long marcsCakewalk(int[] calorie) {
        Arrays.sort(calorie);
        long miles=0;
        for(int i=calorie.length-1;i>=0;i--){
            miles=miles+(calorie[i]*(long)Math.pow(2,calorie.length-1-i));
        }
        return miles;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calorie = new int[n];
        for(int calorie_i = 0; calorie_i < n; calorie_i++){
            calorie[calorie_i] = in.nextInt();
        }
        long result = marcsCakewalk(calorie);
        System.out.println(result);
        in.close();
    }
}
