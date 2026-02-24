public class aq2 {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60};

        int i = 0;

        int next = arr[0];
        for(i = 0; i < arr.length-2; i+=2){
            int temp = arr[i+2];
            arr[i+2] = next;
            next = temp;

        }

        arr[0] = next;

        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }
}
