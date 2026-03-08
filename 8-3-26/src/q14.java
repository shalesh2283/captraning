public class q14 {
    static int Calculate(int m,int n){
        int sum=0;
        for(int i=m;i<=n;i++){
            if(i%3==0 && i%5==0) sum+=i;
        }
        return sum;
    }
}
