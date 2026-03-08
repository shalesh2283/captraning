public class q4 {
    static int findCount(int arr[],int length,int num,int diff){
        int count=0;
        for(int i=0;i<length;i++){
            if(Math.abs(arr[i]-num)<=diff) count++;
        }
        if(count==0) return -1;
        return count;
    }
}
