public class q8 {
    static String DectoNBase(int n,int num){
        String s="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String res="";
        while(num>0){
            int r=num%n;
            res=s.charAt(r)+res;
            num/=n;
        }
        return res;
    }
}
