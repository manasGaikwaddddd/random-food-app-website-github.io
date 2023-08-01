import java.util.Scanner;

public class nested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter fruit name");
        String fruits = in.next();
        if (fruits.equals("mango")){
            System.out.println("king of fruits");


        }
        if(fruits.equals("apple")){
            System.out.println("a sweet red fruit");

        }
        if(fruits.equals("banan")){
            System.out.println("long fruits");

        }
        else{
            System.out.println("erro");
        }
    }
}
