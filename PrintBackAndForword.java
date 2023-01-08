package Maths.Maths;


//Create a String array and add 6 data print all the data forwrod and backword direction using for loop

public class PrintBackAndForword {
    String arr[]={"A","B","C","D","E","F",};
     void  backwordData(){
        for(int i=arr.length-1;i>=0;i--){
          System.out.println(arr[i]);
        }
       

    }
    void forwroddata(){
     for(int i=0;i<=arr.length-1;i++){
        System.out.println(arr[i]);
     }
    }

    public static void main(String[] args) {
        PrintBackAndForword B = new PrintBackAndForword();
        B.backwordData();
        System.out.println("----------------\n");
        B.forwroddata();
    }
    
}
