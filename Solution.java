import java.util.*;
import java.lang.*;
import java.io.*;

public class Solution
{
	public static void main (String[] args) throws java.lang.Exception
	{
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i=0; i<t; i++){
           int a = sc.nextInt();
           int b = sc.nextInt();
           int c = sc.nextInt();
           int max =0;
           int second_max = 0;
           if(a>b && a>c){
               max=a;
           } 
           else if(b>a && b>c){
               max=b;
           }
           else {
               max=c;
           }
        if(a<max && a>c || a>b){
            second_max = a;
        }
        else if(b<max && b>c || b>c){
            second_max = b;
        } 
        else{
            second_max = c;
        }
        System.out.println(second_max);
	}
}
}

