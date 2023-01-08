package Maths;

public class ArraySum {                     //output 27 24 26 22 21 (30-a)

    
    public static void SumArray(int arr[],int sum)
    {
      
        
        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];
            
            
            }
            for(int i=0;i<arr.length;i++){
                 int sub=sum-arr[i];
                 System.out.println(sub);
            }
           
           
        }
        static void printArray(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        

 
    
    public static void main(String[] args) {
       int arr[]={3 ,6 ,4 ,8 ,9} ;  // 27
       ArraySum s = new ArraySum();
       SumArray(arr,0);

      
       
    }
}
