package Maths;
import java.util.*;

public class Solution {
  
        public static void main(String args[]){
           
            System.out.println(floorSqrt( 0));
        }
    
    static long floorSqrt(long   x)
      {
        x=5;
         // Your code here
       if(x==0||x==1)
       return x;
       
       long start=1,end=x,ans=0;

       while(start<=end){
        long mid =(start+end)/2;
           
        if(mid*mid==x)
       return (long)mid;
       
       if(mid*mid<x){
           start = mid+1;
           ans=mid;
       }else
       end = mid-1;
       
      }
      return(long)ans;
     }
    }