public class sq5 {
    public static void main(String[] args) {

        String str = "java programming";

        str = str.toLowerCase();

        StringBuilder res = new StringBuilder(str);

        for(int i = 0; i < str.length(); i+=2){
            char c = str.charAt(i);

            while(c == ' '){
                c = str.charAt(i+1);
                i += 1;
            }
            c = Character.toUpperCase(c);

            res.setCharAt(i, c);
        }

        str = res.toString();

        System.out.println(str);
    }
}
