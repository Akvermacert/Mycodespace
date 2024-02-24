import java.util.Scanner;
/**
 * unique
 */
public class unique {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = s.nextInt();
        int arr[] =new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int m =1;int k=0;
        for(int i=0;i<n;i++){
            for(int j =n-1;j>=n-i;j--){
                if(arr[i]==arr[j]){
                    continue;
                }
                

            }
        }
            if(m==0){
                    System.out.println("No unique element");
                }
                if(m==1){
                    System.out.println("unique element is:");
                }
        }
    
}