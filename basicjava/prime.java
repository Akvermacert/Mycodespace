package basicjava;

import java.math.BigInteger;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(IsPrime(n));
        System.out.println(nextPrime(n));
    }
    public static boolean IsPrime(int n){
        BigInteger b = BigInteger.valueOf(n);
        return b.isProbablePrime(1);
    }
    public static int nextPrime(int n){
        BigInteger b = BigInteger.valueOf(n);
        String a = b.nextProbablePrime().toString();
        return Integer.parseInt((a));
    } 
}
