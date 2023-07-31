import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter temp in c :");
        float tempc = sc.nextFloat();
        float tempF = (tempc * 9/5)+32;
        System.out.println(tempF);

    }
}
