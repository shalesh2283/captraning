public class q1 {
    static int food(int r,int unit,int arr[]){
        if(arr==null) return -1;
        int req=r*unit;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum>=req) return i+1;
        }
        return 0;
    }
}
