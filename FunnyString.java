import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
        String r=new StringBuilder(s).reverse().toString();
        for(int i=0;i<s.length()-1;i++){
            if((Math.abs(s.charAt(i+1)-s.charAt(i)))!=(Math.abs(r.charAt(i+1)-r.charAt(i))))
                return "Not Funny";
        }
        return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
