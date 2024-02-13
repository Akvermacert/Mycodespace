import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter for reversing:");
        String str = s.nextLine();
        int end = str.length();
        String str2 = "";
        for(int i =end-1 ;i>=0;i--){
            str2 = str2+str.charAt(i);
        }
        System.out.println(str2);

    }
}
