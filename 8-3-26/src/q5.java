public class q5 {
    static int differenceofSum(int n,int m){
        int div=0,not=0;
        for(int i=1;i<=m;i++){
            if(i%n==0) div+=i;
            else not+=i;
        }
        return not-div;
    }
}
