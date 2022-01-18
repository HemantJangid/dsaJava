//https://practice.geeksforgeeks.org/problems/generate-all-possible-parentheses/1/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 3;
        List<String> al = new ArrayList<>();
        char[] output = new char[2*n];
        AllParenthesis(n,al,output,0,0,0);
        System.out.println(Arrays.toString(al.toArray()));
    }

    public static void AllParenthesis(int n,List<String> al,char[] output,int idx,int o,int c){
        if(idx == 2*n){
            al.add(String.valueOf(output));
            return;
        }
        if(o<n){
            output[idx] = '(';
            AllParenthesis(n,al,output,idx+1,o+1,c);
        }

        if(c<o){
            output[idx] = ')';
            AllParenthesis(n,al,output,idx+1,o,c+1);
        }
    }
}
