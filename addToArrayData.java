import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class addToArrayData {

 static  void addElementAnyPostion(int arr[],int arr1[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Position Number");
    int inp = sc.nextInt();
    ArrayList<Integer> al = new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        al.add(arr[i]);
    }
    for(int i=0;i<arr1.length;i++){
        al.add(arr1[i]);
    }
   
     Collections.sort(al);
     Collections.reverse(al);
     System.out.println(al);
   

 }


    public static void main(String[] args) { 
  
    int arr[]={4,5,6,45,50,60,70};
    int arr1[]={4,5,6,45,50,60,70};
    addElementAnyPostion(arr,arr1);
   

    }
    
}
