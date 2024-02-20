package basicjava;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1; i<=n;i++){
            for(int j =1; j<=i;j++){
                System.out.print(j);
            }
            for(int j= 2*(n-i)-1;j>0;j--){
                System.out.print("*");
            }
            int k;
            if(n==i){
                 k =i-1;
            }else
                k=i;
            for(;k>0;k-- ){
                System.out.print(k);
            }
            System.out.println();
        }

    }
}
