import java.util.Scanner;

public class largestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st no");
        int a = sc.nextInt();
        System.out.println("enter 2nd no");
        int b = sc.nextInt();
        System.out.println("enter 3rd no");
        int c=sc.nextInt();
        int max = a;
        if(b>max){
           max=b;

        }
        if(c>max){
            max=c;
        }
        System.out.println("maximum number is "+ max);
    }
}
