package Number_sets;
// Program to find missing number in sorted array
public class MissingNo {
    public static void main(String[] args) {
      int  N = 5;
      int A[] = {1,2,3,5} ; //
                                //1+2+3+4+5=21 -26-
      System.out.println(missingNumber(A, N));
     
        
    }
        
    public static int missingNumber(int A[], int N)
     {
        int sum=0;
        int sum1=0;
        int missingN;
         // Your code goes here
         for(N=1;N<=5;N++){   // 2+5+3+1=11   // 1+2+3+4+5=15-11=4
            sum=sum+N;
             
        }
        for(N=0;N<A.length;N++){
            sum1=sum1+A[N];

        }
        missingN=sum-sum1;
    
         return missingN;
    }
    
}
