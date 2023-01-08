import java.util.Scanner;

public class StringInput {
    public static void main(String args[]){
        System.out.println("Stunde Details Input");
        System.out.println(" 1.Student Name\n 2.Father Name\n 3. City\n");
       String student[] = new String[3];
       Scanner sc = new Scanner(System.in);
// use input
     for(int  i=0;i<3;i++){
     student[i]=sc.nextLine();
       }
       System.out.println("You are Enter Details \n");
       // user output
       for(String str:student){
        System.out.println(str);
       }
        

    }
    
}
