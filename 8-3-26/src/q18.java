public class q18 {
    public static void main(String[] args){
        double x1=1,y1=1;
        double x2=2,y2=4;
        double x3=3,y3=6;

        double d1=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        double d2=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        double d3=Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));

        System.out.println(d1+d2+d3);
    }
}
