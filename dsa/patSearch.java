import java.util.*;
public class patSearch {
    public static void PatSrch(String txt,String pat) {
        int post = txt.indexOf(pat);
        while(post>=0){
            System.out.println(post+" ");
            post = txt.indexOf(pat,post+1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.nextLine();
        String pat = s.nextLine();
        PatSrch(txt,pat);
    }    
}