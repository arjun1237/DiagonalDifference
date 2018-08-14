import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.Math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int dia1=0, dia2=0;
        for(int i=0; i < n; i++){
            int m=(n-1)-i;
            for(int j=0; j < n; j++){
                if(i==j)
                    dia1+= a[i][j];
                if(j==m)
                    dia2+= a[i][j];
            }
        }
        System.out.println(Math.abs(dia1-dia2));
    }
}
