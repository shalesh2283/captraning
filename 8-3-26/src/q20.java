import java.util.HashSet;

public class q20 {

    static int FindAutoCount(String n){
        if(n==null) return 0;
        int len=n.length();
        int arr[]=new int[10];
        for(char c:n.toCharArray()) arr[c-'0']++;
        for(int i=0;i<len;i++){
            if(arr[i]!=n.charAt(i)-'0') return 0;
        }
        HashSet<Character> set=new HashSet<>();
        for(char c:n.toCharArray()) set.add(c);
        return set.size();
    }

}
