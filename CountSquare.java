package Maths;
import java.math.*;;

public class CountSquare {
    static int countSquares(int N) {
        long low=1, high = N;
        while (low < high) {
            long mid=low+(high-low)/2;
            if (mid * mid == N) {
                low = mid;
                break;
            }else if(mid*mid > N){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        int count = (int)low;
        return count*count<N ? count : count-1;
    }

    
    public static void main(String[] args) {
       int N=9;
       
        countSquares(N);
        
       
       
        
    }
    
}
