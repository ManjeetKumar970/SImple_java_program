import java.lang.reflect.Array;
import java.util.Arrays;

public class FindArrayPalidrom {

    static void checkPelidromNumberInArray(int arr[]){
        int sum=0;
        int temp=0;
        int newarr[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
             temp=50;
            while(temp!=0){
            int r=temp%10;
            sum=(sum*10)+r;
            temp=temp/10;
            
            }
            
          
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(newarr));
      
    }
    

    public static void main(String[] args) {
        int arr[] = {20,15,55,131,901,11,101};
        checkPelidromNumberInArray(arr);

        
    }
}
