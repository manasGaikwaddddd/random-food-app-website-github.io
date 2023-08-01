import java.util.Scanner;

public class weekdayorweeked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of day");
        int day = sc.nextInt();
        switch (day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:

                System.out.println("weekdays");
                break;
            case 6:
            case 7:
                System.out.println("weeknd");
        }
    }
}
