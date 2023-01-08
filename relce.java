import java.util.Scanner;

public class relce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First NO");
        int first = sc.nextInt();
        System.out.println("Enter Second No");
        int Second = sc.nextInt();

        System.out.println("First No--\t"+first+"\nSecond No --\t"+Second);
        int temp;
        temp=first;
        first=Second;
        Second=temp;
        System.out.println("First No\t"+first+"\nSecond No\t"+Second);

        
    }
    
}
