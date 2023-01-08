import java.util.Arrays;
import java.util.Scanner;

import OOPS.chechbigestDintInnumber;
public class PalidurmNumber {

    private static void CheckNumberIspalidromIsNot(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the NUmber ");
     int sum=0;
    int ch = sc.nextInt();
    int a=ch;
     while(ch!=0){
        int r= ch%10;
        sum =(sum*10)+r;
        ch =ch/10;
     }
    if(a==sum)
    System.out.println("Palidrome Number");
    else
    System.out.println("NOt  Palidrom");
    
    System.out.println(sum);
    }
   
    public static void main(String[] args) {
        CheckNumberIspalidromIsNot();
    }
    
}
