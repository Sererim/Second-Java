import java.util.Scanner;

public class First {


    public static boolean ispalindrom(String word) {
        String foo = new StringBuilder(word).reverse().toString();
        if(word.equals(foo)) return true;
        else return false;
    }

    public static void main(String[] args) {
        String word = "";
        Scanner scan = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter a string.");
            word = scan.nextLine();
    
            if(First.ispalindrom(word))
            {
                System.out.printf("Entered string %s is palindrome.\n", word);
            }
            else
            {
                System.out.printf("Entered string %s isn't palindrome.\n", word);
            }
            
            System.out.println("Do you want to terminate the program Y/y ?\n");
            word = scan.nextLine();
            if(word.equals("Y") || word.equals("y")) break;
        }
        scan.close();
    }
}
 