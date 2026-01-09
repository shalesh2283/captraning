import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next().toLowerCase();
        int arr[]=new int[26];
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if(ch>='a' &&ch<='z'){
                arr[ch-'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(arr[i]>0){
                System.out.println((char) (i + 'a') + " : " + arr[i]);
            }
        }
    }
}
