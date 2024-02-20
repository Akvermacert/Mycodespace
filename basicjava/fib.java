package basicjava;
import java.math.BigInteger;
import java.util.*;
public class fib {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fibo(n));
    }
    public static BigInteger fibo(int n){
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(2);
        for(int j = 2; j<=n;j++){
            c = a.add(b);
            a=b;
            b=c;
            System.out.print(a+" ");
        }
        System.out.println();
        return b;
    }
}
