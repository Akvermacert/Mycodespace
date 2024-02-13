import java.util.*;

public class strOperator {
    public static void main(String[] args) {
        String str1 = "geeks";
        String str2 = "geeks";
        if(str1==str2){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        String str3 = new String("geeks");
        if(str1==str3){
                System.out.println("yes");
        }else{
            System.out.println("no");
        }
        System.out.println(str1.contains(str2));
        System.out.println(str1.indexOf(str2));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.());

    }
    
}
