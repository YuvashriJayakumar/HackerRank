import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int maximizingXor(int l, int r) {
        int max=0;
        for(int i=l;i<=r;i++){
            for(int j=l;j<=r;j++){
                int res=i^j;
                if(res > max)
                    max=res;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int result = maximizingXor(l, r);
        System.out.println(result);
        in.close();
    }
}
