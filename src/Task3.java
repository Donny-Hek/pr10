import java.util.Scanner;

public class Task3 {
    public static void arif(int N){
        int n=10;
        if (N/10>0) {
            n=chis(N,n)/10;
            System.out.println(N/n);
            N=N-(N/n)*n;
            arif(N);
        } else System.out.println(N);
    }

    static int chis(int N, int n) {
        if (N/n>0) {
            n*=10;
            chis(N,n);
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int N;
        System.out.print("Введите число N: ");
        N= scan.nextInt();
        arif(N);
    }
}
