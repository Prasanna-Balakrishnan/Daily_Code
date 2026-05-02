package leet_code;
public class Fibbonocci {
    public static int fib(int n) {
        if(n==1){
            return 1;
        }
        int a=0;
        int b=1;
         int c=0;
        for(int i=2;i<=n;i++){
           c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
public static void main(String[] args) {
	int n=1;
	int result = fib(n);
	System.out.println(result);
}
}
