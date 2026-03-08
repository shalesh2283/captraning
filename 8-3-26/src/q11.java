public class q11 {
    static String ReplaceCharacter(String str,char ch1,char ch2){
        if(str==null) return null;
        char arr[]=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ch1) arr[i]=ch2;
            else if(arr[i]==ch2) arr[i]=ch1;
        }
        return new String(arr);
    }
}
