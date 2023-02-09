import java.io.PrintWriter;
import java.io.File;

public class Second {

    public static String maketest(String word) {
        for(int i = 0; i < 100; i++)
        {
            word = word.concat(" TEST");
        }
        return word;
    }

    public static void savetest(String word) {
        try {
            PrintWriter out = new PrintWriter("test.txt");
            out.println(word);
            out.close();
        }  catch (Exception FileNotFoundException) {
            File test = new File("test.txt");
        }
    }
    public static void main(String[] args) {
        String word = "1";
        word = Second.maketest(word);
        // System.out.print(word);
        Second.savetest(word);
    }
}
