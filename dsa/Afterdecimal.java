import java.util.Scanner;
public class Afterdecimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        String num = s.nextLine();
        int pos = num.indexOf(".");
        if(pos<0){
            System.out.println((""));
        }else{
            System.out.println(num.substring(pos+1));
        }
    }
}
