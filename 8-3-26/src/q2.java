public class q2 {
    static int OperationsBinaryString(String str){
        if(str==null) return -1;
        int res=str.charAt(0)-'0';
        for(int i=1;i<str.length();i+=2){
            char op=str.charAt(i);
            int next=str.charAt(i+1)-'0';
            if(op=='A') res=res & next;
            else if(op=='B') res=res | next;
            else if(op=='C') res=res ^ next;
        }
        return res;
    }
}
