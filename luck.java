import java.util.Random;
import java.util.Scanner;

public class luck{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        int luck = random.nextInt(100) + 1;

        System.out.println("\n" + name + "'s Luck Score: " + luck);

        if (luck >= 80)
            System.out.println("Very Lucky! 🍀");
        else if (luck >= 50)
            System.out.println("Pretty Lucky!");
        else if (luck >= 30)
            System.out.println("Average Luck!");
        else
            System.out.println("Better luck next time!");

        sc.close();
    }
}