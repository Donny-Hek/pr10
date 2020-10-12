import java.util.Scanner;

public class Task1 {
    static int sumC(int a) {
        int sum=0;
        while (a!=0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }

    static int outRes(int k, int s) {
        int result=0;
        int minC= (int) Math.pow(10,k-1);
        int maxC= (int) (Math.pow(10,k)-1);

        for (int i=minC;i<=maxC;i++){
            if (sumC(i)==s) {
                result+=1;
                //System.out.println(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k,s;
        System.out.print("Введите k и s через пробел: ");
        k=scan.nextInt();
        s=scan.nextInt();
        System.out.println(outRes(k,s));
    }
}
