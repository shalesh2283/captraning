package Level1;

import java.util.Scanner;

public class Q3 {
    public static char[] stringArray(String s) {
        int n = s.length();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.charAt(i);
        }
        return arr;
    }

    public static boolean isEqual(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        char[] arr1 = stringArray(str);
        char[] arr2 = str.toCharArray();
        for (char c : arr1) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (char c : arr2) {
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println(isEqual(arr1, arr2));
    }
}
