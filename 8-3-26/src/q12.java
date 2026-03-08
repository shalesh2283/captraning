public class q12 {
    static int OperationChoices(int c,int a,int b){
        if(c==1) return a+b;
        if(c==2) return a-b;
        if(c==3) return a*b;
        if(c==4) return a/b;
        return 0;
    }
}
