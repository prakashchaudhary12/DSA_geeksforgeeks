import java.util.*;
import java.io.*;
public class PalindromeNumber {
    static boolean  isPal(int n){
        int rev=0;
        int temp=n;
        while(temp!=0)
        {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp/10;
        }
        return (rev==n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPal(n)==true){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }   
}
