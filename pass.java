import java.util.Scanner;

public class pass{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        boolean digit = false;
        boolean uppercase = false;
        boolean special = false;

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (Character.isDigit(ch))
                digit = true;

            if (Character.isUpperCase(ch))
                uppercase = true;

            if (!Character.isLetterOrDigit(ch))
                special = true;
        }

        if (password.length() >= 8 && digit && uppercase && special)
            System.out.println("Strong Password");
        else if (password.length() >= 6 && (digit || uppercase))
            System.out.println("Medium Password");
        else
            System.out.println("Weak Password");

        sc.close();
    }
}