import java.util.Scanner;

public class switchcases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter fruit");
        String fruit = in.next();
        switch (fruit){
            case "mango":
                System.out.println("kog");
                break;
            case  "banana":
                System.out.println("long ");
                break;
            case "grapes":
                System.out.println("small");
                break;
            default:
                System.out.println("enter valid fruit");
        }
        System.out.println("enter no.");
        int day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tue");
            case 3 -> System.out.println("wed");
            case 4 -> System.out.println("thrus");
            case 5 -> System.out.println("fri");
            case 6 -> System.out.println("sat");
        }
    }
}
