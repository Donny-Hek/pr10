import java.util.Scanner;

public class Task3 {
    public static void arif(int N){
        if (N/10>0){
            int n=chis(N,10)/10;
            System.out.println(N/n);
            N=N-(N/n)*n;
            arif(N);
        } else System.out.println(N);//однозначное или последняя цифра
    }

    static int chis(int N, int n) {//ПРАВИЛЬНО
        if (N/n>0) {
            n*=10;
            n=chis(N,n);
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
