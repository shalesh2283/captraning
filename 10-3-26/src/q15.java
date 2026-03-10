import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str=input.nextLine();
        if(str.length() > 10){
            String s = ""+str.charAt(0) + (str.length()-2) + str.charAt(str.length()-1);
            System.out.println(s);
        }else{
            System.out.println(str);
        }
    }
}
