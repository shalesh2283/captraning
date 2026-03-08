public class q13 {
    static int MaxExponents(int a,int b){
        int maxNum=a;
        int maxPow=0;
        for(int i=a;i<=b;i++){
            int x=i,count=0;
            while(x%2==0){
                count++;
                x/=2;
            }
            if(count>maxPow){
                maxPow=count;
                maxNum=i;
            }
        }
        return maxNum;
    }
}
