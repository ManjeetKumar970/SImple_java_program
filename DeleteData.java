import java.util.Scanner;

public class DeleteData {
    public static void main(String[] args) {
        System.out.println("Enter Array Size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int userInput[] = new int[size];
        // input to user
        for (int i = 0; i < size; i++) {
            userInput[i] = sc.nextInt();

        }
        // display
        for (int i = 0; i < size; i++) {

            System.out.println("[" + i + "]--\t" + userInput[i]);
        }

        System.out.println("Delete Data");
        int DelData = sc.nextInt();
        // display
        for (int i = 0; i < size; i++) {
            // data select
            if (DelData == userInput[i]) {
                System.out.println("Data Found\t\n");
                for (int j = i; j < size - 1; j++) {
                    userInput[j] = userInput[j + 1];

                }

                break;

            }

        }
        for (int i = 0; i < size - 1; i++) {
            System.out.println("" + i + "\t" + userInput[i]);
        }

    }

}
