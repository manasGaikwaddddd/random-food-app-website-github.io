import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.println("enter operator");
            char op = in.next().trim().charAt(0);
            if (op=='+'|| op =='-'|| op=='*'|| op=='/'|| op=='%'){
                System.out.println("enter 1st no");
                int num1= in.nextInt();
                System.out.println("enter 2nd no");
                int num2=in.nextInt();


                if (op=='+'){
                    ans=num1+num2;
                }
                if(op=='-'){
                    ans=num1-num2;
                }
                if(op=='*'){
                    ans=num1*num2;
                }

                System.out.println("ans is"+ans);
            }
        }
    }
}

