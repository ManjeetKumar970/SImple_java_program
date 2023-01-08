import java.util.Arrays;
import java.util.Scanner;

class InsertInArray{

  static void InsertInArray(int arr[]){
    int newArray[] = new int[arr.length+1];
    Scanner sc = new Scanner(System.in);
    int inp =sc.nextInt();
    System.out.println("Enter insert array");
    int ist = sc.nextInt();
    for(int i=0;i<arr.length;i++){
      if(arr[i]<inp){
        newArray[i]=arr[i];
      }else if(arr[i]==inp){
        newArray[i]=ist;
      }else
      newArray[i]=arr[i-1];
      
    }
    System.out.println(Arrays.toString(newArray));

  }

    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5};
        InsertInArray(arr);
    }
}