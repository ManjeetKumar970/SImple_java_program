package Maths.Maths;

public class PrintString {

    String arr[]={"A","B","C","D","E","F","G","H"};
    void PrintLast3Digit(){
        for(int i=arr.length-1;i>=arr.length-3;i--){
        System.out.println(arr[i]);
        }

    }
    public static void main(String[] args) {
        PrintString p = new PrintString();
        p.PrintLast3Digit();
    }
        
}
