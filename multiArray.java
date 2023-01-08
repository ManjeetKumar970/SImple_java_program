package Maths.Maths;

public class multiArray {
  public static void main(String[] args) {
    int arr[] = { 5, 2, 2 };
    int arr1[] = { 5, 2, 2 };
    int arr2[] = { 5, 2, 2 };

    int ans = 1;
    int i;

    for (i = 0; i < arr.length; i++) {
      ans = ans * arr[i] * arr1[i] * arr2[i];
    }

    System.out.println(ans);
  }
}
