package basicjava;
import java.math.BigInteger;
import java.util.*;
public class bigInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(factorial(a));
    }
    public static BigInteger factorial(int a){
        BigInteger f = new BigInteger("1");
        for(int i =2;i<=a;i++){
            BigInteger x= BigInteger.valueOf(i);
            f = f.multiply(x);
        }
        return f;
    }
}
