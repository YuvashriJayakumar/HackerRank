import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int luckBalance(int n, int k, int[][] contests) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int total=0;
        for(int i = 0; i < n; i++){
                if(contests[i][1]==1){
                    list.add(contests[i][0]);
                }else
                    total=total+contests[i][0];
            
        }
        Collections.sort(list);
            for(int i=0;i<list.size();i++){
                if(i<list.size()-k && list.size()>k)
                    total=total-list.get(i);
                else
                    total=total+list.get(i); 
    }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[][] contests = new int[n][2];
        for(int contests_i = 0; contests_i < n; contests_i++){
            for(int contests_j = 0; contests_j < 2; contests_j++){
                contests[contests_i][contests_j] = in.nextInt();
            }
        }
        int result = luckBalance(n, k, contests);
        System.out.println(result);
        in.close();
    }
}
