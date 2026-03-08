public class q10 {
    static int NumberOfCarries(int num1,int num2){
        int carry=0,count=0;
        while(num1>0||num2>0){
            int sum=num1%10+num2%10+carry;
            if(sum>=10){
                carry=1;
                count++;
            }else carry=0;
            num1/=10;
            num2/=10;
        }
        return count;
    }
}
