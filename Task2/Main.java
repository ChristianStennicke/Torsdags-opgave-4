package Task2;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.println("Please type your name");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);
        System.out.println("Please type your age");
        int age = scanner.nextInt();
        System.out.println(age);
        int result = 67-age;
        System.out.println(result);
    }


}
