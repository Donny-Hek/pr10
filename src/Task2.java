import java.util.Scanner;

public class Task2 {
    static int result=0;

    static boolean change01(int[] mas) {
        boolean flag=false;
        int i=mas.length-1;


        while (i>=1) {
            if (mas[i]==1 && mas[i-1]==0) {
                flag=true;
                mas[i]=0;
                mas[i-1]=1;
                i-=2;
                if (!search00(mas)) result+=1;
            } else i--;
        }

        return flag;
    }

    static boolean search00(int[] mas){
        for (int i=0;i< mas.length-1;i++) {
            if (mas[i] == 0 && mas[i + 1] == 0) return true;
        }
        return false;
    }

    static int outRes(int a, int b){
        boolean flag=true;
        int[] mas=new int[a+b];

        for (int i=0;i< mas.length;i++){
            if (i<a) mas[i]=0;
            else mas[i]=1;
        }

        if (!search00(mas)) result+=1;
        while(flag) {flag=change01(mas);}

        return result;
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b;
        System.out.print("Введите числа a и b через пробел: ");
        a=scan.nextInt();
        b=scan.nextInt();
        if ((a-2)>=b) System.out.print(0);
        else System.out.print(outRes(a,b));
    }
}
