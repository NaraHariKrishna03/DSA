import java.util.Scanner;

public class digitProductSum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int prod=1;
        int n=sc.nextInt();
        while(n!=0){
            int last=n%10;
            prod*=last;
            n/=10;
        }
        System.out.println(prod);
    }
}
