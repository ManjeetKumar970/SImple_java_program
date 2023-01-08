import java.util.Scanner;


public class ArrySerching {
   
  public static void main(String[] args) {
    int Search_Data;
    System.out.println("Input Array Size");
    Scanner in = new Scanner(System.in);// declear input
    int size = in.nextInt(); 
    int user_input[] = new int[size];//declear array
//user input
    for(int i=0;i<size;i++){
        user_input[i]=in.nextInt();

    }
    System.out.println("------------------------");
    //display
    for(int i=0;i<size;i++){
        System.out.println("["+i+"]--\t"+user_input[i]);
    }
    //search data in array
    System.out.println("Find number ");
      Search_Data =in.nextInt();

    for(int i=0;i<size;i++){
        if(user_input[i]==Search_Data){
            System.out.println("["+i+"]--\t"+Search_Data);
            
        }     
     
    }
  
    }        
    }


