import java.lang.reflect.Array;
import java.util.Arrays;

public class HafPartAccendingAndDecendingOrderInarray {
  public static void main(String[] args) {
     int arr[] ={51,2,1,6,7,9,8,3,11,15,1,0};
     System.out.println(arr.length);

    for(int i=0; i<arr.length;i++){// 0
      for(int j=0;j<(arr.length-arr.length/2)-1;j++){ 
        if(arr[j]>arr[j+1]){
           int temp = arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
        }
      }
      for(int j=(arr.length-arr.length/2) ;j<arr.length-1;j++){
        if(arr[j]<arr[j+1]){
         int temp = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
       }
      }
    }
    System.out.println(Arrays.toString(arr));
    


  }
 
}