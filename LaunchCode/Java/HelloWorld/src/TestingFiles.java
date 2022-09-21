import java.util.Scanner;

public class TestingFiles {
    public static String myName(){
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name: ");
        String name = input.nextLine();
        return name;
    }
}
