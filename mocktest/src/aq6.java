public class aq6 {
    public static boolean isPalindrome(String str){

        int left = 0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }

            left ++;
            right --;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "abc";

        if (isPalindrome(str)) {
            System.out.println("Yes --> " + str);
        }else{

            StringBuilder res = new StringBuilder(str);

            boolean flag = false;

            for(int i = 0; i < str.length()-1;i++){
                char start = res.charAt(0);
                res.deleteCharAt(0);
                res.append(start);

                if(isPalindrome(new String(res))){
                    flag = true;
                    break;
                }
            }

            if(flag){
                System.out.println("Yes -->" + res);
            }else{
                System.out.println("No");
            }


        }
    }
}
