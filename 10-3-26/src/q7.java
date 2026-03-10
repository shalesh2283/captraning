import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            set.add(str.charAt(i));
        }
        for(char c : set){
            System.out.print(c);
        }
    }
}
