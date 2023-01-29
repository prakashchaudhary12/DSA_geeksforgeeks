import java.util.*;
public class factorial{
    static int fact(int n){
        int res = 1, i;
        for(i =2; i<=n; i++){
            res = res*i;
        }
        return res;
    }
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int res = sc.nextInt();
    System.out.println(fact(res));
}
}