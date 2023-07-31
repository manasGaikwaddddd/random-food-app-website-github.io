import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        //int num ;
        // for(num=0;num<=5;num+=2){
        //   System.out.println(num);
        //}
        // print number from 1 to n
        //int num;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int num = 0; num <= n; num++) {
            System.out.println(num);
            System.out.println("hello");
            int a = 10;
            int b = 20;
            if (a == 10 && b == 20) {
                System.out.println("hello");
            } else {
                System.out.println("byee");
            }
        }
    }
}



