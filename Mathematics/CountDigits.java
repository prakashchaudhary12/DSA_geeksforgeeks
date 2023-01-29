import java.util.*;
public class CountDigits{
    static int countdigit(int x){
        int res=0;
        while(x>0)
        {
           x=x/10;
            res++;
        }
        return res; 
    }
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int res = sc.nextInt();
            System.out.println(countdigit(res));
        }
}
