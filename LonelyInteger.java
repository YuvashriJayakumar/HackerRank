import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int lonelyinteger(int[] a) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            if(map.get(a[i])!=null)
                map.put(a[i],map.get(a[i])+1);
            else
                map.put(a[i],1);
        }
        return map.entrySet()
            .stream()
            .filter(entry->1==entry.getValue())
            .map(Map.Entry::getKey)
            .findFirst().get();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = lonelyinteger(a);
        System.out.println(result);
    }
}
