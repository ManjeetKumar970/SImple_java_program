package Maths.Maths;

public class printLastThreeNumber {
    // Create a Integrr array adding 6 data and print last 3 number in backside
    int arr[]={1,2,3,4,5,6};
    void FindLast3Number(){
         for(int i=arr.length-3 ;i<=arr.length-1;i++){
            System.out.println(arr[i]);
         }
    }
    public static void main(String[] args) {
        printLastThreeNumber p= new printLastThreeNumber();
        p.FindLast3Number();
        
    }
}
