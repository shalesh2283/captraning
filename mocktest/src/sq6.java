import java.util.*;

public class sq6 {
    public static void main(String[] args) {

        String str = "abcazkb";

        int start = 0;
        int end = 0;

        HashSet<Character> h1 = new HashSet<>();

        String ans = "";
        int max_len = Integer.MIN_VALUE;
        while(end < str.length()){

            char c = str.charAt(end);

            if(!h1.contains(c)){
                h1.add(c);


            }else{


                if (end - start + 1 > max_len) {
                    max_len = end-start+1;
                    ans = str.substring(start,end);
                }


                while(h1.contains(c) && start < end){
                    h1.remove(str.charAt(start));
                    start++;
                }

                h1.add(c);
            }

            end ++;
        }

        if(h1.size() > max_len){
            ans = str.substring(start,end);
        }
        System.out.println(ans);
    }

}
