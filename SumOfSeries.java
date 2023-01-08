package Maths.Maths;

public class SumOfSeries {

    public static void main(String[] args) {
        int alfa=65;
        int last=91;
        char ch;

        for(int i=last;i>=last-5;i--)
        {
         for(int j=last;j>=i;j--){
          if(i%2!=0)
          System.out.print((char)j);
          else
          System.out.print("*");
         }
         System.out.println();

        }
        
    }

     
}
