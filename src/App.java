import helpers.ConsoleColours;
import helpers.InputReader;

public class App 
{
    static String myName;
    public static void main(String[] args) throws Exception 
    {
        System.out.println(ConsoleColours.ANSI_BRIGHT_BG_PURPLE);
        System.out.println(ConsoleColours.ANSI_BRIGHT_BG_YELLOW);
        System.out.println(ConsoleColours.CONSOLE_CLEAR);

        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        myName = InputReader.getString("Please Enter Your Name > ");
        System.out.println("Hello " + myName);
        System.out.println();

    }
}
