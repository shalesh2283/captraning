public class q9 {
    static String MoveHyphen(String str){
        if(str==null) return null;
        int count=0;
        String s="";
        for(char c:str.toCharArray()){
            if(c=='-') count++;
            else s+=c;
        }
        String res="";
        for(int i=0;i<count;i++) res+='-';
        return res+s;
    }
}
