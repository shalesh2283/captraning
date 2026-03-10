import java.util.*;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int max = 0;
        char res = ' ';
        int count = 0;
        for(Map.Entry<Character,Integer> e : map.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                res = e.getKey();
                count++;
            } else if(e.getValue() == max){
                count++;
            }
        }
        if(count>1){
            System.out.println("0");
        }else {
            System.out.println(res);
        }

    }

}

