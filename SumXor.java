import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static long solve(long n) {
        long count=0;
        for(int i=0;i<=n/2;i++){
            long sum=n+i;
            long xor=n^i;
            if(sum==xor)
                count++;
                
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long result = solve(n);
        System.out.println(result);
    }
}
