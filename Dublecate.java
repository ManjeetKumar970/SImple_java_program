package ArrayList;

import java.util.ArrayList;

public class Dublecate {
     
    
            public static ArrayList<Integer> duplicates(int arr[], int n) {
                // code here
                
                
             int arr1[]= new int [n];
               int count=0;
               ArrayList<Integer> a = new ArrayList<>();
               for(int i=0;i<n;i++)
               {
                   arr1[arr[i]]=arr1[arr[i]]+1;
               }
               for(int j=0;j<n;j++)
               {
                   if(arr1[j]>1){
                    a.add(j);
                   count++;
                       
                   }
                    else
                        continue;
               }
               if(count==0)
               {
                a.add(-1);
                    return a;
               }
                else
                    return a;
               
           }

          
        public static void main(String[] args) {
            Dublecate d = new Dublecate();
           int arr[]={2,9,4,4,5,6,9};
            duplicates(arr, 0);
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
            
    }
}
    

