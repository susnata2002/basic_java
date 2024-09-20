import java.util.Scanner;

public class MTH_power {
    static long power(int m,int n){
        int power=1;
        while(n>0){
            power=power*m;
            n-=1;
        }
        return power;
    }
    static int power_optimal(int m,int n){
        if(n == 0)
            return 1;

        int temp = power_optimal(m, n/2);

        temp = temp * temp;

        if(n % 2 == 0)
            return temp;
        else
            return temp * m;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
//        System.out.println(power(m,n));
        System.out.println(power_optimal(m,n));
    }
}
