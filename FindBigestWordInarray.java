package OOPS;

public class FindBigestWordInarray {
    public static String findBigWord(String[] arr) {

        String bigtName = arr[0];

        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i].length() < bigtName.length()) {
                bigtName = arr[i];
            }
        }

        return bigtName;
    }

    public static void main(String[] args) {
        String[] arr = { "Greg", "jg", "Marth", "Oliwka" };

        String val = findBigWord(arr);
        System.out.println(val);
    }

}
