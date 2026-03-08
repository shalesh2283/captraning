public class q3 {
    static int PasswordCheck(String str){
        if(str.length()<4) return 0;
        if(Character.isDigit(str.charAt(0))) return 0;
        int num=0,cap=0;
        for(char c:str.toCharArray()){
            if(c==' '||c=='/') return 0;
            if(Character.isDigit(c)) num=1;
            if(Character.isUpperCase(c)) cap=1;
        }
        if(num==1 && cap==1) return 1;
        return 0;
    }
}
