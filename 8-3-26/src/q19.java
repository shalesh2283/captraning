public class q19 {
    static void MaxInArray(int arr[]){
        int max=arr[0],index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                index=i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
