package Maths.Maths;

public class PrintExpectstartandend {
    int arr[]={1,2,3,4,4,6,7,8,9,10};
    //create integer array add 10 data print all the data expect 1,2 and last one;
    void Data(){
        for(int i=1;i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        PrintExpectstartandend Pt= new PrintExpectstartandend();
        Pt.Data();
    }
    
}
