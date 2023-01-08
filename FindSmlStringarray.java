package OOPS;

public class FindSmlStringarray {
    private static String smlString(String arr[]) {
        String sml = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (sml.length() > arr[i].length()) {
                sml = arr[i];
            }
        }
        return sml;
    }

    public static void main(String[] args) {
        String arr[] = { "akk", "ab", "bca" };
        String val = smlString(arr);
        System.out.println(val);
    }

}
